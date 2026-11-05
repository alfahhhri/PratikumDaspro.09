import java.util.Scanner;
public class NilaiKelompok09 {
    public void main(String [] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok=sc.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai=sc.nextInt();
        
        if (jumlahKelompok <=0 || jumlahPenilai <=0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");

        } else {
            int nomorkelompok=1;
            double rataTertinggi=-1;
            int kelompokterbaik=0;

            while (nomorkelompok <= jumlahKelompok) {
                System.out.println("Kelompok"+nomorkelompok);
                double totalNilai=0;

                for (int j=1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("Nilai dari penilai : "+j+": ");
                        nilai=sc.nextInt();
                        if (nilai <0 || nilai >100) {
                            System.out.println("Nilai harus 0-100. Ulangi input!");

                        }
                    } while (nilai <0 || nilai >100);
                    totalNilai +=nilai;
                }
                    double rataNilai =totalNilai/jumlahPenilai;
                    System.out.println("Kelompok"+nomorkelompok+" : Nilai rata-rata ="+rataNilai);

                    if (rataNilai>rataTertinggi) {
                    rataTertinggi=rataNilai;
                    kelompokterbaik=nomorkelompok;
                    }
                    System.out.println("==============================");
                    System.out.println("Kelompok tertinggi "+kelompokterbaik);
                    System.out.println("Rata tertinggi "+rataTertinggi);
                    nomorkelompok++;
                    

                
            }
        }
    }
}