import java.util.Scanner;
public class latihan03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uangmuka, lamacicilan;
        double bunga=0.2, sisahutangpokok, totalbungacicilan, besarcicilan;

        System.out.print("Masukkan uang muka =");
        uangmuka=input.nextInt();
        System.out.print("Masukkan lama bulan cicilan =");
        lamacicilan=input.nextInt();

        besarcicilan=uangmuka*bunga;
        sisahutangpokok=uangmuka-besarcicilan;
        totalbungacicilan=uangmuka+besarcicilan;

        System.out.println("Besar cicilan perbulan"+besarcicilan);
        System.out.println("Total bunga cicilan "+totalbungacicilan);
        System.out.println("Sisa hutang pokok"+sisahutangpokok);

        

        
    }
    
}
