import java.util.Scanner;

public class Pemilihan02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- cetak krs siakad ---");
        System.out.print(" apakah ukt sudah lunas? (true/false): ");

        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("silahkan cetak KRS dan minta tanda tangan DPA");
        }
    }
}