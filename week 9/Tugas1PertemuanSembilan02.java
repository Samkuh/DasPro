import java.util.Scanner;

public class Tugas1PertemuanSembilan02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tiket, totalTiket = 0, hargaTiket = 50000, i = 0, jmlPelanggan;
        double diskonSepuluh = 0.10, diskonLimaBelas = 0.15, diskonNol = 0, totalHarga = 0;

        System.out.print("Masukkan jumlah pelanggan: ");
        jmlPelanggan = sc.nextInt();
        System.out.print("");

        if (jmlPelanggan < 0) {
            System.out.println("");
            System.out.println("Input Tidak Valid");
        } 

        while (i < jmlPelanggan) {
            System.out.println("");
            System.out.println("===== JUMLAH TIKET =====");
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke- " + (i + 1) + ": ");
            tiket = sc.nextInt();

            if (tiket >= 0 && tiket <= 4) {
                totalHarga += (tiket * hargaTiket) - ( tiket * hargaTiket * diskonNol);
                totalTiket += tiket;
            } else if (tiket > 4 && tiket <= 10) {
                totalHarga += (tiket * hargaTiket) - (tiket * hargaTiket * diskonSepuluh);
                totalTiket += tiket;
            } else {
                totalHarga += (tiket * hargaTiket) - (tiket * hargaTiket * diskonLimaBelas);
                totalTiket += tiket;
            }
            i++;
        }
        System.out.println("");
        System.out.println("==== TOTAL BAYAR DAN TOTAL TIKET ====");
        System.out.println("Total Pendapatan Penjualan Tiket: " + (int) totalHarga);
        System.out.println("Total Tiket yang Terjual: " + (int) totalTiket);
    }
}