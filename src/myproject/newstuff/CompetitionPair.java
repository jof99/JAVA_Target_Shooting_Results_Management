/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.newstuff;

/**
 *
 * @author Joel
 */
public class CompetitionPair {

    public Competitor person1;
    public Competitor person2;
    
    public CompetitionPair(Competitor person1, Competitor person2) {
        this.person1 = person1;
        this.person2 = person2;
    }
    
    public Competitor getPerson1() {
        return person1;
    }

    public Competitor getPerson2() {
        return person2;
    }

}