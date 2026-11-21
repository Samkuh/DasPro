import java.util.Scanner;

public class Bioskop_With_Scanner_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan Nama: ");
                        nama = sc.nextLine();


                        while (true) {
                            while (true) {
                                System.out.print("Masukkan Baris (1 - 4): ");
                                baris = sc.nextInt();
                                if (baris >= 1 && baris <= penonton.length) {
                                    break;
                                }
                                System.out.println("Nomor baris tidak tersedia! Harap masukkan baris 1 - 4.");
                                System.out.println();
                            }
                            
                            while (true) {
                                System.out.print("Masukkan Kolom (1 - 2): ");
                                kolom = sc.nextInt();
                                if (kolom >= 1 && kolom <= penonton[0].length) {
                                    break;
                                }
                                System.out.println("Nomor kolom tidak tersedia! Harap masukkan kolom 1 - 2.");
                                System.out.println();
                            }
                            sc.nextLine();

                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Peringatan: Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "!");
                                System.out.println("Silakan masukkan ulang nomor baris dan kolom.");
                                System.out.println();
                            } else {
                                break;
                            }
                        }    

                            penonton[baris -1][kolom - 1] = nama;
                            System.out.println("Data Penonton Berhasil Disimpan");
                            System.out.println();

                            System.out.print("Apakah Ingin Input Penonton Lainnya: (y/n) ");
                            pilihan = sc.nextLine();
                            System.out.println();

                            if (pilihan.equalsIgnoreCase("n")) {
                                break;
                            }
                    }
                    break;
                       
                
                case 2:
                    System.out.println("\n--- DAFTAR PENONTON ---");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println();
                        System.out.println("Baris Ke- " + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            String tampil = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print(tampil + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("--- TERIMA KASIH PROGRAM SELESAI ---");
                    sc.close();
                    return;    
                default:
                    System.out.println("\n--- MENU TIDAK VALID. SILAHKAN PILIH ANGKA 1, 2, 3. TERIMA KASIH ---");
                    break;
            }
        }
    }
}