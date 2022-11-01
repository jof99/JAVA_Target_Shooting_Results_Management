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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import myproject.DbConnection;


/**
 *
 * @author Joel
 */
public class GameManager {

    private static GameManager singleton = new GameManager();

    public static GameManager getSingleton() {
        return singleton;
    }

    public GameManager() {
        loadGames();
    }

    private List<Game> gameList = new ArrayList<>();

    public String[] getGameNames() {
        String[] array = new String[gameList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = gameList.get(i).getGameName();
        }
        return array;
    }

    public int getIdForGameName(String gameName) {
        for (Game game : gameList) {
            System.out.println("Comparing " + gameName + " to " + game.getGameName());
            if (game.getGameName().equals(gameName)) {
                return game.getId();
            }
        }
        return -1;
    }

    private void loadGames() {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `games`");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int gameId = rs.getInt(1);
                String gameName = rs.getString(2);
                Game game = new Game();
                game.setGameName(gameName);
                game.setGameId(gameId);
                gameList.add(game);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Loaded " + gameList.size() + " games!");
    }

    public void sortCompetitors(List<Competitor> fullList) {

        Collections.sort(fullList, new LeagueComparator());
        Collections.reverse(fullList);
    }

    public Map<Integer, CompetitionPair> getPairs(int competitionId) {
        Map<Integer, CompetitionPair> pairs = new HashMap<>();
        List<Competitor> competitorList = getCompetitorsForCompetition(competitionId);
        for (Competitor o : competitorList) {
            int key = o.getId() + o.getOpponentId();
            if (!pairs.containsKey(key)) {
                Competitor person1 = getCompetitorById(o.getId(), competitorList);
                Competitor person2 = getCompetitorById(o.getOpponentId(), competitorList);
                pairs.put(key, new CompetitionPair(person1, person2));
            }
        }
        return pairs;
    }

    public Competitor getCompetitorById(int id, List<Competitor> list) {
        Competitor result = null;
        for (Competitor competitor : list) {
            if (id == competitor.getId()) {
                result = competitor;
                break;
            }
        }
        return result;
    }

    public List<Competitor> getCompetitorsForCompetition(int competitionId) {
        List<Competitor> fullList = new ArrayList<>();
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `competitor` WHERE `competition_id` = " + competitionId + " AND `game_id` = 1");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int competitorId = rs.getInt(1);
                String gender = rs.getString(2);
                String firstName = rs.getString(3);
                String secondName = rs.getString(4);
                String address = rs.getString(5);
                String clubName = rs.getString(6);
                String birthdate = rs.getString(7);
                String phoneNumber = rs.getString(8);
                int gameId = rs.getInt(9);
                int competitionId2 = rs.getInt(10);
                int initialScore = rs.getInt(11);
                int opponentId = rs.getInt(12);
                int leagueId = rs.getInt(13);
                // addres club name
                fullList.add(new Competitor(competitorId, firstName, secondName, competitionId, initialScore, 0, opponentId, leagueId));

            }
        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fullList;
    }
    
    public void resetScoresTable () { 
        
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("TRUNCATE TABLE `score`");
   
            if (ps.executeUpdate() > 0) {
                // JOptionPane.showMessageDialog(null, "Competitor Data Updated");
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void resetCompetitorDatablesButton () { 
        
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("UPDATE `competitor` SET `competition_id`= NULL, `opponent_id`= NULL, `league_id` = NULL WHERE `game_id` > 0");
   
            if (ps.executeUpdate() > 0) {
                // JOptionPane.showMessageDialog(null, "Competitor Data Updated");
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void startCompetition(String inputCompetitionId) {

        if (inputCompetitionId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a competition!");
            return;
        }

        List<Competitor> fullList = new ArrayList<>();
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `competitor` WHERE `competition_id` IS NULL AND `game_id` = 1");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int competitorId = rs.getInt(1);
                String gender = rs.getString(2);
                String firstName = rs.getString(3);
                String secondName = rs.getString(4);
                String address = rs.getString(5);
                String clubName = rs.getString(6);
                String birthdate = rs.getString(7);
                String phoneNumber = rs.getString(8);
                int gameId = rs.getInt(9);
                int competitionId = rs.getInt(10);
                int initialScore = rs.getInt(11);
                int opponentId = rs.getInt(12);
                int leagueId = rs.getInt(13);
                // addres club name
                fullList.add(new Competitor(competitorId, firstName, secondName, competitionId, initialScore, 0, opponentId, leagueId));

            }
        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (fullList.size() < 12) {
            JOptionPane.showMessageDialog(null, "Not enough free competitors!");
            return;
        }

        // first
        sortCompetitors(fullList);

        // first pairing (league 1)
        Competitor competitor0 = fullList.get(0);
        Competitor competitor1 = fullList.get(1);
        pair(competitor0, competitor1, 1);

        Competitor competitor2 = fullList.get(2);
        Competitor competitor3 = fullList.get(3);
        pair(competitor2, competitor3, 1);

        // second pairing (leage 2)
        Competitor competitor4 = fullList.get(4);
        Competitor competitor5 = fullList.get(5);
        pair(competitor4, competitor5, 2);

        Competitor competitor6 = fullList.get(6);
        Competitor competitor7 = fullList.get(7);
        pair(competitor6, competitor7, 2);

        //third pairing (leage 3)
        Competitor competitor8 = fullList.get(8);
        Competitor competitor9 = fullList.get(9);
        pair(competitor8, competitor9, 3);

        Competitor competitor10 = fullList.get(10);
        Competitor competitor11 = fullList.get(11);
        pair(competitor10, competitor11, 3);

        for (Competitor c : fullList) {
            if (c.getOpponent() == null) {
                continue;
            }
            updateCompetitor(c.getId(), Integer.parseInt(inputCompetitionId), c.getOpponent().getId(), c.getLeagueId());
        }

        JOptionPane.showMessageDialog(null, "Competitition Started!");
    }

    public static void main(String args[]) {
      GameManager.getSingleton().resetCompetitorDatablesButton();
      GameManager.getSingleton().resetScoresTable();
      
    }

    public void showResults(int competitionId, int week) {

        List<Competitor> list = getCompetitorsForCompetition(competitionId);

        Connection con = DbConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("SELECT * FROM `score` WHERE `week` = ? AND `competition_id` = ?");

            ps.setInt(1, week);
            ps.setInt(2, competitionId);

            ResultSet rs = ps.executeQuery();

            Object[] row;
            while (rs.next()) {

                String id = rs.getString("id");
                int competitionID = rs.getInt("competition_id");
                int competitor1ID = rs.getInt("competitor_1_id");
                int competitor2ID = rs.getInt("competitor_2_id");
                double competitor1Score = rs.getDouble("competitor_1_score");
                double competitor2Score = rs.getDouble("competitor_2_score");
                int theweek = rs.getInt("week");

                Competitor person1 = getCompetitorById(competitor1ID, list);
                Competitor person2 = getCompetitorById(competitor2ID, list);

                int winnerID = 0;
                int loserID = 0;

                if (competitor1Score > competitor2Score) {
                    winnerID = competitor1ID;
                    loserID = competitor2ID;
                } else {
                    loserID = competitor1ID;
                    winnerID = competitor2ID;
                }

                try {
                    ps = con.prepareStatement("UPDATE `score` SET `winner_id`= ?,`loser_id`= ? WHERE `id` = ?");
                    ps.setInt(1, winnerID);
                    ps.setInt(2, loserID);
                    ps.setString(3, id);
                    ps.execute();

                } catch (SQLException ex) {
                    Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(null,"Competition ID: " + competitionID + " P1 Name: " + person1.getName() + " ID: " + competitor1ID + " P2 Name: " + person2.getName() + " ID: " + competitor2ID + " P1 Score: " + competitor1Score + " P2 Score: " + competitor2Score + " Week: " + theweek + " WINNER ID: " +winnerID+ " LOSER ID: " +loserID);

            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null,"The results have been calculated for the next round!");
    }

    public void updateCompetitor(int competitorId, int competitionId, int opponentId, int leagueId) {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("UPDATE `competitor` SET `competition_id`= ?, `opponent_id`= ?, `league_id` = ?  WHERE `id` = ?");
            ps.setInt(1, competitionId);
            ps.setInt(2, opponentId);
            ps.setInt(3, leagueId);
            ps.setInt(4, competitorId);
            if (ps.executeUpdate() > 0) {
                // JOptionPane.showMessageDialog(null, "Competitor Data Updated");
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void pair(Competitor competitor1, Competitor competitor2, int leagueId) {

        if (competitor1.getOpponent() != null || competitor2.getOpponent() != null) {
            System.out.println("competitor is already assigned");
            return;
        }

        competitor1.setLeagueId(leagueId);
        competitor2.setLeagueId(leagueId);

        competitor1.setOpponent(competitor2);
        competitor2.setOpponent(competitor1);
    }

    public void InsertCompetitorsCurrentScores(Integer pairKey, Integer competitionId, Integer competitor1Id, Integer competitor2Id, Double competitor1Score, double competitor2Score, int week, int leagueId) {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("INSERT INTO `score`(`id`, `competition_id`, `competitor_1_id`, `competitor_2_id`, `competitor_1_score`, `competitor_2_score`, `week`,`league_id`) VALUES (?,?,?,?,?,?,?,?)");
            //ps = con.prepareStatement("INSERT INTO `score`(`competition_id`, `competitor_1_id`, `competitor_2_id`, `competitor_1_score`, `competitor_2_score`, `week`) VALUES (?,?,?,?,?,?)");
            ps.setString(1, "week_" + week  + "_pair_" + pairKey);
            ps.setInt(2, competitionId);
            ps.setInt(3, competitor1Id);
            ps.setInt(4, competitor2Id);
            ps.setDouble(5, competitor1Score);
            ps.setDouble(6, competitor2Score);
            ps.setInt(7, week);
            ps.setInt(8, leagueId);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Score Added Successfully");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void populateCompetitionJtable(JTable table) {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `competition`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            //removes the 4 empty rows bug before then populating the table
            model.setRowCount(0);

            Object[] row;
            while (rs.next()) {
                row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getInt(5);
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean doesCompetitionExist(String competitionName) {
        boolean doesExist = false;
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `competition` WHERE `competition_name` = ?");
            ps.setString(1, competitionName);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                doesExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doesExist;
    }

    public void InsertDeleteUpdateCompetitor(char operation, Integer id, String competitionName, String distance, String shots, Integer timeHours, Integer gameId) {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps;

        if (operation == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO `competition`(`competition_name`, `distance`, `shots`, `time`, `game_id`) VALUES (?,?,?,?,?)");
                ps.setString(1, competitionName);
                ps.setString(2, distance);
                ps.setString(3, shots);
                ps.setInt(4, timeHours);
                ps.setInt(5, gameId);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Competition Added");
                }

            } catch (SQLException ex) {
                Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (operation == 'u') {
            try {
                ps = con.prepareStatement("UPDATE `competition` SET `competition_name`= ?,`distance`= ?, `shots`= ?, `time`= ? WHERE `id`= ?");
                ps.setString(1, competitionName);
                ps.setString(2, distance);
                ps.setString(3, shots);
                ps.setInt(4, timeHours);
                ps.setInt(5, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Competition Data Updated");
                }

            } catch (SQLException ex) {
                Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (operation == 'd') {
            int yesOrNo = JOptionPane.showConfirmDialog(null, "Are you sure? The scores will also be deleted!", "Delete Score", JOptionPane.OK_CANCEL_OPTION);

            if (yesOrNo == 0) {

                try {
                    ps = con.prepareStatement("DELETE FROM `competition` WHERE `id` = ?");
                    ps.setInt(1, id);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Competition Deleted");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void populateCompetitionCombo(JComboBox combo) {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `competition`");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getCompetitionId(String competitionName) {

        int competitorId = 0;
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `competition` WHERE `competition_name` = ?");
            ps.setString(1, competitionName);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                competitorId = rs.getInt("Id");
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return competitorId;
    }
    public void InsertDeleteUpdateCompetitor(char operation, Integer id, String firstName, String secondName, String gender, String address, String clubName, String birthdate, String phoneNumber, int gameId, double initialScoreAverage) {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps;

        if (operation == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO competitor(gender, first_name, second_name, address, club_name, birthdate, phone_number, game_id,initialScore) VALUES (?,?,?,?,?,?,?,?,?)");
                ps.setString(1, gender);
                ps.setString(2, firstName);
                ps.setString(3, secondName);
                ps.setString(4, address);
                ps.setString(5, clubName);
                ps.setString(6, birthdate);
                ps.setString(7, phoneNumber);
                ps.setInt(8, gameId);
                ps.setDouble(9,initialScoreAverage);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Competitor Added");
                }

            } catch (SQLException ex) {
                Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (operation == 'u') {
            try {
                ps = con.prepareStatement("UPDATE `competitor` SET `gender`= ?,`first_name`= ?,`second_name`= ?,`address`= ?,`club_name`= ?,`birthdate`= ?,`phone_number`= ?,`game_id`= ?, `initialScore`= ? WHERE `id` = ?");
                ps.setString(1, gender);
                ps.setString(2, firstName);
                ps.setString(3, secondName);
                ps.setString(4, address);
                ps.setString(5, clubName);
                ps.setString(6, birthdate);
                ps.setString(7, phoneNumber);
                ps.setInt(8, id);
                ps.setInt(9, gameId);
                ps.setDouble(10, initialScoreAverage);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Competitor Data Updated");
                }

            } catch (SQLException ex) {
                Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (operation == 'd') {
            int yesOrNo = JOptionPane.showConfirmDialog(null, "Are you sure? The competitors score will also be deleted!", "Delete Competitor", JOptionPane.OK_CANCEL_OPTION);

            if (yesOrNo == 0) {
                try {
                    ps = con.prepareStatement("DELETE FROM `competitor` WHERE `id` = ?");
                    ps.setInt(1, id);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Competitor Deleted");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public void populateGameCombo(JComboBox combo) {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `games`");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getInt(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        public void populateCompetitorJtable(JTable table, String searchValue) {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `competitor` WHERE CONCAT(`first_name`,`second_name`,`phone_number`,`address`,`club_name`)LIKE ?");
            ps.setString(1, "%" + searchValue + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            //removes the 4 empty rows bug before then populating the table
            model.setRowCount(0);

            Object[] row;
            while (rs.next()) {
                row = new Object[12];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                row[9] = rs.getString(10);
                row[10] = rs.getString(11);
                row[11] = rs.getString(12);

                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void populateScoreTable(JTable table) {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `score`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            //removes the 4 empty rows bug before then populating the table
            model.setRowCount(0);

            Object[] row;
            while (rs.next()) {
                row = new Object[10];
                row[0] = rs.getString(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getInt(4);
                row[4] = rs.getInt(5);
                row[5] = rs.getInt(6);
                row[6] = rs.getInt(7);
                row[7] = rs.getInt(8);
                row[8] = rs.getInt(9);
                row[9] = rs.getInt(10);
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void populateCompetitorWithScoreJtable(JTable table) {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT `id`,`opponent_id` FROM `competitor`");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            //removes the 4 empty rows bug before then populating the table
            model.setRowCount(0);

            Object[] row;
            while (rs.next()) {

                row = new Object[8];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);

                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void displayAllCompetitorInitialScores(JTable table) {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT `competitor_id`, first_name, second_name, competition_name, competitor_score\n"
                    + "FROM `score`\n"
                    + "INNER JOIN competitor as cmptr on cmptr.id = `competitor_id`\n"
                    + "INNER JOIN competition as cmptn on cmptn.id = `competition_id`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            //removes the 4 empty rows bug before then populating the table
            model.setRowCount(0);

            Object[] row;
            while (rs.next()) {
                row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void populateInitialScoreJtable(JTable table) {
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `score`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            //removes the 4 empty rows bug before then populating the table
            model.setRowCount(0);

            Object[] row;
            while (rs.next()) {
                row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getDouble(3);
                row[3] = rs.getString(4);
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
