/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author Subbu
 */
public class LaundryWorkRequestDirectory {
    
    ArrayList<LaundryWorkRequest> laundryWorkRequestList;

    public LaundryWorkRequestDirectory() {
        this.laundryWorkRequestList = new ArrayList<LaundryWorkRequest>();
    }
    
    public ArrayList<LaundryWorkRequest> getLaundryWorkRequestList() {
        return laundryWorkRequestList;
    }

    public void setLaundryWorkRequestList(ArrayList<LaundryWorkRequest> laundryWorkRequestList) {
        this.laundryWorkRequestList = laundryWorkRequestList;
    }
    
    public void updateLaundryWorkRequest(LaundryWorkRequest laundryWRequest, int index) {
        this.laundryWorkRequestList.set(index, laundryWRequest);
    }
    
}
