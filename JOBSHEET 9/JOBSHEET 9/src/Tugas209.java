import java.util.Scanner;
public class Tugas209 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       String [] menu= {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate Ice"};
       int [] harga= {15000, 13000, 10000, 12000, 8000, 18000, 20000};

       for (int i = 0; i < menu.length; i++) {
        System.out.println(i+1+"." +menu[i]+ " Rp."+harga[i]);

        
       }
       System.out.print("Pilih menu atau cek ketersedian menu : ");
       String cariMenu=sc.nextLine();
       int indeksCariMenu=-1;

       for (int i = 0; i < menu.length; i++) {
        if (menu[i].equalsIgnoreCase(cariMenu))
            indeksCariMenu=i;
       }
        if (indeksCariMenu!=-1) {
        System.out.println("Menu "+cariMenu+" tersedia");
       } else {
        System.out.println("Menu "+cariMenu+" tidak tersedia");
       }
       System.out.print("Apakah anda ingin memesan? (true/false)  : ");
       boolean pesanan=sc.nextBoolean();
       if (pesanan!=true) {
        return;
         } 
        System.out.print("Jumlah item yang ingin dipesan : ");
        int jmlPesan=sc.nextInt();
        sc.nextLine();
        String[] namaPesanan = new String[jmlPesan];

        for (int i = 0; i < jmlPesan; i++) {
            do {
                System.out.print("Pesanan ke-" + (i + 1) + " : ");
                String input = sc.nextLine();

                indeksCariMenu = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(input)) {
                        indeksCariMenu = j;
                        break;
                    }
                }

                if (indeksCariMenu == -1) {
                    System.out.println(input + " tidak tersedia, silakan ulangi.");
                } else {
                    namaPesanan[i]=menu[indeksCariMenu];
                    System.out.println(menu[indeksCariMenu] + " ditambahkan!");
                }
            } while (indeksCariMenu == -1);
        }
        int total = 0;
        System.out.println("=== STRUK PESANAN ===");
        for (int i = 0; i <namaPesanan.length; i++) {
            int hargaItem=0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(namaPesanan[i])) {
                    hargaItem = harga[j];
                    break;
                }
            }
            total += hargaItem;
            System.out.println(i+1+". "+namaPesanan[i]+" : "+hargaItem);
        }
        System.out.println("-------------------------------");
        System.out.printf("TOTAL : Rp%,d%n", total);
        }
    }