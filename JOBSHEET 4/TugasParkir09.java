import java.util.Scanner;
public class TugasParkir09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lamaparkir, totalbiaya_Akhir,totalbiaya_Awal, tarifAwal=2000, tarifAkhir=1000;
    System.out.println("Masukkan lama jam parkir");
    lamaparkir=sc.nextInt();
    totalbiaya_Akhir=lamaparkir*tarifAkhir;
    totalbiaya_Awal=tarifAwal;

    if (lamaparkir>2) {
        System.out.println("Total biaya berjumlah"+totalbiaya_Akhir);
    }
    else {
        System.out.println("Total biaya berjumlah"+totalbiaya_Awal);
    }
  }  
}