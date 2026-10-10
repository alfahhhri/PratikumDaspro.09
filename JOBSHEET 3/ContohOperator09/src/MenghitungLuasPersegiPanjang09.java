import java.util.Scanner;
public class MenghitungLuasPersegiPanjang09 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int panjang;
        int lebar;
        int luas;
        System.out.println("Masukkan panjang persegi =");
        panjang=sc.nextInt();
        System.out.println("Masukkan lebar persegi =");
        lebar=sc.nextInt();

        luas=panjang*lebar;
        System.out.println("Luas persegi adalah ="+luas);



    }
    
}
