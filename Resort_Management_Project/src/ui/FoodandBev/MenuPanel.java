/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FoodandBev;

import Business.EcoSystem;
import Business.FoodandBev.Menu.FBItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class MenuPanel extends javax.swing.JPanel {
    private EcoSystem system;

    String mainValidationString = "";
    String validationString1 = "";
    String validationString2 = "";
    
    /**
     * Creates new form MenuPanel
     */
    public MenuPanel(EcoSystem system) {
        initComponents();
        this.system = system;
    }
    
    private void resetMenuData() {
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }

    public boolean areDataFieldsEmpty() {
        validationString1 = "";
        if (jTextField1.getText().isEmpty()) {
            validationString1 += "Id, ";
        }
        if (jTextField3.getText().isEmpty()) {
            validationString1 += "Name, ";
        }
        if (jTextField4.getText() == null) {
            validationString1 += "Price, ";
        }
        return isNotValid(validationString1);
    }

    public boolean areDataTypesCorrect() {
        validationString2 = "";
        if (!validateDoubleDataType(jTextField4.getText())) {
            validationString2 += "Price, ";
        }
        return isNotValid(validationString2);
    }

    public boolean isNotValid(String str) {
        if (str.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateDoubleDataType(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void validationErrorMessagesDialog(boolean validation1, boolean validation2) {
        if (validation1) {
            mainValidationString = validationString1;
            JOptionPane.showMessageDialog(this, "Please update the data for these fields: " + mainValidationString);
        } else if (validation2) {
            mainValidationString = validationString2;
            JOptionPane.showMessageDialog(this, "Please enter only numbers for these fields: " + mainValidationString);
        }
    }
    
    private boolean menuDetailsExistence() {
        String menuId = jTextField1.getText();
        boolean exist = false;
            for (FBItem fb : system.getFBItemDirectory().getFbItemDirectoryList()) {
                if (jTextField1.getText().equals(fb.getFbItemId())) {
                    exist = true;
                    break;
                }
            }
        return exist;
    }
    
    private FBItem setMenuData() {
        String menuId = jTextField1.getText();
        String category = String.valueOf(jComboBox1.getSelectedItem());
        String name = jTextField3.getText();
        double price = Double.parseDouble(jTextField4.getText());

        FBItem fb = new FBItem();
        fb.setFbItemId(menuId);
        fb.setCategory(category);
        fb.setFbName(name);
        fb.setPrice(price);

        return fb;
    }
    
    private void showMenuData() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

            for (FBItem fb : system.getFBItemDirectory().getFbItemDirectoryList()) {

                Object[] newRow = new Object[4];
                newRow[0] = fb;
                newRow[1] = fb.getCategory();
                newRow[2] = fb.getFbName();
                newRow[3] = fb.getPrice();

                model.addRow(newRow);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Category", "Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("5 Star Hotel");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Id");

        jLabel3.setText("Category");

        jLabel4.setText("Name");

        jLabel5.setText("Price");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appetizer", "Main Course", "Dessert", "Beverage" }));

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jComboBox1, 0, 117, Short.MAX_VALUE))))
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean validation1 = areDataFieldsEmpty();
        boolean validation2 = areDataTypesCorrect();

        if (!validation1 && !validation2) {
            String menuId = jTextField1.getText();
            if (!menuDetailsExistence()) {
                system.getFBItemDirectory().addNewMenuData(setMenuData());
                JOptionPane.showMessageDialog(this, "New menu data with menuId id : " + menuId + " created");
                resetMenuData();
                showMenuData();
            } else {
                JOptionPane.showMessageDialog(this, "Menu details already exists with the menuId id : " + menuId);
            }
        } else {
            validationErrorMessagesDialog(validation1, validation2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();

        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be viewed");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        FBItem selectedMenuItem = (FBItem) model.getValueAt(index, 0);

        jTextField1.setText(selectedMenuItem.getFbItemId());
        jComboBox1.setSelectedItem(selectedMenuItem.getCategory());
        jTextField3.setText(selectedMenuItem.getFbName());
        jTextField4.setText(String.valueOf(selectedMenuItem.getPrice()));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        FBItem selectedEmployeeProfile = (FBItem) model.getValueAt(selectedRowIndex, 0);
        system.getFBItemDirectory().deleteMenuData(selectedEmployeeProfile);
        JOptionPane.showMessageDialog(this, "Selected menu data deleted");
        resetMenuData();
        showMenuData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String menuId = jTextField1.getText();
        boolean validation1 = areDataFieldsEmpty();

        if (!validation1) {
                if (menuDetailsExistence()) {
                    FBItem updatedMenuData = setMenuData();
                    int index = 0;
                    for (FBItem fb : system.getFBItemDirectory().getFbItemDirectoryList()) {
                        if (menuId.equals(fb.getFbItemId())) {
                            system.getFBItemDirectory().updateExistingMenuData(updatedMenuData, index);
                            break;
                        }
                    index++;
                }
                JOptionPane.showMessageDialog(this, "Existing menu details with menu id : " + menuId + " updated");
                resetMenuData();
                showMenuData();
                } else {
                    JOptionPane.showMessageDialog(this, "You can't update the menu details since menu with menu id : " + menuId + " doesn't exist");
                }
        } else {
            validationErrorMessagesDialog(validation1, false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
