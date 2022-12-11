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
public class PoolWorkRequestDirectory {
    
    ArrayList<PoolWorkRequest> poolWorkRequestList;

    public PoolWorkRequestDirectory() {
        this.poolWorkRequestList = new ArrayList<PoolWorkRequest>();
    }
    
    public ArrayList<PoolWorkRequest> getPoolWorkRequestList() {
        return poolWorkRequestList;
    }

    public void setPoolWorkRequestList(ArrayList<PoolWorkRequest> poolWorkRequestList) {
        this.poolWorkRequestList = poolWorkRequestList;
    }
    
     public void updatePoolWorkRequest(PoolWorkRequest poolWRequest, int index) {
        this.poolWorkRequestList.set(index, poolWRequest);
    }
    
}
