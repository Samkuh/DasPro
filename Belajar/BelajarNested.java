import java.util.Scanner;

public class BelajarNested {

    public static void main(String[] args) {
        
        String jenjang, prodi;

        Scanner sc = new Scanner(System.in);

        System.out.println("Pemilihan Jenjang Dan Prodi Kuliah Anda");

        System.out.print("Masukkan Jenjang Kuliah Anda: ");
        jenjang = sc.nextLine();
        System.out.print("Masukkan Jenjang Prodi Kuliah Anda: ");
        prodi = sc.nextLine();

        if (jenjang.equalsIgnoreCase("D3")) {
            if (prodi.equalsIgnoreCase("MI")) {
                System.out.println("Jenjang : D3");
                System.out.println("Prodi : Manajemen Informatika");
            } else if (prodi.equalsIgnoreCase("KA")) {
                System.out.println("Jenjang : D3");
                System.out.println("Prodi : Komputasi Akutansi");
            }
        }

    }
}