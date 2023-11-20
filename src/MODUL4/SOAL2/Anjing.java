package MODUL4.SOAL2;

public class Anjing extends HewanPeliharaan{
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String r, String n, String w, String[] k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing(){
        super.display();
        System.out.println("Memiliki warna bulu: "+warnaBulu);
        System.out.print("Memiliki kemampuan: ");
        for (String i:kemampuan) {
            System.out.print(i+" ");
        }
    }
}
