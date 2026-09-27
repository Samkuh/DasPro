import java.util.Scanner;

public class BelajarNested {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String jurusan, jenjang, prodi;

        
        System.out.print("Masukkan Jenjang Kuliah Anda S1 / S2: ");
        jenjang = sc.nextLine();
        System.out.print("Masukkan Jurusan Anda TI : ");
        jurusan = sc.nextLine();
        System.out.print("Masukkan Prodi Anda TI / SIB / MTI/ MPK: ");
        prodi = sc.nextLine();

        if (jenjang.equalsIgnoreCase("S1")) {
            if (jurusan.equalsIgnoreCase("TI")) {
                if (prodi.equalsIgnoreCase("TI")) {
                    System.out.println("Jenjang Anda : S1");
                    System.out.println("Jurusan Anda : Teknologi Informasi");
                    System.out.println("Prodi Anda : Teknik Informatika");
                } else if (prodi.equalsIgnoreCase("SIB")) {
                    System.out.println("Jenjang Anda : S1");
                    System.out.println("Jurusan Anda : Teknologi Informasi");
                    System.out.println("Prodi Anda : Sistem Informasi Bisnis");
                }
            }
        } else if (jenjang.equalsIgnoreCase("S2")) {
            if (jurusan.equalsIgnoreCase("TI")) {
                if (prodi.equalsIgnoreCase("MTI")) {
                    System.out.println("Jenjang Anda : S2");
                    System.out.println("Jurusan Anda : Teknologi Informasi");
                    System.out.println("Prodi Anda : Magister Teknik Informatika");
                } else if (prodi.equalsIgnoreCase("MPK")) {
                    System.out.println("Jenjang Anda : S2");
                    System.out.println("Jurusan Anda : Teknologi Informasi");
                    System.out.println("Prodi Anda : Megister Pendidikan Komputer");
                }
            }
        } else {
            System.out.println("Jurusan Anda Tidak ADA");
        }
    }
}