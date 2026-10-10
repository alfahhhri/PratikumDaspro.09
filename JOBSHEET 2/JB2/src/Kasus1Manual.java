
public class Kasus1Manual {
    public static void main(String[] args) {
        int gaji_awal = 5000000, tunjangan_awal=100000, jml_anak=4;
        double persentasi_potongan = 0.1, potongan_gaji, total_tunjangan, gaji_akhir;

        potongan_gaji = gaji_awal * persentasi_potongan;
        total_tunjangan = tunjangan_awal * jml_anak;
        gaji_akhir = gaji_awal - potongan_gaji + total_tunjangan;
        
        System.out.println("Potongan gaji adalah "+potongan_gaji);
        System.out.println("Total tunjangan yang didapat "+total_tunjangan);
        System.out.println("Gaji bersih yang didapatkan "+gaji_akhir);





    }
}
