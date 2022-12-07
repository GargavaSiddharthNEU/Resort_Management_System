/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Recreation.PoolFacility;

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
    
}
