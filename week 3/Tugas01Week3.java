import java.util.Scanner;

public class Tugas01Week3 {

    public static void main(String[] args) {
        
        int harga, selisihHarga;
        int uangMuka, bulan;
        double bunga, hasilBunga, hasilSetelahBunga, cicilan;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Harga Laptop Anda");
        harga = sc.nextInt();
        System.out.println("Masukkan Uang Muka Anda");
        uangMuka = sc.nextInt();
        System.out.println("Masukkan Bunga Anda");
        bunga = sc.nextDouble();
        System.out.println("Masukkan Bulan Anda Harus Membayar");
        bulan = sc.nextInt();

        selisihHarga = harga-uangMuka;
        hasilBunga = bunga*selisihHarga;
        cicilan = selisihHarga/bulan;
        hasilSetelahBunga = cicilan+hasilBunga;

        System.out.println("Ini Adalah Cicilan :" +cicilan);
        System.out.println("Ini Adalah Hasil Harga Dengan Bunga :" +hasilSetelahBunga);
    }
}