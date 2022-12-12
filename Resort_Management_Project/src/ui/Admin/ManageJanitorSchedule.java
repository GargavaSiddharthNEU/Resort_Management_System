/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import Business.EcoSystem;
import Business.HouseKeeping.RoomCleaning.JanitorScheduleDirectory;
import Business.HouseKeeping.RoomCleaning.Schedule;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Subbu
 */
public class ManageJanitorSchedule extends javax.swing.JPanel {

    /**
     * Creates new form ManageJanitorSchedule
     */
    EcoSystem system;

    public ManageJanitorSchedule(EcoSystem system) {
        initComponents();
        this.system = system;

        populateTable();
    }
    
    public void resetData() {
        roomNumberTxt.setText("");
        timeTxt.setText("");
        dateTxt.setCalendar(null);
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
        jLabel2 = new javax.swing.JLabel();
        roomNumberTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        timeTxt = new javax.swing.JTextField();
        dateTxt = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        addScheduleBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Assign Janitor Schedule");

        jLabel2.setText("Set Room Number:");

        jLabel3.setText("Set Cleaning Time:");

        jLabel4.setText("Set Cleaning Date:");

        addScheduleBtn.setText("Add Schedule");
        addScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addScheduleBtnActionPerformed(evt);
            }
        });

        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schedule ID", "Room Number", "Cleaning Date", "Status", "Janitor Name", "Janitor ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(scheduleTable);

        jLabel5.setText("Assigned Schedule History");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Pictures\\janitor.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(roomNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(timeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(303, 303, 303)
                                        .addComponent(addScheduleBtn)))
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(304, 304, 304))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(266, 266, 266)))))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(619, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(roomNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(timeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(addScheduleBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScheduleBtnActionPerformed
        // TODO add your handling code here:

        try {

            if (roomNumberTxt.getText() != null && timeTxt.getText() != null) {
                Schedule newSchedule = new Schedule();

                UUID uuid = UUID.randomUUID();
                String randomUUIDString = uuid.toString();

                String roomNumber = roomNumberTxt.getText();
                String cleaningTime = timeTxt.getText();

                Date selectedDate = dateTxt.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                String strDate = dateFormat.format(selectedDate);
                Date cleaningDate = dateFormat.parse(strDate);

                newSchedule.setScheduleId(randomUUIDString);
                newSchedule.setRoomNumber(roomNumber);
                newSchedule.setDate(cleaningDate);
                newSchedule.setTime(cleaningTime);
                newSchedule.setStatus("Pending");

                system.getJanitorScheduleDirectory().getScheduleDirectory().add(newSchedule);
                JOptionPane.showMessageDialog(this, "Schedule added successfully");
                populateTable();
                resetData();
            } else {
                JOptionPane.showMessageDialog(this, "Give valid inputs for adding a schedule");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Give valid inputs for adding a schedule");
        }
    }//GEN-LAST:event_addScheduleBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addScheduleBtn;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField roomNumberTxt;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JTextField timeTxt;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        try {
            DefaultTableModel model = (DefaultTableModel) scheduleTable.getModel();
            model.setRowCount(0);

            for (Schedule schedule : system.getJanitorScheduleDirectory().getScheduleDirectory()) {

                Object[] newRow = new Object[6];
                newRow[0] = schedule.getScheduleId();
                newRow[1] = schedule.getRoomNumber();
                newRow[2] = schedule.getDate();
                newRow[3] = schedule.getStatus();
                if (schedule.getUser() != null) {
                    newRow[4] = (schedule.getUser().getFirstName() + " " + schedule.getUser().getLastName());
                    newRow[5] = schedule.getUser().getUserId();
                }
                model.addRow(newRow);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
