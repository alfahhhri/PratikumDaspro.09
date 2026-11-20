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

        int no = 1;
        for (int nilai : nilaiAkhir) {
            status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
        }
    }
}