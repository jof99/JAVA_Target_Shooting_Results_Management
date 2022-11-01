/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.newstuff;

/**
 *
 * @author Joel
 */
public enum League {
    
    RANK_1("Name 1", 1),
    RANK_2("Name 2", 2),
    RANK_3("Name 3", 3);
    
    int rank;
    String name;
    
    League(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    
    public String getName() {
        return this.name;
    }
   
    public int getRank() {
        return this.rank;
    }
    
}
