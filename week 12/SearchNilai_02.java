import java.util.Arrays;
import java.util.Scanner;

public class SearchNilai_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Indeks Array: ");
        int jmlElemen = sc.nextInt();
        System.out.println();

        int[] nilai = new int[jmlElemen];

        System.out.println("=== NILAI DALAM INDEKS ===");
        System.out.println();
        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan Nilai Indeks ke- " + i + " : ");
            nilai[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("=== SEARCH NILAI PADA INDEKS ===");
        System.out.println();
        
        System.out.print("Masukkan Nilai Yang Dicari: ");
        int key = sc.nextInt();
        System.out.println();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++ ) {
            if (nilai[i] == key) {
                System.out.println("Nilai: " + key + " Berada pada indeks ke- " + i);
                ditemukan = true;
                break;
            }

        }

        if (!ditemukan) {
            System.out.println("Detail Pencarian: Angka " + key + " tidak ada di dalam daftar " 
            + Arrays.toString(nilai) + " (" + nilai.length + " elemen).");
        }
    }
}
