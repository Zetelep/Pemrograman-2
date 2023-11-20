package MODUL4.SOAL2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("""
                pilih jenih hewan yang ingin diinputkan:
                1 = Kucing
                2 = Anjing
                """);
        System.out.print("Masukan pilihan: ");
        int pilihan = in.nextInt();
        in.nextLine();
        if (pilihan !=1 && pilihan!=2) {
            throw new IllegalArgumentException("Pilihan hanya 1 dan 2");
        }else {
            MembuatObjek(pilihan,in);
        }
    }

    static private void MembuatObjek(int pilihan,Scanner in){
        System.out.print("Nama hewan peliharaan: ");
        String nama = in.nextLine();
        System.out.print("Ras: ");
        String ras = in.nextLine();
        System.out.print("Warna Bulu: ");
        String warnaBulu = in.nextLine();
        if (pilihan==1){
            Kucing kucing = new Kucing(ras,nama,warnaBulu);
            System.out.println();
            kucing.displayDetailKucing();
        }
        else if (pilihan==2){
            System.out.print("Memiliki kemampuan: ");
            String kemampuanString = in.nextLine();
            String[] kemampuan = kemampuanString.split(", ");
            Anjing anjing = new Anjing(ras,nama,warnaBulu,kemampuan);
            System.out.println();
            anjing.displayDetailAnjing();
        }
    }
}
