import java.util.Scanner;

public class DiskonTokoBuku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hariApa, jenisBuku;
        int diskonKamus, diskonNovel, diskonSelainBuku, jumlahBuku, diskonNovel2;

        System.out.print("Hari apa anda membeli buku di sini ? ");
        hariApa = sc.nextLine();
        System.out.print("Jenis buku yang anda beli: ");
        jenisBuku = sc.nextLine();
        System.out.print("Berapa buku yang anda beli: ");
        jumlahBuku = sc.nextInt();

        diskonKamus = 10 + 2;
        diskonNovel = 7 + 2;
        diskonNovel2 = 7 + 1;
        diskonSelainBuku = 5;

        if (hariApa.equalsIgnoreCase("RABU")) {
            if (jenisBuku.equalsIgnoreCase("KAMUS")) {
                System.out.println("diskon: " + diskonKamus + " %");
            } else if (jenisBuku.equalsIgnoreCase("NOVEL")) {
                if (jumlahBuku > 3) {
                    System.out.println("diskon: " + diskonNovel + " %");
                } else if (jumlahBuku <= 3) {
                    System.out.println("diskon: " + diskonNovel2 + " %");
                }
            } else {
                if (jumlahBuku > 3) {
                    System.out.println("Diskon: " + diskonSelainBuku + " %");
                } else {
                    System.out.println("Tidak ada diskon");
                }
            }
        }
    }
}

  