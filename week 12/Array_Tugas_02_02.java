import java.util.Scanner;

public class Array_Tugas_02_02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println();
        System.out.println("=== DAFTAR MENU ===");
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }

        System.out.println();


        for (int i = 0; i < menu.length; i++) {
            System.out.println("=== Pencari Menu ===");
            String pesan = sc.nextLine();
                if (menu[i].equalsIgnoreCase(pesan)) {
                    System.out.println(menu[i] + " | " + harga[i]);
                    break;
                }

            }

        System.out.print("Masukkan Jumlah Menu Yang Ingin Dipesan: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        int totalHarga = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan Menu Ke-" + (i + 1) + " : ");
            String pesan = sc.nextLine();

            boolean ditemukan = false;

            for (int j = 0; j < menu.length; j++) {

                if (menu[j].equalsIgnoreCase(pesan)) {
                    System.out.print    ("Masukkan Jumlah Pesanan: ");
                    int jumlahPesanan = sc.nextInt();
                    sc.nextLine();
                    System.out.println(menu[j] + " | " + harga[j]);
                    totalHarga += harga[j] * jumlahPesanan ;
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Menu Tidak Tersedia");
            }

            System.out.println();

        }

        System.out.println();
        System.out.println("==== Total Harga ====");
        System.out.println("Total Harga: " + totalHarga);
        
    }
}