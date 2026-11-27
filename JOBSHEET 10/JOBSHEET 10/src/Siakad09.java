import java.util.Scanner;
public class Siakad09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       
        int[][] nilai=new int[4][3]; 
       
        
        for (int i = 0; i <nilai.length; i++) {
            System.out.println("Input mahasiswa ke- "+(i+1));

            double totalPersiswa=0;
            for (int j = 0; j <nilai.length; j++) {
                System.out.print("Nilai mata kuliah "+(j+1)+" : ");
                nilai[i][j]=sc.nextInt();
                totalPersiswa+=nilai[i][j];
                
            }
            System.out.println("Nilai rata-rata : "+totalPersiswa/nilai[i].length);

        }
         System.out.println("\n====================================");
         System.out.println("Rata-rata nilai setiap mata kuliah : ");

         for (int j = 0; j < nilai[0].length; j++) {
            double totalPermatkul=0;
            for (int i = 0; i < nilai.length; i++) {
                totalPermatkul+=nilai[i][j];
            }
            System.out.println("Mata kuliah "+(j+1)+": "+totalPermatkul/nilai.length);
         }
    }
}
