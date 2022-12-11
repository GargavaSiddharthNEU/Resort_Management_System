/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HouseKeeping.RoomCleaning;

import java.util.ArrayList;

/**
 *
 * @author Subbu
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

    public Schedule getScheduleById(String scheduleId) {
        
        Schedule selectedSchedule = new Schedule();
        for(Schedule schedule : scheduleDirectory) {
            if(schedule.getScheduleId().equals(scheduleId)) {
                selectedSchedule = schedule;
                break;
            }
        }
        return selectedSchedule;
    }
    
    public void updateSchedule (Schedule schedule) {
        Schedule newSchedule = new Schedule();
        
        int position = 0;
        for (int iter = 0; iter < scheduleDirectory.size(); iter++) {
            if((scheduleDirectory.get(iter).getScheduleId()).equals(schedule.getScheduleId())) {
                position = iter;
                break;
            }
        }

        newSchedule.setScheduleId(schedule.getScheduleId());        
        newSchedule.setDate(schedule.getDate());
        newSchedule.setRoomNumber(schedule.getRoomNumber());
        newSchedule.setTime(schedule.getTime());
        newSchedule.setStatus(schedule.getStatus());
        newSchedule.setUser(schedule.getUser());
        
        scheduleDirectory.set(position, newSchedule);
    }
}
