import java.util.Scanner;

public class PemilihanElse0102 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- cetak krs siakad ---");
        System.out.print(" apakah ukt sudah lunas? (true/false): ");

        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran ukt terverifikasi");
            System.out.println("silahkan cetak krs dan minta tanda tangan dpa");
        } else {
            System.out.println("Registrasi Ditolak");
            System.out.println("silahkan lunasi UKT terlebih dahulu");
        }
    }
}