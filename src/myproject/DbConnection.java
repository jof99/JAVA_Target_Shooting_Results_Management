/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;
// DB USER dbadmin
// DB PASS ^"DzYav7DGhrEyf)
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Joel
 */
public class DbConnection {
    
    public static Connection getConnection () {
        
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://f3f4sj2k8.mysql.database.azure.com/shooting_competition_db","dbadmin","^\"DzYav7DGhrEyf)");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
            return con;
        }
        
}

    

    

