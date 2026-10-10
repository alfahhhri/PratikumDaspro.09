import java.util.Scanner;
public class latihanbaru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah_tabungan_awal, lama_menabung;
        double prosentase_bunga, total_tabungan_awal, besarbunga;

        System.out.println("Masukkan jumlah tabungan awal =");
        jumlah_tabungan_awal=input.nextInt();
        System.out.println("Masukkan lama menabung (tahun)");
        lama_menabung=input.nextInt();
        System.out.println("Masukkan prosentase bunga");
        prosentase_bunga=input.nextDouble();

        besarbunga=jumlah_tabungan_awal*prosentase_bunga*lama_menabung;
        total_tabungan_awal=jumlah_tabungan_awal+besarbunga;
        int total_tabungan_akhir = (int) total_tabungan_awal;

        System.out.println("Total tabungan akhir"+total_tabungan_akhir);
        System.out.println("Besar bunga yang didapat"+besarbunga);


    }
}
