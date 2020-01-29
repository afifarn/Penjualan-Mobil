/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.GUI;
import Ujikom.Class.koneksi;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author 
 */
public class FrmBeliKredit extends javax.swing.JFrame {
JasperDesign jasperdesain;
JasperPrint jasperprint;
JasperReport jasperreport;
    Map<String, Object> param = new HashMap<String, Object>();
    /**
     * Creates new form FrmBeliKredit
     */
    public FrmBeliKredit() {
        initComponents();
        koneksi.Koneksi_DB();
        setcomboktp();
        setcombomobil();
        setcombopaket();
        kodeotomatis1();
    }
    public void setcombopaket(){
        try{
        String sql = "select * from paket_kredit";
        koneksi.rs = koneksi.cn.executeQuery(sql);
        while(koneksi.rs.next()){
            kodepaket.addItem(koneksi.rs.getString(1));
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void setcombomobil(){
        try{
        String sql = "select * from mobil";
        koneksi.rs = koneksi.cn.executeQuery(sql);
        while(koneksi.rs.next()){
            KodeMobil.addItem(koneksi.rs.getString(1));
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void setcomboktp(){
        try{
        String sql = "select * from pembeli";
        koneksi.rs = koneksi.cn.executeQuery(sql);
        while(koneksi.rs.next()){
            NoKTP.addItem(koneksi.rs.getString(1));
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void settanggal(){
        java.util.Date now = new java.util.Date();
        java.text.SimpleDateFormat call = new java.text.SimpleDateFormat("yyyy-MM-dd");
        Tanggal.setText(call.format(now));
    }
    public void kodeotomatis(){
        try{
            String sql = "select max(right(kode_kredit,2)) from kredit";
            koneksi.rs = koneksi.cn.executeQuery(sql);
            while(koneksi.rs.next()){
                if(koneksi.rs.first()==true){
                    koneksi.rs.last();
                    int hitung = koneksi.rs.getInt(1)+1;
                    String itung = String.valueOf(hitung);
                    int panjang = itung.length();
                    for(int i=0;i<2-panjang;i++){
                        itung = "00"+hitung;
                    }
                    NoTransaksi.setText("K00"+itung);
                }else{
                    NoTransaksi.setText("K0001");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    String kode_cicilan;
    public void kodeotomatis1(){
        try{
            String sql = "select max(right(kode_cicilan,2)) from bayar_cicilan";
            koneksi.rs = koneksi.cn.executeQuery(sql);
            while(koneksi.rs.next()){
                if(koneksi.rs.first()==true){
                    koneksi.rs.last();
                    int hitung = koneksi.rs.getInt(1)+1;
                    String itung = String.valueOf(hitung);
                    int panjang = itung.length();
                    for(int i=0;i<2-panjang;i++){
                        itung = "00"+hitung;
                    }
                    kode_cicilan = "TC-"+itung;
                }else{
                    kode_cicilan = "TC-001";
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void bersih(){
        NoTransaksi.setText(null);
        Tanggal.setText(null);
        KodeMobil.setSelectedItem("Pilih Kode Mobil");
        MerkMobil.setText(null);
        TypeMobil.setText(null);
        WarnaMobil.setText(null);
        HargaMobil.setText(null);
        tampilgambar.setIcon(null);
        NoKTP.setSelectedItem("Pilih No KTP");
        Nama.setText(null);
        Alamat.setText(null);
        NoTelepon.setText(null);
        harusbayar.setText(null);
        dibayar.setText(null);
        kembali.setText(null);
        Harga.setText(null);
        uangmuka.setText(null);
        jumlahcicilan.setText(null);
        bunga.setText(null);
        nilaicicilan.setText(null);
        fotocopykk.setText(null);
        fotocopyktp.setText(null);
        fotocopysg.setText(null);
    }
    public void aktif(){
        KodeMobil.setEnabled(true);
        NoKTP.setEnabled(true);
        dibayar.setEnabled(true);
        kodepaket.setEnabled(true);
    }
    public void nonaktif(){
        KodeMobil.setEnabled(false);
        NoKTP.setEnabled(false);
        kodepaket.setEnabled(false);
        dibayar.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NoTransaksi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Tanggal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        KodeMobil = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        MerkMobil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tampilgambar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TypeMobil = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        WarnaMobil = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        HargaMobil = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        NoKTP = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NoTelepon = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        kodepaket = new javax.swing.JComboBox();
        Harga = new javax.swing.JTextField();
        uangmuka = new javax.swing.JTextField();
        jumlahcicilan = new javax.swing.JTextField();
        bunga = new javax.swing.JTextField();
        nilaicicilan = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fotocopyktp = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        fotocopykk = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fotocopysg = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        harusbayar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        dibayar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        kembali = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transaksi Kredit");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEMBELIAN KREDIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No Transaksi");

        NoTransaksi.setEnabled(false);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal");

        Tanggal.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Mobil");

        KodeMobil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kode Mobil" }));
        KodeMobil.setEnabled(false);
        KodeMobil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                KodeMobilItemStateChanged(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Merk");

        MerkMobil.setEnabled(false);

        jScrollPane1.setViewportView(tampilgambar);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Type");

        TypeMobil.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Warna");

        WarnaMobil.setEnabled(false);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga");

        HargaMobil.setEnabled(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pembeli"));

        jLabel9.setText("No KTP");

        NoKTP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih No KTP" }));
        NoKTP.setEnabled(false);
        NoKTP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NoKTPItemStateChanged(evt);
            }
        });

        jLabel10.setText("Nama Lengkap");

        Nama.setEnabled(false);

        Alamat.setEnabled(false);

        jLabel11.setText("Alamat");

        jLabel12.setText("No Telepon");

        NoTelepon.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(NoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nama)
                            .addComponent(Alamat)
                            .addComponent(NoKTP, 0, 112, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(NoKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(NoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSeparator1.setEnabled(false);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kode Paket");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Harga");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Uang Muka");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Jumlah Cicilan");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Bunga");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nilai Cicilan");

        kodepaket.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Paket Kredit" }));
        kodepaket.setEnabled(false);
        kodepaket.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kodepaketItemStateChanged(evt);
            }
        });

        Harga.setEnabled(false);

        uangmuka.setEnabled(false);

        jumlahcicilan.setEnabled(false);

        bunga.setEnabled(false);

        nilaicicilan.setEnabled(false);

        jSeparator2.setEnabled(false);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Foto Copy KTP");

        jButton1.setText("Browse..");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fotocopyktp.setEnabled(false);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Foto Copy KK");

        jButton2.setText("Browse..");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fotocopykk.setEnabled(false);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Foto Copy Slip Gaji");

        jButton3.setText("Browse...");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fotocopysg.setEnabled(false);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Jumlah Yg Harus Dibayar");

        harusbayar.setEnabled(false);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Uang Pembayaran");

        dibayar.setEnabled(false);
        dibayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dibayarKeyReleased(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Kembali");

        kembali.setEnabled(false);

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        simpan.setText("Simpan Dan Cetak");
        simpan.setEnabled(false);
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        jButton7.setText("Tutup");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(14, 14, 14)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(21, 21, 21)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TypeMobil)
                                    .addComponent(MerkMobil, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(KodeMobil, javax.swing.GroupLayout.Alignment.TRAILING, 0, 113, Short.MAX_VALUE)
                                    .addComponent(NoTransaksi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(WarnaMobil)
                                    .addComponent(HargaMobil)))
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bunga)
                                    .addComponent(kodepaket, 0, 108, Short.MAX_VALUE)
                                    .addComponent(Harga)
                                    .addComponent(uangmuka)
                                    .addComponent(jumlahcicilan)
                                    .addComponent(nilaicicilan))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fotocopykk, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(harusbayar)
                            .addComponent(dibayar)
                            .addComponent(kembali)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fotocopyktp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fotocopysg)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(KodeMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(MerkMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TypeMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(WarnaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(HargaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(kodepaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(uangmuka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jumlahcicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(bunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(nilaicicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jButton1)
                    .addComponent(jLabel21)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fotocopyktp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotocopysg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jButton2)
                    .addComponent(jLabel22)
                    .addComponent(harusbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotocopykk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(dibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambah)
                            .addComponent(simpan)
                            .addComponent(batal)
                            .addComponent(jButton7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KodeMobilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_KodeMobilItemStateChanged
        // TODO add your handling code here:
        try{
            String sql = "Select * From mobil where kode_mobil = '"+KodeMobil.getSelectedItem()+"'";
            koneksi.rs = koneksi.cn.executeQuery(sql);
            while(koneksi.rs.next()){
                MerkMobil.setText(koneksi.rs.getString("Merk"));
                TypeMobil.setText(koneksi.rs.getString("Type"));
                WarnaMobil.setText(koneksi.rs.getString("Warna"));
                HargaMobil.setText(koneksi.rs.getString("Harga_Mobil"));
                tampilgambar.setIcon(new ImageIcon(koneksi.rs.getString("Gambar")));
            }
            NoKTP.requestFocus();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_KodeMobilItemStateChanged

    private void NoKTPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NoKTPItemStateChanged
        // TODO add your handling code here:
        try{
            String sql = "Select * From pembeli where ktp = '"+NoKTP.getSelectedItem()+"'";
            koneksi.rs = koneksi.cn.executeQuery(sql);
            while(koneksi.rs.next()){
                Nama.setText(koneksi.rs.getString(2));
                Alamat.setText(koneksi.rs.getString(3));
                NoTelepon.setText(koneksi.rs.getString(4));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_NoKTPItemStateChanged

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
       bersih();
        aktif();
        KodeMobil.requestFocus();
        kodeotomatis();
        settanggal();
        dibayar.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        simpan.setEnabled(true);
        tambah.setEnabled(false);
    }//GEN-LAST:event_tambahActionPerformed

    private void kodepaketItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kodepaketItemStateChanged
        // TODO add your handling code here:
        try{
            String sql = "Select * From paket_kredit where kode_paket = '"+kodepaket.getSelectedItem()+"'";
            koneksi.rs = koneksi.cn.executeQuery(sql);
            while(koneksi.rs.next()){
                Harga.setText(koneksi.rs.getString(2));
                uangmuka.setText(koneksi.rs.getString(3));
                jumlahcicilan.setText(koneksi.rs.getString(4));
                bunga.setText(koneksi.rs.getString(5));
                nilaicicilan.setText(koneksi.rs.getString(6));
            }
            int a = Integer.parseInt(Harga.getText());
            int b = Integer.parseInt(uangmuka.getText());
            int c = Integer.parseInt(nilaicicilan.getText());
            harusbayar.setText(String.valueOf(a+b+c));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_kodepaketItemStateChanged

    private void dibayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dibayarKeyReleased
        // TODO add your handling code here:
        int a = Integer.parseInt(harusbayar.getText());
        int b = Integer.parseInt(dibayar.getText());
        kembali.setText(String.valueOf(b-a));
    }//GEN-LAST:event_dibayarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File f = jf.getSelectedFile();
        String path = f.getAbsolutePath();
        fotocopyktp.setText(path);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File f = jf.getSelectedFile();
        String path = f.getAbsolutePath();
        fotocopykk.setText(path);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File f = jf.getSelectedFile();
        String path = f.getAbsolutePath();
        fotocopysg.setText(path);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "INSERT INTO kredit VALUES("+
                     "'"+NoTransaksi.getText()+"',"+
                     "'"+NoKTP.getSelectedItem()+"',"+
                     "'"+kodepaket.getSelectedItem()+"',"+
                     "'"+KodeMobil.getSelectedItem()+"',"+
                     "'"+Tanggal.getText()+"',"+
                     "'"+fotocopyktp.getText()+"',"+
                     "'"+fotocopykk.getText()+"',"+
                     "'"+fotocopysg.getText()+"')";
        koneksi.cn.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, NoTransaksi.getText()+" Disimpan!");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            int a = Integer.parseInt(harusbayar.getText());
            int b = Integer.parseInt(HargaMobil.getText());
            int c = b-a;
        String sql = "INSERT INTO bayar_cicilan VALUES("+
                     "'"+kode_cicilan+"',"+
                     "'"+NoTransaksi.getText()+"',"+
                     "0000-00-00,"+
                     "'"+jumlahcicilan.getText()+"',"+
                     "0,"+
                     "0,"+
                     ""+c+")";
        koneksi.cn.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Kode Cicilan : "+kode_cicilan);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
        File file = new File("src/Ujikom/Report/reportKredit.jrxml");
        jasperdesain = JRXmlLoader.load(file);
        param.put("KodeFaktur", NoTransaksi.getText());
        jasperreport = JasperCompileManager.compileReport(jasperdesain);
        jasperprint = JasperFillManager.fillReport(jasperreport, param,koneksi.conn);
        JasperViewer.viewReport(jasperprint,false);
        bersih();
        nonaktif();
        tambah.setEnabled(true);
        simpan.setEnabled(false);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_simpanActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        bersih();
        nonaktif();
        simpan.setEnabled(false);
        tambah.setEnabled(true);
    }//GEN-LAST:event_batalActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int app;
        if((app= JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan menutup Transaksi Beli Cash?","Tutup",JOptionPane.YES_NO_OPTION))==0){
            this.dispose();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField HargaMobil;
    private javax.swing.JComboBox KodeMobil;
    private javax.swing.JTextField MerkMobil;
    private javax.swing.JTextField Nama;
    private javax.swing.JComboBox NoKTP;
    private javax.swing.JTextField NoTelepon;
    private javax.swing.JTextField NoTransaksi;
    private javax.swing.JTextField Tanggal;
    private javax.swing.JTextField TypeMobil;
    private javax.swing.JTextField WarnaMobil;
    private javax.swing.JButton batal;
    private javax.swing.JTextField bunga;
    private javax.swing.JTextField dibayar;
    private javax.swing.JTextField fotocopykk;
    private javax.swing.JTextField fotocopyktp;
    private javax.swing.JTextField fotocopysg;
    private javax.swing.JTextField harusbayar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jumlahcicilan;
    private javax.swing.JTextField kembali;
    private javax.swing.JComboBox kodepaket;
    private javax.swing.JTextField nilaicicilan;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JLabel tampilgambar;
    private javax.swing.JTextField uangmuka;
    // End of variables declaration//GEN-END:variables
}
