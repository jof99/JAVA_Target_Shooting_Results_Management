/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.newstuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Joel
 */
public class ScheduledGame {
    
    private int id;
    private String name;
    private League league;
    private List<Competitor> competitors;
    private int weekNo;
    
    public ScheduledGame(int weekNo, League league) {
        this.league = league;
        this.weekNo = weekNo;
        competitors = new ArrayList<>();
    }
    
    public int getWeekNo() {
        return weekNo;
    }
    
    private Random random = new Random();
    
    public GameResult simulate(Competitor competitorOne, Competitor competitorTwo) {  
        GameResult result = new GameResult();
        competitorOne.setCurrentScore(random.nextInt(1000));
        competitorTwo.setCurrentScore(random.nextInt(1000));
        // what if equal
        if(competitorOne.getCurrentScore() > competitorTwo.getCurrentScore()) { 
            result.setWinner(competitorOne); 
            result.setLoser(competitorTwo);
        } else { 
            result.setWinner(competitorTwo);
            result.setLoser(competitorOne);
        }
        return result;
    }
    
    public League getLeague() {
        return league;
    }
    
    public List<Competitor> getCompetitors() {
        return competitors;
    }
    
    public void addCompetitor(Competitor competitor) {
        competitors.add(competitor);
    }
    
    public Competitor getWinner() {
        return null;
    }
    
}
