import java.util.Scanner;
public class nestedAksesLab09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah anda seorang mahasiswa aktif? (true/false):");
        mahasiswaAktif =sc.nextBoolean();
        System.out.print("Apakah anda sedang di sanksi? (true/false):");
        sedangDisanksi =sc.nextBoolean();
        System.out.println("Apakah anda punya izin dosen? (true/false):");
        punyaIzinDosen =sc.nextBoolean();
        System.out.println("Apakah anda seorang asisten lab? (true/false):");
        asistenLab =sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses lab diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
                
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
    
}
