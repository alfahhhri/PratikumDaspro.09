import java.util.Scanner;

public class Tugas109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[10][6];
        double totalKeseluruhan = 0;              

        for (int i = 0; i < nilai.length; i++) {
            double totalPerResponden = 0;          
            System.out.println("Input data responden ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                do {
                    System.out.print("Input nilai pertanyaan ke-" + (j + 1) + " (1-5) : ");
                    nilai[i][j] = sc.nextInt();
                    if (nilai[i][j] < 1 || nilai[i][j] > 5) {
                        System.out.println("Nilai harus 1-5, Ulangi input!");
                    }
                } while (nilai[i][j] <1 || nilai[i][j] >5);

                totalPerResponden += nilai[i][j];  
            }

            totalKeseluruhan += totalPerResponden;
            System.out.printf("Nilai rata-rata responden ke-%d : %.2f%n",(i + 1), totalPerResponden/nilai[i].length);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata nilai setiap pertanyaan : ");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerPertanyaan = 0;        
            for (int i = 0; i < nilai.length; i++) {
                totalPerPertanyaan += nilai[i][j];
            }
            System.out.printf("Pertanyaan %d : %.2f%n", (j + 1), totalPerPertanyaan / nilai.length);
        }

        System.out.println("\n====================================");
        System.out.printf("Rata-rata keseluruhan : %.2f%n",totalKeseluruhan / (nilai.length * nilai[0].length));
    }
}