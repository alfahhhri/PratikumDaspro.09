import java.util.Scanner;
public class Kasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int panjang_tanah, sisi, lebar_tanah,luas_persegi;
        double diameter_lingkaran, phi = 3.14, luas_tanah, jari_jari, kolam_lingkaran, luas_digunakan, luas_tidak_digunakan;

        System.out.print("Masukkan lebar tanah =");
        lebar_tanah = input.nextInt();
        System.out.print("Masukkan panjang tanah =");
        panjang_tanah = input.nextInt();
        System.out.print("Masukkan diameter kolam =");
        diameter_lingkaran = input.nextInt();
        System.out.print("Masukkan sisi kolam =");
        sisi = input.nextInt();

        luas_tanah = lebar_tanah * panjang_tanah;
        kolam_lingkaran = phi * diameter_lingkaran/2 * diameter_lingkaran/2;
        luas_persegi = sisi * sisi;
        luas_digunakan = kolam_lingkaran + luas_persegi;
        luas_tidak_digunakan = luas_tanah - luas_digunakan;

        System.out.println("Luas tanah = "+ luas_tanah);
        System.out.println("Luas Kolam = "+kolam_lingkaran);
        System.out.println("Luas Taman ="+luas_persegi);
        System.out.println("Luas digunakan ="+luas_digunakan);
        System.out.println("Luas tidak digunakan = "+luas_tidak_digunakan);

    }
    
}
