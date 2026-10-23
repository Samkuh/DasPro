import java.util.Scanner;

public class SiakadFor02 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double nilai, tertinggi = 0, terendah = 100;
    double lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
        System.out.print("Masukkan nilai mahasiswa ( 1 - 10 ) ke- " + i + ": ");
        nilai = sc.nextDouble();
            if (nilai > tertinggi) {
            tertinggi = nilai;
            }
            if (nilai < terendah) {
            terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else if (nilai < 60) {
                tidakLulus++;
            }
        }
        System.out.println("");
        System.out.println("============================");
        System.out.println("Nilai Tertinggi: " + (int) tertinggi);    
        System.out.println("Nilai Terendah: " + (int) terendah);  
        System.out.println("Jumlah Lulus: " + (int) lulus + " mahasiswa");
        System.out.println("Jumlah Tidak Lulus: " + (int) tidakLulus + " mahasiswa");
    }
}