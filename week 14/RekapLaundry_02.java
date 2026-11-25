import java.util.Scanner;

public class RekapLaundry_02 {

    public static void main(String[] args) {
        String[] layanan = {"Cuci Kering", "Cuci Setrika", "Setrika Saja", "Express"};
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum`at", "Sabtu"};
        int[] harga = {6000, 8000, 5000, 12000};

        Menu();

        System.out.println();
        int[][] dataBerat = inputDataBerat();

        System.out.println();
        tampilkanData(dataBerat);

        System.out.println();
        System.out.println("--- TOTAL BERAT PER LAYANAN ---");
        for (int i = 0; i < dataBerat.length; i++) {
            int total = totalPelayanan(dataBerat, i);
            System.out.println("Layanan ke- " + (i + 1) + " (" + layanan[i] + ") : " + total + " Kg");
        }

        System.out.println();
        layananBeratTertinggi(dataBerat, layanan);

        System.out.println();
        int hariTersibuk = hariTersibuk(dataBerat);
        System.out.println("--- HARI TERSIBUK ---");
        System.out.println("Hari Tersibuk : " + hari[hariTersibuk]);

        System.out.println();
        int totalPendapatan = tampilHitungPendapatan(dataBerat, layanan, harga);
        System.out.println();
        System.out.println("--- REKAP PENDAPATAN ---");
        System.out.println("Total Pendapatan ( 6 hari ): " + totalPendapatan);
    }

    public static void Menu() {
        System.out.println("--- LAYANAN ----");
        System.out.println("1. Cuci Kering : 6000 / Kg");
        System.out.println("2. Cuci Setrika : 8000 / Kg");
        System.out.println("3. Setrika Saja : 5000 / Kg");
        System.out.println("4. Express : 12000 / Kg");
    }

    static int[][] inputDataBerat() {
        Scanner sc = new Scanner(System.in);
        int beratCucian[][] = new int[4][6];
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.println("Layanan Ke- " + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Hari Ke- " + (j + 1) + ": ");
                beratCucian[i][j] = sc.nextInt();
            }
        }

        return beratCucian;
    }

    static void tampilkanData(int[][] dataBerat) {
        String[] layanan = {
            "Cuci Kering",
            "Cuci Setrika",
            "Setrika Saja",
            "Express"
        };

        int[] harga = {
            6000, 8000, 5000, 12000
        };

        String[] hari = {
            "Senin", "Selasa", "Rabu",
            "Kamis", "Jum`at", "Sabtu"
        };

        System.out.println("--- REKAP DATA LAUNDRY ---");
        System.out.println();

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-18s %12s", "Layanan", "Harga / Kg");

        for (int i = 0; i < hari.length; i++) {
            System.out.printf("%10s", hari[i]);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            String hargaFormat = String.format("%,d", harga[i]).replace(',', '.');
            System.out.printf("%-18s   Rp%-8s", layanan[i], hargaFormat);

            for (int j = 0; j < 6; j++) {
                System.out.printf("%10d", dataBerat[i][j]);
            }

            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");
    }

    static int totalPelayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int i = 0; i < 6; i++) {
            total += data[idxLayanan][i];
        }

        return total;
    }

    static void layananBeratTertinggi(int[][] x, String[] l) {
        int indexMax = 0;
        int max = 0;

        for (int i = 0; i < x.length; i++) {    
            int total = totalPelayanan(x, i);

            if (total > max) {
                max = total;
                indexMax = i;
            }
        }

        System.out.println("--- LAYANAN BERAT TERTINGGI ---");
        System.out.println("Layanan : " + l[indexMax]);
        System.out.println("Total   : " + max + " Kg");
    }

    static int hariTersibuk (int[][] data) {
        int max = 0;
        int indexMax = 0;

        for (int i = 0; i < data[0].length; i++) {
            int totalPerHari = 0;
            
            for (int j = 0; j < data.length; j++) {
                totalPerHari += data[j][i];
            }

            if (totalPerHari > max) {
                max = totalPerHari;
                indexMax = i;
            }
        }

        return indexMax;
    }

    static int tampilHitungPendapatan (int [][] x, String[] layanan, int[] harga) {
        int totalSemuaPendapatan = 0;

        System.out.println("--- PENDAPATAN PER LAYANAN ---");
        for (int i = 0; i < x.length; i++) {
            int totalBeratLayanan = totalPelayanan(x, i);
            int pendapatanLayanan = totalBeratLayanan * harga[i];
            totalSemuaPendapatan += pendapatanLayanan;

            System.out.println("Layanan ke- " + (i + 1) + " ( " + layanan[i] + " ) : Rp. " + pendapatanLayanan);
        }

        return totalSemuaPendapatan;
    }

}
