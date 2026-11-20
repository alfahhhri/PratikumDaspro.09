import java.util.Scanner;

public class ArrayNilai09 {
    public static void main(String[] args) {

        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        String status = "";

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        int jmlLulus = 0;
        int jmlTdkLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                status = "LULUS";
                jmlLulus++;
            } else {
                status = "TIDAK LULUS";
                jmlTdkLulus++;
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }

        System.out.println("Jumlah lulus : " + jmlLulus);
        System.out.println("Jumlah tidak lulus : " + jmlTdkLulus);
    }
}