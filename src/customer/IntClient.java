/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IntClient.java
 *
 * Created on Aug 14, 2012, 1:10:47 PM
 */
package customer;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import java.net.MalformedURLException;
import market.*;
import bank.*;
import java.rmi.*;

/**
 *
 * @author ahad
 */
public class IntClient extends javax.swing.JFrame {

    /** Creates new form IntClient */
    public static Bank bank;
    
    public IntClient() {
        super(clientName);
        initComponents();
        try{
            cInt = new Customer(clientName);           
        }catch(Exception ex){
            System.out.println(ex);
        }            
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        status = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableLocalProduct = new javax.swing.JTable();
        buttonAddProduct = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buttonRemoveProduct = new javax.swing.JButton();
        buttonSellProduct = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableMarket = new javax.swing.JTable();
        buttonBuy = new javax.swing.JButton();
        buttonChoice = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableChoice = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        bName = new javax.swing.JLabel();
        accName = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuRegister = new javax.swing.JMenuItem();
        menuUnregister = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton4.setText("jButton4");

        jButton1.setText("jButton1");

        jButton5.setText("jButton5");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        status.setText("Status");

        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        modelLocalProduct = new DefaultTableModel(
            new Object [][] {
                {"Camera", new Float(1000.0)},
                {"TV", new Float(5000.0)},
                {"Laptop", new Float(4500.0)},
                {"Iphone", new Float(2500.0)}
            },
            new String [] {
                "Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        };

        tableLocalProduct.setModel(modelLocalProduct);
        jScrollPane3.setViewportView(tableLocalProduct);

        buttonAddProduct.setText("Add");
        buttonAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddProductActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        buttonRemoveProduct.setText("Remove");
        buttonRemoveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveProductActionPerformed(evt);
            }
        });

        buttonSellProduct.setText("Sell");
        buttonSellProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSellProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonRemoveProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(buttonSellProduct))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonAddProduct)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRemoveProduct))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(buttonSellProduct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Local Product", jPanel1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        modelMarket = new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "owner", "Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class,  java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        };
        tableMarket.setModel(modelMarket);
        jScrollPane5.setViewportView(tableMarket);

        buttonBuy.setText("Buy");
        buttonBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuyActionPerformed(evt);
            }
        });

        buttonChoice.setText("Add to Choice List");
        buttonChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonBuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonChoice))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBuy)
                    .addComponent(buttonChoice))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Market", jPanel2);

        modelChoice = new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Owner", "Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        };
        tableChoice.setModel(modelChoice);
        jScrollPane6.setViewportView(tableChoice);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Choice List", jPanel3);

        bName.setText("Bank Name         :");

        accName.setText("Account Name    :");

        balance.setText("Cuurent Balance :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balance)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(accName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(bName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(balance)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Account Info", jPanel4);

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuRegister.setText("Register");
        menuRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegisterActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegister);

        menuUnregister.setText("Unregister");
        menuUnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUnregisterActionPerformed(evt);
            }
        });
        jMenu1.add(menuUnregister);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(status)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRemoveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveProductActionPerformed
        // TODO add your handling code here:
        int row = tableLocalProduct.getSelectedRow();
        modelLocalProduct.removeRow(row);
        status.setText("Status: " + tableLocalProduct.getValueAt(row, 0) + " is now removed");
    }//GEN-LAST:event_buttonRemoveProductActionPerformed

    private void buttonBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuyActionPerformed
        // TODO add your handling code here:
        try {
            int row = tableMarket.getSelectedRow();
            if (String.valueOf(row) != null && String.valueOf(row) != null) {
                String sOwnerName = (String) tableMarket.getValueAt(row, 0);
                String sItemName = (String) tableMarket.getValueAt(row, 1);
                float fItemPrice = (Float) tableMarket.getValueAt(row, 2);
                //status.setText(sOwnerName + " " + sItemName + "" + String.valueOf(fItemPrice));
                try{                        
                    Product k = oMarket.buyProduct(clientName, sOwnerName, sItemName, fItemPrice);

                    int i = modelLocalProduct.getRowCount();
                    modelLocalProduct.insertRow(i, new Object[]{k.getProductName(), k.getProductPrice()});
                    if(!k.getProductName().equals("")){
                        JOptionPane.showMessageDialog(this, "Bought item "+k.getProductName()+" for price kr."+ k.getProductPrice() + ". Item added to your local inventory.");
                        refreshMarketView();
                    }else{
                        JOptionPane.showMessageDialog(this, "Action Rejected. Reason: Not enough balance!");
                        refreshMarketView();
                    }  
                }catch(RemoteException re){
                    clearAndLogout("Connection failed..Try again later.");
                }catch(Exception re){
                    clearAndLogout("Connection failed..Try again later.");
                }
                
           } 
        } catch (NullPointerException n) {
            status.setText("Item not available.Reload the marketview tab to view the current available items." + n.getMessage());
            //System.exit(0);
        }
    }//GEN-LAST:event_buttonBuyActionPerformed

    private void buttonSellProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSellProductActionPerformed
        int row = tableLocalProduct.getSelectedRow();

        if (String.valueOf(row) != null) {
            String prod = (String) tableLocalProduct.getValueAt(row, 0);
            float price = (Float) tableLocalProduct.getValueAt(row, 1);
            modelLocalProduct.removeRow(row);
            status.setText("Item "+prod + " is listed to the market for " + price);
            try {
                if (oMarket.sellProduct(clientName, prod, price) == true) {
                    refreshMarketView();
                }             
             } catch (Exception e) {
               clearAndLogout(e.getMessage());
               
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSellProductActionPerformed

    private void refreshMarketView() {

        try {
            modelMarket.getDataVector().removeAllElements();
            oProduct = oMarket.getProduct();
            for (int i = 0; i < oProduct.length; i++) {
                modelMarket.insertRow(i, new Object[]{oProduct[i].getOwner(),
                            oProduct[i].getProductName(), oProduct[i].getProductPrice()});
            }
        } catch (Exception e) {
           clearAndLogout(e.getMessage());
        }
    }
    
    private void refreshWishList(){
        try {
            modelChoice.getDataVector().removeAllElements();
            oProduct = oMarket.getChoice();
            for (int i = 0; i < oProduct.length; i++) {
                modelChoice.insertRow(i, new Object[]{oProduct[i].getOwner(),
                            oProduct[i].getProductName(), oProduct[i].getProductPrice()});
            }
        } catch (Exception e) {
           clearAndLogout(e.getMessage());
        }
    }
    
    private void menuRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegisterActionPerformed
        // TODO add your handling code here:
        try {           
            oMarket = (MarketInt) Naming.lookup("Sweden");
            if (oMarket.register(clientName,cInt) == true) {
                status.setText("Connected to Market");
                menuRegister.setEnabled(false);
            } else {
                status.setText("Unable to connect to Market...Try Again!");
            }
        } catch (Exception e) {
              clearAndLogout("Connection failed. Please try again later. Cause: " + e.getMessage());
            
        }
    }//GEN-LAST:event_menuRegisterActionPerformed

    public void clearAndLogout(String s){
        
        menuRegister.setEnabled(true);
        //oMarket = null;
        status.setText(s);           
    }
    
    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menuUnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUnregisterActionPerformed
        // TODO add your handling code here:
        try {
            oMarket.unregister(clientName);
        } catch (Exception e) {
              clearAndLogout("The runtime failed: " + e.getMessage());            
        }
    }//GEN-LAST:event_menuUnregisterActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_menuExitActionPerformed

    private void buttonAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddProductActionPerformed
        // TODO add your handling code here:
                int row = tableLocalProduct.getRowCount();
        if (String.valueOf(row) != null) {
            modelLocalProduct.insertRow(tableLocalProduct.getRowCount(), new Object[]{"Edit this", 0.0});
            String prod = (String) tableLocalProduct.getValueAt(row, 0);
            float price = Float.parseFloat(tableLocalProduct.getValueAt(row, 1).toString());
            status.setText("Status:Edit coloumn and press enter to add the product");
        }
    }//GEN-LAST:event_buttonAddProductActionPerformed

    private void buttonChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChoiceActionPerformed
        // TODO add your handling code here:
        try {
            int row = tableMarket.getSelectedRow();

            if (String.valueOf(row) != null && String.valueOf(row) != null) {
                //String sOwnerName = (String) tableMarketView.getValueAt(row, 0);
                String sItemName = (String) tableMarket.getValueAt(row, 1);
                //float fItemPrice = (Float) tableMarketView.getValueAt(row, 2);
                 float fWishPrice = (Float.parseFloat( JOptionPane.showInputDialog(null, "Enter Wish price", " ", 3)));
                if (oMarket.adChoice(clientName, sItemName, fWishPrice)== true)
                {
                    refreshWishList();
                   
                }
            }
            
        } catch (Exception e) {
             clearAndLogout("The runtime failed: " + e.getMessage());
           
        }
    }//GEN-LAST:event_buttonChoiceActionPerformed

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        int index = sourceTabbedPane.getSelectedIndex();
        switch(index){
            case 1: {
                        refreshMarketView();
                        break;
                    }
            case 2: {
                        refreshWishList();
                        break;
                    }   
         
            case 3: {
                        String bankName = "Nordea";
                        try {
                
                            bank = (Bank)Naming.lookup(bankName);
                
                            Account acc = bank.getAccount(clientName);
                            if (acc == null) {
                               status.setText("No account for" + clientName);
                            }
                            float bal = acc.getBalance();
                            bName.setText("Bank name              : "+bankName);
                            accName.setText("Account name         : "+clientName);
                            balance.setText("CurrBalance           : "+String.valueOf(bal) +" Kr");
                        } catch (NullPointerException n) {
                            status.setText("The runtime failed : " + n.getMessage());
                        } catch(RemoteException re){
                            clearAndLogout("Remote exception: "+ re.getMessage());
                        } catch (NotBoundException ex) {
                            status.setText("Remote exception: "+ ex.getMessage());
                        } catch (MalformedURLException ex) {
                            status.setText("Remote exception: "+ ex.getMessage());    
                        }

                        break;
                    }   
            }              
    }//GEN-LAST:event_jTabbedPane2StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

            java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                clientName = JOptionPane.showInputDialog(null, "Enter your Name", "...", 3);
                    IntClient ic = new IntClient();
                    ic.setLocation(300, 200);
                    new IntClient().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accName;
    private javax.swing.JLabel bName;
    private javax.swing.JLabel balance;
    private javax.swing.JButton buttonAddProduct;
    private javax.swing.JButton buttonBuy;
    private javax.swing.JButton buttonChoice;
    private javax.swing.JButton buttonRemoveProduct;
    private javax.swing.JButton buttonSellProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuRegister;
    private javax.swing.JMenuItem menuUnregister;
    private javax.swing.JLabel status;
    private javax.swing.JTable tableChoice;
    private javax.swing.JTable tableLocalProduct;
    private javax.swing.JTable tableMarket;
    // End of variables declaration//GEN-END:variables
    
    private DefaultTableModel modelLocalProduct, modelMarket, modelChoice;
    private static String clientName;
    private CustomerInt cInt;
    private MarketInt oMarket;
    private Product[] oProduct;
}
