package MODUL3.PRAK301_2210817210026_ZulfaAuliyaAkbar;

import java.util.LinkedList;
import java.util.Scanner;

public class DaduDriver {
    public static void main(String[] args) {
        LinkedList<Dadu> listDadu = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int jumlahDadu = in.nextInt();
        int sum=0;

        for (int i=0;i<jumlahDadu;i++){
            Dadu dadu = new Dadu();
            listDadu.add(dadu);
        }
        for (Dadu i:listDadu) {
            System.out.println("dadu ke-"+(listDadu.indexOf(i)+1)+" bernilai "+ i.acakNilai());
            sum+=i.getMataDadu();
        }
        System.out.println("Total nilai dadu keseluruhan "+sum);
    }
}
