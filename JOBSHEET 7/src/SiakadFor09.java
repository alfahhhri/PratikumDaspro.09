import java.util.Scanner;
public class SiakadFor09 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double nilai, tertinggi=0, terendah=100;
        int lulus=0,tidaklulus=0,totalLulus=0,totalTidaklulus=0;

        for (int i=1; i <=12; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai=sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi=nilai;
            }
            if (nilai <terendah) { 
                terendah=nilai;

            } 
             if (nilai >=60) {
                System.out.println("Lulus");
                lulus++;
            } else if (nilai <60) {
                System.out.println("Tidak lulus");
                tidaklulus++;
            } 
        }
        System.out.println("Nilai tertinggi :"+tertinggi);
        System.out.println("Nilai terendah :"+terendah);
        System.out.println("Total lulus :"+lulus);
        System.out.println("Total tidak lulus :"+tidaklulus);
    }
}
