/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Recreation.PoolFacility;

import Business.Transportation.VehicleBooking.Vehicle;
import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class PoolDirectory {
    ArrayList<Pool> poolDirectory;
    
    public PoolDirectory(){
        this.poolDirectory = new ArrayList<>();
    }

    public ArrayList<Pool> getPoolDirectory() {
        return poolDirectory;
    }

    public void setPoolDirectory(ArrayList<Pool> poolDirectory) {
        this.poolDirectory = poolDirectory;
    }
    
    public Pool getPools(int index){
        Pool newPool = new Pool();
        newPool = poolDirectory.get(index);
        return newPool;
    }
    
    public Pool addPoolDetails(){
        Pool newPool = new Pool();
        poolDirectory.add(newPool);
        
        return newPool;
    }
    
    public Pool getPoolByName(String poolName) {
        
        Pool selectedPool = new Pool();
        for(Pool pool : poolDirectory) {
            if(pool.getPoolName().equals(poolName)) {
                selectedPool = pool;
                break;
            }
        }
        return selectedPool;
    }
    
    public void deletePool(Pool pool){
        poolDirectory.remove(pool);
    }
    
}
