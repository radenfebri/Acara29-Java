/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author Sendy
 */
public class UserSession {

    private static String nama, email;   


    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        UserSession.nama = nama;
    }
    
    public static String getEmail() {
        return email;
    }
    
    public static void setEmail(String email) {
        UserSession.email = email;
    }
}
