import java.util.Scanner;

public class StudiKasus102 {

    public static void main(String[] args) {

        int jumlahCup, hargaBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang, hargaCup;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Harga Per Cup: ");
        hargaCup = sc.nextInt();
        System.out.print("Masukkan Jumlah Cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan Nominal Uang Bayar: ");
        hargaBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }

        System.out.println("Total Harga: Rp." + totalHarga);
        System.out.println("diskon: Rp." + diskon);
        System.out.println("Total Bayar: Rp." + totalBayar);

        if (hargaBayar >= totalBayar) {
            kembalian = hargaBayar - totalBayar;
            System.out.println("Kembalian: Rp." + kembalian);
        } else {
            kurang = totalBayar - hargaBayar;
            System.out.println("Kurang: Rp" + kurang);
        }
    }
}