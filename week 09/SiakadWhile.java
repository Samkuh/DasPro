import java.util.Scanner;

public class SiakadWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        System.out.print("");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("");
            System.out.println("======== NILAI ========");
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai mahasiswa tidak valid. Masukkan lagi nilai mahasiswa");
                continue;
            }

            if (nilai > 80 && nilai <=100) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah A");
                System.out.println("Bagus. Pertahankan Nilainyaa !!");
                System.out.println("");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah B+");
                System.out.println("");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah B");
                System.out.println("");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah C+");
                System.out.println("");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah C");
                System.out.println("");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah D");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah E");
                System.out.println("");
            }
            i++;
        }
    }
}