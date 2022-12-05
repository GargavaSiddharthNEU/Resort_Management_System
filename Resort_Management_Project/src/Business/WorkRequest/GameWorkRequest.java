/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.Recreation.GamingFacility.Game;

/**
 *
 * @author Subbu
 */
public class GameWorkRequest {
    
    Long userId;
    Game gameDetails;
    int numberOfHours;
    String status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Game getGameDetails() {
        return gameDetails;
    }

    public void setGameDetails(Game gameDetails) {
        this.gameDetails = gameDetails;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
