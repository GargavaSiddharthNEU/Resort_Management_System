/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import Business.EcoSystem;
import Business.User.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Subbu
 */
public class ManageUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserPanel
     */
    EcoSystem system;

    public ManageUserPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        txtUserId.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbRole = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showRolesTbl = new javax.swing.JTable();
        viewRoleBtn = new javax.swing.JButton();
        deleteRoleBtn = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbRoleUpdate = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtUserId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        updateRoleBtn = new javax.swing.JButton();
        viewUsersBtn = new javax.swing.JButton();

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehicle Contractor", "Pool Incharge", "Gaming Incharge", "Janitor", "Food Manager", "Laundry Manager", "Souvenir Shop Manager" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Manage User Roles");

        jLabel2.setText("Choose an user role:");

        showRolesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(showRolesTbl);

        viewRoleBtn.setText("View");
        viewRoleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoleBtnActionPerformed(evt);
            }
        });

        deleteRoleBtn.setText("Delete");
        deleteRoleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoleBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("User Name");

        jLabel8.setText("Address");

        jLabel14.setText("Email Address");

        jLabel4.setText("Last Name");

        jLabel10.setText("Age");

        jLabel5.setText("Password");

        jLabel11.setText("Phone Number");

        jLabel6.setText("Roletype");

        cmbRoleUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehicle Contractor", "Pool Incharge", "Gaming Incharge", "Janitor", "Food Manager", "Laundry Manager", "Souvenir Shop Manager" }));

        jLabel7.setText("First Name");

        jLabel9.setText("User ID");

        updateRoleBtn.setText("Update");
        updateRoleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRoleBtnActionPerformed(evt);
            }
        });

        viewUsersBtn.setText("View Users");
        viewUsersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUsersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUserName)
                                            .addComponent(txtLName)
                                            .addComponent(txtPassword)
                                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateRoleBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel14))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAddress)
                                            .addComponent(txtPhoneNumber)
                                            .addComponent(cmbRoleUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAge)
                                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(viewRoleBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteRoleBtn))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewUsersBtn)))
                .addContainerGap(501, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(viewUsersBtn))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewRoleBtn)
                            .addComponent(deleteRoleBtn))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbRoleUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(updateRoleBtn)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewRoleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoleBtnActionPerformed
        // TODO add your handling code here:

        try {
            int index = showRolesTbl.getSelectedRow();

            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Please select a User Role to be viewed");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) showRolesTbl.getModel();
            String userId = String.valueOf(model.getValueAt(index, 0));
            User selectedUser = system.getUserDirectory().getUserById(userId);

            txtUserId.setText(selectedUser.getUserId());
            txtFName.setText(selectedUser.getFirstName());
            txtLName.setText(selectedUser.getLastName());
            txtUserName.setText(selectedUser.getUserName());
            txtPassword.setText(selectedUser.getPassword());
            txtAddress.setText(selectedUser.getAddress());
            txtPhoneNumber.setText(String.valueOf(selectedUser.getPhoneNumber()));
            txtAge.setText(String.valueOf(selectedUser.getAge()));
            txtEmailAddress.setText(selectedUser.getEmailId());
            txtFName.setText(selectedUser.getFirstName());
            cmbRoleUpdate.setSelectedItem(selectedUser.getRoleType());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a User Role to be viewed");
        }
    }//GEN-LAST:event_viewRoleBtnActionPerformed

    private void viewUsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUsersBtnActionPerformed
        // TODO add your handling code here:
        displayUserRoles();
    }//GEN-LAST:event_viewUsersBtnActionPerformed

    private void deleteRoleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoleBtnActionPerformed
        // TODO add your handling code here:

        try {
            int index = showRolesTbl.getSelectedRow();

            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Please select a User to be deleted");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) showRolesTbl.getModel();
            String userId = String.valueOf(model.getValueAt(index, 0));
            User selectedUser = system.getUserDirectory().getUserById(userId);

            system.getUserDirectory().getUsers().remove(selectedUser);

            JOptionPane.showMessageDialog(this, "User removed successfully");
            displayUserRoles();

            clearFields();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a User to be deleted");
        }
    }//GEN-LAST:event_deleteRoleBtnActionPerformed

    private void updateRoleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRoleBtnActionPerformed
        // TODO add your handling code here:

        try {
            User selectedUser = new User();

            selectedUser.setUserId(txtUserId.getText());
            selectedUser.setFirstName(txtFName.getText());
            selectedUser.setLastName(txtLName.getText());
            selectedUser.setUserName(txtUserName.getText());
            selectedUser.setPassword(txtPassword.getText());
            selectedUser.setRoleType(String.valueOf(cmbRoleUpdate.getSelectedItem()));
            selectedUser.setAddress(txtAddress.getText());
            selectedUser.setPhoneNumber(Long.valueOf(txtPhoneNumber.getText()));
            selectedUser.setEmailId(txtEmailAddress.getText());
            selectedUser.setAge(Integer.parseInt(txtAge.getText()));

            system.getUserDirectory().updateUser(selectedUser);

            JOptionPane.showMessageDialog(this, "User Record updated successfully");
            displayUserRoles();
            clearFields();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid inputs for updating");
        }
    }//GEN-LAST:event_updateRoleBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JComboBox<String> cmbRoleUpdate;
    private javax.swing.JButton deleteRoleBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable showRolesTbl;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JButton updateRoleBtn;
    private javax.swing.JButton viewRoleBtn;
    private javax.swing.JButton viewUsersBtn;
    // End of variables declaration//GEN-END:variables

    public void displayUserRoles() {

        try {
            if (cmbRole.getSelectedItem() != null) {

                DefaultTableModel showUsersModel = (DefaultTableModel) showRolesTbl.getModel();
                showUsersModel.setRowCount(0);

                String userRoleType = String.valueOf(cmbRole.getSelectedItem());
                ArrayList<User> userDetails = system.getUserDirectory().getUsersByRole(userRoleType);

                for (User users : userDetails) {
                    Object[] newRow = new Object[3];
                    newRow[0] = users.getUserId();
                    newRow[1] = (users.getFirstName() + " " + users.getLastName());
                    newRow[2] = users.getRoleType();

                    showUsersModel.addRow(newRow);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a User Role to be viewed");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a User Role to be viewed");
        }
    }

    public void clearFields() {

        txtUserId.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtAge.setText("");
        txtEmailAddress.setText("");
        txtFName.setText("");
        cmbRoleUpdate.setSelectedIndex(0);

    }
}
