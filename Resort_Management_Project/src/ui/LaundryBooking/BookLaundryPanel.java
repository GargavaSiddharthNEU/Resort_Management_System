/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.LaundryBooking;

import Business.EcoSystem;
import javax.swing.JOptionPane;
import ui.LaundryBooking.ManageLaundryPanel;
import ui.PoolBooking.HomePoolPanel;

/**
 *
 * @author siddh
 */
public class BookLaundryPanel extends javax.swing.JPanel {
    private EcoSystem system;

    /**
     * Creates new form BookLaundryPanel
     */
    public BookLaundryPanel(EcoSystem system) {
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
        jPanel1 = new javax.swing.JPanel();
        btnManageLaundry = new javax.swing.JButton();
        btnRequestQueue = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnManageLaundry.setText("MANAGE CATEGORY");
        btnManageLaundry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLaundryActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageLaundry)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRequestQueue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btnManageLaundry)
                .addGap(29, 29, 29)
                .addComponent(btnRequestQueue)
                .addGap(35, 35, 35)
                .addComponent(btnHome)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laundry.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 150, 780, 540);

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageLaundryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLaundryActionPerformed
        // TODO add your handling code here:
         try {
            ManageLaundryPanel managelaundryPanel = new ManageLaundryPanel(system);
            jSplitPane1.setRightComponent(managelaundryPanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnManageLaundryActionPerformed

    private void btnRequestQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestQueueActionPerformed
        // TODO add your handling code here:
         try {
            ManageLaundryRequestsPanel manageRequestsPanel  = new ManageLaundryRequestsPanel(system);
            jSplitPane1.setRightComponent(manageRequestsPanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRequestQueueActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        try {
            HomeLaundryPanel homeLaundryPanel = new HomeLaundryPanel();
            jSplitPane1.setRightComponent(homeLaundryPanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnManageLaundry;
    private javax.swing.JButton btnRequestQueue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
