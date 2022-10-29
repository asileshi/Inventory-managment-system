package pharmacy;

import javax.swing.*;
import java.sql.*;

public class Customer extends parentClass {

    public Customer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        purchaseText = new javax.swing.JTextField();
        purchaseButton = new javax.swing.JButton();
        quantityText = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("WELL COME TO OUR FARMACY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("YOU CAN FIND ANY MEDICINE ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        logoutButton.setBackground(new java.awt.Color(51, 255, 51));
        logoutButton.setText("logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        searchText.setText("enter the name of the medicine");

        searchButton.setBackground(new java.awt.Color(0, 204, 0));
        searchButton.setText("search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        purchaseText.setText("enter the ID of the medicine");

        purchaseButton.setBackground(new java.awt.Color(0, 204, 0));
        purchaseButton.setText("purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        quantityText.setText("quantity");

        exitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Inventory Management System\\src\\pharmacy\\ex.png")); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(purchaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton)
                    .addComponent(purchaseButton))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(16, 16, 16))
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        new logIN().setVisible(true);
        dispose();


    }//GEN-LAST:event_backButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed

        new logIN().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed
    private void getTempInfo() {
        String medicineName = searchText.getText();
        String searchResult = "id = ";
        String query = "select * from medicine_list";
        String tempName = "";

        try {

            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                tempName = result.getString("medicine_name");
                if (medicineName.equals(tempName)) {
                    searchResult += result.getString("id") + "\n";
                    searchResult += "name = " + result.getString("medicine_name") + "\n";
                    searchResult += "price = " + result.getString("price");
                    JOptionPane.showMessageDialog(null, searchResult);
                    break;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error occured, please try again");

        }
        if (!(medicineName.equals(tempName))) {
            JOptionPane.showMessageDialog(null, "we do not have that medicine, sorry!");
        }
    }

    private void getTempInfo(String id, int quantity) {

        int pastQauntity = 0;
        double presentPrice;
        double currentPrice = 0;
        String tempId = "";
        String query_show = "select * from medicine_list";

        String currentDate = "\"" + currentYear + "-\"" + "\"" + currentMonth + "-\"" + "\"" + currentDay + "\"";

        try {

            ResultSet result = statement.executeQuery(query_show);
            while (result.next()) {
                tempId = result.getString("id");

                if (tempId.equals(id)) {
                    pastQauntity = Integer.parseInt(result.getString("quantity"));
                    presentPrice = Double.parseDouble(result.getString("price"));
                    currentPrice = presentPrice * quantity;

                    break;
                }
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "error occured, please try again");
        }
        if (tempId.equals(id) && pastQauntity != 0) {
            int presentQuantity = pastQauntity - quantity;

            String changeQuery = "update medicine_list set quantity=" + presentQuantity + " where id =" + "\"" + id + "\"";
            String addToAccount = "insert into account value(" + currentDate + "," + currentPrice + "," + quantity + ")";

            try {

                PreparedStatement prepared = con.prepareStatement(changeQuery);

                PreparedStatement preparedAccount = con.prepareStatement(addToAccount);

                preparedAccount.executeUpdate();

                prepared.executeUpdate();
                JOptionPane.showMessageDialog(null, "transaction compelte");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "unable to connect to data base");
            }
        } else {
            JOptionPane.showMessageDialog(null, "we do not have the medicine you are looking for,sorry!");
        }
    }


    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        getTempInfo();

    }//GEN-LAST:event_searchButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        String id = purchaseText.getText();
        try {
            int quantity = Integer.parseInt(quantityText.getText());
            if (quantity > 0) {
                getTempInfo(id, quantity);

            } else {
                JOptionPane.showMessageDialog(null, "invalid input");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "invalid input");
        }


    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        parentClass.exitMethod();

    }//GEN-LAST:event_exitButtonActionPerformed

    public static void main(String args[]) {

        //new Customer().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JTextField purchaseText;
    private javax.swing.JTextField quantityText;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}
