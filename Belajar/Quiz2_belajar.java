import java.util.Scanner;

public class Quiz2_belajar {
    public static void main(String[] args) {
        String nama = "Achmad Labib Zainullah";
        int noAbsen = 02;            // nomor absen Anda
        int k = noAbsen % 5;        // kode personal
        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);

        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah tim   : ");
        int jumlahTim = sc.nextInt();
        System.out.print("Jumlah ronde : ");
        int jumlahRonde = sc.nextInt();

        int timTerbaik = 0;
        double rataTertinggi = -1;  // -1 agar tim pertama selalu jadi kandidat
        int jumlahUnggulan = 0;

        // Badan inner loop dijalankan jumlahTim x jumlahRonde kali (pada contoh: 2 x 2 = 4 kali)
        for (int tim = 1; tim <= jumlahTim; tim++) {
            System.out.println("Tim " + tim);
            int totalSkor = 0;
            int main = 0;

            for (int ronde = 1; ronde <= jumlahRonde; ronde++) {
                System.out.print("  Skor ronde " + ronde + ": ");
                int skor = sc.nextInt();
                if (skor != 0) {        // skor 0 = forfeit, tidak dihitung
                    totalSkor += skor;
                    main++;
                }
            }

            double rata = 0;
            if (main > 0) {
                rata = (double) totalSkor / main;
            }

            String kategori;
            if (main == 0) {
                kategori = "Gugur";
            } else if (rata >= 20 + k) {
                kategori = "Unggulan";
                jumlahUnggulan++;
            } else {
                kategori = "Reguler";
            }

            System.out.printf("  Main: %d | Rata: %.2f | %s%n", main, rata, kategori);

            // pakai ">" (bukan ">=") supaya jika seri, nomor tim terkecil tetap dipilih
            if (rata > rataTertinggi) {
                rataTertinggi = rata;
                timTerbaik = tim;
            }
        }

        System.out.println("==============================");
        System.out.println("Tim terbaik         : " + timTerbaik);
        System.out.printf("Rata-rata tertinggi : %.2f%n", rataTertinggi);
        System.out.println("Jumlah tim Unggulan : " + jumlahUnggulan);
    }
}