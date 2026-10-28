import java.util.Scanner;

public class belajarLebihBesarKecil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int bilangan = 0;
        int bilanganTerbesar = 0;
        int b = 0;
        
        System.out.print("Masukkan Jumlah Input: ");
        input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            System.out.print("Masukkan bilangan ke- " + i + ": ");
            bilangan = sc.nextInt();
            if (bilangan > bilanganTerbesar) {
                bilanganTerbesar = bilangan;
                b = i;
            }
        }
        System.out.println(" bilangan terbesar adalah bilangan ke- " + b);
        
    }
}