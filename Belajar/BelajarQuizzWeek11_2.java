import java.util.Scanner;

public class BelajarQuizzWeek11_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = "Achmad labib zainullah";
        int noAbsen = 2;
        int k = noAbsen % 5;

        System.out.println("Nama: " + nama);
        System.out.println("Kode personal k = " + k);

        System.out.print("Masukkan jumlah kamar: ");
        int jumlahKamar = sc.nextInt();

        int kamarPalingBoros = 0;
        double kwhTertinggi = 0;
        int jumlahMateranRusak = 0;

        int i = 1;
        while (i <= jumlahKamar) {
            System.out.println("Kamar nomor " + i);

            double jumlahKwh = 0;
            boolean materanRusak = false;
            int jumlahHari = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Hari " + j + " (khw): ");
                double kwh = sc.nextDouble();

                if (kwh == -1) {
                    System.out.println("Kamar rusak");
                    jumlahMateranRusak++;
                    materanRusak = true;
                    break;
                    
                }
                jumlahKwh += kwh;
                jumlahHari++;
            }
            

            double rataRata = 0;
            if (!materanRusak) {
                rataRata = jumlahKwh / jumlahHari;
            }

            String status = "";
            if (rataRata < (5 + k)) {
                 status = "hemat";
            } else {
                 status = "boros";
            }

            System.out.printf("Total: " + jumlahKwh + "| " + status + "\n");

            if (jumlahKwh > kwhTertinggi) {
                kwhTertinggi = jumlahKwh;
                kamarPalingBoros = i;
            }
            i++;
        }    

        System.out.println("==============");
        System.out.println("kamar paling boros: " + kamarPalingBoros);
        System.out.println("Total kwh tertinggi: " + kwhTertinggi);
        System.out.println("Jumlah materan rusak: " + jumlahMateranRusak);
    }
}