import java.util.Scanner;

public class NilaiKelompok02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        double jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahKelompok <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus lebih dari 0");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok : " + nomorKelompok);
                int totalNilai = 0;

                for (int i = 1; i <= jumlahPenilai; i++) {
                    int nilai;
                    do {
                        System.out.print(" Nilai dari Penilai " + i + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println(" Nilai harus bernilai antara 0 sampai 100. Ulangi input");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }

                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata - rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                   rataTertinggi = rataNilai;
                   kelompokTerbaik = nomorKelompok;
                }
                nomorKelompok++;
            }
                System.out.println("=============");
                System.out.println("Kelompok terbaik : " + kelompokTerbaik);
                System.out.println("Rata rata tertinggi : " + rataTertinggi);
        }
        sc.close();
    }
}