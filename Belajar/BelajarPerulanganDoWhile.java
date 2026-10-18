import java.util.Scanner;

public class BelajarPerulanganDoWhile {

    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Perulangan ke- " + i);
            i++;
        } while (i <= 5);

        Scanner sc = new Scanner(System.in);

        int pilihan, jumlah, totalBelanja = 0;
        char ulang;

        do {
            System.out.println("=== MENU CAFE BROTHER HOOD ===");
            System.out.println("1. Kopi Susu - Rp 10.000");
            System.out.println("2. Roti Bakar - Rp 15.000");
            System.out.println("3. Kentang Goreng - Rp 20.000");
            System.out.println("4. Burger - Rp 25.000");
            System.out.println("5. Nasi Goreng - Rp 30.000");
            System.out.println("");
            System.out.print("Pilih Menu ( 1 - 5 ): ");
            pilihan = sc.nextInt();

            System.out.println("");
            System.out.print("Masukkan jumlah yang dibeli: ");
            jumlah = sc.nextInt();

            switch (pilihan) {
                case 1:
                    totalBelanja += 10000 * jumlah;
                    break;
                case 2:
                    totalBelanja += 15000 * jumlah;
                    break;
                case 3:
                    totalBelanja += 20000 * jumlah;
                    break;
                case 4:
                    totalBelanja += 25000 * jumlah;
                    break;
                case 5:
                    totalBelanja += 30000 * jumlah;
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }

            System.out.print("\nApakah Anda ingin membeli menu lain? ( y/n ): ");
            ulang = sc.next().toLowerCase().charAt(0);
            System.out.println();
        } while (ulang == 'y');

        System.out.println("===================================");
        System.out.println("Total yang harus dibayar: Rp. " + totalBelanja);
        System.out.println("Terima kasih telah berbelanja");
    }
}