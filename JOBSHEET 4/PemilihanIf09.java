import java.util.Scanner;
public class PemilihanIf09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktlunas = sc.nextBoolean();
        if (uktlunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
         }
         else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu!");
         }
         }
    }