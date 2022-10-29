package pharmacy;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class admin extends parentClass {

    public admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addMedicineButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        expireText = new javax.swing.JTextField();
        quantityText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTabel = new javax.swing.JTable();
        showMedicineButton = new javax.swing.JButton();
        removeText = new javax.swing.JTextField();
        balanceLabel = new javax.swing.JLabel();
        balanceButton = new javax.swing.JButton();
        soldButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204), 6));
        jPanel2.setForeground(new java.awt.Color(0, 255, 0));

        addMedicineButton.setBackground(new java.awt.Color(0, 255, 0));
        addMedicineButton.setText("add medicine");
        addMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineButtonActionPerformed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(0, 255, 0));
        removeButton.setText("remove");
        removeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(0, 255, 0));
        logoutButton.setText("logout");
        logoutButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("YOU CAN ADD MEDICINE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("YOU  CAN REMOVE MEDICIEN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("YOU CAN CHECK NOTIFICATIAON");

        backButton.setText("back");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        idText.setText("id");
        idText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        nameText.setText("name");
        nameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        expireText.setText("expire date");
        expireText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        quantityText.setText("quantity");
        quantityText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        priceText.setText("price");
        priceText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        showTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "EXPIRE_DATE", "QUANTITY", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        showTabel.setDoubleBuffered(true);
        showTabel.setEnabled(false);
        jScrollPane1.setViewportView(showTabel);

        showMedicineButton.setBackground(new java.awt.Color(0, 204, 0));
        showMedicineButton.setText("show mediciene");
        showMedicineButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        showMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMedicineButtonActionPerformed(evt);
            }
        });

        removeText.setText("enter medicine id");
        removeText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));

        balanceLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));

        balanceButton.setBackground(new java.awt.Color(0, 204, 0));
        balanceButton.setText("balance");
        balanceButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        balanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceButtonActionPerformed(evt);
            }
        });

        soldButton.setBackground(new java.awt.Color(0, 255, 0));
        soldButton.setText("solld");
        soldButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        soldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Inventory Management System\\src\\pharmacy\\ex.png")); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("notification");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(removeText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(balanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(soldButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(expireText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(addMedicineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(showMedicineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(85, 85, 85))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(17, 17, 17)))
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMedicineButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expireText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(removeText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeButton)
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(balanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soldButton))
                            .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(showMedicineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void soldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldButtonActionPerformed
        String sumQuery = "SELECT sum(quantity) total_quntity  FROM account";
        try {
            ResultSet result = statement.executeQuery(sumQuery);
            result.next();
            String sumAccount = result.getString("total_quntity");
            balanceLabel.setText("the amount sold is  " + sumAccount);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error occured");

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "the table is empity");

        }

    }//GEN-LAST:event_soldButtonActionPerformed

    private void balanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceButtonActionPerformed
        String sumQuery = "SELECT sum(price) total_balance FROM account";
        try {
            ResultSet result = statement.executeQuery(sumQuery);

            result.next();
            String sumAccount = result.getString("total_balance");
            balanceLabel.setText("your balance is $" + sumAccount);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error occured");

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "the table is empity");

        }
    }//GEN-LAST:event_balanceButtonActionPerformed
    private void tableGetter() {
        try {
            String query = "select * from medicine_list";
            ResultSet result = statement.executeQuery(query);
            DefaultTableModel table;

            while (result.next()) {
                String id = result.getString("id");
                String name = result.getString("medicine_name");
                String expdate = result.getString("expire_date");
                String quantity = "" + result.getInt("quantity");
                String price = "" + result.getDouble("price");
                String tableData[] = {id, name, expdate, quantity, price};
                table = (DefaultTableModel) showTabel.getModel();
                table.addRow(tableData);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error occured");

        }

    }
    private void showMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMedicineButtonActionPerformed

        tableGetter();

    }//GEN-LAST:event_showMedicineButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new logIN().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new logIN().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed

        String idtext = removeText.getText();
        String tempq = "select * from medicine_list";
        try {
            ResultSet tempresult = statement.executeQuery(tempq);
            String tempUserName = "";
            while (tempresult.next()) {
                tempUserName = tempresult.getString("id");
                if (idtext.equals(tempUserName)) {
                    break;
                }
            }
            if (idtext.equals(tempUserName)) {
                PreparedStatement st = con.prepareStatement("DELETE FROM medicine_list WHERE id =" + "\"" + idtext + "\"");

                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "removed successfully");
            } else if (!(idtext.equals(tempUserName))) {
                JOptionPane.showMessageDialog(null, "error, please check the id");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "unable to remove, please try again");

        }

    }//GEN-LAST:event_removeButtonActionPerformed

    private void addMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineButtonActionPerformed
        String id = idText.getText();
        String name = nameText.getText();
        String expd = expireText.getText();
        try {
            double price = Double.parseDouble(priceText.getText());
            int quantity = Integer.parseInt(quantityText.getText());

            String query = "insert into medicine_list(id,medicine_name,expire_date,quantity,price)values(?,?,?,?,?)";
            PreparedStatement prepared = con.prepareStatement(query);
            prepared.setString(1, id);
            prepared.setString(2, name);
            prepared.setString(3, expd);
            prepared.setInt(4, quantity);
            prepared.setDouble(5, price);
            prepared.execute();
            JOptionPane.showMessageDialog(null, "action completed");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "sorry! error has been genereted");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "you did not enter the rignt input");

        }

    }//GEN-LAST:event_addMedicineButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        parentClass.exitMethod();

    }//GEN-LAST:event_exitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(null, "have deleted "+);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        //new admin().setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton balanceButton;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField expireText;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextField quantityText;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField removeText;
    private javax.swing.JButton showMedicineButton;
    private javax.swing.JTable showTabel;
    private javax.swing.JButton soldButton;
    // End of variables declaration//GEN-END:variables
}
