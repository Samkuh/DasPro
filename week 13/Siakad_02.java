import java.util.Scanner;

public class Siakad_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println();
            System.out.print("Input nilai mahasiswa ke- " + (i + 1) + ": ");
            double totalPerSiswa = 0;

            System.out.println();
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke- " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata - rata: " + totalPerSiswa / nilai[i].length);
        }

        System.out.println();
        System.out.println("=====================");
        System.out.println("Rata - rata nilai setiap mata kuliah: ");

        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
        }
    }
}