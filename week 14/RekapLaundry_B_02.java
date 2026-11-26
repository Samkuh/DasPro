import java.util.Scanner;

public class RekapLaundry_B_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Layanan: ");
        int jumlahLayanan = sc.nextInt();
        sc.nextLine();

        System.out.println();

        System.out.print("Masukkan Jumlah Hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        String layanan[] = new String[jumlahLayanan];
        int harga[] = new int[jumlahLayanan];

        System.out.println();
        inputDataLayanan(layanan, harga);

        Menu(layanan, harga);

        System.out.println();
        int[][] dataBerat = inputDataBerat(jumlahLayanan, jumlahHari, layanan);

        System.out.println();
        tampilkanData(dataBerat, layanan, harga, jumlahHari);

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
        int totalBeratHariTersibuk = 0;
        for (int i = 0; i < dataBerat.length; i++) {
            totalBeratHariTersibuk += dataBerat[i][hariTersibuk];
        }
        System.out.println("--- HARI TERSIBUK ---");
        System.out.println("Hari Ke- " + (hariTersibuk + 1));
        System.out.println("Total Berat: " + totalBeratHariTersibuk + " Kg");

        System.out.println();
        int totalPendapatan = tampilHitungPendapatan(dataBerat, layanan, harga);
        System.out.println();
        System.out.println("--- REKAP PENDAPATAN ---");
        System.out.println("Total Pendapatan ( " + jumlahHari + " ): " + totalPendapatan);
    }


    static void inputDataLayanan (String[] layanan, int[] harga) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < layanan.length; i++) {
            System.out.println("--- LAYANAN KE " + (i + 1) + " ---");
            System.out.print("Masukkan Nama Layanan: ");
            layanan[i] = sc.nextLine();

            System.out.print("Harga Per Kg: ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    public static void Menu(String[] layanan, int[] harga) {
        System.out.println();
        System.out.println("--- LAYANAN ---");
        for (int i = 0; i < layanan.length; i++) {
            System.out.println((i + 1) + ". " + layanan[i] + " : " + harga[i] + " / Per Kg");
            
        }
    }

    static int[][] inputDataBerat(int jumlahLayanan, int jumlahHari, String[] layanan) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT DATA BERAT ---");
        int beratCucian[][] = new int[jumlahLayanan][jumlahHari];
        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.println();
            System.out.println("Layanan Ke- " + (i + 1));
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari Ke- " + (j + 1) + ": ");
                beratCucian[i][j] = sc.nextInt();
            }
        }

        return beratCucian;
    }

    static void tampilkanData(int[][] dataBerat, String[] layanan, int[] harga, int jumlahHari) {
       
        System.out.println("--- REKAP DATA LAUNDRY ---");
        System.out.println();

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-18s %12s", "Layanan", "Harga / Kg");

        for (int i = 0; i < jumlahHari; i++) {
            System.out.printf("%14s", "Hari ke- " + (i + 1));
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");

        for (int i = 0; i < layanan.length; i++) {
            String hargaFormat = String.format("%,d", harga[i]).replace(',', '.');
            System.out.printf("%-18s   Rp%-8s", layanan[i], hargaFormat);

            for (int j = 0; j < jumlahHari; j++) {
                System.out.printf("%12d", dataBerat[i][j]);
            }

            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");
    }

    static int totalPelayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int i = 0; i < data[idxLayanan].length; i++) {
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
