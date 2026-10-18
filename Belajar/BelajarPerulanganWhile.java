import java.util.Scanner;

public class BelajarPerulanganWhile {

    public static void main(String[] args) {
        int i = 1;
        while (i >= 1 && i <= 10) {
            System.out.println("Pengulangan ke- " + i);

            i++;
        }

        System.out.println("");

        Scanner sc = new Scanner(System.in);

        String pinBenar = "25102007";
        String pinInput = "";
        int kesempatan = 3;
        int percobaan = 0;
        boolean statusLogin = false;

        while (percobaan < kesempatan && !statusLogin) {
            System.out.println("========= PIN ATM =========");
            System.out.print("Masukkan 6 digit PIN Anda: ");
            pinInput = sc.nextLine();

            percobaan++;

            if (pinInput.equals(pinBenar)) {
                statusLogin = true;
                System.out.println("\nPIN Benar! Selamat datang di layanan ATM");
            } else {
                int sisa = kesempatan - percobaan;
                if (sisa > 0) {
                    System.out.println("Pin Salah. Sisa kesempatan: " + sisa + " kali.\n");
                } else {
                    System.out.println("\nPIN salah 3 kali. Kartu ATM Anda terblokir");
                }
            }
        }
    }
}