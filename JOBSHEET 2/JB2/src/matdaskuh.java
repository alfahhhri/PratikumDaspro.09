import java.util.Scanner;
public class matdaskuh {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai mahasiswa =");
        double nilai = input.nextDouble();
        System.out.print("Masukkan persentase kehadiran =");
        double kehadiran = input.nextDouble();

        boolean p = nilai >=60;
        boolean q = kehadiran >=80;
        boolean Tidaklulus = !p || !q;

        System.out.println("Status Kelulusan");
        System.out.println("Nilai =" + nilai);
        System.out.println("Kehadiran =" + kehadiran);

        if (Tidaklulus) {
            System.out.println("Status  : TIDAK LULUS");
        }   else {
            System.out.println("Status   : LULUS");
        }
        input.close();








    }
}