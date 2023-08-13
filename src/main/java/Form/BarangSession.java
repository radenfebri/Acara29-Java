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
public class BarangSession {

    private String namaBarang;
    private int idBarang;   


    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    public int getidBarang() {
        return idBarang;
    }
    
    public void setidBarang(int idBarang) {
        this.idBarang = idBarang;
    }
    
    @Override
    public String toString() {
        return namaBarang;
    }
}
