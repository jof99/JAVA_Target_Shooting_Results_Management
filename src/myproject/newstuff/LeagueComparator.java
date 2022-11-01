/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.newstuff;

import java.util.Comparator;

/**
 *
 * @author Joel
 */
public class LeagueComparator implements Comparator<Competitor>  {
    
    @Override
    public int compare(Competitor a, Competitor b) {
        return a.getInitialScore() < b.getInitialScore() ? -1 : a.getInitialScore() == b.getInitialScore() ? 0 : 1;
    }
    
}