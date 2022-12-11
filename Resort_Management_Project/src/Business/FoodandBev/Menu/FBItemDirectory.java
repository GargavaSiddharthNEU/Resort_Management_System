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
    
    public FBItemDirectory() {
        this.fbItemDirectoryList = new ArrayList<>();
    }

    public ArrayList<FBItem> getFbItemDirectoryList() {
        return fbItemDirectoryList;
    }

    public void setFbItemDirectoryList(ArrayList<FBItem> fbItemDirectoryList) {
        this.fbItemDirectoryList = fbItemDirectoryList;
    }
    
    public void addNewMenuData(FBItem fb) {
        this.fbItemDirectoryList.add(fb);
    }
    
    public void deleteMenuData(FBItem fb) {
        this.fbItemDirectoryList.remove(fb);
    }
    
    public void updateExistingMenuData(FBItem fb, int index) {
        this.fbItemDirectoryList.set(index, fb);
    }
    
    public FBItem getItemByName(String itemName) {

        FBItem selectedItem = new FBItem();
        for (FBItem item : fbItemDirectoryList) {
            if (item.getFbName().equals(itemName)) {
                selectedItem = item;
                break;
            }
        }
        return selectedItem;
    }
}
