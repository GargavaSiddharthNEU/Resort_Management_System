/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Recreation.GamingFacility;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class GameDirectory {

    ArrayList<Game> gameDirectory;

    public GameDirectory() {
        this.gameDirectory = new ArrayList<>();
    }

    public ArrayList<Game> getGameDirectory() {
        return gameDirectory;
    }

    public void setGameDirectory(ArrayList<Game> gameDirectory) {
        this.gameDirectory = gameDirectory;
    }

    public Game getGameByName(String gameName) {

        Game selectedGame = new Game();
        for (Game game : gameDirectory) {
            if (game.getGameName().equals(gameName)) {
                selectedGame = game;
                break;
            }
        }
        return selectedGame;
    }

}
