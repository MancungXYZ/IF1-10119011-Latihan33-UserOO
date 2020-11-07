/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        User masuk = new User();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan username = ");
        String user = sc.nextLine();
        
        System.out.print("Masukan password =");
        String pass = sc.nextLine();
        
        masuk.pengecekanLogin(user,pass);
    }
    
}
