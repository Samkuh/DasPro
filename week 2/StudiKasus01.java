import java.util.Scanner;

public class StudiKasus01 {

    public static void main(String[] args) {

        int gajiPokok, tunjanganAnak, jumlahAnak;
        double persentasePotonganGaji =0.1, gajiKotor, gajiBersih;

        System.out.println("Perhitungan Gaji Pokok Karyawan PT XYZ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Gaji Pokok Anda Per Bulan");
        gajiPokok = sc.nextInt();
        System.out.println("Masukkan Jumlah Tunjangan Anak Anda Per Bulan");
        tunjanganAnak = sc.nextInt();
        System.out.println("Masukkan Jumlah Anak Anda Sekarang");
        jumlahAnak = sc.nextInt();

        gajiKotor = (gajiPokok+(tunjanganAnak*jumlahAnak));
        gajiBersih = (gajiKotor-(persentasePotonganGaji*gajiPokok));

        System.out.println("Gaji Kotor Yang Anda Terima Pada Bulan Ini Adalah: " +gajiKotor);
        System.out.println("Gaji Bersih Yang Anda Terima Pada Bulan Ini Adalah: " +gajiBersih);

    }
}