import java.util.Scanner;

public class GajiKaryawan02 {

    public static void main(String[] args) {
        
        double gajiPokok;
        double bonus, hasilBonus, totalGaji;
        double tunjanganTransparan;
        double tunjanganMakan;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Gaji Pokok Anda");
        gajiPokok = sc.nextDouble();
        System.out.println("Masukkan Bonus Gaji Pokok Anda Dalam Persen");
        bonus = sc.nextDouble();
        System.out.println("Masukkan Tunjangan Transparan Anda");
        tunjanganTransparan = sc.nextDouble();
        System.out.println("Masukkan Tunjangan Makan Anda");
        tunjanganMakan = sc.nextDouble();
        
        hasilBonus = bonus*gajiPokok;
        totalGaji =(gajiPokok+tunjanganTransparan+tunjanganMakan+hasilBonus-(0.1*gajiPokok));

        System.out.println("\nIni Adalah Total Gaji Anda :" + (int) totalGaji);
        System.out.println("\nIni Adalah Bonus Anda :" +hasilBonus);

    }
}