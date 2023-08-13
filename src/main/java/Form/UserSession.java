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
// membuat session ketika user login
public class UserSession {

    // attribute 
    private static String nama, email, alamat;   
    private static int id;   

    public static int getID() {
        return id;
    }

    public static void setID(int id) {
        UserSession.id = id;
    }
    
    public static String getNama() {
        return nama;
    }
    
    public static String getAlamat() {
        return alamat;
    }

    public static void setNama(String nama) {
        UserSession.nama = nama;
    }
    
    public static void setAlamat(String alamat) {
        UserSession.alamat = alamat;
    }
    
    public static String getEmail() {
        return email;
    }
    
    public static void setEmail(String email) {
        UserSession.email = email;
    }
    
    public static void clearSession() {
    id = 0;
    nama = null;
    alamat = null;
    // Hapus informasi sesi lainnya yang mungkin Anda simpan
}
}
