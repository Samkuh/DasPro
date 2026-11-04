import java.util.Scanner;

public class Tugas2_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah n : ");
        int n = sc.nextInt();
        int total = 0;
        int a = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a = i * j;
                System.out.print(a + "\t");
                total += a;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka : " + total);
        sc.close();
    }
}