package MODUL1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2210817210026_ZulfaAuliyaAkbar {
    static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.###");

        System.out.print("Masukan jari-jari: ");
        double r = in.nextDouble();
        System.out.print("Masukan tinggi: ");
        double t = in.nextDouble();

        double volume = PI*r*r*t;

        System.out.println("Volume tabung dengan jari-jari "+r+" cm dan tinggi "+t+" cm adalah "+dec.format(volume)+" m3");
    }
}
