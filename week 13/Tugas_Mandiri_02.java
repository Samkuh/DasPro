import java.util.Scanner;

public class Tugas_Mandiri_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];
        double[] rataPertanyaan = new double[6];
        int[] totalPertanyaan = new int[6];
        double[] rataResponden = new double[10];
        int total = 0;
        int totalResponden;
        double rataTotal = 0;

        System.out.println("--- Hasil Survei ---");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Survei Responden ke- " + (i + 1) + ": ");
            totalResponden = 0;
            for (int j = 0; j < survei[i].length; j++) {
                do {
                    System.out.print("Masukkan nilai (1 - 5) dari pertanyaan ke- " + (j + 1) + ": ");
                    survei[i][j] = sc.nextInt();
                    if (survei[i][j] < 1 || survei[i][j] > 5) {
                        System.out.println("Input Tidak Valid. Ulang Input Nilai");
                    }
                }while (survei[i][j] < 1 || survei[i][j] > 5);
                totalResponden += survei[i][j];
                total += survei[i][j];
                totalPertanyaan[j] += survei[i][j];
                rataPertanyaan[j] = (double)totalPertanyaan[j] / survei.length;
            }
            rataResponden[i] = (double) totalResponden / survei[i].length;
            rataTotal = (double) total / (survei.length*survei[i].length);
        }

        System.out.println();
        for (int i = 0; i < survei[i].length;i++) {
            System.out.printf("Rata - rata dari responden ke- " + (i + 1) + ": %.2f", rataResponden[i]);
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < survei[i].length;i++) {
            System.out.printf("Rata - rata dari pertanyaan ke- " + (i + 1) + ": %.2f", rataPertanyaan[i]);
            System.out.println();
        }

        System.out.printf("Rata - rata dari total seluruh nilai dari tiap pertanyaan %.2f\n", rataTotal);
        sc.close();
    }
}