/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
//import java.swing.JOptionPane;


/**
 *
 * @author febri
 */
public class Koneksi {
    private static Connection mysqlkonek;
    private static Connection koneksiDB() throws SQLException{
        if(mysqlkonek == null){
            try {
                 String DB = "jdbc:mysql://localhost:3306/dbdata";
                 String user = "root";
                 String pass = "";
                 DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
                 mysqlkonek = (Connection)DriverManager.getConnection(DB,user,pass);
                 
            } catch (Exception e) {
                
            }
         
        }return mysqlkonek;
    }
}
