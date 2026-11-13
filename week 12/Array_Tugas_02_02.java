import java.util.Scanner;
import java.util.Arrays;;

public class Array_Tugas_02_02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println();
        System.out.println("=== DAFTAR MENU ===");
        
        System.out.println(Arrays.toString(menu));

        System.out.println();

        String ulang;

        System.out.println("=== Search Menu Kafe Kampus ===");
        do {
            System.out.print("Masukkan Nama Menu Yang Anda Ingin Cari: ");
            String cari = sc.nextLine();

            boolean ditemukan = false;

            for (int i = 0; i < menu.length; i++) {

                if (menu[i].equalsIgnoreCase(cari)) {
                    System.out.println("Menu : " + menu[i] + " | " + "Harga: Rp." + harga[i]);

                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Menu tidak ditemukan");
            }

            System.out.print("\nApakah anda ingin mencari harga menu lain? ( IYA / TIDAK ): ");
            ulang = sc.nextLine();
            if (ulang.equalsIgnoreCase("TIDAK")) {
                System.out.println();
                System.out.println("Anda Akan di arahkan ke Menu Pemesanan. Silahkan Memesan Menu ");
            }

            System.out.println();
        } while (ulang.equalsIgnoreCase("IYA"));

        System.out.println();

        System.out.println("=== Menu Pemesanan ===");
        System.out.print("Masukkan Jumlah Menu Yang Ingin Dipesan: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        int totalHarga = 0;

        String daftarPesanan[] = new String[jumlahMenu];
        int jumlahPesanan[] = new int[jumlahMenu];
        int subtotalPesanan[] = new int[jumlahMenu];

        int jumlahDataPesanan = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan Menu Ke-" + (i + 1) + " : ");
            String pesan = sc.nextLine();

            boolean ditemukan = false;

            for (int j = 0; j < menu.length; j++) {

                if (menu[j].equalsIgnoreCase(pesan)) {
                    System.out.print    ("Masukkan Jumlah Pesanan: ");
                    int jumlah = sc.nextInt();
                    sc.nextLine();

                    daftarPesanan[jumlahDataPesanan] = menu[j];
                    jumlahPesanan[jumlahDataPesanan] = jumlah;
                    subtotalPesanan[jumlahDataPesanan] = harga[jumlahDataPesanan] * jumlah;

                    totalHarga += subtotalPesanan[jumlahDataPesanan];
                    jumlahDataPesanan++;
                    

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
        System.out.println("==== DAFTAR PESANAN ====");

        for (int i = 0; i < jumlahDataPesanan; i++) {
            System.out.println("Menu ke- " + (i + 1) + " : " + daftarPesanan[i]);
            System.out.println("Jumlah Pesanan: " + jumlahPesanan[i]);
            System.out.println("Total Harga Per Menu : Rp. " + subtotalPesanan[i]);
            System.out.println();
        }

        System.out.println("=== TOTAL HARGA ===");
        System.out.println("Total Harga : Rp." + totalHarga);
        
    }
}