import java.util.Scanner;

public class Rectangle02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();

        for (int b = 1; b <= baris; b++) {
            for (int k = 1; k <= kolom; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}