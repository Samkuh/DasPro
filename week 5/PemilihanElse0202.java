import java.util.Scanner;

public class PemilihanElse0202 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- cetak krs siakad ---");
        System.out.print(" Masukkan semester saat ini: ");

        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("Krs Semester 1 diatampilkan ");
        } else if (semester == 2) {
            System.out.println("Krs Semester 2 diatampilkan ");
        } else if (semester == 3) {
            System.out.println("Krs Semester 3 diatampilkan ");
        } else if (semester == 4) {
            System.out.println("Krs Semester 4 diatampilkan ");
        } else if (semester == 5) {
            System.out.println("Krs Semester 5 diatampilkan ");
        } else if (semester == 6) {
            System.out.println("Krs Semester 6 diatampilkan ");
        } else if (semester == 7) {
            System.out.println("Krs Semester 7 diatampilkan ");
        } else if (semester == 8) {
            System.out.println("Krs Semester 8 diatampilkan ");
        } else {
            System.out.println("Semester tidak valid.");
        }
    }
}