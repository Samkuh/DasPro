import java.util.Scanner;

public class KubusLimas_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu, sisi, tinggi, L, vk, lpk;
        double vlp;

        System.out.println("--- PILIHAN MENU ---");
        System.out.println("0. Keluar Program");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Volume Kubus");
        System.out.println("3. Luas Permukaan Kubus");
        System.out.println("4. Volume Limas Persegi");

        do {

        System.out.println();
        System.out.print("Masukkan menu yang ingin anda akses: ");
        menu = sc.nextInt();


            switch (menu) {
                case 1:

                System.out.print("Masukkan Panjang Sisi: ");
                sisi = sc.nextInt();

                System.out.println();

                L = luasPersegi(sisi);
                System.out.println("Luas Persegi: " + L);
                System.out.println();

                break;


                case 2:

                System.out.print("Masukkan Panjang Sisi: ");
                sisi = sc.nextInt();

                System.out.println();

                vk = volumeKubus(sisi);
                System.out.println("Volume Kubus: " + vk);
                System.out.println();

                break;

                case 3:

                System.out.print("Masukkan Panjang Sisi: ");
                sisi = sc.nextInt();

                System.out.println();

                lpk = luasPermukaanKubus(sisi);
                System.out.println("Luas Permukaan Kubus: " + lpk);
                System.out.println();

                break;

                case 4:

                System.out.print("Masukkan Panjang Sisi: ");
                sisi = sc.nextInt();
                System.out.print("Masukkan Panjang Tinggi: ");
                tinggi = sc.nextInt();

                System.out.println();

                vlp = volumeLimasPersegi(sisi, tinggi);
                System.out.printf("Volume Limas Persegi %.2f", vlp);
                System.out.println();

                break;

                case 0:
                    
                    break;
            
                default:
                    break;
            }

        } while (menu != 0);
    }

    static int luasPersegi(int s) {
        int Luas = s * s;
        return Luas;
    }

    static int volumeKubus(int s) {
        int volumeKubus = luasPersegi(s) * s;
        return volumeKubus;
    }

    static int luasPermukaanKubus(int s) {
        int luasPermukaan = luasPersegi(s) * 6;
        return luasPermukaan;
    }

    static double volumeLimasPersegi(int s, int t) {
        double volumeLimas = luasPersegi(s) * t / 3.0;
        return volumeLimas;
    }
}