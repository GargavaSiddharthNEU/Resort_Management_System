/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Shopping.InhouseShopping.Souvenir;
import Business.TransactionHistory.CustomerTransaction;
import Business.User.User;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.MutableComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Subbu
 */
public class ShopPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShopPanel
     */
    EcoSystem system;
    User user;
    float totalPrice;

    public ShopPanel(EcoSystem system, User user) {
        initComponents();

        this.system = system;
        this.user = user;
        totalPrice = 0;

        MutableComboBoxModel<String> model = new DefaultComboBoxModel<String>();

        for (Souvenir souvenirList : system.getSouvenirDirectory().getSouvenirDirectory()) {
            model.addElement(souvenirList.getSouvenirName());
        }

        chooseSouvenirDropdown.setModel(model);

        souvenirNameTxt.setEditable(false);
        subTotalTxt.setEditable(false);
        souvenirPriceTxt.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        souvenirPriceTxt = new javax.swing.JTextField();
        addSouvenirBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        souvenirListTable = new javax.swing.JTable();
        buySouvenirBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chooseSouvenirDropdown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        souvenirNameTxt = new javax.swing.JTextField();
        viewDetailsBtn = new javax.swing.JButton();
        removeSouvenirBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subTotalTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(null);
        add(souvenirPriceTxt);
        souvenirPriceTxt.setBounds(614, 184, 160, 29);

        addSouvenirBtn.setText("Add Item");
        addSouvenirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSouvenirBtnActionPerformed(evt);
            }
        });
        add(addSouvenirBtn);
        addSouvenirBtn.setBounds(814, 184, 100, 29);

        souvenirListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Souvenir Name", "Souvenir Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(souvenirListTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(34, 258, 966, 195);

        buySouvenirBtn.setText("Buy Items");
        buySouvenirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buySouvenirBtnActionPerformed(evt);
            }
        });
        add(buySouvenirBtn);
        buySouvenirBtn.setBounds(898, 528, 102, 39);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Shop for Souvenirs");
        add(jLabel1);
        jLabel1.setBounds(390, 40, 220, 32);

        jLabel2.setText("Choose a Souvenir:");
        add(jLabel2);
        jLabel2.setBounds(200, 115, 125, 21);

        add(chooseSouvenirDropdown);
        chooseSouvenirDropdown.setBounds(343, 111, 220, 29);

        jLabel3.setText("Souvenir Name:");
        add(jLabel3);
        jLabel3.setBounds(142, 188, 104, 21);
        add(souvenirNameTxt);
        souvenirNameTxt.setBounds(264, 184, 160, 29);

        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });
        add(viewDetailsBtn);
        viewDetailsBtn.setBounds(593, 111, 120, 29);

        removeSouvenirBtn.setText("Remove Item");
        removeSouvenirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSouvenirBtnActionPerformed(evt);
            }
        });
        add(removeSouvenirBtn);
        removeSouvenirBtn.setBounds(593, 471, 126, 39);

        jLabel5.setText("Souvenir Price:");
        add(jLabel5);
        jLabel5.setBounds(500, 188, 96, 21);

        jLabel4.setText("Sub-Total:");
        add(jLabel4);
        jLabel4.setBounds(753, 480, 68, 21);
        add(subTotalTxt);
        subTotalTxt.setBounds(839, 476, 161, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shop.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(0, -30, 1410, 1140);
    }// </editor-fold>//GEN-END:initComponents

    private void addSouvenirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSouvenirBtnActionPerformed
        // TODO add your handling code here:

        try {

            DefaultTableModel itemListModel = (DefaultTableModel) souvenirListTable.getModel();

            if (chooseSouvenirDropdown.getSelectedItem() != null) {

                String itemName = String.valueOf(chooseSouvenirDropdown.getSelectedItem());
                Souvenir souvenirDetails = system.getSouvenirDirectory().getSouvenirByName(itemName);

                Object[] newRow = new Object[2];
                newRow[0] = souvenirDetails.getSouvenirName();
                newRow[1] = souvenirDetails.getPrice();

                itemListModel.addRow(newRow);
                totalPrice += souvenirDetails.getPrice();
                subTotalTxt.setText(String.valueOf(totalPrice));
                clearFields();

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Souvenir item for adding to list");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Souvenir item for adding to list");
        }
    }//GEN-LAST:event_addSouvenirBtnActionPerformed

    private void buySouvenirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buySouvenirBtnActionPerformed
        // TODO add your handling code here:

        try {
            
            DefaultTableModel itemListModel = (DefaultTableModel) souvenirListTable.getModel();

            if (souvenirListTable.getRowCount() != 0) {
                CustomerTransaction shopBill = new CustomerTransaction();

                shopBill.setUserId(user.getUserId());
                shopBill.setFacilityUsed("Items purchased in souvenir shop");
                shopBill.setPrice(totalPrice);

                system.getCustomerTransactionDirectory().getCustomerTransactionList().add(shopBill);

                JOptionPane.showMessageDialog(this, "Souvenir items order placed. Please pickup during checkout");
                clearFields();
                itemListModel.setRowCount(0);
                totalPrice = 0;
                subTotalTxt.setText(String.valueOf(totalPrice));
                
            } else {
                JOptionPane.showMessageDialog(this, "Choose atleast one souvenir item for placing an order");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose valid souvenir items for buying");
        }
    }//GEN-LAST:event_buySouvenirBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:

        try {
            if (chooseSouvenirDropdown.getSelectedItem() != null) {

                String souvenirName = String.valueOf(chooseSouvenirDropdown.getSelectedItem());
                Souvenir souvenirDetails = system.getSouvenirDirectory().getSouvenirByName(souvenirName);

                souvenirNameTxt.setText(souvenirDetails.getSouvenirName());
                souvenirPriceTxt.setText(String.valueOf(souvenirDetails.getPrice()));

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Souvenir item for viewing");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Souvenir item for viewing");
        }
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void removeSouvenirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSouvenirBtnActionPerformed
        // TODO add your handling code here:

        try {
            int index = souvenirListTable.getSelectedRow();

            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Please select a Souvenir item to be removed from list");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) souvenirListTable.getModel();
            String souvenirName = String.valueOf(model.getValueAt(index, 0));
            Souvenir souvenirDetails = system.getSouvenirDirectory().getSouvenirByName(souvenirName);

            model.removeRow(index);
            totalPrice -= souvenirDetails.getPrice();
            subTotalTxt.setText(String.valueOf(totalPrice));

            JOptionPane.showMessageDialog(this, "Souvenir item removed successfully from list");
            
            clearFields();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a Souvenir item to be removed from list");
        }
    }//GEN-LAST:event_removeSouvenirBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSouvenirBtn;
    private javax.swing.JButton buySouvenirBtn;
    private javax.swing.JComboBox<String> chooseSouvenirDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeSouvenirBtn;
    private javax.swing.JTable souvenirListTable;
    private javax.swing.JTextField souvenirNameTxt;
    private javax.swing.JTextField souvenirPriceTxt;
    private javax.swing.JTextField subTotalTxt;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        
        souvenirNameTxt.setText("");
        souvenirPriceTxt.setText("");
    }
}
