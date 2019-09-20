package sekuensial;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PrakSekuen {

    public static void prak1() {
        int golek;
        boolean temu=true;
        int a = 0;
        int[] data = new int[]{74, 98, 72, 74, 72, 90, 81, 72};
        System.out.println("Data pada array : "
                + "\n 74\t98\t72\t74\t72\t90\t81\t72");
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nilai yang dicari : ");
        golek = masuk.nextInt();
         if (temu == true) {
            System.out.println("==============="
                    + "\nDATA TERSEDIA\n===============");
        } else {
            System.out.println("================="
                    + "\nDATA TIDAK VALID\n=================");
        }

        for (int i = 0; i < data.length; i++) {
            if (golek == data[i]) {
                a++;
            }

        }System.out.println("Terdapat "+a+" data"
                + "\n================");
    }

    public static void prak2() {
        double jumlah = 0;
        int a=0;
        int[] nilai = new int[]{83, 76, 45, 90, 85, 80, 78, 74};
        System.out.println("Data pada array : "
                + "\n 83\t76\t45\t90\t85\t80\t78\t74");
        for (int i = 0; i < nilai.length; i++) {
           // System.out.println(nilai[i]+"\t");
            jumlah +=nilai[i];
        }
        double ratarata = jumlah /= nilai.length;
        for (int i = 0; i < nilai.length; i++) {
          if( ratarata < nilai[i]){
              a++;
          }     
            
        }
        System.out.println("Rata-rata nilai array = "+ratarata
            +"\nnilai yang diatas rata-rata adalah : " +a+
                "\n=======================================");
    }

    public static void prak3() {
        int x = 0;
        int hasil = 0;
        int[] nilai = new int[]{92, 98, 76, 72, 84, 101, 39};
        System.out.print("Data pada array :");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + "\t");
        }
        System.out.println();
        System.out.println("Nilai yang berkelipatan 3 : ");
        for (int i = 0; i < nilai.length; i++) {
            if (hasil == nilai[i] % 3) {
                x++;
                System.out.println(nilai[i]+"\n======");
            }

        }
    }

    public static void prak4() {
        Scanner input = new Scanner(System.in);
        String temu;
        System.out.println("Masukkan sebuah kalimat :");
        temu = input.nextLine();
        System.out.println("============================");
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        for (int i = 0; i < temu.length(); i++) {
            if (temu.charAt(i) == 'a') {
                a++;
            }
            if (temu.charAt(i) == 'i') {
                b++;
            }
            if (temu.charAt(i) == 'u') {
                c++;
            }
            if (temu.charAt(i) == 'e') {
                d++;
            }
            if (temu.charAt(i) == 'o') {
                e++;
            }
        }
        System.out.println("Jumlah huruh a = " +a);
        System.out.println("Jumlah huruh i = " +b);
        System.out.println("Jumlah huruh u = " +c);
        System.out.println("Jumlah huruh e = " +d);
        System.out.println("Jumlah huruh o = " +e);
        int total =a+b+c+d+e ;
        System.out.println("Jumlah semua huruf vokal ="+total
        +"\n============================");

    }
    public static void jop2(){
        String ulang;
        do {
            String menu = JOptionPane.showInputDialog(null, "Masukkan pilihan anda : "
                    + "\n 1. Praktikum 1"
                    + "\n 2. Praktikum 2"
                    + "\n 3. Praktikum 3"
                    + "\n 4. Praktikum 4");

            int option = Integer.parseInt(menu);
            if (option == 1) {
                prak1();
            } else if (option == 2) {
                prak2();
            } else if (option == 3) {
                prak3();
            } else if (option == 4) {
                prak4();
            } else if (option == 5) {
                JOptionPane.showMessageDialog(null, "==MATUR THANK YOU==");
                System.exit(0);
            }
            ulang = JOptionPane.showInputDialog(null,
                    "\n Apakah anda ingin mengulang "
                    + "\n 1.ya \n 2. tidak");
        } while ("1".equals(ulang));
        
    }

    public static void main(String[] args) {
        jop2();
    }
}
