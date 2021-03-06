/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.GUI;
import Ujikom.Tabel.TabelMobil;
import Ujikom.TabelModel.ModelTabelMobil;
import Ujikom.Class.koneksi;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class FrmDataMobil extends javax.swing.JFrame {
ModelTabelMobil tabelmodel;
    /**
     * Creates new form FrmDataMobil
     */
    public FrmDataMobil() {
        initComponents();
        tabelmodel = new ModelTabelMobil();
        jTable1.setModel(tabelmodel);
        koneksi.Koneksi_DB();
        tampil();
        kdauto();
        nonaktif();
    }
    public void tampil(){
        int baris = jTable1.getRowCount();
        for(int i = 0;i<baris;i++){
            tabelmodel.delete(0, baris);
        }
        try{
        String sql = "select * from mobil";
        koneksi.rs = koneksi.cn.executeQuery(sql);
        while(koneksi.rs.next()){
            TabelMobil mobil = new TabelMobil();
            mobil.setkode(koneksi.rs.getString(1));
            mobil.setmerk(koneksi.rs.getString(2));
            mobil.settype(koneksi.rs.getString(3));
            mobil.setwarna(koneksi.rs.getString(4));
            mobil.setharga(koneksi.rs.getString(5));
            mobil.setgambar(koneksi.rs.getString(6));
            tabelmodel.add(mobil);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void kdauto(){
        try{
            String sql = "select max(right(kode_mobil,2)) from mobil";
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
                    kodemobil.setText("M-"+itung);
                }else{
                    kodemobil.setText("M-001");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void aktif(){
        kodemobil.setEnabled(false);
        merkmobil.setEnabled(true);
        typemobil.setEnabled(true);
        hargamobil.setEnabled(true);
        warnamobil.setEnabled(true);
        gambar.setEnabled(false);
        carigambar.setEnabled(true);
    }
    public void nonaktif(){
        kodemobil.setEnabled(false);
        merkmobil.setEnabled(false);
        typemobil.setEnabled(false);
        hargamobil.setEnabled(false);
        warnamobil.setEnabled(false);
        gambar.setEnabled(false);
        carigambar.setEnabled(false);
        Simpan.setEnabled(false);
        Ubah.setEnabled(false);
        Hapus.setEnabled(false);
        Tambah.setEnabled(true);
    }
    public void bersih(){
        kodemobil.setText(null);
        merkmobil.setText(null);
        typemobil.setText(null);
        warnamobil.setText(null);
        hargamobil.setText(null);
        gambar.setText(null);
        tampilgambar.setIcon(null);
        kdauto();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kodemobil = new javax.swing.JTextField();
        merkmobil = new javax.swing.JTextField();
        typemobil = new javax.swing.JTextField();
        warnamobil = new javax.swing.JTextField();
        hargamobil = new javax.swing.JTextField();
        gambar = new javax.swing.JTextField();
        carigambar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tampilgambar = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Mobil");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Data Mobil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Mobil");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Merk Mobil");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type Mobil");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Warna Mobil");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga Mobil(Rp)");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gambar");

        carigambar.setText("Browse..");
        carigambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carigambarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tampilgambar);

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Simpan.setText("Simpan");
        Simpan.setEnabled(false);
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        Ubah.setText("Ubah");
        Ubah.setEnabled(false);
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.setEnabled(false);
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        jButton5.setText("Batal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Tutup");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(warnamobil, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gambar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(carigambar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(hargamobil, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(typemobil)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(merkmobil))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(kodemobil)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Ubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kodemobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(merkmobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(typemobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(warnamobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(hargamobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(carigambar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tambah)
                    .addComponent(Simpan)
                    .addComponent(Ubah)
                    .addComponent(Hapus)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void carigambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carigambarActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File f = jf.getSelectedFile();
        String path = f.getAbsolutePath();
        gambar.setText(path);
        tampilgambar.setIcon(new ImageIcon(path));
    }//GEN-LAST:event_carigambarActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        bersih();
        aktif();
        Tambah.setEnabled(false);
        Simpan.setEnabled(true);
        merkmobil.requestFocus();
    }//GEN-LAST:event_TambahActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        String kode = kodemobil.getText();
        String merk = merkmobil.getText();
        String type = typemobil.getText();
        String warna = warnamobil.getText();
        String harga = hargamobil.getText();
        String s = gambar.getText();
        if(kode.isEmpty()||merk.isEmpty()||type.isEmpty()||warna.isEmpty()||harga.isEmpty()||s.isEmpty()){
           JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong!");
        }else{
        File baru = new File(gambar.getText());
        if(baru.renameTo(new File("src/images/"+baru.getName()))){
            String path = "src/images/"+baru.getName();
        try{
            String sql = "INSERT INTO mobil VALUES("+
                         "'"+kodemobil.getText()+"',"+
                         "'"+merkmobil.getText()+"',"+
                         "'"+typemobil.getText()+"',"+
                         "'"+warnamobil.getText()+"',"+
                         "'"+hargamobil.getText()+"',"+
                         "'"+path+"')";
            koneksi.cn.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, kodemobil.getText()+" Disimpan!");
            bersih();
            nonaktif();
            tampil();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan ketika menyimpan gambar!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_SimpanActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        // TODO add your handling code here:
        int app;
        if((app= JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan mengubah "+kodemobil.getText()+"?","Ubah",JOptionPane.YES_NO_OPTION))==0){
            try{
                File baru = new File(gambar.getText());
                if(baru.renameTo(new File("src/images/"+baru.getName()))){
                String path = "src/Images/"+baru.getName();
                String sql = "UPDATE mobil SET "+
                             "Merk ='"+merkmobil.getText()+"',"+
                             "Type ='"+typemobil.getText()+"',"+
                             "warna ='"+warnamobil.getText()+"',"+
                             "harga_mobil ='"+hargamobil.getText()+"',"+
                             "gambar ='"+path+"' "+
                             "WHERE kode_mobil ='"+kodemobil.getText()+"'";
                koneksi.cn.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, kodemobil.getText()+" Diubah!");
                bersih();
                nonaktif();
                tampil();
                }else{
                   JOptionPane.showMessageDialog(null,"Terjadi kesalahan ketika menyimpan gambar!","ERROR",JOptionPane.ERROR_MESSAGE);  
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_UbahActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        bersih();
        nonaktif();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        int app;
        if((app= JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan menghapus "+kodemobil.getText()+"?","Hapus",JOptionPane.YES_NO_OPTION))==0){
            try{
                String sql = "DELETE FROM mobil WHERE kode_mobil = '"+kodemobil.getText()+"'";
                koneksi.cn.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, kodemobil.getText()+" DiHapus!");
                bersih();
                nonaktif();
                tampil();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        int row = 0 ;
        row = jTable1.getSelectedRow();
        kodemobil.setText(tabelmodel.getValueAt(row, 0).toString());
        merkmobil.setText(tabelmodel.getValueAt(row, 1).toString());
        typemobil.setText(tabelmodel.getValueAt(row, 2).toString());
        warnamobil.setText(tabelmodel.getValueAt(row, 3).toString());
        hargamobil.setText(tabelmodel.getValueAt(row, 4).toString());
        gambar.setText(tabelmodel.getValueAt(row, 5).toString());
        tampilgambar.setIcon(new ImageIcon(tabelmodel.getValueAt(row, 5).toString()));
        aktif();
        Tambah.setEnabled(false);
        Ubah.setEnabled(true);
        Hapus.setEnabled(true);
    }//GEN-LAST:event_jTable1MousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int app;
        if((app= JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan menutup Data Mobil?","Tutup",JOptionPane.YES_NO_OPTION))==0){
            this.dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Simpan;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton Ubah;
    private javax.swing.JButton carigambar;
    private javax.swing.JTextField gambar;
    private javax.swing.JTextField hargamobil;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kodemobil;
    private javax.swing.JTextField merkmobil;
    private javax.swing.JLabel tampilgambar;
    private javax.swing.JTextField typemobil;
    private javax.swing.JTextField warnamobil;
    // End of variables declaration//GEN-END:variables
}
