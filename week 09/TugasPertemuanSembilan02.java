import java.util.Scanner;

public class TugasPertemuanSembilan02 {

    public static void main(String[] args) {
        
       int jenis, durasi, total = 0;

       Scanner sc = new Scanner(System.in);

       do {
        System.out.println("");
        System.out.println("01. MOBIL");
        System.out.println("02. SEPEDA MOTOR");
        System.out.println("00. BERHENTI");

        System.out.println("");
        System.out.println("==== JENIS KENDARAAN ====");
        System.out.print("Masukkan jenis kendaraan:");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.println("");
            System.out.println("==== DURASI ====");
            System.out.print("Masukkan Durasi Parkir Dalam Jam: ");
            durasi = sc.nextInt();

            if (jenis == 1) {
                total += durasi * 3000;
            } else {
                total += durasi * 2000;
            }
        }
       } while (jenis != 0);

       System.out.println("");
       System.out.println("==== TOTAL PENDAPATAN ====");
       System.out.println("Total pendapatan parkir: Rp." + total);
    }
}