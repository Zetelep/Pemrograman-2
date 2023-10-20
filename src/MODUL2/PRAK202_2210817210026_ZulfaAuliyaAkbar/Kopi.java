package MODUL2.PRAK202_2210817210026_ZulfaAuliyaAkbar;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;
    Double pajak;

    void info(){
        System.out.printf("Nama Kopi: %s%nUkuran: %s%nHarga: %.1f%n"
                ,namaKopi,ukuran,harga);
    }
    public String getPembeli() {
        return pembeli;
    }
    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }
    public double getPajak() {
        pajak = harga*0.11;
        return pajak;
    }
}
