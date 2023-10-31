package MODUL3.PRAK301_2210817210026_ZulfaAuliyaAkbar;

import java.util.Random;

public class Dadu {
    private int maxSisiDadu = 6;
    private int mataDadu;
    Random rand = new Random();
    public int acakNilai() {
        this.mataDadu = rand.nextInt(maxSisiDadu)+1; // agar rangenya 1-6
        return mataDadu;
    }
    public int getMataDadu() {
        return mataDadu;
    }
}
