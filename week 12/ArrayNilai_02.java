import java.util.Scanner;

public class ArrayNilai_02 {

    public static void main(String[] args) {
        
        int[] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke- " + (i + 1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("=== STATUS MAHASISWA ===");
        System.out.println();

        int lulus = 0;
        int tidakLulus = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke- " + (i + 1) + "| " + nilaiAkhir[i] + " | LULUS ");
                lulus++;
            } else {
                System.out.println("Mahasiswa ke- " + (i + 1) + "| " + nilaiAkhir[i] + " | TIDAK LULUS ");
                tidakLulus++;
            }
        }

        System.out.println();
        System.out.println("=== JUMLAH MAHASISWA LULUS DAN TIDAK LULUS");
        System.out.println();

        System.out.println("LULUS: " + lulus);
        System.out.println("TIDAK LULUS: " + tidakLulus);
    }
}