/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import Business.EcoSystem;
import Business.HouseKeeping.LaundryFacility.Laundry;
import Business.User.User;
import Business.WorkRequest.LaundryWorkRequest;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.MutableComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Subbu
 */
public class LaundryPanel extends javax.swing.JPanel {

    /**
     * Creates new form LaundryPanel
     */
    EcoSystem system;
    User user;

    public LaundryPanel(EcoSystem system, User user) {
        initComponents();

        this.system = system;
        this.user = user;

        MutableComboBoxModel<String> model = new DefaultComboBoxModel<String>();

        for (Laundry laundryList : system.getLaundryDirectory().getLaundryDirectory()) {
            model.addElement(laundryList.getCategory());
        }

        chooseLaundryDropdown.setModel(model);

        categoryNameTxt.setEditable(false);
        priceTxt.setEditable(false);

        populateRequestTable();
        formatRows();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        priceTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        categoryNameTxt = new javax.swing.JTextField();
        numberOfClothesTxt = new javax.swing.JTextField();
        bookLaundryBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        laundryWorkQueueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        viewPriceBtn = new javax.swing.JButton();
        chooseLaundryDropdown = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(null);
        add(priceTxt);
        priceTxt.setBounds(645, 205, 160, 29);

        jLabel9.setText("Laundry Booking Status");
        add(jLabel9);
        jLabel9.setBounds(395, 372, 155, 21);

        jLabel3.setText("Category Name:");
        add(jLabel3);
        jLabel3.setBounds(160, 209, 107, 21);

        jLabel8.setText("Enter Number of clothes:");
        add(jLabel8);
        jLabel8.setBounds(230, 284, 164, 21);
        add(categoryNameTxt);
        categoryNameTxt.setBounds(285, 205, 160, 29);
        add(numberOfClothesTxt);
        numberOfClothesTxt.setBounds(412, 280, 160, 29);

        bookLaundryBtn.setText("Book Laundry");
        bookLaundryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookLaundryBtnActionPerformed(evt);
            }
        });
        add(bookLaundryBtn);
        bookLaundryBtn.setBounds(623, 269, 137, 50);

        laundryWorkQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category Name", "Price per cloth", "Number of clothes", "Total price", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(laundryWorkQueueTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(29, 411, 918, 257);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Book Laundry");
        add(jLabel1);
        jLabel1.setBounds(410, 40, 180, 32);

        viewPriceBtn.setText("View Price");
        viewPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPriceBtnActionPerformed(evt);
            }
        });
        add(viewPriceBtn);
        viewPriceBtn.setBounds(683, 116, 106, 29);

        add(chooseLaundryDropdown);
        chooseLaundryDropdown.setBounds(488, 116, 148, 29);

        jLabel6.setText("Price per cloth:");
        add(jLabel6);
        jLabel6.setBounds(529, 209, 98, 21);

        jLabel2.setText("Choose a category of your choice:");
        add(jLabel2);
        jLabel2.setBounds(224, 124, 224, 21);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Pictures\\laundry.png")); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(140, 0, 1150, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void bookLaundryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookLaundryBtnActionPerformed
        // Book a vehicle after entering details
        LaundryWorkRequest bookLaundry = new LaundryWorkRequest();

        try {
            if (chooseLaundryDropdown.getSelectedItem() != null) {
                String laundryName = String.valueOf(chooseLaundryDropdown.getSelectedItem());
                Laundry laundryDetails = system.getLaundryDirectory().getLaundryByName(laundryName);
                int numberOfClothes = Integer.parseInt(numberOfClothesTxt.getText());

                bookLaundry.setLaundryDetails(laundryDetails);
                bookLaundry.setNumberOfClothes(numberOfClothes);
                bookLaundry.setUserId(user.getUserId());
                bookLaundry.setStatus("Pending");

                system.getLaundryWorkRequestDirectory().getLaundryWorkRequestList().add(bookLaundry);

                JOptionPane.showMessageDialog(this, "Laundry booking request sent to Manager");
                populateRequestTable();
                clearFields();
                formatRows();

            } else {
                JOptionPane.showMessageDialog(this, "Enter valid number of clothes values for booking Laundry");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid number of clothes values for booking Laundry");
        }
    }//GEN-LAST:event_bookLaundryBtnActionPerformed

    private void viewPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPriceBtnActionPerformed
        // View Vehicle Details on choosing

        try {
            if (chooseLaundryDropdown.getSelectedItem() != null) {

                String laundryName = String.valueOf(chooseLaundryDropdown.getSelectedItem());
                Laundry laundryDetails = system.getLaundryDirectory().getLaundryByName(laundryName);

                categoryNameTxt.setText(laundryDetails.getCategory());
                priceTxt.setText(String.valueOf(laundryDetails.getPrice()));

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Laundry category for booking");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Laundry category for booking");
        }
    }//GEN-LAST:event_viewPriceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookLaundryBtn;
    private javax.swing.JTextField categoryNameTxt;
    private javax.swing.JComboBox<String> chooseLaundryDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable laundryWorkQueueTable;
    private javax.swing.JTextField numberOfClothesTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton viewPriceBtn;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {

        try {
            DefaultTableModel model = (DefaultTableModel) laundryWorkQueueTable.getModel();
            model.setRowCount(0);

            for (LaundryWorkRequest laundryWorkRequest : system.getLaundryWorkRequestDirectory().getLaundryWorkRequestList()) {

                if (laundryWorkRequest.getUserId().equals(user.getUserId())) {
                    Object[] newRow = new Object[5];
                    newRow[0] = laundryWorkRequest.getLaundryDetails().getCategory();
                    newRow[2] = laundryWorkRequest.getLaundryDetails().getPrice();
                    newRow[3] = laundryWorkRequest.getNumberOfClothes();
                    newRow[4] = (laundryWorkRequest.getLaundryDetails().getPrice() * laundryWorkRequest.getNumberOfClothes());
                    newRow[5] = laundryWorkRequest.getStatus();

                    model.addRow(newRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearFields() {

        categoryNameTxt.setText("");
        priceTxt.setText("");
        numberOfClothesTxt.setText("");

    }
    
    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) laundryWorkQueueTable.getModel();

        laundryWorkQueueTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 4));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

    }
}
