/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.Class;

/**
 *
 * @author 
 */
public class Session {
    private static String hak_akses,user;
    public static void setHak_akses(String hak_akses){
        Session.hak_akses=hak_akses;
    }
    public static String getHak_akses(){
        return hak_akses;
    }
    public static void setUser(String user){
        Session.user=user;
    }
    public static String getUser(){
        return user;
    }
}
