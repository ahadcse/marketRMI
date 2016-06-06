/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

import java.rmi.Remote;
import java.rmi.RemoteException;
import customer.*;
/**
 *
 * @author ahad
 */
public interface MarketInt extends Remote{
    
    public boolean register(String name, CustomerInt cin) throws RemoteException;
    public boolean unregister(String name) throws RemoteException;
    public Product[] getProduct() throws RemoteException;  
    public Product[] getChoice() throws RemoteException;
    public Product buyProduct(String buyer, String owner, String itemName, float price) throws RemoteException;
    public boolean sellProduct(String seller, String itemName, float price) throws RemoteException;
    public boolean adChoice(String buyer, String itemName, float price) throws RemoteException;
    public void bankConnection(String bankName) throws RemoteException;
}
