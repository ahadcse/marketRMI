/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

import java.util.*;
import customer.*;
import java.rmi.*;
import bank.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author ahad
 */
public class Market extends UnicastRemoteObject implements MarketInt{
    
    private String marketName = "Sweden";
    private Map<String, CustomerInt> customer = new HashMap<String, CustomerInt>();
    private Map<String, Product> ProductList = new HashMap<String, Product>();
    private Map<String, Product> ChoiceList = new HashMap<String, Product>();
    private static final long serialVersionUID = 7526472295622776147L;
    Bank bankObj;
    CustomerInt custObj;
    
    public Market(String name) throws RemoteException {
        super();
        this.marketName = name;
    }
    
    @Override
    public boolean register(String name, CustomerInt cin)throws RemoteException {
        try {
            customer.put(name,cin);     // Map the name to CustomerInt object
            System.out.println(name + " registered for market.");
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    } 
    
    @Override
    public boolean unregister(String name) throws RemoteException{
        try{    
            customer.remove(name);                      // UnMap from customer
            System.out.println(name + " unregistered from the market");
            return true;
        }catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }

    @Override
    public Product[] getProduct() throws RemoteException {
        Product[] productArray = new Product[ProductList.size()];
        Set set = ProductList.entrySet();             
        Iterator i = set.iterator();               
        int index = 0;
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            Product pr = ProductList.get((String) me.getKey());
            productArray[index] = pr;
            index++;
        }
        return productArray;
    }
    
    @Override
    public Product[] getChoice() throws RemoteException{
        Product[] choiceArray = new Product[ChoiceList.size()];
        Set set = ChoiceList.entrySet();
        Iterator i = set.iterator();
        int index = 0;
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            Product pr = ChoiceList.get((String) me.getKey());
            choiceArray[index] = pr;
            index++;
        }
        return choiceArray;
    }
    
    @Override
    public boolean adChoice(String buyer, String itemName, float price) throws RemoteException{   
        Product pr = new Product(buyer, itemName, price);
        ChoiceList.put(buyer, pr);
        display(ChoiceList, "wish list");
        return true;
    }
    
        public void display(Map list, String type) {

        Set set = list.entrySet();
        Iterator i = set.iterator();
        System.out.printf("Current %s view\nName\tPrice\tOwner\n-------------------------------------\n", type);
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            Product pr = ProductList.get((String) me.getKey());
            System.out.printf("%s\t%s\t%s\n", pr.getProductName(), pr.getProductPrice(), pr.getOwner());
        }

    }
    
    @Override
    public Product buyProduct(String buyer, String owner, String itemName, float price) throws RemoteException{
    
        bankConnection("Nordea");
        boolean transection = withdrawBalance(buyer, price);
        if(transection){
            Product p = ProductList.get(owner);
            ProductList.remove(owner);
            depositBalance(owner, price);
            p.setOwner(buyer);
             try {
                custObj = customer.get(owner);
                custObj.Sold("Your item " + itemName + " is sold to " + buyer);
            } catch (Exception e) {
                System.out.println("Send notification failed" + e.getMessage());
            }
            return p;

        } else {
            System.out.println("Not enough balance to buy this item");
            Product p = new Product("", "", 0);   //??
            return p;
        }
    }
    
    @Override
    public boolean sellProduct(String seller, String itemName, float price) throws RemoteException{
    
        String owner = "";
        Product p = new Product(seller, itemName, price);
        System.out.println( "Sold Product: " + seller + " " + itemName + " " + price);
        ProductList.put(seller, p);
        
        Set set = ChoiceList.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            Product pr = ChoiceList.get((String) me.getKey());

            if (pr.getProductPrice() >= price && (pr.getProductName().equals(itemName) == true)) {
                owner = pr.getOwner();
                System.out.println(owner);
                try {
                    custObj = customer.get(owner);
                    custObj.Choice("There is a matching for your wish from User "
                            + seller + "Product: " + itemName + " Price:  " + price);
                    ChoiceList.remove(pr.getOwner());

                } catch (Exception e) {
                    System.out.println("send notification failed" + e.getMessage());

                }
            }
        }
        return true;
    }
    
    @Override
    public void bankConnection(String bankName) throws RemoteException{
        try{
            bankObj = (Bank)Naming.lookup(bankName);
            if(bankObj != null){
                System.out.println("Connected to Bank" + bankName);
          }
        }catch(Exception ex){
            System.out.println("Connection failed");
            System.out.println(ex);
        }
    }
    
    public boolean withdrawBalance(String buyer, float price){        
        try{
            Account ac = bankObj.getAccount(buyer);
            if(ac == null){
                System.out.println("No account for" + buyer);
                return false;
            }
            ac.withdraw(price);
            float balance = ac.getBalance();
            System.out.printf("Amount %f withdrawn from %s's account and new balance is %f\n", price, buyer, balance);
            return true;   
        }catch (RemoteException re) {
            System.out.println("Remote exception: " + re.getMessage());
            return false;
        } catch (RejectedException rj) {
            System.out.println("Transaction rejected by the server" + rj.getMessage());
            return false;
        }
    }
    
    public void depositBalance(String owner, float price){
    
        try{
            Account ac = bankObj.getAccount(owner);
            if(ac == null){
                System.out.println("No account for" + owner);
            }
            ac.deposit(price);
            float balance = ac.getBalance();
            System.out.printf("Amount %f deposited to %s's account and new balance is %f\n", price, owner, balance);   
        }catch (RemoteException re) {
            System.out.println("Remote exception: " + re.getMessage());
        } catch (RejectedException rj) {
            System.out.println("Transaction rejected by the server" + rj.getMessage());
        }
    }
}