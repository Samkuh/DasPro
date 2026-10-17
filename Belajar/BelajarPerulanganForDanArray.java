import java.util.Scanner;

public class BelajarPerulanganForDanArray {

    public static void main(String[] args) {
        
        int jumlahUlang, j=1;

        for(int i=1; i<6; i++) {
            System.out.print(i);
        }

        System.out.println("");

        for(int i=5; i>=1; i--) {
            System.out.print(i);
        }

        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Ulang: ");
        jumlahUlang = sc.nextInt();
        for(; j<=jumlahUlang; j++) {
            System.out.print(j);
        }

        System.out.println("");

        // ==================================================== //

        System.out.print("Masukkan Jumlah Jenis Barang Yang di beli: ");
        int jumlahBarang = sc.nextInt();
        sc.nextLine();

        String[] namaBarang = new String[jumlahBarang];
        int[] hargaBarang = new int[jumlahBarang];
        int totalBelanja = 0;

        for(int i = 0; i < jumlahBarang; i++) {

            System.out.print("\n--- Masukkan harga barang ke- " + (i + 1 ) + " ---- ");
            System.out.print("Nama Barang : ");
            namaBarang[i] = sc.nextLine();

            System.out.print("Harga       : Rp ");
            hargaBarang[i] = sc.nextInt();
            sc.nextLine();

            totalBelanja += hargaBarang[i];
        }

            double diskon = 0;
            if (totalBelanja >= 100000) {
                diskon = totalBelanja * 0.10;
            }

            double totaAkhir = totalBelanja - diskon;

            System.out.println("\n======== STRUK BELANJA ===========");
            System.out.println("================================");

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println((i + 1) + ". " + namaBarang[i] + "\t: Rp " + hargaBarang[i]);
        }

            System.out.println("-------------------------");
            System.out.println("Total Belanja Awal  : Rp " + totalBelanja);

            if (diskon > 0) {
                System.out.println("Diskon ( 10% )      : Rp " + (int)diskon);
            } else {
                System.out.println("Diskon              : Rp 0 ( Belum mencapai syarat pembelian Rp 100.000 )");
            }

            System.out.println("-------------------------");
            System.out.println("Total Akhir         : Rp " + (int)totaAkhir);
            System.out.println("===============================");
    }
}