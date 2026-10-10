    // nilai daspro 75+(9 mod 11) =84
    // nilai wawancara 70+ (9 mod 11) = 79
    import java.util.Scanner;
    public class Tugas2SeleksiAsisten09 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            boolean mahasiswaAktif;
            boolean mahasiwaTerkenaSanksi;
            boolean sertifikatKompetensi;
            int nilaiPemrograman,nilaiWawancara;

            System.out.print("Apakah mahasiswa aktif? (true/false):");
            mahasiswaAktif=sc.nextBoolean();
            System.out.print("Apakah mahasiswa terkena sanksi? (true/false):");
            mahasiwaTerkenaSanksi=sc.nextBoolean();
            System.out.print("Apakah mahasiswa memiliki sertifikat kompetensi? (true/false):");
            sertifikatKompetensi=sc.nextBoolean();
            System.out.print("Masukkan nilai pemrograman:");
            nilaiPemrograman=sc.nextInt();
            System.out.print("Masukkan nilai wawancara:");
            nilaiWawancara=sc.nextInt();

            if (mahasiswaAktif || !mahasiwaTerkenaSanksi) {
                if (nilaiPemrograman>=84 || sertifikatKompetensi) {
                    if (nilaiWawancara>=79) {
                        System.out.println("Selamat anda diterima sebagai asisten pratikum");
                    } else {
                        System.out.println("Maaf, Nilai wawancara belum mencukupi");
                    }
                } else {
                    System.out.println("Maaf, Nilai pemrograman anda belum mencukupi"+"\nAnda tidak memliki sertifikat kompetensi");    
                }
                } else {
                    System.out.println("Maaf, anda belum mencukupi syarat sebagai asisten pratikum");
                }







        }
    }