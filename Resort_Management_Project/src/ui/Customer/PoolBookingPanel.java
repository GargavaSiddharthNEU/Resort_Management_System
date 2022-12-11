/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Recreation.PoolFacility.Pool;
import Business.User.User;
import Business.WorkRequest.PoolWorkRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.MutableComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Subbu
 */
public class PoolBookingPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoolBookingPanel
     */
    EcoSystem system;
    User user;

    public PoolBookingPanel(EcoSystem system, User user) {
        initComponents();

        this.system = system;
        this.user = user;

        MutableComboBoxModel<String> model = new DefaultComboBoxModel<String>();

        for (Pool poolList : system.getPoolDirectory().getPoolDirectory()) {
            model.addElement(poolList.getPoolName());
        }

        choosePoolDropdown.setModel(model);

        poolNameTxt.setEditable(false);
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

        viewPoolBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numberOfHoursTxt = new javax.swing.JTextField();
        poolBookingDateTxt = new com.toedter.calendar.JDateChooser();
        bookPoolBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        poolWorkQueueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        choosePoolDropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        poolNameTxt = new javax.swing.JTextField();

        viewPoolBtn.setText("View Details");
        viewPoolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPoolBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Price per hour:");

        jLabel7.setText("Select Pool Booking Date:");

        jLabel8.setText("Enter Number of Hours:");

        poolBookingDateTxt.setDateFormatString("MM/dd/yyyy");

        bookPoolBtn.setText("Book Pool");
        bookPoolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookPoolBtnActionPerformed(evt);
            }
        });

        poolWorkQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pool Name", "Booking Date", "Price per hour", "Number of hours", "Total Price", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(poolWorkQueueTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Book A Swimming Pool");

        jLabel2.setText("Choose a pool of your choice:");

        jLabel9.setText("Pool Booking Status");

        jLabel3.setText("Pool Name:");

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
                        .addGap(249, 249, 249)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(choosePoolDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(viewPoolBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(poolBookingDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(numberOfHoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookPoolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(poolNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(choosePoolDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewPoolBtn))))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(poolNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(numberOfHoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(poolBookingDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bookPoolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewPoolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPoolBtnActionPerformed
        // View Vehicle Details on choosing

        try {
            if (choosePoolDropdown.getSelectedItem() != null) {

                String poolName = String.valueOf(choosePoolDropdown.getSelectedItem());
                Pool poolDetails = system.getPoolDirectory().getPoolByName(poolName);

                poolNameTxt.setText(poolDetails.getPoolName());
                priceTxt.setText(String.valueOf(poolDetails.getPrice()));

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Pool for booking");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Pool for booking");
        }
    }//GEN-LAST:event_viewPoolBtnActionPerformed

    private void bookPoolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookPoolBtnActionPerformed
        // Book a vehicle after entering details
        PoolWorkRequest bookPool = new PoolWorkRequest();

        try {
            if (choosePoolDropdown.getSelectedItem() != null) {
                String poolName = String.valueOf(choosePoolDropdown.getSelectedItem());
                Pool poolDetails = system.getPoolDirectory().getPoolByName(poolName);

                Date selectedDate = poolBookingDateTxt.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                String strDate = dateFormat.format(selectedDate);
                Date bookingDate = dateFormat.parse(strDate);

                int numberOfHours = Integer.parseInt(numberOfHoursTxt.getText());

                bookPool.setPoolDetails(poolDetails);
                bookPool.setBookingDate(bookingDate);
                bookPool.setNumberOfHours(numberOfHours);
                bookPool.setUserId(user.getUserId());
                bookPool.setStatus("Pending");

                system.getPoolWorkRequestDirectory().getPoolWorkRequestList().add(bookPool);

                JOptionPane.showMessageDialog(this, "Pool booking request sent to Manager");
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(this, "Enter valid date and number of hours for booking a Pool");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid date and number of hours for booking a Pool");
        }
    }//GEN-LAST:event_bookPoolBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookPoolBtn;
    private javax.swing.JComboBox<String> choosePoolDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numberOfHoursTxt;
    private com.toedter.calendar.JDateChooser poolBookingDateTxt;
    private javax.swing.JTextField poolNameTxt;
    private javax.swing.JTable poolWorkQueueTable;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton viewPoolBtn;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {

        try {
            DefaultTableModel model = (DefaultTableModel) poolWorkQueueTable.getModel();
            model.setRowCount(0);

            for (PoolWorkRequest poolWorkRequest : system.getPoolWorkRequestDirectory().getPoolWorkRequestList()) {

                if (poolWorkRequest.getUserId().equals(user.getUserId())) {
                    Object[] newRow = new Object[6];
                    newRow[0] = poolWorkRequest.getPoolDetails().getPoolName();
                    newRow[1] = poolWorkRequest.getBookingDate();
                    newRow[2] = poolWorkRequest.getPoolDetails().getPrice();
                    newRow[3] = poolWorkRequest.getNumberOfHours();
                    newRow[4] = (poolWorkRequest.getPoolDetails().getPrice()*poolWorkRequest.getNumberOfHours());
                    newRow[5] = poolWorkRequest.getStatus();

                    model.addRow(newRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
