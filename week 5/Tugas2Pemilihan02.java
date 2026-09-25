import java.util.Scanner;

public class Tugas2Pemilihan02 {

    public static void main(String[] argas) {

        int jumlahSKS;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah SKS: ");
        jumlahSKS = sc.nextInt();

        if (jumlahSKS > 24) {
            System.out.println("Jumlah SKS melebihi batas maksimal");
        }else {
            System.out.println("Jumalah KRS Valid");
        }
    }
}