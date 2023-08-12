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
    private static Connection mysqlkonek; //membuat attribute untuk koneksi database
//    membuat method
    public static Connection koneksiDB() throws SQLException{
        if(mysqlkonek == null){
            try {
                 String DB = "jdbc:mysql://localhost:3306/penjualan-sepatu"; //alamat Database
                 String user = "root"; 
                 String pass = "";
                 //memanggil driver untuk mempersiapakan koneksi
                 DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
                 //membuat koneksi database
                 mysqlkonek = (Connection)DriverManager.getConnection(DB,user,pass);                
                 System.out.println("Koneksi Berhasil \n");
            } catch (Exception e) {
                System.out.println("Koneksi Database gagal \n" + e);
            }         
//         mengisi attribute mysqlkonek
        }return mysqlkonek; //return to object
    }    
//    unit testing
    public static void main(String[] args) throws SQLException {
       koneksiDB();
    }
}
