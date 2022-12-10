/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HouseKeeping.LaundryFacility;
import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class LaundryDirectory {
    ArrayList<Laundry> laundryDirectory;
    
    public LaundryDirectory(){
        this.laundryDirectory = new ArrayList<>();
    }

    public ArrayList<Laundry> getLaundryDirectory() {
        return laundryDirectory;
    }

    public void setLaundryDirectory(ArrayList<Laundry> laundryDirectory) {
        this.laundryDirectory = laundryDirectory;
    }
    
    public Laundry getLaundries(int index){
        Laundry newLaundry = new Laundry();
        newLaundry = laundryDirectory.get(index);
        return newLaundry;
    }
    
    public Laundry addLaundryDetails(){
        Laundry newLaundry = new Laundry();
        laundryDirectory.add(newLaundry);
        
        return newLaundry;
    }
    
    public Laundry getLaundryByName(String laundryName) {
        
        Laundry selectedLaundry = new Laundry();
        for(Laundry laundry : laundryDirectory) {
            if(laundry.getCategory().equals(laundryName)) {
                selectedLaundry = laundry;
                break;
            }
        }
        return selectedLaundry;
    }
    
    public void deleteLaundry(Laundry laundry){
        laundryDirectory.remove(laundry);
    }

}
