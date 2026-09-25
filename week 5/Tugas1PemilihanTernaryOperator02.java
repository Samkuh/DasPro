import java.util.Scanner;

public class Tugas1PemilihanTernaryOperator02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print(" Apakah ukt sudah lunas? (true/false): ");

        boolean uktLunas = sc.nextBoolean();

        // Ternary Operator //

        String hasil = (uktLunas) ? "Pembayaran ukt terverifikasi\nsilahkan cetak krs dan minta tanda tangan DPA" : "";
        System.out.println(hasil);

    }
}