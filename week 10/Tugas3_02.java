import java.util.Scanner;

public class Tugas3_02 {

    public static void main(String[] args) {
        Scanner labib = new Scanner(System.in);
        
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko (minimal 1) : ");
            jumlahToko = labib.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko tidak boleh kurang dari 1. Ulangi ");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;

        String ringkasanPerToko = "";

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\n--- Data Toko " + i + " ---");
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + " : ");
                jumlahPelanggan = labib.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif. Ulangi");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangTokoIni = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;
                do {
                    System.out.print(" Jumlah barang pelanggan ke- " + j + " : ");
                    jumlahBarang = labib.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println( " jumlah barang tidak boleh negatif. Ulangi");
                    }
                } while (jumlahBarang < 0);
                totalBarangTokoIni += jumlahBarang;
            }

            ringkasanPerToko += "Toko " + i + " - pelanggan: " + jumlahPelanggan + " - total barang: " + totalBarangTokoIni + "\n";
            totalBarangSeluruhToko += totalBarangTokoIni;

            if (totalBarangTokoIni > barangTerbanyak) {
                barangTerbanyak = totalBarangTokoIni;
                tokoTerbanyak = i;
            }
        }
            System.out.println("\n======= Ringkasan Rekap ===========");
            System.out.print(ringkasanPerToko);
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);    
            labib.close();
    }
}

