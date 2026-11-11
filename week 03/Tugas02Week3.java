import java.util.Scanner;

public class Tugas02Week3 {

    public static void main(String[] args) {
        
        int jumlahLembar, biayaCetak, biayaJilid;
        int hasilBiayaCetak, hasilAkhir;

        Scanner sc = new Scanner(System.in);

        System.out.println("Perhitungan Biaya Cetak Dan Jilid Tugas ");

        System.out.println("Masukkan Jumlah Lembar Anda Yang Ingin Di Cetak");
        jumlahLembar = sc.nextInt();
        System.out.println("Masukkan Biaya Cetak Anda");
        biayaCetak = sc.nextInt();
        System.out.println("Masukkan Biaya Jilid Anda");
        biayaJilid = sc.nextInt();

        hasilBiayaCetak = jumlahLembar*biayaCetak;
        hasilAkhir = hasilBiayaCetak+biayaJilid;

        System.out.println("Ini Adalah Biaya Yang Harus Anda Bayar :" +hasilAkhir);
    }
}