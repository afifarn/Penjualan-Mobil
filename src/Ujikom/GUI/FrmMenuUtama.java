/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.GUI;
import Ujikom.Class.koneksi;
import Ujikom.Class.Session;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author 
 */
public class FrmMenuUtama extends javax.swing.JFrame {
JasperDesign jasperdesain;
JasperPrint jasperprint;
JasperReport jasperreport;
    Map<String, Object> param = new HashMap<String, Object>();
    /**
     * Creates new form FrmMenuUtama
     */
    public FrmMenuUtama() {
        initComponents();
        koneksi.Koneksi_DB();
        jLabel1.setText("Selamat Datang , "+ Session.getUser() );
        jLabel2.setText("Hak Akses : "+ Session.getHak_akses());
        if(Session.getHak_akses().equals("user")||Session.getHak_akses().equals("User")){
            paketkredit.setVisible(false);
            datamobil.setVisible(false);
            report.setVisible(false);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        datamobil = new javax.swing.JMenuItem();
        paketkredit = new javax.swing.JMenuItem();
        datapembeli = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        pembeliancash = new javax.swing.JMenuItem();
        pembeliankredit = new javax.swing.JMenuItem();
        pembayarancicilan = new javax.swing.JMenuItem();
        report = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selamat Datang ,");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hak Akses");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PT Torga Mobil");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Melayani Dengan Sepenuh Hati.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Master");

        datamobil.setText("Data Mobil");
        datamobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datamobilActionPerformed(evt);
            }
        });
        jMenu2.add(datamobil);

        paketkredit.setText("Data Paket Kredit");
        paketkredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketkreditActionPerformed(evt);
            }
        });
        jMenu2.add(paketkredit);

        datapembeli.setText("Data Pembeli");
        datapembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datapembeliActionPerformed(evt);
            }
        });
        jMenu2.add(datapembeli);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaksi");

        pembeliancash.setText("Pembelian Cash");
        pembeliancash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembeliancashActionPerformed(evt);
            }
        });
        jMenu3.add(pembeliancash);

        pembeliankredit.setText("Pembelian Kredit");
        pembeliankredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembeliankreditActionPerformed(evt);
            }
        });
        jMenu3.add(pembeliankredit);

        pembayarancicilan.setText("Pembayaran Cicilan");
        pembayarancicilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayarancicilanActionPerformed(evt);
            }
        });
        jMenu3.add(pembayarancicilan);

        jMenuBar1.add(jMenu3);

        report.setText("Report");

        jMenuItem9.setText("Laporan Data Mobil");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        report.add(jMenuItem9);

        jMenuItem10.setText("Laporan Data Paket Kredit");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        report.add(jMenuItem10);

        jMenuItem3.setText("Laporan Data Pembeli");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        report.add(jMenuItem3);

        jMenuBar1.add(report);

        setJMenuBar(jMenuBar1);

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

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        int app;
        if((app= JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan Logout?","Logout",JOptionPane.YES_NO_OPTION))==0){
            this.dispose();
            new FrmLogin().show();
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        int app;
        if((app= JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan Keluar?","Exit",JOptionPane.YES_NO_OPTION))==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void datamobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datamobilActionPerformed
        // TODO add your handling code here:
        new FrmDataMobil().show();
    }//GEN-LAST:event_datamobilActionPerformed

    private void datapembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datapembeliActionPerformed
        // TODO add your handling code here:
        new FrmPembeli().show();
    }//GEN-LAST:event_datapembeliActionPerformed

    private void paketkreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketkreditActionPerformed
        // TODO add your handling code here:
        new FrmPaketKredit().show();
    }//GEN-LAST:event_paketkreditActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        try{
        File file = new File("src/Ujikom/Report/reportDataMobil.jrxml");
        jasperdesain = JRXmlLoader.load(file);
        param.clear();
        jasperreport = JasperCompileManager.compileReport(jasperdesain);
        jasperprint = JasperFillManager.fillReport(jasperreport, param,koneksi.conn);
        JasperViewer.viewReport(jasperprint,false);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        try{
        File file = new File("src/Ujikom/Report/reportPaketKredit.jrxml");
        jasperdesain = JRXmlLoader.load(file);
        param.clear();
        jasperreport = JasperCompileManager.compileReport(jasperdesain);
        jasperprint = JasperFillManager.fillReport(jasperreport, param,koneksi.conn);
        JasperViewer.viewReport(jasperprint,false);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void pembeliancashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembeliancashActionPerformed
        // TODO add your handling code here:
        new FrmBeliCash().show();
    }//GEN-LAST:event_pembeliancashActionPerformed

    private void pembeliankreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembeliankreditActionPerformed
        // TODO add your handling code here:
        new FrmBeliKredit().show();
    }//GEN-LAST:event_pembeliankreditActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try{
        File file = new File("src/Ujikom/Report/reportPembeli.jrxml");
        jasperdesain = JRXmlLoader.load(file);
        param.clear();
        jasperreport = JasperCompileManager.compileReport(jasperdesain);
        jasperprint = JasperFillManager.fillReport(jasperreport, param,koneksi.conn);
        JasperViewer.viewReport(jasperprint,false);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void pembayarancicilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayarancicilanActionPerformed
        // TODO add your handling code here:
        new FrmBayarCicilan().show();
    }//GEN-LAST:event_pembayarancicilanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem datamobil;
    private javax.swing.JMenuItem datapembeli;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuItem paketkredit;
    private javax.swing.JMenuItem pembayarancicilan;
    private javax.swing.JMenuItem pembeliancash;
    private javax.swing.JMenuItem pembeliankredit;
    private javax.swing.JMenu report;
    // End of variables declaration//GEN-END:variables
}
