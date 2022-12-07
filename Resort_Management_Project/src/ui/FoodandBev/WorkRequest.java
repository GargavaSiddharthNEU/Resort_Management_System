/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FoodandBev;

import Business.EcoSystem;
import Business.FoodandBev.Menu.FBItem;
import Business.TransactionHistory.CustomerTransaction;
import Business.WorkRequest.FoodBevWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class WorkRequest extends javax.swing.JPanel {

        private EcoSystem system;
    /**
     * Creates new form WorkRequest
     */
    public WorkRequest(EcoSystem system) {
        initComponents();
        this.system = system;
        populatePendingWorkRequestTable();
    }
    
    void populatePendingWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

            for (FoodBevWorkRequest fbr : system.getFoodBevWorkRequestDirectory().getFoodBevWorkRequestList()) {
                ArrayList<String> foodItemNames = new ArrayList<String>();
                long foodItemsTotalPrice = 0;
                for(FBItem fb: fbr.getFbItemDetails()) {
                    foodItemNames.add(fb.getFbName());
                    foodItemsTotalPrice+=fb.getPrice();
                }
                    Object[] newRow = new Object[3];
                    newRow[0] = fbr;
                    newRow[1] = foodItemNames;
                    newRow[2] = foodItemsTotalPrice;
                    newRow[3] = fbr.getStatus();
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
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserId", "Item Details", "Total Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserId", "Item Details", "Total Price", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnApprove)
                        .addGap(18, 18, 18)
                        .addComponent(btnReject))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to approve.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        FoodBevWorkRequest selectedFoodBevWorkRequest = (FoodBevWorkRequest) model.getValueAt(selectedRowIndex, 0);
        CustomerTransaction ct = new CustomerTransaction();
        ct.setUserId(selectedFoodBevWorkRequest.getUserId());
        ct.setFacilityUsed("Food&Beverage");
        
        system.getCustomerTransactionDirectory().addCustomerTransaction(ct);
        JOptionPane.showMessageDialog(this, "Order Approved");
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
