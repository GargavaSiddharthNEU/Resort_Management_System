/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PoolBooking;

import Business.EcoSystem;
import Business.TransactionHistory.CustomerTransaction;
import Business.WorkRequest.PoolWorkRequest;
import Business.WorkRequest.VehicleWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siddh
 */
public class ManagePoolRequestsPanel extends javax.swing.JPanel {
    EcoSystem system;
    /**
     * Creates new form ManageRequestsPanel
     */
    public ManagePoolRequestsPanel(EcoSystem system) {
        initComponents();
        
        this.system = system;
        populatePoolRequestTable();
    }
    
    public void populatePoolRequestTable() {
        ArrayList<PoolWorkRequest> pendingPoolRequest = new ArrayList<PoolWorkRequest>();
        ArrayList<PoolWorkRequest> non_pendingPoolRequest = new ArrayList<PoolWorkRequest>();

        for (PoolWorkRequest poolWRequest : system.getPoolWorkRequestDirectory().getPoolWorkRequestList()) {
            if (poolWRequest.getStatus().equals("Pending")) {
                pendingPoolRequest.add(poolWRequest);
            } else {
                non_pendingPoolRequest.add(poolWRequest);
            }
        }

        populate_based_on_status(pendingPoolRequest, non_pendingPoolRequest);
    }

    public void populate_based_on_status(ArrayList<PoolWorkRequest> pendingPoolRequest, ArrayList<PoolWorkRequest> non_pendingPoolRequest) {
        DefaultTableModel model = (DefaultTableModel) tblPoolRequests.getModel();
        model.setRowCount(0);
        for (PoolWorkRequest poolWRequest : pendingPoolRequest) {

            Object[] newRow = new Object[6];
            newRow[0] = poolWRequest;
            newRow[1] = poolWRequest.getPoolDetails().getPoolName();
            newRow[2] = poolWRequest.getPoolDetails().getPrice();
            newRow[3] = poolWRequest.getBookingDate();
            newRow[4] = poolWRequest.getNumberOfHours();
            newRow[5] = poolWRequest.getStatus();

            model.addRow(newRow);
        }

        DefaultTableModel modelNon_Pending = (DefaultTableModel) tblPoolConfirmed.getModel();
        modelNon_Pending.setRowCount(0);
        for (PoolWorkRequest poolWRequest : non_pendingPoolRequest) {

             Object[] newRow = new Object[6];
            newRow[0] = poolWRequest;
            newRow[1] = poolWRequest.getPoolDetails().getPoolName();
            newRow[2] = poolWRequest.getPoolDetails().getPrice();
            newRow[3] = poolWRequest.getBookingDate();
            newRow[4] = poolWRequest.getNumberOfHours();
            newRow[5] = poolWRequest.getStatus();

            modelNon_Pending.addRow(newRow);
        }
    }
    
    public void updateWorkRequestStatus(PoolWorkRequest selectedPool, String status) {
        selectedPool.setStatus(status);
        int index = 0;
        for (PoolWorkRequest poolWRequest : system.getPoolWorkRequestDirectory().getPoolWorkRequestList()) {
            if (poolWRequest.getUserId().equals(selectedPool.getUserId())) {
                system.getPoolWorkRequestDirectory().updatePoolWorkRequest(poolWRequest, index);
                break;
            }
            index++;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPoolRequests = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPoolConfirmed = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        jLabel1.setText("MANAGE REQUESTS");

        tblPoolRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Pool Name", "Pool Price", "No. of Hours", "Required Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPoolRequests);

        tblPoolConfirmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Pool Name", "Pool Price", "No. of Hours", "Required Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPoolConfirmed);

        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnApprove)
                        .addGap(175, 175, 175)
                        .addComponent(btnReject)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblPoolRequests.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tblPoolRequests.getModel();
            PoolWorkRequest selectedPoolWorkRequest = (PoolWorkRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedPoolWorkRequest, "Approved");
            CustomerTransaction ct = new CustomerTransaction();

            float poolbooking_finalprice = selectedPoolWorkRequest.getNumberOfHours() * selectedPoolWorkRequest.getPoolDetails().getPrice();
            ct.setUserId(selectedPoolWorkRequest.getUserId());
            ct.setFacilityUsed("Pool Booked - " + selectedPoolWorkRequest.getPoolDetails().getPoolName() + " for " + selectedPoolWorkRequest.getNumberOfHours() + " hours");
            ct.setPrice(poolbooking_finalprice);
            system.getCustomerTransactionDirectory().addCustomerTransaction(ct);
            JOptionPane.showMessageDialog(this, "Request approved successfully");
            populatePoolRequestTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblPoolRequests.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tblPoolRequests.getModel();
            PoolWorkRequest selectedPoolWorkRequest = (PoolWorkRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedPoolWorkRequest, "Rejected");
            JOptionPane.showMessageDialog(this, "Request rejected successfully");
            populatePoolRequestTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPoolConfirmed;
    private javax.swing.JTable tblPoolRequests;
    // End of variables declaration//GEN-END:variables
}
