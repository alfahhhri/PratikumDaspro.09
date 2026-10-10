import java.util.Scanner;
public class latihan01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int hargaAwal;
        double besarPotonganHarga, totalHargaAkhir, diskon=0.20;

        System.out.println("Masukkan harga awal =");
        hargaAwal = input.nextInt();

        besarPotonganHarga=hargaAwal*diskon;
        totalHargaAkhir=hargaAwal-besarPotonganHarga;
        System.out.println("Besar potongan harga ="+besarPotonganHarga);
        System.out.println("total harga akhir "+totalHargaAkhir);




        
    }
}
