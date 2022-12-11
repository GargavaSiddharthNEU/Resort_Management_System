/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.VehicleBooking;

import Business.EcoSystem;
import Business.Email.EmailNotification;
import Business.Email.EmailTest;
import Business.FoodandBev.Menu.FBItem;
import Business.TransactionHistory.CustomerTransaction;
import Business.User.User;
import Business.WorkRequest.FoodBevWorkRequest;
import Business.WorkRequest.VehicleWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siddh
 */
public class ManageVehicleRequestsPanel extends javax.swing.JPanel {

    EcoSystem system;

    /**
     * Creates new form ManageRequests
     */
    public ManageVehicleRequestsPanel(EcoSystem system) {
        initComponents();

        this.system = system;
        populateVehicleRequestTable();

    }

    //func - get values from work-request directory, checks for status
    public void populateVehicleRequestTable() {
        ArrayList<VehicleWorkRequest> pendingVehicleRequest = new ArrayList<VehicleWorkRequest>();
        ArrayList<VehicleWorkRequest> non_pendingVehicleRequest = new ArrayList<VehicleWorkRequest>();

        for (VehicleWorkRequest vehicleWRequest : system.getVehicleWorkRequestDirectory().getVehicleWorkRequestList()) {
            if (vehicleWRequest.getStatus().equals("Pending")) {
                pendingVehicleRequest.add(vehicleWRequest);
            } else {
                non_pendingVehicleRequest.add(vehicleWRequest);
            }
        }

        populate_based_on_status(pendingVehicleRequest, non_pendingVehicleRequest);
    }

    public void populate_based_on_status(ArrayList<VehicleWorkRequest> pendingVehicleRequest, ArrayList<VehicleWorkRequest> non_pendingVehicleRequest) {
        DefaultTableModel model = (DefaultTableModel) tblVehicleRequests.getModel();
        model.setRowCount(0);
        for (VehicleWorkRequest vehicleWRequest : pendingVehicleRequest) {

            Object[] newRow = new Object[9];
            newRow[0] = vehicleWRequest;
            newRow[1] = vehicleWRequest.getVehicleDetails().getVehicleNumber();
            newRow[2] = vehicleWRequest.getVehicleDetails().getVehicleName();
            newRow[3] = vehicleWRequest.getVehicleDetails().getCategory();
            newRow[4] = vehicleWRequest.getVehicleDetails().getSeater();
            newRow[5] = vehicleWRequest.getVehicleDetails().getPrice();
            newRow[6] = vehicleWRequest.getNumberOfHours();
            newRow[7] = vehicleWRequest.getBookingDate();
            newRow[8] = vehicleWRequest.getStatus();

            model.addRow(newRow);
        }

        DefaultTableModel modelNon_Pending = (DefaultTableModel) tblVehicleConfirmed.getModel();
        modelNon_Pending.setRowCount(0);
        for (VehicleWorkRequest vehicleWRequest : non_pendingVehicleRequest) {

            Object[] newRow = new Object[9];
            newRow[0] = vehicleWRequest;
            newRow[1] = vehicleWRequest.getVehicleDetails().getVehicleNumber();
            newRow[2] = vehicleWRequest.getVehicleDetails().getVehicleName();
            newRow[3] = vehicleWRequest.getVehicleDetails().getCategory();
            newRow[4] = vehicleWRequest.getVehicleDetails().getSeater();
            newRow[5] = vehicleWRequest.getVehicleDetails().getPrice();
            newRow[6] = vehicleWRequest.getNumberOfHours();
            newRow[7] = vehicleWRequest.getBookingDate();
            newRow[8] = vehicleWRequest.getStatus();

            modelNon_Pending.addRow(newRow);
        }

    }

//    public void populateWorkRequestTable(String status) {
//        DefaultTableModel model = new DefaultTableModel();
//        if(status.equals("Pending")) {
//            model = (DefaultTableModel) tblVehicleRequests.getModel();
//        }
//        else {
//            model = (DefaultTableModel) tblVehicleConfirmed.getModel();
//        }
//        model.setRowCount(0);
//            for (VehicleWorkRequest vehicleWRequest : system.getVehicleWorkRequestDirectory().getVehicleWorkRequestList()) {
//                if(vehicleWRequest.getStatus().equals(status)) {
//                    Object[] newRow = new Object[8];
//                    newRow[0] = vehicleWRequest;
//                    newRow[1] = vehicleWRequest.getVehicleDetails().getVehicleNumber();
//                    newRow[2] = vehicleWRequest.getVehicleDetails().getVehicleName();
//                    newRow[3] = vehicleWRequest.getVehicleDetails().getCategory();
//                    newRow[4] = vehicleWRequest.getVehicleDetails().getSeater();
//                    newRow[5] = vehicleWRequest.getVehicleDetails().getPrice();
//                    newRow[6] = vehicleWRequest.getNumberOfHours();
//                    newRow[7] = vehicleWRequest.getStatus();
//                   
//                    model.addRow(newRow);
//                }
//            }
//    }
    void updateWorkRequestStatus(VehicleWorkRequest selectedVehicle, String status) {
        selectedVehicle.setStatus(status);
        int index = 0;
        for (VehicleWorkRequest vehicleWRequest : system.getVehicleWorkRequestDirectory().getVehicleWorkRequestList()) {
            if (vehicleWRequest.getUserId().equals(selectedVehicle.getUserId())) {
                system.getVehicleWorkRequestDirectory().updateVehicleWorkRequest(vehicleWRequest, index);
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
        tblVehicleRequests = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVehicleConfirmed = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        jLabel1.setText("MANAGE REQUESTS");

        tblVehicleRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Vehicle Number", "Vehicle Name", "Category", "Seater", "Price per hour", "No of hours", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehicleRequests);

        tblVehicleConfirmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Vehicle Number", "Vehicle Name", "Category", "Seater", "Price per hour", "No of hours", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVehicleConfirmed);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblVehicleRequests.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            
            DefaultTableModel model = (DefaultTableModel) tblVehicleRequests.getModel();
            VehicleWorkRequest selectedVehicleWorkRequest = (VehicleWorkRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedVehicleWorkRequest, "Approved");
            CustomerTransaction ct = new CustomerTransaction();
            //User definition for email notif
            User getUser = system.getUserDirectory().getUserById(selectedVehicleWorkRequest.getUserId());
            
            float vehiclebooking_finalprice = selectedVehicleWorkRequest.getNumberOfHours() * selectedVehicleWorkRequest.getVehicleDetails().getPrice();
            ct.setUserId(selectedVehicleWorkRequest.getUserId());
            ct.setFacilityUsed("Vehicle Booked - " + selectedVehicleWorkRequest.getVehicleDetails().getVehicleName() + " for " + selectedVehicleWorkRequest.getNumberOfHours() + " hours");
            ct.setPrice(vehiclebooking_finalprice);
            system.getCustomerTransactionDirectory().addCustomerTransaction(ct);
            //email notification
            new EmailNotification().SendEmailOfNotification(getUser, "Vehicle");
            
            
            JOptionPane.showMessageDialog(this, "Request approved successfully and email notification sent");
            populateVehicleRequestTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblVehicleRequests.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tblVehicleRequests.getModel();
            VehicleWorkRequest selectedVehicleWorkRequest = (VehicleWorkRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedVehicleWorkRequest, "Rejected");
            JOptionPane.showMessageDialog(this, "Request rejected successfully");
            populateVehicleRequestTable();
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
    private javax.swing.JTable tblVehicleConfirmed;
    private javax.swing.JTable tblVehicleRequests;
    // End of variables declaration//GEN-END:variables
}
