import java.util.Scanner;
public class TugasAntrean09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int loket;
        System.out.println("Pilih loket");
        loket=sc.nextInt();
        switch(loket) {
            case 1:
                System.out.println("Legalisir Ijazah");
            break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah");
            break;
            case 3:
                System.out.println("Pembayaran UKT");
            break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik");
            break;
        default:
            System.out.println(" Kode layanan tidak tersedia");
        
            
        }
    }
    
}
