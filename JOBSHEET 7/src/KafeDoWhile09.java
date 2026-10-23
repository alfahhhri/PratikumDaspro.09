import java.util.Scanner;
public class KafeDoWhile09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kopi,teh,roti;
        String namapelanggan;
        int hargakopi=12000, hargateh=7000,hargaroti=20000,totalharga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan=sc.nextLine();
        if (namapelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan");
            break;
        }
        System.out.print("Jumlah kopi : ");
        kopi=sc.nextInt();
        System.out.print("Jumlah teh: ");
        teh=sc.nextInt();
        System.out.print("Jumlah roti: ");
        roti=sc.nextInt();
        totalharga= (kopi*hargakopi) + (teh*hargateh) + (roti*hargaroti);
        System.out.println("Total harga yang harus dibayar: Rp "+ totalharga);
        sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai");
    }
}
