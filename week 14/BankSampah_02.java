import java.util.Scanner;

public class BankSampah_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double HARGA_PER_KG = 3000.0;

        System.out.print("Masukkan Jumlah Nasabah: ");
        int nasabah = sc.nextInt();

        if (nasabah <= 0) {
            System.out.println("Jumlah nasabah harus lebih dari 0.");
            return;
        }

        double[] dataSetoran = inputSetoran(nasabah);

        tampilSetoran(dataSetoran);

        System.out.println("\n--- Saldo Setiap Nasabah ( Harga: Rp.3000 Per Kg ) ---");
        for (int i = 0; i < dataSetoran.length; i++) {
            double saldo = hitungSaldo(dataSetoran[i], HARGA_PER_KG);
            System.out.printf("Nasabah ke- %d : Rp%,.2f\n", (i + 1), saldo);
        }

        double totalBerat = totalSetoran(dataSetoran);
        System.out.printf("\nTotal Berat Setoran Seluruh Nasabah: %.2f kg\n", totalBerat);

        int terbanyak = nasabahTerbanyak(dataSetoran);
        System.out.printf("Nasabah dengan setoran Terbanyak: Nasabah ke-%d ( Array ke- %d ) dengan berat %.2f kg\n"
        , (terbanyak + 1), terbanyak, dataSetoran[terbanyak]);
    }

    static double[] inputSetoran(int n) {
        Scanner sc = new Scanner(System.in);
        double[] setoran = new double[n];

        System.out.println("\n--- Input Data Setoran Sampah ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan berat setoran nasabah ke- " + (i + 1) + " Kg : ");
            setoran[i] = sc.nextDouble();
        }

        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("\n--- Daftar Setoran Sampah Nasabah ---");

        for (int i = 0; i < setoran.length; i++) {
            System.out.printf("Nasabah Ke- %d : %.2f Kg\n", (i + 1), setoran[i]);
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;
        for (int i = 0; i < setoran.length; i++) {
            total += setoran[i];
        }

        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg) {
        return berat * hargaPerKg;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int max = 0;
        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[max]) {
                max = i;
            }
        }

        return max; 
    }
}