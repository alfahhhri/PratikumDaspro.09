import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int jenis,durasi=0, total=0;

        do {
            System.out.println("Masukkan jenis kendaraan : ");
                jenis=sc.nextInt();
            if (jenis==1 || jenis==2) {
                System.out.println("Masukkan durasi : ");
                durasi=sc.nextInt();
            
                if (jenis==1) {
                total+=durasi*3250;
                System.out.println("Total : "+total);
    
            }   else if (jenis==2) {
                total+=durasi*2250;
                System.out.println("Total : "+total);
            } else if (jenis!=0) {
            }
            }
        } while (jenis!=0);
        System.out.println("Progam berakhir");
    }
}
