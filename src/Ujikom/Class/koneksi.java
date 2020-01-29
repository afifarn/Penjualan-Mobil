/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.Class;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 
 */
public class koneksi {
       public static Connection conn;
       public static Statement cn;
       public static ResultSet rs;
       public static void Koneksi_DB(){
           try{
               Class.forName("com.mysql.jdbc.Driver");
               conn = DriverManager.getConnection("jdbc:mysql://localhost/db_jual_mobil","root","");
               cn = conn.createStatement();
               System.out.println("Koneksi Berhasil");
           }catch(Exception e){
               JOptionPane.showMessageDialog(null,"Ada Kesalahan","ERROR",JOptionPane.ERROR_MESSAGE);
               System.out.println(e.getMessage());
           }
       }
}
