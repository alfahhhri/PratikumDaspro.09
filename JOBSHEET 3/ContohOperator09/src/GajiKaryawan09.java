import java.util.Scanner;
public class GajiKaryawan09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in); 
        int gajipokok;
        double tunjTransp=600000; 
        double tunjMakan=400000;
        double bonus;
        double totalgaji;
        System.out.println("Masukkan gaji pokok =");
        gajipokok=sc.nextInt();
        bonus= 0.05*gajipokok;
        totalgaji=gajipokok+tunjTransp+tunjMakan+bonus-0.1*gajipokok;

        int totalgajibulat = (int) totalgaji;
        int bonusBulat = (int) bonus;

    
        System.out.println("Bonus bulanan yang anda dapat Rp."+bonusBulat);
        System.out.println("Gaji yang anda terima Rp."+totalgajibulat);
        

    }
    
}
