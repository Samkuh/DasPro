import java.util.Scanner;

public class StudiKasus01 {

    public static void main(String[] args) {

        int gajiPokok, tunjanganAnak, jumlahAnak;
        double persentasePotonganGaji, gajiKotor, gajiBersih;

        Scanner sc = new Scanner(System.in);

        System.out.println("Perhitungan Gaji Pokok Karyawan PT XYZ");
        
        System.out.println("Masukkan Gaji Pokok Anda Per Bulan: ");
        gajiPokok = sc.nextInt();
        System.out.println("Masukkan Jumlah Tunjangan Anak Anda Per Bulan: ");
        tunjanganAnak = sc.nextInt();
        System.out.println("Masukkan Jumlah Anak Anda Sekarang: ");
        jumlahAnak = sc.nextInt();
        System.out.println("Masukkan Persentase Potongan Gaji Anda: ");
        persentasePotonganGaji = sc.nextDouble();

        gajiKotor = (gajiPokok+(tunjanganAnak*jumlahAnak));
        gajiBersih = (gajiKotor-(persentasePotonganGaji*gajiPokok));

        System.out.println("Gaji Kotor Yang Anda Terima Pada Bulan Ini Adalah: " +gajiKotor);
        System.out.println("Gaji Bersih Yang Anda Terima Pada Bulan Ini Adalah: " +gajiBersih);

    }
}