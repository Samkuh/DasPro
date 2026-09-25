import java.util.Scanner;

public class TugasParkir02{

    public static void main(String[] args) {
        
        int jamParkir;
        int tarif = 2000;
        int total;

        Scanner sc = new Scanner(System.in);

        System.out.println("--- SISTEM PARKIR ---");
        System.out.print(" Masukkan jumlah jam parkir Anda: ");
        jamParkir = sc.nextInt();

        total = (jamParkir - 2) * 1000 + tarif;

        if (jamParkir <= 2) {
            System.out.println("Total tarif parkir: " + tarif);
        } else {
            System.out.println("Total tarif parkir: Rp. " + total);
        }
    }
} 