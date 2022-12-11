/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import Business.EcoSystem;

/**
 *
 * @author Subbu
 */
public class AdminHomePanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminHomePanel
     */
    EcoSystem system;

    public AdminHomePanel(EcoSystem system) {
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
        manageUserBtn = new javax.swing.JButton();
        manageScheduleBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        createUserBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        manageUserBtn.setText("Manage Users");
        manageUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserBtnActionPerformed(evt);
            }
        });

        manageScheduleBtn.setText("Manage Janitor Schedule");
        manageScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageScheduleBtnActionPerformed(evt);
            }
        });

        homeBtn.setText("Home");

        createUserBtn.setText("Create New User");
        createUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createUserBtn)
                    .addComponent(homeBtn)
                    .addComponent(manageScheduleBtn)
                    .addComponent(manageUserBtn))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(createUserBtn)
                .addGap(36, 36, 36)
                .addComponent(manageUserBtn)
                .addGap(40, 40, 40)
                .addComponent(manageScheduleBtn)
                .addGap(37, 37, 37)
                .addComponent(homeBtn)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(539, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageScheduleBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageScheduleBtnActionPerformed

    private void createUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserBtnActionPerformed
        // TODO add your handling code here:
        CreateUserAdminPanel createUserPanel = new CreateUserAdminPanel(system);
        jSplitPane1.setRightComponent(createUserPanel);
    }//GEN-LAST:event_createUserBtnActionPerformed

    private void manageUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserBtnActionPerformed
        // TODO add your handling code here:
        ManageUserPanel manageUserPanel = new ManageUserPanel(system);
        jSplitPane1.setRightComponent(manageUserPanel);
    }//GEN-LAST:event_manageUserBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createUserBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageScheduleBtn;
    private javax.swing.JButton manageUserBtn;
    // End of variables declaration//GEN-END:variables
}
