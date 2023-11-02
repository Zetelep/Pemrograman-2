import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long angka,total=0;
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        while (T-->0){
            long N = in.nextLong();
            for (int i = 0; i < N; i++) {
                angka = in.nextInt();
                total   =(total+angka)%N;
            }
            if(total == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");}
        }
    }
}