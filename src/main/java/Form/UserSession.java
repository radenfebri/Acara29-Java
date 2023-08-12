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

    private static int stok, harga;
    private static String nama;   
    private static String email;


    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        UserSession.nama = nama;
    }
    
    public static void setEmail(String email) {
        UserSession.email = email;
    }

    public static int getStok() {
        return stok;
    }

    public static void setStok(int stok) {
        UserSession.stok = stok;
    }

    public static int getHarga() {
        return harga;
    }

    public static void setHarga(int harga) {
        UserSession.harga = harga;
    }
}
