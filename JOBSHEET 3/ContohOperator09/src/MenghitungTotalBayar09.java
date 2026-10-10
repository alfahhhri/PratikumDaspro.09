import java.util.Scanner;
public class MenghitungTotalBayar09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double harga;
        double potongan, jml_bayar, diskon = 0.15;

        System.out.println("Masukkan harga barang =");
        harga=sc.nextInt();
        potongan=diskon*harga;
        jml_bayar=harga-potongan;
        System.out.println("Jumlah yang harus anda bayar adalah Rp. ="+jml_bayar);

    }
    
}
