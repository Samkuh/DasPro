import java.util.Scanner;

public class BelajarTokoWeek10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko ( Minimal 1 ): ");
            jumlahToko = sc.nextInt();
        } while (jumlahToko < 1);

       int totalBarangSeluruhToko = 0;
       int tokoTerbanyak = 1;
       int barangTerbanyak = -1;

       String ringkasanSeluruhToko = "";

       for (int i = 1; i <= jumlahToko; i++) {
        System.out.println("--- Data Toko ke - " + i + "---");
        int jumlahPelanggan;
        do {
            System.out.print("Masukkan jumlah pelanggan untuk toko ke - " + i + ": ");
            jumlahPelanggan = sc.nextInt();
            if (jumlahPelanggan < 0) {
                System.out.println("Pelanggan tidak boleh kurang dari 0");
            }
        } while (jumlahPelanggan <= 0);

        int totalBarangTokoIni = 0;

        for (int j = 1; j <= jumlahPelanggan; j++) {
            int jumlahBarang;
            do {
                System.out.print("Masukkan jumlah barang pelanggan ke - " + j + ": ");
                jumlahBarang = sc.nextInt();
                if (jumlahBarang < 0) {
                    System.out.println("Jumlah barang tidak boleh kurang dari nol");
                }
            } while (jumlahBarang < 0);
            totalBarangTokoIni += jumlahBarang;
        }
        ringkasanSeluruhToko += "Toko ke- " + i + "  Jumlah Pelanggan: " + jumlahPelanggan + "   Jumlah total barang: " + totalBarangTokoIni + "\n";
        totalBarangSeluruhToko += totalBarangTokoIni;

        if (totalBarangTokoIni > barangTerbanyak) {
            barangTerbanyak = totalBarangTokoIni;
            tokoTerbanyak = i;
        }
       }

       System.out.println("--- Ringkasan seluruh toko ---");
       System.out.println(ringkasanSeluruhToko);
       System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
       System.out.println("Toko dengan barang terbanyak: Toko nomor: " + tokoTerbanyak);
       sc.close();
    }
}