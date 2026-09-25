import java.util.Scanner;
public class Segitiga02 {

    public static void main(String[] args) {

    byte alas, tinggi;
    float luas;

    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan tinggi: ");
    tinggi = sc.nextByte();
    System.out.println("Masukkan alas: ");
    alas = sc.nextByte();
    
    luas =(int) (alas * tinggi * 0.5);
    System.out.println("Hasil Dari Perkalian Segita Adalah: " +luas);

    }
}