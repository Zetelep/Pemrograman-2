package MODUL3.PRAK303_2210817210026_ZulfaAuliyaAkbar;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver {
    static ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        boolean run = true;

        while (run){
            System.out.print("""
                    Menu:
                    1. Tambah Mahasiswa
                    2. Hapus Mahasiswa berdasarkan NIM
                    3. Cari Mahasiswa berdasarkan NIM
                    4. Tampilkan Daftar Mahasiswa
                    0. Keluar
                    Pilihan:\s""");
        int pilihan = in.nextInt();
        in.nextLine();
            switch (pilihan) {
                case 1 -> tambahMahasiswa();
                case 2 -> hapusMahasiswaBYNIM();
                case 3 -> cariMahasiswaBYNIM();
                case 4 -> tampilkanDaftarMahasiswa();
                case 0 -> {
                    run = false;
                    System.out.println("Terima Kasih!");
                }

                default -> System.out.println("Tidak termasuk dalam pilihan menu");
            }
        }
    }

    static private void tambahMahasiswa(){
        System.out.print("Masukan Nama Mahasiswa: ");
        String nama = in.nextLine();
        System.out.print("Masukan NIM Mahasiswa (harus unik): ");
        String NIM = in.next();
        if(listMahasiswa.isEmpty()){
            Mahasiswa mahasiswa = new Mahasiswa(nama,NIM);
            listMahasiswa.add(mahasiswa);
            System.out.println("Mahasiswa "+nama+" ditambahkan");
        }else{
            for (Mahasiswa i : listMahasiswa) {
                if(NIM.equals(i.getNIM())) {
                    System.out.println("NIM sudah dipakai!");
                }else {
                    Mahasiswa mahasiswa = new Mahasiswa(nama,NIM);
                    listMahasiswa.add(mahasiswa);
                    System.out.println("Mahasiswa "+nama+" ditambahkan");
                    break;
                }
            }
        }
    }
    static private void hapusMahasiswaBYNIM(){
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String NIM = in.nextLine();
        for (Mahasiswa i : listMahasiswa) {
            if(i.getNIM().equals(NIM)){
                listMahasiswa.remove(i);
                System.out.println("Mahasiswa dengan NIM " +NIM+" dihapus.");
                break;
            }else{
                System.out.println("Mahasiswa dengan NIM tersebut tidak ada");
            }
        }
    }
    static private void cariMahasiswaBYNIM(){
        System.out.print("Masukan NIM untuk mahasiswa yang ingin dicari: ");
        String NIM = in.nextLine();
        for (Mahasiswa i : listMahasiswa) {
            if(i.getNIM().equals(NIM)){
                System.out.println("NIM: "+i.getNIM()+" ,Nama: "+i.getNama());
                break;
            }else{
                System.out.println("Mahasiswa dengan NIM tersebut tidak ada");
            }
        }
    }
    static private void tampilkanDaftarMahasiswa(){
        for (Mahasiswa i : listMahasiswa) {
            System.out.println("NIM: "+i.getNIM()+" ,Nama: "+i.getNama());
        }
    }
}
