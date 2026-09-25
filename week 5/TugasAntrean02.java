 import java.util.Scanner;

 public class TugasAntrean02 {

    public void main(String [] args) {

        char loket;

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Layanan Loket ---");
        System.out.print("Masukkan Loket Anda: ");
        loket = sc.next().charAt(0);

        switch (loket) {
            case 'A','a':
                System.out.println("Loket A : Legalisir Ijazah");
                break;
            case 'B','b':
                System.out.println("Loket B : Surat Keterangan Aktif Kuliah");
                break;
            case 'C','c':
                System.out.println("Loket C : Pembayaran UKT");
                break;
            case 'D','d':
                System.out.println("Loket D : Pengajuan Cuti Akademik");
                break;
            default:
                System.out.println("Layanan Tidak Tersedia");
        }
    }
 }