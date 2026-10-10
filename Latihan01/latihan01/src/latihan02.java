import java.util.Scanner;
public class latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajipokok_perbulan, tunjangankesehatan, tunjanganmakanan;
        double potongangaji = 0.3, totalpotongan, gajibersih, totalgaji;
        
        System.out.println("Masukkan gaji pokok perbulan =");
        gajipokok_perbulan=input.nextInt();
        System.out.println("Masukkan tunjangan kesehatan perbulan =");
        tunjangankesehatan=input.nextInt();
        System.out.println("Masukkan tunjangan makanan perbulan =");
        tunjanganmakanan=input.nextInt();

    
        totalpotongan=gajipokok_perbulan*potongangaji;
        gajibersih=(gajipokok_perbulan-totalpotongan) +tunjangankesehatan+tunjanganmakanan;

        System.out.println("Total potongan asuransi"+totalpotongan);
        System.out.println("Gaji bersih yang didapatkan"+gajibersih);


    }
}