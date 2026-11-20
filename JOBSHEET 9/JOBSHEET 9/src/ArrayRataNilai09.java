import java.util.Scanner;
public class ArrayRataNilai09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs=sc.nextInt();
        int [] nilaiMhs=new int[jmlMhs];
        int total=0;
        double rata2;
        String status="";

        for (int i = 0; i <jmlMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" +(i+1)+ ": ");
            nilaiMhs[i]=sc.nextInt();
            total+=nilaiMhs[i];

        }
        rata2=(double)total/jmlMhs;
        System.out.println("Total nilai : "+total);
        System.out.println("Rata-rata : "+rata2);

        int tertinggi=nilaiMhs[0];
        int terendah=nilaiMhs[0];
        // int jmlLulus=0;
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi=nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah=nilaiMhs[i];
            // if (nilaiMhs[i]>70) {
            //     jmlLulus++;
            // }
            if (rata2 >=85) {
             status="SANGAT BAIK";
            } else if (rata2 >=70) {
             status="BAIK";
            } else if (rata2 <=70) {
             status="PERLU PENDAMPINGAN";
            }

        }
        System.out.println("Nilai tertinggi : "+tertinggi);
        System.out.println("Nilai terendah : "+terendah);
        // System.out.println("Jumlah lulus : "+jmlLulus);
        System.out.println("Predikat kelas : "+status);
    }
    
}
