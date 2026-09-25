import java.util.Scanner;

public class StudiKasus02 {

    public static void main(String[] args) {

        int lebarTanah, panjangTanah, diameterKolam, panjangTaman;
        double phiJari =3.14, luasTanah, luasKolam, luasTaman, luasTanahAkhir;

        System.out.println("Perhitungan Sisa Luas Tanah Yang Telah Dibaut Kolam Dan Taman ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Lebar Tanah Anda");
        lebarTanah = sc.nextInt();
        System.out.println("Masukkan Panjang Tanah Anda");
        panjangTanah = sc.nextInt();
        System.out.println("Masukkan Diameter Kolam Anda");
        diameterKolam = sc.nextInt();
        System.out.println("Masukkan Panjang Taman Anda");
        panjangTaman = sc.nextInt();

        luasTanah = lebarTanah*panjangTanah;
        luasKolam = (((diameterKolam/2)*(diameterKolam/2))*phiJari);
        luasTaman = panjangTaman*panjangTaman;
        luasTanahAkhir = (luasTanah-(luasKolam+luasTaman));

        System.out.println("Luas Tanah Akhir Atau Sisa Anda Adalah " +luasTanahAkhir + ("\tMeter Kubik"));

    }
}