/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodandBev.Menu;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class FBItemDirectory {
    private ArrayList<FBItem> fbItemDirectoryList;

    public ArrayList<FBItem> getFbItemDirectoryList() {
        return fbItemDirectoryList;
    }

    public void setFbItemDirectoryList(ArrayList<FBItem> fbItemDirectoryList) {
        this.fbItemDirectoryList = fbItemDirectoryList;
    }
    
    public FBItemDirectory() {
        this.fbItemDirectoryList = new ArrayList<>();
    }
    
    public void addNewMenuData(FBItem fb) {
        this.fbItemDirectoryList.add(fb);
    }
    
}
