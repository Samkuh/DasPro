// Achmad Labib Zainullah
// TI - 1D
// UTS QUIZ 06 
// 14 OKTOBER 2026

import java.util.Scanner;

public class StudiKasus06 {

    public static void main(String[] args) {

    String modeLevel;
    int jumlahZombieKalah;
    int koinPerZombie, persenBonus;
    double bonus, koinDasar, totalKoin, koinBonus, hadiahKhusus;

    Scanner sc = new Scanner(System.in);

    bonus = 0;
    koinPerZombie = 0;
    persenBonus = 0;
    hadiahKhusus = 0;

    System.out.print("Masukkan Mode Level ( Siang/Malam ): ");
    modeLevel = sc.nextLine();
    System.out.print("Masukkan jumlah Zombie yang dikalahakan: ");
    jumlahZombieKalah = sc.nextInt();

    if (modeLevel.equalsIgnoreCase("Siang")) {
        if (jumlahZombieKalah <= 10) {
            bonus = 0;
            persenBonus = 0;
            koinPerZombie = 10;
        } else if (jumlahZombieKalah >= 11 && jumlahZombieKalah <= 25) {
            bonus = 0.1;
            persenBonus = 10;
            koinPerZombie = 10;
        } else {
            bonus = 0.25;
            persenBonus = 25;
            koinPerZombie = 10;
        } 
    } else if (modeLevel.equalsIgnoreCase("Malam")) {
        if (jumlahZombieKalah <= 10) {
            bonus = 0;
            persenBonus = 0;
            koinPerZombie = 15;
        } else if (jumlahZombieKalah >= 11 && jumlahZombieKalah <= 25) {
            bonus = 0.15;
            persenBonus = 15;
            koinPerZombie = 15;
        } else {
            if (jumlahZombieKalah >= 26 && jumlahZombieKalah <= 40) {
            bonus = 0.3;
            persenBonus = 30;
            koinPerZombie = 15;
            } else {
            bonus = 0.3;
            persenBonus = 30;
            koinPerZombie = 15;
            hadiahKhusus = 100;
            } 
        } 
    } else {
        System.out.println("Mode salah atau jumlah zombie kurang dari 0");
        System.out.println("Periksa kembali data anda");
    }
    
    koinDasar = koinPerZombie * jumlahZombieKalah;
    koinBonus = bonus * koinDasar;
    totalKoin = koinBonus + koinDasar;

    System.out.println("Koin dasar anda: " +  koinDasar);
    System.out.println("Koin bonus anda: " + (int) koinBonus + " ( " + persenBonus + " % )");
    System.out.println("Total koin anda: " + (int) totalKoin );

    totalKoin = 0;
    totalKoin = koinBonus + koinDasar + hadiahKhusus;

    if (hadiahKhusus > 0) {
        System.out.println("Hadiah Tropi Malam: " + (int) hadiahKhusus);
        System.out.println("Total koin dengan tropi malam: " + (int) totalKoin );
    }
    }
}