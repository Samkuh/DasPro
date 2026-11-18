import java.util.Scanner;

public class TokoBuku {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] tokoBuku = new int[3][3];

            int[] totalBuku = new int[3];
            double[] rataBuku = new double[3];
            double[] rataToko = new double[3];
            int[] totalToko = new int[3];
            int total = 0;

            System.out.println(" Cabang Toko : 1. Dieng | 2. Soehat | 3. Sengkaling");
            System.out.println(" Jenis Buku : 1. Novel | 2. Komik | 3. Ensiklopedia");

            System.out.println();

            System.out.println("--- Input Jumlah Buku Per Toko ---");
            for (int i = 0; i < tokoBuku.length; i++) {
                System.out.println("Cabang Toko Ke- " + (i + 1) + ": ");
                totalToko[i] = 0;
                for (int j = 0; j < tokoBuku[i].length; j++) {
                    System.out.print("Masukkan Jumlah Buku Ke- " + (j + 1) + ": ");
                    tokoBuku[i][j] = sc.nextInt();

                    total += tokoBuku[i][j];

                    totalToko[i] += tokoBuku[i][j];
                    totalBuku[j] += tokoBuku[i][j];
                    rataBuku[j] = (double)totalBuku[j] / tokoBuku.length;
                }

                rataToko[i] = (double)totalToko[i] / tokoBuku[i].length;
            }

            System.out.println();

            System.out.println("--- Total Buku Terjual Di Setiap Toko ---");
            for (int i = 0; i < tokoBuku.length; i++) {
                System.out.printf("Total buku yang terjual di toko ke- " + (i + 1) + ": %d", totalToko[i]);
                System.out.println();
            }

            System.out.println();
            System.out.println("--- Total Setiap Buku Terjual Di Seluruh Toko ---");
            for (int i = 0; i < tokoBuku.length; i++) {
                System.out.printf("Total buku ke- " + (i + 1) + " yang terjual di seluruh toko: %d", totalBuku[i]);
                System.out.println();
            }

            System.out.println();
            System.out.println("--- Rata - rata Buku Terjual Di Setiap Toko ---");
            for (int i = 0; i < tokoBuku.length; i++) {
                System.out.printf("Rata - rata buku yang terjual di toko ke- " + (i + 1) + ": %.2f", rataToko[i]);
                System.out.println();
            }

            System.out.println();
            System.out.println("--- Rata - rata Setiap Buku Terjual Di Seluruh Toko ---");
            for (int i = 0; i < tokoBuku.length; i++) {
                System.out.printf("Rata - rata buku ke- " + (i + 1) + " yang terjual di seluruh toko: %.2f", rataBuku[i]);
                System.out.println();
            }
            
            System.out.println();
            System.out.println("--- TOTAL BUKU TERJUAL SELURUH TOKO ---");
            System.out.println("TOTAL: " + total);
        }
}