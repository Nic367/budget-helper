
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicole
 */
public class myConnection {
    
    public static Connection getConnection(){
        Connection con = null;
        /*
        To enter SQL through terminal:
        nicole@nicole-Lenovo-YOGA-720-12IKB:~$ mysql -u root
        mysql> use budgetapp;
        mysql> show tables;
        mysql> select * from users;
        */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/budgetapp","root","");
        }catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
