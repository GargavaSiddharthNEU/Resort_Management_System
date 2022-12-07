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
public class FoodBevWorkRequestDirectory {
    
    ArrayList<FoodBevWorkRequest> foodBevWorkRequestList;
    
    public FoodBevWorkRequestDirectory() {
        this.foodBevWorkRequestList = new ArrayList<FoodBevWorkRequest>();
    }
    
    public ArrayList<FoodBevWorkRequest> getFoodBevWorkRequestList() {
        return foodBevWorkRequestList;
    }

    public void setFoodBevWorkRequestList(ArrayList<FoodBevWorkRequest> foodBevWorkRequestList) {
        this.foodBevWorkRequestList = foodBevWorkRequestList;
    }
    
    public void updateFoodBevWorkRequest(FoodBevWorkRequest fbr, int index) {
        this.foodBevWorkRequestList.set(index, fbr);
    }
    
}
