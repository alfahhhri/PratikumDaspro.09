
public class Kasus2Manual {
    public static void main(String[] args) {
        int panjang_tanah = 100, sisi=2, lebar_tanah=30,luas_persegi;
        double diameter_lingkaran=5, phi = 3.14, luas_tanah, jari_jari, kolam_lingkaran, luas_digunakan, luas_tidak_digunakan;

        luas_tanah = lebar_tanah * panjang_tanah;
        kolam_lingkaran = phi * diameter_lingkaran/2 * diameter_lingkaran/2;
        luas_persegi = sisi * sisi;
        luas_digunakan = kolam_lingkaran + luas_persegi;
        luas_tidak_digunakan = luas_tanah - luas_digunakan;

        System.out.println("Luas tanah = "+ luas_tanah);
        System.out.println("Luas Kolam = "+kolam_lingkaran);
        System.out.println("Luas digunakan ="+luas_digunakan);
        System.out.println("Luas tidak digunakan = "+luas_tidak_digunakan);

    }
    
}
