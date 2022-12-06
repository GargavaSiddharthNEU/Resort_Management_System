/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.FoodandBev.Menu.FBItemDirectory;
import Business.HouseKeeping.LaundryFacility.LaundryDirectory;
import Business.HouseKeeping.RoomCleaning.ScheduleDirectory;
import Business.Recreation.GamingFacility.GameDirectory;
import Business.Recreation.PoolFacility.PoolDirectory;
import Business.Shopping.InhouseShopping.SouvenirDirectory;
import Business.TransactionHistory.CustomerTransaction;
import Business.Transportation.VehicleBooking.VehicleDirectory;
import Business.User.UserDirectory;
import Business.WorkRequest.FoodBevWorkRequest;
import Business.WorkRequest.GameWorkRequest;
import Business.WorkRequest.LaundryWorkRequest;
import Business.WorkRequest.PoolWorkRequest;
import Business.WorkRequest.VehicleWorkRequest;

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
    ScheduleDirectory scheduleDirectory;
    LaundryDirectory laundryDirectory;
    FBItemDirectory fBItemDirectory;
    FoodBevWorkRequest foodBevWorkRequest;
    GameWorkRequest gameWorkRequest;
    LaundryWorkRequest laundryWorkRequest;
    PoolWorkRequest poolWorkRequest;
    VehicleWorkRequest vehicleWorkRequest;
    CustomerTransaction customerTransaction;

    public CustomerTransaction getCustomerTransaction() {
        return customerTransaction;
    }

    public void setCustomerTransaction(CustomerTransaction customerTransaction) {
        this.customerTransaction = customerTransaction;
    }

    public FoodBevWorkRequest getFoodBevWorkRequest() {
        return foodBevWorkRequest;
    }

    public void setFoodBevWorkRequest(FoodBevWorkRequest foodBevWorkRequest) {
        this.foodBevWorkRequest = foodBevWorkRequest;
    }

    public GameWorkRequest getGameWorkRequest() {
        return gameWorkRequest;
    }

    public void setGameWorkRequest(GameWorkRequest gameWorkRequest) {
        this.gameWorkRequest = gameWorkRequest;
    }

    public LaundryWorkRequest getLaundryWorkRequest() {
        return laundryWorkRequest;
    }

    public void setLaundryWorkRequest(LaundryWorkRequest laundryWorkRequest) {
        this.laundryWorkRequest = laundryWorkRequest;
    }

    public PoolWorkRequest getPoolWorkRequest() {
        return poolWorkRequest;
    }

    public void setPoolWorkRequest(PoolWorkRequest poolWorkRequest) {
        this.poolWorkRequest = poolWorkRequest;
    }

    public VehicleWorkRequest getVehicleWorkRequest() {
        return vehicleWorkRequest;
    }

    public void setVehicleWorkRequest(VehicleWorkRequest vehicleWorkRequest) {
        this.vehicleWorkRequest = vehicleWorkRequest;
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

    public ScheduleDirectory getScheduleDirectory() {
        return scheduleDirectory;
    }

    public void setScheduleDirectory(ScheduleDirectory scheduleDirectory) {
        this.scheduleDirectory = scheduleDirectory;
    }

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
        scheduleDirectory = new ScheduleDirectory();
        laundryDirectory = new LaundryDirectory();
        fBItemDirectory = new FBItemDirectory();
        foodBevWorkRequest = new FoodBevWorkRequest();
        gameWorkRequest = new GameWorkRequest();
        laundryWorkRequest = new LaundryWorkRequest();
        poolWorkRequest = new PoolWorkRequest();
        vehicleWorkRequest = new VehicleWorkRequest();
        customerTransaction = new CustomerTransaction();
    }
}
