/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.newstuff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.api.scripting.ScriptObjectMirror;
import myproject.DbConnection;

/**
 *
 * @author Joel
 */
public class SomeTest {

    public static void main(String[] args) {
 
        
        List<Competitor> competitorList = GameManager.getSingleton().getCompetitorsForCompetition(8);
 
        //List<SomeObject> container = new ArrayList<>();
        Map<Integer, SomePair> pairs = new HashMap<>();
        
        
//        SomeObject person1 = new SomeObject("Person 1", 100, 101);
//        SomeObject person2 = new SomeObject("Person 2", 101, 100);
//        container.add(person1);
//        container.add(person2);
        
        for(Competitor o : competitorList) {
            int key = o.getId() + o.getOpponentId();
            if(!pairs.containsKey(key)) {
                pairs.put(key, new SomePair());
                // get the pair
                SomePair pair = pairs.get(key);
                pair.person1 = GameManager.getSingleton().getCompetitorById(o.getId(), competitorList);
                pair.person2 = GameManager.getSingleton().getCompetitorById(o.getOpponentId(), competitorList);
                
                System.out.println(pair.person1 + " - " + pair.person2);
            }
        }
        
        System.out.println(pairs.size());
        
    }
    
    static class SomePair {
        
        public Competitor person1;
        public Competitor person2;
        
    }
    
    static class SomeObject {
        
        public int myId;
        public int otherId;
        public String name;
        
        public SomeObject(String name, int myId, int otherId) {
            this.name = name;
            this.myId = myId;
            this.otherId = otherId;
        }
        
        @Override
        public String toString() {
            return name + ", id=" + myId + ", otherId: " + otherId;
        }
        
    }
    
}
