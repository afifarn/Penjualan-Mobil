/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.Tabel;

/**
 *
 * @author 
 */
public class TabelPaket {
    private String kode,harga,uang,jumlah,bunga,nilai;
    public void TabelPaket(){
    }
    public void setkode(String kode){
        this.kode = kode;
    }
    public void setuang(String uang){
        this.uang = uang;
    }
    public void setjumlah(String jumlah){
        this.jumlah = jumlah;
    }
    public void setbunga(String bunga){
        this.bunga = bunga;
    }
    public void setharga(String harga){
        this.harga = harga;
    }
    public void setnilai(String nilai){
        this.nilai = nilai;
    }
    public String getkode(){
        return kode;
    }
    public String getuang(){
        return uang;
    }
    public String getjumlah(){
        return jumlah;
    }
    public String getbunga(){
        return bunga;
    }
    public String getharga(){
        return harga;
    }
    public String getnilai(){
        return nilai;
    }
}
