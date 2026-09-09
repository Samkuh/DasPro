import java.util.Scanner;

public class MenghitungTotalBayar02 {

    public static void main(String[] args) {
        
        double harga;
        double potongan, jml_bayar, diskon;

        System.out.println("Menghitung Jumlah Harga Anda");

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Diskon Harga Anda");
        diskon = sc.nextDouble();
        System.out.println("Masukkan Harga Barang Anda");
        harga = sc.nextInt();

        potongan = diskon*harga;
        jml_bayar = harga-potongan;

        System.out.println("Ini Adalah Potongan Harga Anda : " +potongan);
        System.out.println("Ini Adalah Jumlah Bayar Anda : " +jml_bayar);

    }
}