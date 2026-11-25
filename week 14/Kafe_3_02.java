import java.util.Scanner;

public class Kafe_3_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Labib", true);

        System.out.println();
        System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan Jumlah Item Yang Ingin Dipesan: ");
        int banyakItem = sc.nextInt();

        int totalBayar = hitungTotalHarga02(pilihanMenu, banyakItem);

        System.out.println();
        System.out.println("Total harga untuk pesanan Anda: Rp. " + totalBayar);

    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang. " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member. Dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println();
        System.out.println("---- MENU RESTO KAFE ----");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("---------------------------");
    }

    public static int hitungTotalHarga02(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
}