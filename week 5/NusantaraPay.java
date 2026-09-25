import java.util.Scanner;

public class NusantaraPay {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistem Security Digital Nusantara Pay");


        // Transaksi Lansung Ditolak //
        boolean statusAkun;
        int saldo,saldoTransaksi,maxTransaksi = 10000,totalPengeluaran;
        boolean tempatLuarNegeri,akunMencurigakan;
        int nominalLuarNegeri,jamTransakasi,nominalJam,nominalMencurigakan;

        System.out.println("1. Pemeriksaan Transaksi Langsung Ditolak");
        System.out.println("2. Pemeriksaan Transaksi Mencurigakan Ditahan Sementara");

        System.out.print("Akun si pengguna sudah masuk daftar hitam atau penipu (True/False): ");
        statusAkun = sc.nextBoolean();

        System.out.print("Masukkan Saldo rekening anda: ");
        saldo = sc.nextInt();
        System.out.print("Masukkan saldo Transaksi anda: ");
        saldoTransaksi = sc.nextInt();

        System.out.print("Masukkan Total Pengeluaran Anda Hari ini: ");
        totalPengeluaran = sc.nextInt();

        // --------------------------------- //

        System.out.print("Apakah Transaksi dilakukan Di luar negeri (True/False): ");
        tempatLuarNegeri = sc.nextBoolean();
        System.out.print("Masukkan nominal transaksi saat di Luar Negeri: ");
        nominalLuarNegeri = sc.nextInt();

        System.out.print("Masukkan jam transaksi anda: ");
        jamTransakasi = sc.nextInt();
        System.out.print("Masukkan nominal yang anda transaksikan pada jam tersebut: ");
        nominalJam = sc.nextInt();

        System.out.print("Apakah akun anda sudah di di tandai Mencurigakan sebelumnya (true/false): ");
        akunMencurigakan = sc.nextBoolean();
        System.out.print("Masukkan nominal transaksi anda: ");
        nominalMencurigakan = sc.nextInt();

        if (statusAkun) {
            System.out.println("Hasil :   Akun Pengguna Masuk Pada Daftar Hitam ");
            System.out.println("Apapun transaksinya langsung ditolak");
        } else if (saldo < saldoTransaksi) {
            System.out.println("Hasil :   Saldo di rekening lebih kecil daripada nominal yang mau ditransaksikan");
            System.out.println("Apapun transaksinya langsung ditolak");
        } else if (maxTransaksi < totalPengeluaran) {
            System.out.println("Hasil :   Total transaksi anda hari ini melebihi batas harian");
            System.out.println("Apapun transaksinya langsung ditolak");
        } else if (tempatLuarNegeri && nominalLuarNegeri > 2000) {
            System.out.println("Hasil :   Sistem curiga akunmu sedang dibajak orang asing");
            System.out.println("transaksi ditahan sementara untuk diperiksa lebih lanjut");
        } else if (jamTransakasi >= 0 && jamTransakasi <= 4 && nominalJam > 1000) {
            System.out.println("Hasil :   jarang ada orang belanja besar-besar di jam tidur");
            System.out.println("transaksi ditahan sementara untuk diperiksa lebih lanjut");
        } else if (akunMencurigakan && nominalMencurigakan > 500) {
            System.out.println("Hasil :   Sistem butuh verifikasi OTP lagi demi keamanan");
            System.out.println("transaksi ditahan sementara untuk diperiksa lebih lanjut");
        } else {
            System.out.println("Hasil :   Saldomu cukup, akunmu bersih, dilakukan di jam wajar, dan nominalnya aman");
            System.out.println("Transaksi berhasil diproses.");
        }
    }
}
