
import java.util.Scanner;
public class Star09 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n=sc.nextInt();

        for (int i=2; i <= n; i+=2) {
            System.out.print(i+"");

        }
        System.out.println();
        sc.close();
    }
}
