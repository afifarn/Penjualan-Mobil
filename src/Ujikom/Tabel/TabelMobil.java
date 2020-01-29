/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.Tabel;

/**
 *
 * @author 
 */
public class TabelMobil {
    private String kode,merk,type,warna,harga,gambar;
    public void TabelMobil(){
    }
    public void setkode(String kode){
        this.kode = kode;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    public void settype(String type){
        this.type = type;
    }
    public void setwarna(String warna){
        this.warna = warna;
    }
    public void setharga(String harga){
        this.harga = harga;
    }
    public void setgambar(String gambar){
        this.gambar = gambar;
    }
    public String getkode(){
        return kode;
    }
    public String getmerk(){
        return merk;
    }
    public String gettype(){
        return type;
    }
    public String getwarna(){
        return warna;
    }
    public String getharga(){
        return harga;
    }
    public String getgambar(){
        return gambar;
    }
}
