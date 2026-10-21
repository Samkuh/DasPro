import java.util.Scanner;

public class KafeDoWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int itemKopi, itemTeh, itemRoti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.println("");
            System.out.print("Masukkan Nama Pelanggan ( Ketik batal untuk keluar ): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("");
                System.out.println("Transaksi Di Batalkan");
                break;
            }
            System.out.println("");
            System.out.println("======= JUMLAH ======");
            System.out.print("Jumlah Kopi: ");
            itemKopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            itemTeh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            itemRoti = sc.nextInt();

            totalHarga = (itemKopi * hargaKopi) + (itemTeh * hargaTeh) + (itemRoti * hargaRoti);

            System.out.println("");
            System.out.println("====== STRUCK HARGA TOTAL =====");
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua Transaksi Selesai");
    }
}