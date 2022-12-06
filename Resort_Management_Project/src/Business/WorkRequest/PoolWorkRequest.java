/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.Recreation.PoolFacility.Pool;

/**
 *
 * @author Subbu
 */
public class PoolWorkRequest {
    
    Long userId;
    Pool poolDetails;
    int numberOfHours;
    String status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
    
}
