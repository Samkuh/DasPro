import java.util.Scanner;

public class RSUGDHarapanKita {

    public static void main(String[] args) {
         
        System.out.println("Sistem Pemilihan Tindakan Pasien Di RS Harapan Kita");

        Scanner sc = new Scanner(System.in);

        boolean kritis,kormobid,pasienPingsan;
        double saturasiOksigen,tekananDarah;
        int sisaBedIcu,usiaPasien,jumlahNafasMenit,suhuDemam;

        System.out.print("Apakah Kondisi Pasien Sangat Kritis (True/False): ");
        kritis = sc.nextBoolean();
        System.out.print("Masukkan Saturasi Pasien Dalam Bentuk Desimal: ");
        saturasiOksigen = sc.nextDouble();
        System.out.print("Masukkan Jumlah Ranjang ICU yang Masih tersedia Di rumah sakit: ");
        sisaBedIcu = sc.nextInt();
        System.out.print("Masukkan jumlah tekanan darah sistolik pasien dalam bentuk desimal: ");
        tekananDarah = sc.nextDouble();
        System.out.print("Apakah Pasien Dalam keadaan pingsan (True/False): ");
        pasienPingsan = sc.nextBoolean();
        System.out.print("Masukkan Suhu demam pasien Anda: ");
        suhuDemam = sc.nextInt();
        System.out.print("Apakah pasien anda mempunyai penyakit Karmobid (True/False): ");
        kormobid = sc.nextBoolean();
        System.out.print("Masukkan Usia Pasien Anda: ");
        usiaPasien = sc.nextInt();
        System.out.print("Masukkan Jumlah Nafas Pasien Per Menit: ");
        jumlahNafasMenit = sc.nextInt();

            // Kamar ICU //

        if (kritis && saturasiOksigen < 0.85 && sisaBedIcu > 0) {
            System.out.println("Pasien Akan Ditepatkan Pada Ruangan ICU ");
            // UGD VENTILATOR MOBIL //
        } else if (saturasiOksigen < 0.85 && sisaBedIcu == 0) {
            System.out.println("Pasien Akan Ditepatkan Pada Ruangan UGD dan Akan di pasangi ventilator Portabel ");
            //Ruang Resusitasi UGD //
        } else if (saturasiOksigen >= 0.85 && saturasiOksigen <= 0.89 && tekananDarah < 0.90 || tekananDarah > 180.0 && pasienPingsan) {
            System.out.println("Pasien akan langsung dibawa ke ruang penyelamatan jiwa yaitu Ruang Resutasi UGD");
            // HCU Isolasi
        } else if (saturasiOksigen >= 0.90 && saturasiOksigen <= 0.94 || suhuDemam > 39 && kormobid && usiaPasien > 65) {
            System.out.println("Pasien Akan ditempatkan di Ruangan HCU Isolasi Ruangan ini khusus untuk\npasienlansia yang punya penyakit penyerta");
            // Rawat Inap Umum //
        } else if (saturasiOksigen >= 0.90 && saturasiOksigen <= 0.94 || jumlahNafasMenit > 24) {
            System.out.println("Pasien Akan ditempatkan pada Ruangan rawat inap umum untuk pemulihan ");
            // Rawat Jalan //
        } else {
            System.out.println("Pasien dalam kondisi aman, stabil, dan tidak masuk dalam semua kriteria darurat di atas.\nPasien boleh pulang setelah diberi obat");
        }
    }
}