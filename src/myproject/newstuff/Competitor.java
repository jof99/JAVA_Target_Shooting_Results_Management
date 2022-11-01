/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.newstuff;

/**
 *
 * @author Joel
 */
public class Competitor {
    
    private int id;
    private int opponentId;
    private String firstName;
    private String lastName;
    private int competitionId;
    private double initalScore;
    private double currentScore;
    private Competitor opponent;
    private int leagueId;

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    private ScheduledGame game;
    
    public Competitor(int competitorId, String firstName, String lastName, int competitionId, double initalScore, double currentScore, int opponentId, int leagueId) {
        this.id = competitorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.competitionId = competitionId;
        this.initalScore = initalScore;
        this.currentScore = currentScore;
        this.opponentId = opponentId;
        this.leagueId = leagueId;
    }
    public int getLeagueId() { 
        return leagueId;
    }
    public int getId() { 
        return id;
    }
    
    public int getOpponentId() { 
        return opponentId;
    }
    
    public String getName() {
        return firstName + " " + lastName;
    }
    
    public double getInitialScore() {
        return initalScore;
    }
    
    @Override
    public String toString() {
        return firstName + ":" + initalScore;
    }
    
    public ScheduledGame getGame() {
        return game;
    }

    public void setGame(ScheduledGame game) {
        this.game = game;
    }
    
    public double getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
    
    public Competitor getOpponent() {
        return opponent;
    }

    public void setOpponent(Competitor opponent) {
        this.opponent = opponent;
    }
    
}
