import java.util.Scanner;

public class PemilihanSwitch02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print(" Masukkan semester saat ini: ");
        byte semester = sc.nextByte();

        switch (semester) {
            case 1:
                System.out.println("Krs Semester 1 diatampilkan ");
                break;
            case 2:
                System.out.println("Krs Semester 2 diatampilkan ");
                break;
            case 3:
                System.out.println("Krs Semester 3 diatampilkan ");
                break;
            case 4:
                System.out.println("Krs Semester 4 diatampilkan ");
                break;
            case 5:
                System.out.println("Krs Semester 5 diatampilkan ");
                break;
            case 6:
                System.out.println("Krs Semester 6 diatampilkan ");
                break;
            case 7:
                System.out.println("Krs Semester 7 diatampilkan ");
                break;
            case 8:
                System.out.println("Krs Semester 8 diatampilkan ");
                break;
             default:
                System.out.println("Semester tidak valid.");
        }
    }
}