/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.Tabel;

/**
 *
 * @author 
 */
public class TabelPembeli {
    private String KTP,nama,alamat,telepon;
    public void TabelPembeli(){
    }
    public void setKTP(String KTP){
        this.KTP = KTP;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    public void settelepon(String telepon){
        this.telepon = telepon;
    }
    public String getKTP(){
        return KTP;
    }
    public String getnama(){
        return nama;
    }
    public String getalamat(){
        return alamat;
    }
    public String gettelepon(){
        return telepon;
    }
}
