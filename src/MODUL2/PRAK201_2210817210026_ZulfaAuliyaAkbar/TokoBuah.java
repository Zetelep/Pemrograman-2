package MODUL2.PRAK201_2210817210026_ZulfaAuliyaAkbar;

import static java.lang.Math.floor;

public class TokoBuah {
    String namaBuah;
    Double beratBuah, hargaBuah, jumlahBeli, hargaAwal, totalDiskon, hargaAkhir;
    Double diskon = 0.02; //per 4 kg
    public TokoBuah(String namaBuah, Double beratBuah, Double hargaBuah,Double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.beratBuah = beratBuah;
        this.hargaBuah = hargaBuah;
        this.jumlahBeli = jumlahBeli;
        hargaAwal = (jumlahBeli/beratBuah)*hargaBuah;
        totalDiskon = (floor(jumlahBeli/4))*(hargaBuah*diskon*4);
        hargaAkhir = hargaAwal-totalDiskon;
    }
    void Info(){
        System.out.printf("%nNama Buah: %s%nBerat: %.1f%nHarga: %.1f%nJumlah Beli: %.1f%nHarga Sebelum Diskon: %.2f%nTotal Diskon: %.2f%nHarga Setelah Diskon: %.2f%n"
                ,namaBuah,beratBuah,hargaBuah,jumlahBeli,hargaAwal,totalDiskon,hargaAkhir);
    }
}
