/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.FoodandBev.Menu.FBItem;
import java.util.ArrayList;

/**
 *
 * @author Subbu
 */
public class FoodBevWorkRequest {
    
    Long userId;
    ArrayList<FBItem> fbItemDetails;
    String status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public ArrayList<FBItem> getFbItemDetails() {
        return fbItemDetails;
    }

    public void setFbItemDetails(ArrayList<FBItem> fbItemDetails) {
        this.fbItemDetails = fbItemDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
