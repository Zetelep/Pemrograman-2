package MODUL1;

import java.util.Scanner;

public class PRAK102_2210817210026_ZulfaAuliyaAkbar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int baris = 10;
        int angka = in.nextInt();

        while (baris >= 0) {
            if (angka % 5 == 0) {
                if(baris==0){
                    System.out.print((angka/5)-1);
                    break;
                }
                System.out.print((angka/5)-1 + ",");
            } else {
                if(baris==0){
                    System.out.print(angka);
                    break;
                }
                System.out.print(angka + ",");
            }
            angka++;
            baris--;
        }
    }
}
