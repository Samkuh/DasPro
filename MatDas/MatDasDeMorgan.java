import java.util.Scanner;

public class MatDasDeMorgan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penentuan Kelulusan Mahasiswa Polinema Tahun 2025");
        System.out.println("Masukkan Nilai Mahasiswa");
        double nilai = scanner.nextDouble();

        System.out.println("Masukkan Persentase Kehadiran");
        double kehadiran = scanner.nextDouble();

        boolean p = nilai >= 60;
        boolean q = kehadiran >= 80;

        if (p) {
            if (q) {
                System.out.println("Status: LULUS");
            } else {
                System.out.println("Status: TIDAK LULUS");
            }    
        } else {
            System.out.println("Status: TIDAK LULUS");
        }

        scanner.close();
    }
}
