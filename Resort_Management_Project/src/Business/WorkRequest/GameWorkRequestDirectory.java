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
public class GameWorkRequestDirectory {
    
    ArrayList<GameWorkRequest> gameWorkRequestList;

    public GameWorkRequestDirectory() {
        this.gameWorkRequestList = new ArrayList<GameWorkRequest>();
    }
    
    public ArrayList<GameWorkRequest> getGameWorkRequestList() {
        return gameWorkRequestList;
    }

    public void setGameWorkRequestList(ArrayList<GameWorkRequest> gameWorkRequestList) {
        this.gameWorkRequestList = gameWorkRequestList;
    }
    
    public void updateGameWorkRequest(GameWorkRequest gameWRequest, int index) {
        this.gameWorkRequestList.set(index, gameWRequest);
    }
    
}
