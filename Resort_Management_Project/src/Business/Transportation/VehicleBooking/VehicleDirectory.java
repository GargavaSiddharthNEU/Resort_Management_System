/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Transportation.VehicleBooking;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class VehicleDirectory {
   private ArrayList<Vehicle> vehicleDirectory;
   
   public VehicleDirectory(){
        this.vehicleDirectory = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicleDirectory() {
        return vehicleDirectory;
    }

    public void setVehicleDirectory(ArrayList<Vehicle> vehicleDirectory) {
        this.vehicleDirectory = vehicleDirectory;
    }
    
    public Vehicle getVehicles(int index){
        Vehicle newVehicle = new Vehicle();
        newVehicle = vehicleDirectory.get(index);
        return newVehicle;
    }
    
    public Vehicle addVehicleDetails(){
        Vehicle newVehicle = new Vehicle();
        vehicleDirectory.add(newVehicle);
        
        return newVehicle;
    }
    
    public void deleteVehicle(Vehicle vehicle){
        vehicleDirectory.remove(vehicle);
    }
   
}
