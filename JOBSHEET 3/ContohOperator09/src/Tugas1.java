import java.util.Scanner;
public class Tugas1 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int harga, uangmuka, sisa_harga, lamabulan;
        double bunga= 0.2; 
        double jumlahcicilan, totalbunga, jumlahcicilan_perbulan;

        System.out.println("Masukkan harga laptop =");
        harga = input.nextInt();
        System.out.println("Masukkan uang muka =");
        uangmuka = input.nextInt();
        System.out.println("Masukkan lama bulan =");
        lamabulan = input.nextInt();
        
        sisa_harga=harga-uangmuka;
        totalbunga=sisa_harga*bunga;
        jumlahcicilan=sisa_harga/lamabulan+totalbunga;
        //jumlahcicilan_perbulan=jumlahcicilan+totalbunga;

        System.out.println("Sisa harga adalah ="+sisa_harga);
        System.out.println("Bunga perbulan adalah ="+totalbunga);
        System.out.println("Jumlah cicilan perbulan5 yang harus dibayar ="+jumlahcicilan);








    }
    
}
