/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekuensial;

import javax.swing.JOptionPane;
import static sekuensial.LatSekuen.jop1;
import static sekuensial.PrakSekuen.jop2;

/**
 *
 * @author LENOVO
 */
public class Menu {
    public static void main(String[] args) {
        String ulang;
        do {
            String menu = JOptionPane.showInputDialog(null, "Masukkan pilihan anda : "
                    + "\n 1. Latihan Praktikum"
                    + "\n 2. Tugas Praktikum");

            int option = Integer.parseInt(menu);
            if (option == 1) {
                jop1();
            } else if (option == 2) {
                jop2();
            } else if (option == 6) {
                JOptionPane.showMessageDialog(null, "==MATUR THANK YOU==");
                System.exit(0);
            }
    
            ulang = JOptionPane.showInputDialog(null,
                    "\n Apakah anda ingin keluar "
                    + "\n 1.ya \n 2. tidak");
        } while ("2".equals(ulang));
        JOptionPane.showMessageDialog(null, "==MATUR THANK YOU==");
    }
}
