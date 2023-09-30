package MODUL2;

import java.util.HashMap;
import java.util.Scanner;

public class PRAK101_2210817210026_ZulfaAuliyaAkbar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Map untuk merubah bulan yang berupa angka ke nama bulannya
        HashMap<Integer,String> Bulan = new HashMap<>();
        Bulan.put(1, "Januari");
        Bulan.put(2, "Februari");
        Bulan.put(3, "Maret");
        Bulan.put(4, "April");
        Bulan.put(5, "Mei");
        Bulan.put(6, "Juni");
        Bulan.put(7, "Juli");
        Bulan.put(8, "Augustus");
        Bulan.put(9, "September");
        Bulan.put(10, "Oktober");
        Bulan.put(11, "November");
        Bulan.put(12, "Desember");

        System.out.print("Masukan Nama Lengkap: ");
        String Nama = in.nextLine();
        System.out.print("Masukan Tempat Lahir: ");
        String TempatLahir = in.nextLine();
        System.out.print("Masukan Tanggal Lahir: ");
        int TanggalLahir = in.nextInt();
        System.out.print("Masukan Bulan Lahir: ");
        int BulanLahir = in.nextInt();
        System.out.print("Masukan Tahun Lahir: ");
        int TahunLahir = in.nextInt();
        System.out.print("Masukan Tinggi Badan: ");
        int TinggiBadan = in.nextInt();
        System.out.print("Masukan Berat Badan: ");
        double BeratBadan = in.nextDouble();

        System.out.println("Nama Lengkap "+Nama+", Lahir di "+TempatLahir+" pada Tanngal "+TanggalLahir+" "+Bulan.get(BulanLahir)+" "+TahunLahir+
                " Tinggi Badan "+TinggiBadan+" cm dan Berat Badan "+BeratBadan+" kilogram");
    }
}
