import java.util.Scanner;

public class KonsultanPajak {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jumlahKenaPajak;
        double tahap00 = 0,tahap01 = 0.05, tahap02 = 0.15, tahap03 = 0.25, tahap04 = 0.30;
        double hasilTahap00, hasilTahap01;
        double selisihTahap01, selisihTahap02, selisihTahap03, selisihTahap04;
        
        System.out.println("Kalkulator Pajak Penghasilan");
        
        System.out.print("Masukkan Pajak Penghasilan Anda Dalam Bentuk Desimal: ");
        jumlahKenaPajak = sc.nextInt();

        hasilTahap00 = jumlahKenaPajak * tahap00;
        hasilTahap01 = jumlahKenaPajak * tahap01;
        selisihTahap01 = 60000000 * tahap01;
        selisihTahap02 = selisihTahap01 + ((jumlahKenaPajak - 60000000) * tahap02);
        selisihTahap03 = 31500000 + ((jumlahKenaPajak - 250000000) * tahap03);
        selisihTahap04 = 94000000 + ((jumlahKenaPajak - 500000000) * tahap04);

        // 0 //
        if (jumlahKenaPajak <= 0) {
            System.out.println("Anda Tidak Membayar Pajak Sama Sekali Pajak Anda: " + (int) hasilTahap00);
            // 0 s.d 60 juta //
        } else if (jumlahKenaPajak >= 1 && jumlahKenaPajak <=60000000) {
            System.out.println("Pajak Anda Di kalikan 5 Persen Jadinya Adalah: " + (int) hasilTahap01);
            // 60 juta s.d 250 juta //
        } else if (jumlahKenaPajak >= 60000000 && jumlahKenaPajak <= 250000000) {
            System.out.println("Pajak Anda Di kalikan 15 Persen Ditambah Pajak Dari Tahap sebelumnya Jadinya Adalah: " + (int) (selisihTahap02));
            // 250 juta s.d 500 juta //
        } else if (jumlahKenaPajak >= 250000000 && jumlahKenaPajak <= 500000000) {
            System.out.println("Pajak Anda Di kalikan 25 Persen Ditambah Pajak Dari Tahap sebelumnya Jadinya Adalah: " + (int) (selisihTahap03));
            // 500 juta lebih //
        } else if (jumlahKenaPajak > 500000000) {
            System.out.println("Pajak Anda Di kalikan 30 Persen Ditambah Pajak Dari Tahap sebelumnya Jadinya Adalah: " + (int) (selisihTahap04));
        } 
    }
}
