// diskon dasar kamus = 8+(9 mod 5)% = 12% 
// berlaku jika kamus dibeli 2+(9 mod 4) = >3 (tambahan diskon 2%)
// diskon dasar novel = 5+(9 mod 4)% = 6%
// berlaku jika novel dibeli 3+(9 mod 2) = >4 tambahan diskon 2% <4 tambahan diskon1%
// diskon selain kamus/novel = 3+(9 mod 4)% = 4%
// berlaku jika jenis tsb dibeli 3+(9 mod 2) = 4 buah
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String jenisbuku;
        int jumlahbuku;
        double diskon=0.0;

        System.out.print("Masukkan jenis buku:");
        jenisbuku=sc.nextLine();
        System.out.print("Masukkan jumlah buku:");
        jumlahbuku=sc.nextInt();

        if (jenisbuku.equalsIgnoreCase("Kamus")) {
            diskon=12.0;
            if (jumlahbuku>3) {
                diskon=diskon+2.0;
                }
            } else if (jenisbuku.equalsIgnoreCase("Novel")) {
                diskon=6.0;
                if (jumlahbuku>4) {
                    diskon=diskon+2.0;
                } else {
                    diskon=diskon+1.0;
                }

            } else {
                if (jumlahbuku>4) {
                    diskon=4.0;
                } else {
                    diskon=0.0;
                }
            }
            System.out.println(diskon);
        }
    }

