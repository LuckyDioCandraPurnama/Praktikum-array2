
package sekuensial;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LatSekuen {

    public static void lat1(){
        //Chalange dari latihan 1
        int cari;
        boolean found = false;
        int[] data = new int[] {29,4,10,94,96};
        System.out.println("Data pada array : "
                + "\n 29\t4\t10\t94\t96");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yg ingin dicari");
        cari = input.nextInt();
        for (int i = 0; i < data.length; i++) {
            if (cari == data[i]){
                found = true;
                break;
            }
            
        }
        if (found == true){
            System.out.println("==============="
                    + "\nDATA TERSEDIA\n===============");
        }else{
            System.out.println("================="
                    + "\nDATA TIDAK VALID\n=================");
        }
    }
    public static void lat11(){
        //Tipe array String
        String golek;
        boolean cari = false;
        String[] data = new String[]{"lucky", "aji", "iwan","angga"};
        Scanner input = new Scanner(System.in);
        System.out.println("Nama yang tersedia :"
                + "\nlucky\taji\tiwan\tangga"
                + "\nMasukkan nama yg ingin dicari :");
        golek = input.nextLine();
        for (int i = 0; i < data.length; i++) {
            if (golek.equalsIgnoreCase(data[i])){
                cari = true;
                break;
            }
            
        }
        if (cari == true){
            System.out.println("=============\nNama Tersedia\n=============");
        }else{
            System.out.println("================\nNama Tidak Valid\n================");
        }
    }
    public static void lat2(){
        int cari;
        boolean temu =false;
        int[] data = new int[] {8,98,56,90,87,76,42};
        Scanner masok = new Scanner(System.in);
        System.out.println("Data yang tersedia"
                + "\n8\t98\t56\t90\t87\t76\t42"
                + "\nMasukkan data yg dicari : ");
        cari = masok.nextInt();
        for (int i = 0; i < data.length; i++) {
            if(cari == data[i]){
                temu = true;
                System.out.println("Data ditemukan di indeks ke-" + i
                                  +"\n=================================");
            }
            
        }
        if (temu != true) {
            System.out.println("Ora ketemu mas"
                    + "\n==============");
        }
    }
    
    public static void lat3(){
    int min = 0;
    int maks = -9999;
    int[] data = new int[] {-21,90,82,190,-83,74};
        System.out.println("Data pada array : "
               // + "\n-21\t90\t82\t190\t-83\t74"
        );
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
            if (data[i] < min){
                min = data[i];
            }if (data[i] > maks){
            maks = data[i];
            }
            
        }
        System.out.print("\n Data terkecil dari array adalah "+min
                + "\n======================================");
        System.out.println("\n Data terbesar dari array adalah "+maks
        +"\n======================================");
}
    public static void lat4(){
        Scanner masuk = new Scanner (System.in);
        String cari;
        System.out.println("Masukkan sebuah kata/kalimat : ");
        cari = masuk.nextLine();
        
        int a = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'a'){
                a++;
               
            }
        }
        System.out.println("Jumlah huruf 'A' pd kalimat diatas ada " +a
                          +"\n============================================");
        
    }
    public static void jop1() {
        String ulang;
        do {
            String menu = JOptionPane.showInputDialog(null, "Masukkan pilihan anda : "
                    + "\n 1. Latihan 1"
                    + "\n 2. Challenge 1"
                    + "\n 3. Latihan 2"
                    + "\n 4. Latihan 3"
                    + "\n 5. Latihan 4");

            int option = Integer.parseInt(menu);
            if (option == 1) {
                lat1();
            } else if (option == 2) {
                lat11();
            } else if (option == 3) {
                lat2();
            } else if (option == 4) {
                lat3();
            } else if (option == 5) {
                lat4();
            } else if (option == 6) {
                JOptionPane.showMessageDialog(null, "==MATUR THANK YOU==");
                System.exit(0);
            }
           
            ulang = JOptionPane.showInputDialog(null,
                    "\n Apakah anda ingin mengulang "
                    + "\n 1.ya \n 2. tidak");
        } while ("1".equals(ulang));
        
    }
    public static void main(String[] args) {
        jop1();
    }
    
}
