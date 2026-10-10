import java.util.Scanner;
public class latihan22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_motor, uangmuka, lama_angsuran;
        double prosentase_bunga, sisahutangpokok, totalbunga, besarcicilan;

        System.out.println("Masukkan harga motor");
        harga_motor=input.nextInt();
        System.out.println("Masukkan uang muka");
        uangmuka=input.nextInt();
        System.out.println("Masukkan lama angsuran (bulan)");
        lama_angsuran=input.nextInt();
        System.out.println("Masuukan prosentase bunga");
        prosentase_bunga=input.nextDouble();

        sisahutangpokok=harga_motor-uangmuka;
        totalbunga=sisahutangpokok*prosentase_bunga*lama_angsuran;
        besarcicilan=(totalbunga+sisahutangpokok)/lama_angsuran;

        System.out.println("Sisa hutang pokok"+sisahutangpokok);
        System.out.println("Total bunga adalah"+totalbunga);
        System.out.println("Besar cicilan perbulan"+besarcicilan);

        


    }
}
