/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Transportation.VehicleBooking.Vehicle;
import Business.WorkRequest.VehicleWorkRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.MutableComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class VehicleBookingPanel extends javax.swing.JPanel {

    /**
     * Creates new form VehicleBookingPanel
     */
    EcoSystem system;

    public VehicleBookingPanel(EcoSystem system) {
        initComponents();
        this.system = system;

        MutableComboBoxModel<String> model = new DefaultComboBoxModel<String>();

        for (Vehicle vehicleList : system.getVehicleDirectory().getVehicleDirectory()) {
            model.addElement(vehicleList.getVehicleName());
        }

        chooseVehicleDropdown.setModel(model);

        vehicleNameTxt.setEditable(false);
        vehicleCategoryTxt.setEditable(false);
        vehicleSeaterTxt.setEditable(false);
        priceTxt.setEditable(false);
        vehicleNumberTxt.setEditable(false);
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
        chooseVehicleDropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vehicleNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vehicleCategoryTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        vehicleSeaterTxt = new javax.swing.JTextField();
        viewVehicleBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numberOfHoursTxt = new javax.swing.JTextField();
        vehicleBookingDateTxt = new com.toedter.calendar.JDateChooser();
        bookVehicleBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleWorkQueueTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vehicleNumberTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Book A Vehicle");

        jLabel2.setText("Choose a vehicle of your choice:");

        jLabel3.setText("Vehicle Name:");

        jLabel4.setText("Vehicle Category:");

        jLabel5.setText("Vehicle Seater:");

        viewVehicleBtn.setText("View Details");
        viewVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVehicleBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Price per hour:");

        jLabel7.setText("Select Vehicle Booking Date:");

        jLabel8.setText("Enter Number of Hours:");

        bookVehicleBtn.setText("Book Vehicle");
        bookVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookVehicleBtnActionPerformed(evt);
            }
        });

        vehicleWorkQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Name", "Price per hour", "Number of hours", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vehicleWorkQueueTable);

        jLabel9.setText("Vehicle Booking Status");

        jLabel10.setText("Vehicle Number:");

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
                        .addGap(213, 213, 213)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(chooseVehicleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(viewVehicleBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(vehicleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(vehicleCategoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(vehicleSeaterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(vehicleBookingDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(numberOfHoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookVehicleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(vehicleNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 32, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(414, 414, 414))
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
                            .addComponent(chooseVehicleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewVehicleBtn))))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vehicleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(vehicleCategoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(vehicleSeaterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(vehicleNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(numberOfHoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(vehicleBookingDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(bookVehicleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVehicleBtnActionPerformed
        // View Vehicle Details on choosing

        try {
            if (chooseVehicleDropdown.getSelectedItem() != null) {

                String vehicleName = String.valueOf(chooseVehicleDropdown.getSelectedItem());
                Vehicle vehicleDetails = system.getVehicleDirectory().getVehicleByName(vehicleName);

                vehicleNameTxt.setText(vehicleDetails.getVehicleName());
                vehicleCategoryTxt.setText(vehicleDetails.getCategory());
                vehicleSeaterTxt.setText(String.valueOf(vehicleDetails.getSeater()));
                vehicleNumberTxt.setText(vehicleDetails.getVehicleNumber());
                priceTxt.setText(String.valueOf(vehicleDetails.getPrice()));

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Vehicle for booking");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_viewVehicleBtnActionPerformed

    private void bookVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookVehicleBtnActionPerformed
        // Book a vehicle after entering details
        VehicleWorkRequest bookVehicle = new VehicleWorkRequest();

        try {

            String vehicleName = String.valueOf(chooseVehicleDropdown.getSelectedItem());
            Vehicle vehicleDetails = system.getVehicleDirectory().getVehicleByName(vehicleName);

            String dateValue = ((JTextField) vehicleBookingDateTxt.getDateEditor().getUiComponent()).getText();
            Date bookingDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateValue);
            int numberOfHours = Integer.parseInt(numberOfHoursTxt.getText());

            bookVehicle.setVehicleDetails(vehicleDetails);
            bookVehicle.setBookingDate(bookingDate);
            bookVehicle.setNumberOfHours(numberOfHours);
            bookVehicle.setUserId(dateValue);
            bookVehicle.setStatus("Pending");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_bookVehicleBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookVehicleBtn;
    private javax.swing.JComboBox<String> chooseVehicleDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numberOfHoursTxt;
    private javax.swing.JTextField priceTxt;
    private com.toedter.calendar.JDateChooser vehicleBookingDateTxt;
    private javax.swing.JTextField vehicleCategoryTxt;
    private javax.swing.JTextField vehicleNameTxt;
    private javax.swing.JTextField vehicleNumberTxt;
    private javax.swing.JTextField vehicleSeaterTxt;
    private javax.swing.JTable vehicleWorkQueueTable;
    private javax.swing.JButton viewVehicleBtn;
    // End of variables declaration//GEN-END:variables
}
