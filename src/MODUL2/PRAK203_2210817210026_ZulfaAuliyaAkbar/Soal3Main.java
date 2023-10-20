package MODUL2.PRAK203_2210817210026_ZulfaAuliyaAkbar;

public class Soal3Main {
        public static void main(String[] args) {
            Pegawai p1 = new Pegawai();
//           Kurang petik dua(;) di akhir
//            p1.nama = "Roi"
            p1.nama = "Roi";
            p1.asal = "Kingdom of Orvel";
            p1.setJabatan("Assasin");

//            Kurang Tambahan set umur pegawai untuk menyesuaikan output
            p1.umur = 17;
            System.out.println("Nama Pegawai: " + p1.getNama());
            System.out.println("Asal: " + p1.getAsal());
            System.out.println("Jabatan: " + p1.jabatan);
//          Kurang "Tahun" di ujung print untuk menyamakan output
//            System.out.println("Umur: " + p1.umur);
            System.out.println("Umur: "+p1.umur+" Tahun");
        }
    }

