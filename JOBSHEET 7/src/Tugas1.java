import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tiket,pelanggan=0,jml,totaltiket=0;
        int i=0;
        int hargatiket=46000;
        double diskon=0,totalharga,totalHargaSeharian=0;

        System.out.print("Masukkan jumlah pelanggan : ");
        jml=sc.nextInt();
        // System.out.println("Masukkan jumlah tiket :");
        // tiket=sc.nextInt();

        while (i<jml) {
        System.out.println("Pelanggan ke-"+(i+1)+"");
        System.out.println("Masukkan jumlah tiket :");
        tiket=sc.nextInt();
        if (tiket <0) {
            System.out.println("Tidak valid. Silahkan input ulang"); 
            continue;
        }
        if (tiket >6 && tiket <=9 ) {
            System.out.println("Pelanggan ke-"+(i+1)+" Mendapatkan diskon 12&%");
            diskon=0.12*hargatiket;
            totalharga=hargatiket*tiket-diskon;
            System.out.println("Total harga :"+totalharga);
        } else if (tiket >9) {
            System.out.println("Pelanggan ke-"+(i+1)+" Mendapatkan diskon 16% ");
            diskon=0.16*hargatiket;
            totalharga=hargatiket*tiket-diskon;
            System.out.println("Total harga :"+totalharga);
        } else {
            totalharga=tiket*hargatiket;
        }
        totaltiket+=tiket;
        totalHargaSeharian+=totalharga;
        // totalharga=tiket*hargatiket-diskon;
        System.out.println("Total tiket : "+totaltiket);
        System.out.println("Total harga seharian : "+totalHargaSeharian);
        i++;
    }

    }
}
