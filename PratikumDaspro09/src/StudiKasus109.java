import java.util.Scanner;
public class StudiKasus109 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int hargaPerCup=18000, jumlahCup, uangbayar,
        totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.println("Masukkan jumlah cup :");
        jumlahCup=sc.nextInt();
        System.out.print("Masukkan uang bayar :Rp.");
        uangbayar=sc.nextInt();

        totalHarga=jumlahCup*hargaPerCup;
        diskon=0;
        totalBayar=0;
        kembalian=0;
        kurang=0;

        System.out.println("Total harga yang diperoleh Rp."+totalHarga);

        
        if (totalHarga>=100000) {
            diskon=totalHarga*10/100;
            totalBayar=totalHarga-diskon;
            System.out.println("Diskon yang diperoleh :Rp."+diskon);
            System.out.println("Total bayar diperoleh :Rp."+totalBayar);
        } else {
            diskon=0;
        }
        totalBayar=totalHarga-diskon;

        if (uangbayar>=totalBayar) {
            kembalian=uangbayar-totalBayar;
            System.out.println("Kembalian :Rp."+kembalian);

        } else {
            kurang=totalBayar-uangbayar;
            System.out.println("Uang tidak cukup, kurang Rp."+kurang);
        }

    }
}