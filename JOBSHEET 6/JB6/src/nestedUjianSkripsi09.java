// bimbinganP1 6 +(9 mod 5) = 10
// bimbinganP2 3 +(9 mod 3) = 3
import java.util.Scanner;
public class nestedUjianSkripsi09 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah Mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebaskompen=sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1=sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2=sc.nextInt();

        if (bebaskompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 10 && bimbinganP2 >= 3) {
                pesan ="Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 10 && bimbinganP2 <3) {
                pesan ="Gagal! Log bimbingan 1 kurang dari 10 kali dan P2 kurang dari 3 kali";
            } else if (bimbinganP1 <3) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 10 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 3 kali";
                
            } 
            } else {
                pesan = "Gagal! mahasiswa masih memiliki tanggungan kompen";
            }
            System.out.println(pesan);
            }

        }


    
