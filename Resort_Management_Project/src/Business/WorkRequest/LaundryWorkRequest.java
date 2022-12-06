/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.HouseKeeping.LaundryFacility.Laundry;

/**
 *
 * @author Subbu
 */
public class LaundryWorkRequest {
    
    String userId;
    Laundry laundryDetails;
    String status;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Laundry getLaundryDetails() {
        return laundryDetails;
    }

    public void setLaundryDetails(Laundry laundryDetails) {
        this.laundryDetails = laundryDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
