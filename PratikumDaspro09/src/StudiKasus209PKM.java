import java.util.Scanner;
public class StudiKasus209PKM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String namaMahasiswa,jenisKegiatan;
        int jumlahDokumen,peringkatJuara,kurangDokumen,statusPendanaan;

        System.out.println("Masukkan Nama Mahasiswa :");
        namaMahasiswa=sc.nextLine();
        System.out.println("Masukkan jenis kegiatan (BELMAWA/BAKORMA/PKM/LAINNYA) :");
        jenisKegiatan=sc.nextLine();
        System.out.println("Masukkan jumlah dokumen :");
        jumlahDokumen=sc.nextInt();
        //System.out.println("Masukkan peringkat :");
        //peringkatJuara=sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") 
            || jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI"))  {
            System.out.println("Masukkan peringkat");
            peringkatJuara=sc.nextInt();
            if (peringkatJuara>=1 && peringkatJuara <=3) {
                System.out.println("Selamat anda juara " +peringkatJuara);
            if (jumlahDokumen==4) {
                System.out.println("Dokumen anda lengkap. Silahkan ambil dana penghargaan");
            } else {
                kurangDokumen=4-jumlahDokumen;
                System.out.println("Dokumen anda tidak lengkap (Kurang " +kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
            }
            } else {
                System.out.println("Maaf, anda belum juara. Tetap Semangat");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.println("Masukkan Status pendanaan (1/0) : ");
            statusPendanaan=sc.nextInt();
            if (statusPendanaan==1) {
                System.out.println("Selamat anda lolos");                
            if (jumlahDokumen==4) {
                System.out.println("Dokumen Lengkap, dana diberikan");

            } else {
                kurangDokumen=4-jumlahDokumen;
                System.out.println("Dokumen tidak lengkap (Kurang " +kurangDokumen + " dokumen). Dana tidak diberikan");
            }
            } else {
                System.out.println("Maaf anda tidak lolos");
            }
        }

    }
}
