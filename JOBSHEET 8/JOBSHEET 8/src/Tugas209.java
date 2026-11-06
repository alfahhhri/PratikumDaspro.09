import java.util.Scanner;
public class Tugas209 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("Masukkan nilai n : ");
       int n=sc.nextInt();
       int total=0;

       int i=n;
       int j=1;
       for ( i = 1; i <=n; i++) {
        for ( j = 1; j <=n; j++) {
            
            int hasil=i*j;
            System.out.print(hasil+"\t");
             total=total+hasil;
            
        }
        System.out.println();
       }
       System.out.print("Jumlah seluruh angka : "+total);
    }
}
