package MODUL0;

import java.util.Scanner;

public class PRAK005_2210817210026_ZulfaAuliyaAkbar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Makanan Favorit: ");
        String makanan = in.next();
        System.out.print("Masukan Hobi: ");
        String Hobi = in.next();

        System.out.println("Aku Suka Makan "+makanan+", dan Hobiku "+ Hobi);
        in.close();
    }
}
