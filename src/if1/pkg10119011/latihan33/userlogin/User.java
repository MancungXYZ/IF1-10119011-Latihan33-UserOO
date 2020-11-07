/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan33.userlogin;

/**
 *
 * @author Reihan Wiyanda
 */
public class User {
    private static String db_user = "ReihanWiyanda";
    private static String db_pass = "Mancung";
    public boolean statusAkun;
    
    public void cekAkun(String username, String password) {
            if (username.equals(db_user) && password.equals(db_pass)) {
                statusAkun = true;
    } else {
                statusAkun = false;
        }
    } 
    public void hasilLogin(boolean statusAkun, String username) {
        if (statusAkun) {
            System.out.println("****** HALO " + username.toUpperCase() + "*******");
            System.out.println("Selamat datang");
        } else {
            System.out.println("Oooops, Username atau Password salah");
        }
    }
    public void pengecekanLogin (String username, String password) {
        cekAkun(username,password);
        hasilLogin(statusAkun,username);
    }
    
}
        