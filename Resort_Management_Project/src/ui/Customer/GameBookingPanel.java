/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Recreation.GamingFacility.Game;
import Business.User.User;
import Business.WorkRequest.GameWorkRequest;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.MutableComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Subbu
 */
public class GameBookingPanel extends javax.swing.JPanel {

    /**
     * Creates new form GameBookingPanel
     */
    
    EcoSystem system;
    User user;

    public GameBookingPanel(EcoSystem system, User user) {
        initComponents();
        
        this.system = system;
        this.user = user;
        
        MutableComboBoxModel<String> model = new DefaultComboBoxModel<String>();

        for (Game gameList : system.getGameDirectory().getGameDirectory()) {
            model.addElement(gameList.getGameName());
        }

        chooseGameDropdown.setModel(model);

        gameNameTxt.setEditable(false);
        gameCategoryTxt.setEditable(false);
        priceTxt.setEditable(false);

        populateRequestTable();
        formatRows();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewGameBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numberOfHoursTxt = new javax.swing.JTextField();
        gameBookingDateTxt = new com.toedter.calendar.JDateChooser();
        bookGameBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameWorkQueueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        chooseGameDropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gameNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gameCategoryTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        viewGameBtn.setText("View Details");
        viewGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGameBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Price per hour:");

        jLabel7.setText("Select Game Booking Date:");

        jLabel8.setText("Enter Number of Hours:");

        gameBookingDateTxt.setDateFormatString("MM/dd/yyyy");

        bookGameBtn.setText("Book Game");
        bookGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookGameBtnActionPerformed(evt);
            }
        });

        gameWorkQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Game Name", "Game Category", "Booking Date", "Price per hour", "Number of hours", "Total price", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(gameWorkQueueTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Book A Game");

        jLabel2.setText("Choose a game of your choice:");

        jLabel3.setText("Game Name:");

        jLabel4.setText("Game Category:");

        jLabel9.setText("Game Booking Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(383, 383, 383)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(chooseGameDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(viewGameBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(gameBookingDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(numberOfHoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(gameNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(gameCategoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jLabel9)))
                .addContainerGap(34, Short.MAX_VALUE))
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
                            .addComponent(chooseGameDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewGameBtn))))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gameNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(gameCategoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(gameBookingDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(numberOfHoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(bookGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGameBtnActionPerformed
        // View Vehicle Details on choosing

        try {
            if (chooseGameDropdown.getSelectedItem() != null) {

                String gameName = String.valueOf(chooseGameDropdown.getSelectedItem());
                Game gameDetails = system.getGameDirectory().getGameByName(gameName);

                gameNameTxt.setText(gameDetails.getGameName());
                gameCategoryTxt.setText(gameDetails.getGameCategory());
                priceTxt.setText(String.valueOf(gameDetails.getPrice()));

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Game for booking");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Game for booking");
        }
    }//GEN-LAST:event_viewGameBtnActionPerformed

    private void bookGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookGameBtnActionPerformed
        // Book a vehiclgameBookingDateTxtils
        GameWorkRequest bookGame = new GameWorkRequest();

        try {
            if (chooseGameDropdown.getSelectedItem() != null) {
                String gameName = String.valueOf(chooseGameDropdown.getSelectedItem());
                Game gameDetails = system.getGameDirectory().getGameByName(gameName);

                Date selectedDate = gameBookingDateTxt.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                String strDate = dateFormat.format(selectedDate);
                Date bookingDate = dateFormat.parse(strDate);

                int numberOfHours = Integer.parseInt(numberOfHoursTxt.getText());

                bookGame.setGameDetails(gameDetails);
                bookGame.setBookingDate(bookingDate);
                bookGame.setNumberOfHours(numberOfHours);
                bookGame.setUserId(user.getUserId());
                bookGame.setStatus("Pending");

                system.getGameWorkRequestDirectory().getGameWorkRequestList().add(bookGame);

                JOptionPane.showMessageDialog(this, "Game booking request sent to Incharge");
                populateRequestTable();
                clearFields();
                formatRows();
                
            } else {
                JOptionPane.showMessageDialog(this, "Enter valid date and number of hours for booking a Game");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid date and number of hours for booking a Game");
        }
    }//GEN-LAST:event_bookGameBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookGameBtn;
    private javax.swing.JComboBox<String> chooseGameDropdown;
    private com.toedter.calendar.JDateChooser gameBookingDateTxt;
    private javax.swing.JTextField gameCategoryTxt;
    private javax.swing.JTextField gameNameTxt;
    private javax.swing.JTable gameWorkQueueTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numberOfHoursTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton viewGameBtn;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        
        try {
            DefaultTableModel model = (DefaultTableModel) gameWorkQueueTable.getModel();
            model.setRowCount(0);

            for (GameWorkRequest gameWorkRequest : system.getGameWorkRequestDirectory().getGameWorkRequestList()) {

                if (gameWorkRequest.getUserId().equals(user.getUserId())) {
                    Object[] newRow = new Object[7];
                    newRow[0] = gameWorkRequest.getGameDetails().getGameName();
                    newRow[1] = gameWorkRequest.getGameDetails().getGameCategory();
                    newRow[2] = gameWorkRequest.getBookingDate();
                    newRow[3] = gameWorkRequest.getGameDetails().getPrice();
                    newRow[4] = gameWorkRequest.getNumberOfHours();
                    newRow[5] = (gameWorkRequest.getNumberOfHours()*gameWorkRequest.getGameDetails().getPrice());
                    newRow[6] = gameWorkRequest.getStatus();

                    model.addRow(newRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearFields() {
        
        gameNameTxt.setText("");
        gameCategoryTxt.setText("");
        priceTxt.setText("");
        numberOfHoursTxt.setText("");
        gameBookingDateTxt.setCalendar(null);
    }
    
    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) gameWorkQueueTable.getModel();

        gameWorkQueueTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 6));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

    }
}
