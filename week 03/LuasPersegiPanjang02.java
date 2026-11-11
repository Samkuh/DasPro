import java.util.Scanner;
public class LuasPersegiPanjang02 {
    
    public static void main(String[] args) {
        int panjang, lebar, luas;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nKalkulator Perhitungan Luas Persegi Panjang");

        System.out.println("\nMasukkan Panjang Persegi Panjang Anda");
        panjang = sc.nextInt();
        System.out.println("Masukkan Lebar Persegi Panjang Anda");
        lebar = sc.nextInt();

        luas = panjang*lebar;
        
        System.out.println("\nIni Adalah Luas Persegi Panjang Anda");
        System.out.println(luas + " m2");

    }
}