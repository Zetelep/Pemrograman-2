package MODUL3.PRAK302_2210817210026_ZulfaAuliyaAkbar;

import java.util.LinkedList;
import java.util.Scanner;

public class NegaraDriver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Negara> listNegara = new LinkedList<>();
        int jumlah = in.nextInt();
        in.nextLine();
        for (int i = 0; i < jumlah; i++) {
            Negara negara = new Negara();
            listNegara.add(negara);
        }
        for (Negara i : listNegara) {
            i.info();
        }
    }
}
