/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.FoodandBev.Menu.FBItemDirectory;
import Business.HouseKeeping.LaundryFacility.LaundryDirectory;
//import Business.HouseKeeping.RoomCleaning.ScheduleDirectory;
import Business.Recreation.GamingFacility.GameDirectory;
import Business.Recreation.PoolFacility.PoolDirectory;
import Business.Shopping.InhouseShopping.SouvenirDirectory;
import Business.TransactionHistory.CustomerTransactionDirectory;
import Business.Transportation.VehicleBooking.VehicleDirectory;
import Business.User.UserDirectory;
import Business.WorkRequest.FoodBevWorkRequestDirectory;
import Business.WorkRequest.GameWorkRequestDirectory;
import Business.WorkRequest.LaundryWorkRequestDirectory;
import Business.WorkRequest.PoolWorkRequestDirectory;
import Business.WorkRequest.VehicleWorkRequestDirectory;

/**
 *
 * @author Subbu
 */
public class EcoSystem {

    private static EcoSystem ecoSystem;
    UserDirectory userDirectory;
    VehicleDirectory vehicleDirectory;
    SouvenirDirectory souvenirDirectory;
    PoolDirectory poolDirectory;
    GameDirectory gameDirectory;
//    ScheduleDirectory scheduleDirectory;
    LaundryDirectory laundryDirectory;
    FBItemDirectory fBItemDirectory;
    FoodBevWorkRequestDirectory foodBevWorkRequestDirectory;
    GameWorkRequestDirectory gameWorkRequestDirectory;
    LaundryWorkRequestDirectory laundryWorkRequestDirectory;
    PoolWorkRequestDirectory poolWorkRequestDirectory;
    VehicleWorkRequestDirectory vehicleWorkRequestDirectory;
    CustomerTransactionDirectory customerTransactionDirectory;

    public FoodBevWorkRequestDirectory getFoodBevWorkRequestDirectory() {
        return foodBevWorkRequestDirectory;
    }

    public void setFoodBevWorkRequestDirectory(FoodBevWorkRequestDirectory foodBevWorkRequestDirectory) {
        this.foodBevWorkRequestDirectory = foodBevWorkRequestDirectory;
    }

    public GameWorkRequestDirectory getGameWorkRequestDirectory() {
        return gameWorkRequestDirectory;
    }

    public void setGameWorkRequestDirectory(GameWorkRequestDirectory gameWorkRequestDirectory) {
        this.gameWorkRequestDirectory = gameWorkRequestDirectory;
    }

    public LaundryWorkRequestDirectory getLaundryWorkRequestDirectory() {
        return laundryWorkRequestDirectory;
    }

    public void setLaundryWorkRequestDirectory(LaundryWorkRequestDirectory laundryWorkRequestDirectory) {
        this.laundryWorkRequestDirectory = laundryWorkRequestDirectory;
    }

    public PoolWorkRequestDirectory getPoolWorkRequestDirectory() {
        return poolWorkRequestDirectory;
    }

    public void setPoolWorkRequestDirectory(PoolWorkRequestDirectory poolWorkRequestDirectory) {
        this.poolWorkRequestDirectory = poolWorkRequestDirectory;
    }

    public VehicleWorkRequestDirectory getVehicleWorkRequestDirectory() {
        return vehicleWorkRequestDirectory;
    }

    public void setVehicleWorkRequestDirectory(VehicleWorkRequestDirectory vehicleWorkRequestDirectory) {
        this.vehicleWorkRequestDirectory = vehicleWorkRequestDirectory;
    }

    public CustomerTransactionDirectory getCustomerTransactionDirectory() {
        return customerTransactionDirectory;
    }

    public void setCustomerTransactionDirectory(CustomerTransactionDirectory customerTransactionDirectory) {
        this.customerTransactionDirectory = customerTransactionDirectory;
    }
    
    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public VehicleDirectory getVehicleDirectory() {
        return vehicleDirectory;
    }

    public void setVehicleDirectory(VehicleDirectory vehicleDirectory) {
        this.vehicleDirectory = vehicleDirectory;
    }

    public SouvenirDirectory getSouvenirDirectory() {
        return souvenirDirectory;
    }

    public void setSouvenirDirectory(SouvenirDirectory souvenirDirectory) {
        this.souvenirDirectory = souvenirDirectory;
    }

    public PoolDirectory getPoolDirectory() {
        return poolDirectory;
    }

    public void setPoolDirectory(PoolDirectory poolDirectory) {
        this.poolDirectory = poolDirectory;
    }

    public GameDirectory getGameDirectory() {
        return gameDirectory;
    }

    public void setGameDirectory(GameDirectory gameDirectory) {
        this.gameDirectory = gameDirectory;
    }

//    public ScheduleDirectory getScheduleDirectory() {
//        return scheduleDirectory;
//    }
//
//    public void setScheduleDirectory(ScheduleDirectory scheduleDirectory) {
//        this.scheduleDirectory = scheduleDirectory;
//    }

    public LaundryDirectory getLaundryDirectory() {
        return laundryDirectory;
    }

    public void setLaundryDirectory(LaundryDirectory laundryDirectory) {
        this.laundryDirectory = laundryDirectory;
    }

    public FBItemDirectory getFBItemDirectory() {
        return fBItemDirectory;
    }

    public void setfBItemDirectory(FBItemDirectory fBItemDirectory) {
        this.fBItemDirectory = fBItemDirectory;
    }

    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    private EcoSystem() {

        userDirectory = new UserDirectory();
        vehicleDirectory = new VehicleDirectory();
        souvenirDirectory = new SouvenirDirectory();
        poolDirectory = new PoolDirectory();
        gameDirectory = new GameDirectory();
//        scheduleDirectory = new ScheduleDirectory();
        laundryDirectory = new LaundryDirectory();
        fBItemDirectory = new FBItemDirectory();
        foodBevWorkRequestDirectory = new FoodBevWorkRequestDirectory();
        gameWorkRequestDirectory = new GameWorkRequestDirectory();
        laundryWorkRequestDirectory = new LaundryWorkRequestDirectory();
        poolWorkRequestDirectory = new PoolWorkRequestDirectory();
        vehicleWorkRequestDirectory = new VehicleWorkRequestDirectory();
        customerTransactionDirectory = new CustomerTransactionDirectory();
    }
}
