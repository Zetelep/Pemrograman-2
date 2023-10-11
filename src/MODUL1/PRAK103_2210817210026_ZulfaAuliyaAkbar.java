package MODUL1;

import java.util.Scanner;

public class PRAK103_2210817210026_ZulfaAuliyaAkbar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int angka = in.nextInt();

        if (angka%2==0) angka+=1;

        do {
            if (N==1){
                System.out.println(angka);
                break;
            }
            System.out.print(angka + ",");
            N--;angka+=2;
        }while (N>0);
    }
}
