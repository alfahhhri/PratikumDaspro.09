import java.util.Scanner;
public class Kasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gaji_awal, tunjangan_awal, jml_anak;
        double persentasi_potongan = 0.1, potongan_gaji, total_tunjangan, gaji_akhir;

        System.out.print("Masukkan gaji awal anda =");
        gaji_awal = input.nextInt();
        System.out.print("Masukkan tunjangan anak =");
        tunjangan_awal = input.nextInt();
        System.out.print("Masukkan jumlah anak =");
        jml_anak = input.nextInt();
        potongan_gaji = gaji_awal * persentasi_potongan;
        total_tunjangan = tunjangan_awal * jml_anak;
        gaji_akhir = gaji_awal - potongan_gaji + total_tunjangan;
        
        System.out.println("Potongan gaji adalah "+potongan_gaji);
        System.out.println("Total tunjangan yang didapat "+total_tunjangan);
        System.out.println("Gaji bersih yang didapatkan "+gaji_akhir);





    }
}
