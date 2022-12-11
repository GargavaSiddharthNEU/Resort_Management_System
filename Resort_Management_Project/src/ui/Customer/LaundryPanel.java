/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import Business.EcoSystem;
import Business.HouseKeeping.LaundryFacility.Laundry;
import Business.User.User;
import Business.WorkRequest.LaundryWorkRequest;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.MutableComboBoxModel;
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

        jLabel9.setText("Laundry Booking Status");

        jLabel3.setText("Category Name:");

        jLabel8.setText("Enter Number of clothes:");

        bookLaundryBtn.setText("Book Laundry");
        bookLaundryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookLaundryBtnActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Book Laundry");

        viewPriceBtn.setText("View Price");
        viewPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPriceBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Price per cloth:");

        jLabel2.setText("Choose a category of your choice:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel9)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(chooseLaundryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(viewPriceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(numberOfClothesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(bookLaundryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(categoryNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chooseLaundryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewPriceBtn)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(categoryNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numberOfClothesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookLaundryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
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
                    newRow[4] = (laundryWorkRequest.getLaundryDetails().getPrice()*laundryWorkRequest.getNumberOfClothes());
                    newRow[5] = laundryWorkRequest.getStatus();

                    model.addRow(newRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
