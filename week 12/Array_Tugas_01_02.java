import java.util.Scanner;

public class Array_Tugas_01_02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        int mahasiswa[] = new int[jumlahMhs];

        int total = 0;
        double rata2 = 0;

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            mahasiswa[i] = sc.nextInt();
            total += mahasiswa[i];
        }

        System.out.println();
        System.out.println("=========");

        rata2 = (double) total /  jumlahMhs;
        System.out.println("Total Nilai: " + total);
        System.out.println("Rata - Rata Nilai: " + rata2);

        int tertinggi = mahasiswa[0];
        int terendah = mahasiswa[0];

        for (int i = 0; i < jumlahMhs; i++) {
            if (mahasiswa[i] > tertinggi) tertinggi = mahasiswa[i];
            if (mahasiswa[i] < terendah) terendah = mahasiswa[i];
        }

        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);

        System.out.println();
        System.out.println("==========");

        for (int i = 0; i < jumlahMhs; i++) {
            String status = (mahasiswa[i] > 70) ? "Lulus" : "Tidak Lulus";
            System.out.println("Mahasiswa ke- " + (i + 1) + ": " + mahasiswa[i] + " ( " + status + " )");
        }
    }
}