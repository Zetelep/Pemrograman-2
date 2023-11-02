package MODUL3.PRAK302_2210817210026_ZulfaAuliyaAkbar;

import java.util.HashMap;
import java.util.Scanner;

public class Negara {
    private String nama,jenisKepemimpinan,namaPemimpin,tanggalKemerdekaan,bulanKemerdekaan,tahunKemerdekaan;

        public Negara() {
        Scanner in = new Scanner(System.in);
        this.nama = in.nextLine();
        this.jenisKepemimpinan = in.nextLine();
        this.namaPemimpin = in.nextLine();

        if(!jenisKepemimpinan.equals("monarki")) {
            this.tanggalKemerdekaan = in.nextLine();
            this.bulanKemerdekaan = in.nextLine();
            this.tahunKemerdekaan = in.nextLine();
        }
    }

    public void info(){
        if(jenisKepemimpinan.equals("monarki")){
            System.out.println("Negara "+getNama()+" mempunyai Raja bernama "+getNamaPemimpin()+"\n");
        }
        else{
            System.out.println("Negara "+getNama()+" mempunyai "+getJenisKepemimpinan() +" bernama "+getNamaPemimpin() +
                    " Deklarasi Kemerdekaan pada Tanggal " +getTanggalKemerdekaan()+" "+getBulanKemerdekaan()
                    +" "+getTahunKemerdekaan()+"\n");
        }
    }
    public String getNama() {
        return nama;
    }
    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }
    public String getNamaPemimpin() {
        return namaPemimpin;
    }
    public String getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }
    public String getBulanKemerdekaan() {
        HashMap<String,String> bulan = new HashMap<>();
        bulan.put("1", "Januari");
        bulan.put("2", "Februari");
        bulan.put("3", "Maret");
        bulan.put("4", "April");
        bulan.put("5", "Mei");
        bulan.put("6", "Juni");
        bulan.put("7", "Juli");
        bulan.put("8", "Augustus");
        bulan.put("9", "September");
        bulan.put("10", "Oktober");
        bulan.put("11", "November");
        bulan.put("12", "Desember");
        return bulan.get(bulanKemerdekaan);
    }
    public String getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }
}
