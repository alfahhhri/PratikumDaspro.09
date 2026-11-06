import java.util.Scanner;
public class Tugas309 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    

        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko <1) {
            System.out.println("Jumlah toko minimal harus 1");
        } else {
            int totalSemuaToko = 0;
            int barangTerbanyak = -1;  
            int tokoTerbanyak = 0;

            for (int i = 1; i <=jumlahToko; i++) {
                int totalBarangToko = 0;  

                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + i + " - jumlah pelanggan : ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan<0) {
                        System.out.println("Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan<0);

                for (int j = 1; j <=jumlahPelanggan; j++) {
                    int jumlahbarang;
                    do {
                        System.out.print("  Barang pelanggan ke- " + j + " : ");
                        jumlahbarang = sc.nextInt();
                        if (jumlahbarang<0) {
                            System.out.println("  Jumlah barang tidak boleh negatif. Ulangi input!");
                        }
                    } while (jumlahbarang <0);
                    totalBarangToko+=jumlahbarang;
                }

                System.out.println("Toko ke- " + i + " Pelanggan: " + jumlahPelanggan+ ", total barang : " + totalBarangToko);

                totalSemuaToko+=totalBarangToko;

                if (totalBarangToko>barangTerbanyak) {  
                    barangTerbanyak=totalBarangToko;
                    tokoTerbanyak=i;
                }
            }

            System.out.println("Total barang seluruh toko : " + totalSemuaToko);
            System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
        }
    }
}