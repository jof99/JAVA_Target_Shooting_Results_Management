/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.newstuff;

/**
 *
 * @author Joel
 */
public class Game {
    
    private int gameId;
    private String gameName;
    
    public int getId() { 
        return gameId;
    }
    public String getGameName() { 
        return gameName;
    }
     public void setGameId(int gameId) { 
        this.gameId = gameId;
    }
     
    public void setGameName(String gameName) { 
        this.gameName = gameName;
    }   

    public void games (int gameId, String gameName) { 
        this.gameId = gameId;
        this.gameName = gameName;
    }
}
