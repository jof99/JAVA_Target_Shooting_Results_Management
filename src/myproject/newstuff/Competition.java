/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.newstuff;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel
 */
public class Competition {
    
    private int id;
    private String name;
    private List<ScheduledGame> games;
    
    public Competition() {
        games = new ArrayList<>();
    }
    
    public void addGame(ScheduledGame game) {
        games.add(game);
    }
    
    public ScheduledGame getGameByIndex(int index) {
        return games.get(index);
    }
    
    public void pairCompetitors(ScheduledGame game, int week) {
        List<Competitor> competitors = game.getCompetitors();
        
        GameResult gameOneResult = null;
        GameResult gameTwoResult = null;
        
        switch(week) {
            case 1:
                gameOneResult = game.simulate(competitors.get(0), competitors.get(1));
                gameTwoResult = game.simulate(competitors.get(2), competitors.get(3));
                
               
                System.out.println("Game 1 winner: " + gameOneResult.getWinner().getName());
                System.out.println("Game 1 loser: " + gameOneResult.getLoser().getName());
                
                System.out.println("Game 2 winner: " + gameTwoResult.getWinner().getName());
                System.out.println("Game 2 loser: " + gameTwoResult.getLoser().getName());
                
                break;
      
        }
        
        
    }
    
    public void showGames() {
        
        for(ScheduledGame game : games) {
            
            List<Competitor> competitors = game.getCompetitors();
            for(Competitor competitor : competitors) {
                
                System.out.println(competitor.getName() + ": " + competitor.getGame().getLeague() + " score: " + competitor.getInitialScore());
            }
            
        }
        
    }
    
    
}