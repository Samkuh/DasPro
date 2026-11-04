import java.util.Scanner;

public class BelajarQuizzWeek11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = "Achmad labib zainullah";
        int noAbsen = 2;
        int k = noAbsen % 5;

        System.out.println("Nama: " + nama);
        System.out.println(" Kode personal: " + k);

        System.out.print("Masukkan jumlah kurir: ");
        int jumlahKurir = sc.nextInt();

        int kurirTerbaik = 0;
        double ongkirTertinggi = 0;
        int paketTerBesar = 0;

        int kurir = 1;
        while (kurir <= jumlahKurir) {
            System.out.println("\n--- KURIR : " + kurir);
            System.out.print("Masukkan jumlah paket: ");
            int jumlahPaket = sc.nextInt();

            double totalOngkirKurir = 0;

            for (int i = 1; i <= jumlahPaket; i++) {
                System.out.print("Masukkan berat paket " + i + "(Kg): ");
                double beratPaket = sc.nextDouble();

                double tarif = 0;

                if (beratPaket <= 1.0) {
                    tarif = 8000;
                }else if (beratPaket <= 10.0) {
                    tarif = 20000;
                } else {
                    tarif = 40000;
                    paketTerBesar++;
                }

                double ongkirPaket = tarif + (k * 500);
                totalOngkirKurir += ongkirPaket;
            }

            double rataRata = 0;
            if (jumlahPaket > 0) {
                rataRata = totalOngkirKurir / jumlahPaket;
            }

            System.out.printf(" Total: %.0f | Rata per paket: %.0f\n",totalOngkirKurir, rataRata);

            if (totalOngkirKurir > ongkirTertinggi) {
                ongkirTertinggi = totalOngkirKurir;
                kurirTerbaik = kurir;
            }

            kurir++;
        }

        System.out.println("==============");
        System.out.println("Kurir terbaik: " + kurirTerbaik);
        System.out.printf("Ongkir tertinggi: %.0f\n",ongkirTertinggi);
        System.out.println("Jumlah Paket besar: " + paketTerBesar);
    }
}