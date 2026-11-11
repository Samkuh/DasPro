
import java.util.Scanner;

public class Belajar_Tugas_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                         "Kentang Goreng", "Teh Tarik", "Cappucino",
                         "Chocolate Ice"};

        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println();
        System.out.println("==================================");
        System.out.println("       KAFE KAMPUS POLINEMA");
        System.out.println("==================================");

        System.out.println("\n=== DAFTAR MENU ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] +
                               " | Rp" + harga[i]);
        }

        // FITUR PENCARIAN MENU
        System.out.println("\n=== PENCARIAN MENU ===");
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String pesan = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {

            if (menu[i].equalsIgnoreCase(pesan)) {
                System.out.println("Menu Ditemukan!");
                System.out.println("Nama Menu : " + menu[i]);
                System.out.println("Harga     : Rp" + harga[i]);

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu Tidak Tersedia!");
        }

        // FITUR PEMESANAN
        System.out.println("\n=== PEMESANAN MENU ===");

        System.out.print("Masukkan Jumlah Menu Yang Ingin Dipesan: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        // ARRAY UNTUK MENYIMPAN PESANAN
        String[] pesanan = new String[jumlahMenu];
        int[] jumlahPesanan = new int[jumlahMenu];
        int[] subtotal = new int[jumlahMenu];

        int totalHarga = 0;

        for (int i = 0; i < jumlahMenu; i++) {

            boolean valid = false;

            while (!valid) {

                System.out.print("\nMasukkan Menu Ke-" + (i + 1) + " : ");
                String namaPesanan = sc.nextLine();

                // LINEAR SEARCH
                for (int j = 0; j < menu.length; j++) {

                    if (menu[j].equalsIgnoreCase(namaPesanan)) {

                        System.out.print("Masukkan Jumlah Pesanan: ");
                        int jumlah = sc.nextInt();
                        sc.nextLine();

                        pesanan[i] = menu[j];
                        jumlahPesanan[i] = jumlah;
                        subtotal[i] = harga[j] * jumlah;

                        totalHarga += subtotal[i];

                        System.out.println("Pesanan Berhasil Ditambahkan!");
                        valid = true;

                        break;
                    }
                }

                if (!valid) {
                    System.out.println("Menu Tidak Tersedia!");
                    System.out.println("Silakan Masukkan Nama Menu Kembali.");
                }
            }
        }

        // MENAMPILKAN DAFTAR PESANAN
        System.out.println("\n==============================================");
        System.out.println("              STRUK PEMESANAN");
        System.out.println("==============================================");

        System.out.printf("%-5s %-18s %-10s %-12s\n",
                          "No", "Nama Menu", "Jumlah", "Subtotal");

        System.out.println("----------------------------------------------");

        for (int i = 0; i < jumlahMenu; i++) {

            System.out.printf("%-5d %-18s %-10d Rp%-12d\n",
                              (i + 1), pesanan[i],
                              jumlahPesanan[i], subtotal[i]);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Total Biaya : Rp" + totalHarga);
        System.out.println("==============================================");

        System.out.println("Terima Kasih Telah Memesan!");

        sc.close();
    }
}
