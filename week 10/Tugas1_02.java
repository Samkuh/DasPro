import java.util.Scanner;

public class Tugas1_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        int i = 0;
        int total = 0;
        while (i <= n) {
            int j = 0;
            int k = 1;
            while (j < i) {
                System.out.print(k + " ");
                j++;
                k++;
            }
        total += i;
        i++;
        System.out.println();
        }
        System.out.println("Total Angka tercetak : " + total);
        sc.close();
    }
}