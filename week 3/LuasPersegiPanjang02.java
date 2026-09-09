import java.util.Scanner;
public class LuasPersegiPanjang02 {
    
    public static void main(String[] args) {
        int panjang, lebar, luas;

        System.out.println("Kalkulator Perhitungan Luas Persegi Panjang");

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Panjang Persegi Panjang Anda");
        panjang = sc.nextInt();
        System.out.println("Masukkan Lebar Persegi Panjang Anda");
        lebar = sc.nextInt();

        luas = panjang*lebar;
        
        System.out.println("Ini Adalah Luas Persegi Panjang Anda");
        System.out.println(luas);

    }
}