import java.util.Scanner;

public class Tugas2SeleksiAsisten02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean status, sanksi, memilikiSertif;
        int nilaiDasar, nilaiWawancara;

        System.out.print("Apakah mahasiswa berstatus aktif ? (true/false) ");
        status = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi ? (true/false) ");
        sanksi = sc.nextBoolean();
        System.out.print("Apakah mahasiswa memiliki sertifikat kompetensi pemrograman ? (true/false) ");
        memilikiSertif = sc.nextBoolean();
        System.out.print("Berapa nilai dasar pemrograman mahasiswa : ");
        nilaiDasar = sc.nextInt();
        System.out.print("Berapa nilai wawancara mahasiswa : ");
        nilaiWawancara = sc.nextInt();

        if (status && !sanksi) {
            if (nilaiDasar >= 80 || memilikiSertif) {
                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa Diterima Menjadi Asisten");
                } else {
                    System.out.println("Mahasiswa gagal pada tahap wawancara. karena nilai kurang dari 75 ");
                }
            } else {
                System.out.println("Mahasiswa gagal menjadi asisten. karena gagal pada tahap nilai dan sertifikat ");
            }
        } else {
            System.out.println("Mahasiswa gagal pada tahap pertama. Mahasisa tidak aktif dan terkena sanksi");
        }
    }
}