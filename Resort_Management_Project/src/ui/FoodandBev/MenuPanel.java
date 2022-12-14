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
        showMenuData();
    }

    private void resetMenuData() {
        try {
            jTextField1.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
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
                if (menuId.equals(fb.getFbItemId())) {
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

        setBackground(new java.awt.Color(153, 255, 204));
        setLayout(null);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 61, 657, 267);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("5 Star Hotel");
        add(jLabel1);
        jLabel1.setBounds(0, 14, 1088, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(270, 410, 117, 23);
        add(jTextField3);
        jTextField3.setBounds(270, 490, 117, 23);
        add(jTextField4);
        jTextField4.setBounds(270, 530, 117, 23);

        jLabel2.setText("Id");
        add(jLabel2);
        jLabel2.setBounds(170, 410, 52, 17);

        jLabel3.setText("Category");
        add(jLabel3);
        jLabel3.setBounds(170, 450, 52, 17);

        jLabel4.setText("Name");
        add(jLabel4);
        jLabel4.setBounds(170, 490, 34, 17);

        jLabel5.setText("Price");
        add(jLabel5);
        jLabel5.setBounds(170, 530, 29, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appetizer", "Main Course", "Dessert", "Beverage" }));
        add(jComboBox1);
        jComboBox1.setBounds(270, 450, 117, 23);

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(190, 590, 72, 23);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(270, 590, 73, 23);

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(189, 340, 72, 23);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(279, 340, 72, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
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
                    JOptionPane.showMessageDialog(this, "Menu details already exists with the menuId : " + menuId);
                }
            } else {
                validationErrorMessagesDialog(validation1, validation2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            FBItem selectedMenuItem = (FBItem) model.getValueAt(selectedRowIndex, 0);
            system.getFBItemDirectory().deleteMenuData(selectedMenuItem);
            JOptionPane.showMessageDialog(this, "Selected menu data deleted");
            resetMenuData();
            showMenuData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
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
