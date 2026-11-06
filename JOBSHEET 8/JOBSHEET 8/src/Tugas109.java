import java.util.Scanner;
public class Tugas109 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Masukkan nilai n : ");
        int n=sc.nextInt();
        int i=n;
        int total=0;
        for ( i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+ " ");
                total++;
            }
            System.out.println();
        } 
        System.out.println("Jumlah seluruh angka : "+total);
        sc.close();
    }
}
