import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menuPilihan;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        menu:
        while (true) {
            System.out.println("=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu : ");
            int pilihMenu=sc.nextInt();
            sc.nextLine();

            switch (pilihMenu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        while (true) {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > penonton.length
                                    || kolom < 1 || kolom > penonton[0].length) {
                                System.out.println("Baris atau kolom tidak tersedia! "
                                        + "(baris 1-" + penonton.length
                                        + ", kolom 1-" + penonton[0].length + ")");
                            }
                            else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah diisi oleh "+penonton[baris - 1][kolom - 1] + "! Pilih kursi lain.");
                            } else {
                                break;
                            }
                        }
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.print("Input penonton lainnya? (y/n): ");
                        pilihan = sc.nextLine();
                        if (pilihan.equalsIgnoreCase("n")) {
                        break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + isi);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    break menu;

                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}