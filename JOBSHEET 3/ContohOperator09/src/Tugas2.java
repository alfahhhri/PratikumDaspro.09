import java.util.Scanner;
public class Tugas2 {
    public static void main(String[]args) {
       Scanner input = new Scanner(System.in);
       int hargaPerLembar;
       int biayaCetak = 500;
       int biayaPenjilidan = 5000;
       int totalbiaya;
       System.out.println("Masukkan banyak lembar dokumen yang dicetak =");
       hargaPerLembar=input.nextInt();
       totalbiaya=hargaPerLembar*biayaCetak+biayaPenjilidan;

       System.out.println("Total biaya yang harus dibayar adalah ="+totalbiaya);
        
    }
    
}
