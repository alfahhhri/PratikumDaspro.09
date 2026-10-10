import java.util.Scanner;
public class operatorlogikaWifi09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.println("Apakah pengguna mahasiswa? (true/false):");
        mahasiswa =sc.nextBoolean();
        System.out.println("Apakah pengguna dosen? (true/false):");
        dosen =sc.nextBoolean();
        System.out.println("Apakah akun sedang diblokir? (true/false):");
        akunDiblokir =sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses wifi diberikan");

        } else {
            System.out.println("Akses wifi ditolak");
        }
    }
}