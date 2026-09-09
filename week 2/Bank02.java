import java.util.Scanner;
public class Bank02 {

    public static void main(String[] args) {

        int jumlah_tabungan_awal, lama_menabung;
        double persentase_bunga =0.02, bunga, jml_tabungan_akhir;

        System.out.println("Perhitungan Bunga Majemuk Anda Dengan Bunga 2 Persen");

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Tabungan Awal Anda");
        jumlah_tabungan_awal = sc.nextInt();
        System.out.println("Masukkan Lama Tahun Menabung Anda");
        lama_menabung = sc.nextInt();

        bunga = lama_menabung*persentase_bunga*jumlah_tabungan_awal;
        jml_tabungan_akhir = bunga+jumlah_tabungan_awal;

        System.out.println("Bunga Anda Adalah: " +bunga);
        System.out.println("Jumlah Tabungan Anda Sekarang Adalah: " +jml_tabungan_akhir);

    }
}