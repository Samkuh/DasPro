import java.util.Scanner;

public class Quiz2_02 {
    public static void main(String[] args) {
        
        String nama = "Achmad Labib Zainullah"; 
        int noAbsen = 0;             
        int k = noAbsen % 5;
        
        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kurir : ");
        int jumlahKurir = sc.nextInt();
        
        int i = 1;
        double ongkirTertinggi = 0;
        int kurirTerbaik = 0;
        int totalPaketBesar = 0;
        
        
        while (i <= jumlahKurir) {
            System.out.println("Kurir " + i);
            System.out.print("   Jumlah paket: ");
            int jumlahPaket = sc.nextInt();
            
            double totalOngkirKurir = 0;
            
            for (int j = 1; j <= jumlahPaket; j++) {
                System.out.print("      Berat paket " + j + " (kg): ");
                double berat = sc.nextDouble();
                
                double tarif = 0;
                if (berat < 1.0) {
                    tarif = 8000;
                } else if (berat <= 10.0) {
                    tarif = 20000;
                } else {
                    tarif = 40000;
                    totalPaketBesar++; 
                }
                
                
                double ongkirPaket = tarif + (k * 500);
                totalOngkirKurir += ongkirPaket;
            }
            
            double rataRata = 0;
            if (jumlahPaket > 0) {
                rataRata = totalOngkirKurir / jumlahPaket;
            }
            
            System.out.printf("   Total: %.0f | Rata per paket: %.2f\n", totalOngkirKurir, rataRata);
            
            if (i == 1 || totalOngkirKurir > ongkirTertinggi) {
                ongkirTertinggi = totalOngkirKurir;
                kurirTerbaik = i;
            }
            
            i++;
        }
        
        // Ringkasan Akhir
        System.out.println("Kurir terbaik      : " + kurirTerbaik);
        System.out.printf("Ongkir tertinggi   : %.0f\n", ongkirTertinggi);
        System.out.println("Jumlah paket besar : " + totalPaketBesar);
        
        sc.close();
    }
}
