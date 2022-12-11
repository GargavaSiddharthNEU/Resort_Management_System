/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.VehicleBooking;

import Business.EcoSystem;
import javax.swing.JOptionPane;

/**
 *
 * @author siddh
 */
public class BookVehiclePanel extends javax.swing.JPanel {
    private EcoSystem system;

    /**
     * Creates new form BookVehicle
     */
    public BookVehiclePanel(EcoSystem system) {
        initComponents();
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        buttonPanel = new javax.swing.JPanel();
        btnManageVehicle = new javax.swing.JButton();
        btnRequestQueue = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        imageAreaPanel = new javax.swing.JPanel();
        imgVehicle = new javax.swing.JLabel();

        btnManageVehicle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnManageVehicle.setText("MANAGE FLEET");
        btnManageVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVehicleActionPerformed(evt);
            }
        });

        btnRequestQueue.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnRequestQueue.setText("MANAGE REQUESTS");
        btnRequestQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestQueueActionPerformed(evt);
            }
        });

        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageVehicle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRequestQueue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnManageVehicle)
                .addGap(18, 18, 18)
                .addComponent(btnRequestQueue)
                .addGap(18, 18, 18)
                .addComponent(btnHome)
                .addContainerGap(419, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(buttonPanel);

        imgVehicle.setIcon(new javax.swing.ImageIcon("C:\\Users\\siddh\\OneDrive\\Desktop\\NEU Fall Sem\\AED5100\\Final Project\\Images\\book_vehicle.jfif")); // NOI18N
        imgVehicle.setText("jLabel1");

        javax.swing.GroupLayout imageAreaPanelLayout = new javax.swing.GroupLayout(imageAreaPanel);
        imageAreaPanel.setLayout(imageAreaPanelLayout);
        imageAreaPanelLayout.setHorizontalGroup(
            imageAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageAreaPanelLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(imgVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        imageAreaPanelLayout.setVerticalGroup(
            imageAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageAreaPanelLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(imgVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(imageAreaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVehicleActionPerformed
        // TODO add your handling code here:
        try {
            ManageVehiclePanel managevehiclePanel = new ManageVehiclePanel(system);
            jSplitPane1.setRightComponent(managevehiclePanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnManageVehicleActionPerformed

    private void btnRequestQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestQueueActionPerformed
        // TODO add your handling code here:
        try {
            ManageVehicleRequestsPanel manageRequestsPanel = new ManageVehicleRequestsPanel(system);
            jSplitPane1.setRightComponent(manageRequestsPanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_btnRequestQueueActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        try {
            HomeVehiclePanel homeVehiclePanel = new HomeVehiclePanel();
            jSplitPane1.setRightComponent(homeVehiclePanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnManageVehicle;
    private javax.swing.JButton btnRequestQueue;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imageAreaPanel;
    private javax.swing.JLabel imgVehicle;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
