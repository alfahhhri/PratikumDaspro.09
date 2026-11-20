import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        double rata2=0;
        int total=0;
        int jmlMahasiswa=0;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMahasiswa=sc.nextInt();
        int [] nilaiMhs=new int[jmlMahasiswa];
        int i=0;
        for (i = 0; i < jmlMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke- "+(i+1)+" : ");
            nilaiMhs[i]=sc.nextInt();
            total+=nilaiMhs[i];
            String status=(nilaiMhs[i]>=70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke- " +(i+1) +" "+ status);    
        }
        rata2=(double)total/jmlMahasiswa;
        int tertinggi=nilaiMhs[0];
        int terendah=nilaiMhs[0]; 
        for ( i = 1; i <jmlMahasiswa; i++) {
        if (nilaiMhs[i] > tertinggi) tertinggi=nilaiMhs[i];
        if (nilaiMhs[i] < terendah) terendah=nilaiMhs[i];
    }
        System.out.printf("Rata-rata : %.2f%n", rata2);
        System.out.println("Nilai tertinggi : "+tertinggi);
        System.out.println("Nilai terendah : "+terendah);
    }
}
