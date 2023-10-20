package MODUL2.PRAK203_2210817210026_ZulfaAuliyaAkbar;

//      sesuai pada file main, nama classnya adalah Pegawai, bukan Employee
//    public class Employee {
    public class Pegawai {
        public String nama;

//        Pada output asal berupa string(kalimat), bukan char
//        public char asal;
        public String asal;
        public String jabatan;
        public int umur;

        public String getNama() {
            return nama;
        }

        public String getAsal() {
            return asal;
        }

//        Kurang parameter j (String) di dalam function
//        public void setJabatan() {
          public void setJabatan(String j){
            this.jabatan = j;
        }
    }

