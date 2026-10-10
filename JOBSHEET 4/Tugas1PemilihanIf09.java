import java.util.Scanner;
public class Tugas1PemilihanIf09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktlunas = sc.nextBoolean();
        String pesan = (uktlunas) ? "Silahkan cetak KRS anda" : "Silahkan melakukan pembayaran terlebih dahulu"; 
        System.out.println(pesan);
        }
    }