/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HouseKeeping.RoomCleaning;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class JanitorScheduleDirectory {
    
    ArrayList<Schedule> scheduleDirectory;

    public JanitorScheduleDirectory() {
        this.scheduleDirectory = new ArrayList<Schedule>();
    }
    
    public ArrayList<Schedule> getScheduleDirectory() {
        return scheduleDirectory;
    }

    public void setScheduleDirectory(ArrayList<Schedule> scheduleDirectory) {
        this.scheduleDirectory = scheduleDirectory;
    }
    
    
}
