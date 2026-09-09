import java.util.Scanner;

public class MatDasA {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Penentuan Kelulusan Mahasiswa Polinema Tahun 2026");

            System.out.print("Masukkan Nilai Mahasiswa");
            double nilai = scanner.nextDouble();

            System.out.println("Masukkan Persentase Kehadiran");
            double kehadiran = scanner.nextDouble();

            boolean p = nilai >=60;
            boolean q = kehadiran >=80;

            if (p && q) {
                System.out.println("Status: LULUS");
            } else {
                System.out.println("Status: TIDAK LULUS");
            }

            scanner.close();

        }
}