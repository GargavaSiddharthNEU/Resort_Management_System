/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.Recreation.PoolFacility.Pool;
import java.util.Date;

/**
 *
 * @author Subbu
 */
public class PoolWorkRequest {
    
    String userId;
    Pool poolDetails;
    int numberOfHours;
    Date bookingDate;
    String status;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Pool getPoolDetails() {
        return poolDetails;
    }

    public void setPoolDetails(Pool poolDetails) {
        this.poolDetails = poolDetails;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return userId;
    }
    
}
