import java.util.Scanner;

public class MenghitungTotalBayar02 {

    public static void main(String[] args) {
        
        int harga;
        double diskon, potongan, jml_bayar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Menghitung Jumlah Harga Anda");

        System.out.println("Masukkan Harga Barang Anda");
        harga = sc.nextInt();
        System.out.println("Masukkan Diskon Harga Anda");
        diskon = sc.nextDouble();

        potongan = diskon*harga;
        jml_bayar = harga-potongan;

        System.out.println("\nIni Adalah Potongan Harga Anda : " + "Rp. " + (int) potongan);
        System.out.println("\nIni Adalah Jumlah Bayar Anda : " + "Rp. " + (int) jml_bayar);

    }
}