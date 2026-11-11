import java.util.Scanner;

public class nesdetAksesLab02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisaksi, punyaIzinDosen, asistenLab;

        System.out.println("Jawab lah True Atau False");

        System.out.print("Apakah mahasiswa aktif: ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang di sakasi: ");
        sedangDisaksi = sc.nextBoolean();
        System.out.print("Apakah mahasiswa punya izin dosen: ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah mahasiswa merupakan asisten Lab: ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisaksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses labolatorium diberikan");
            } else {
                System.out.println("Akses ditolak : membutuhkan izin dosen atau status asisten Lab");
            }
        } else {
            System.out.println("Akses ditolak : status mahasiswa tidak memenuhi syarat");
        }
    }
}