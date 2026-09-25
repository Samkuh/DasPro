//Achmad Labib Zainullah //
// TI - 1D //
// QUIZ A //

import java.util.Scanner;

public class QuizALabib02 { 

    public static void main(String[] args) {
        
        System.out.println("TOKO HANDPONE ONLINE");

        // Deklarasi Variabel Yang Dibutuhkan //
        // Barang Yaitu Handphone, Kabel, Earphone //

        // Variabel Untuk Barang Handphone //
        int hargaJualHp, hargaBeliHp, biayaPengemasanHp, biayaPengirimanHp, 
        jumlahPenjualanHp, targetKeuntunganHp;

        // Variabel Untuk Barang Kabel //
        int hargaJualKabel, hargaBeliKabel, biayaPengemasanKabel, biayaPengirimanKabel, 
        jumlahPenjualanKabel, targetKeuntunganKabel;

        // Variabel Untuk Barang Earphone //
        int hargaJualEarphone, hargaBeliEarphone, biayaPengemasanEarphone, biayaPengirimanEarphone, 
        jumlahPenjualanEarphone, targetKeuntunganEarphone;

        // Variabel Untuk Keuntungan Total Semua Jenis Produk //
        double keuntunganHp, keuntunganKabel, keuntunganEarphone;

        // Variabel Untuk Memasukkan Diskon Per Barang //
        double setelahDiskonHp, setelahDiskonKabel, setelahDiskonEarphone;
        double diskonHargaHp, diskonHargaKabel, diskonHargaEarphone;

        // Variabel Untuk Keuntungan Per Barang //
        double keuntunganHpItem, keuntunganKabelItem, keuntunganEarphoneItem;

        // Variabel Untuk Faktor Kerusakan Per Barang //
        double faktorKerusakanHp, faktorKerusakanKabel, faktorKerusakanEarphone;

        // Variabel Untuk Jumlah Item Penghitung Keuntungan Per Barang //
        double jumlahKeuntunganHp, jumlahKeuntunganKabel, jumlahKeuntunganEarphone;

        // total keuntungan semua produk //
        double totalKeuntungan, totalJumlahKeuntungan;

        // ================================================================= //

        // Scanner Untuk Input Data Dari User //
        Scanner sc = new Scanner(System.in);

        // Input Data User Harga Jual Per Barang //
        System.out.print("Masukkan Harga Jual Handphone : ");
        hargaJualHp = sc.nextInt();
        System.out.print("Masukkan Harga Jual Kabel : ");
        hargaJualKabel = sc.nextInt();
        System.out.print("Masukkan Harga Jual Earphone :");
        hargaJualEarphone = sc.nextInt();

        // Input Data User Harga Beli Per Barang //
        System.out.print("Masukkan Harga Beli Handphone : ");
        hargaBeliHp = sc.nextInt();
        System.out.print("Masukkan Harga Beli Kabel : ");
        hargaBeliKabel = sc.nextInt();
        System.out.print("Masukkan Harga Beli Earphone : ");
        hargaBeliEarphone = sc.nextInt();

        // Input Data User Biaya Pengiriman Per Barang //
        System.out.print("Masukkan Biaya Pengiriman Handphone : ");
        biayaPengirimanHp = sc.nextInt();
        System.out.print("Masukkan Biaya Pengiriman Kabel : ");
        biayaPengirimanKabel = sc.nextInt();
        System.out.print("Masukkan Biaya Pengiriman Earphone : ");
        biayaPengirimanEarphone = sc.nextInt();

        // Input Data User Biaya Pengemasan Per Barang //
        System.out.print("Masukkan Biaya Pengemasan Handphone : ");
        biayaPengemasanHp = sc.nextInt();
        System.out.print("Masukkan Biaya Pengemasan Kabel : ");
        biayaPengemasanKabel = sc.nextInt();
        System.out.print("Masukkan Biaya Pengemasan Earphone : ");
        biayaPengemasanEarphone = sc.nextInt();

        // Input Data User Diskon Harga Per Barang //
        System.out.print("Masukkan Diskon Harga Handphone : ");
        diskonHargaHp = sc.nextDouble();
        System.out.print("Masukkan Diskon Harga Kabel : ");
        diskonHargaKabel = sc.nextDouble();
        System.out.print("Masukkan Diskon Harga Earphone : ");
        diskonHargaEarphone = sc.nextDouble();

        // ================================================================= //

        // Input Data User Jumlah Penjualan Per Barang //
        System.out.print("Masukkan Jumlah Penjualan Handphone : ");
        jumlahPenjualanHp = sc.nextInt();
        System.out.print("Masukkan Jumlah Penjualan Kabel : ");
        jumlahPenjualanKabel = sc.nextInt();
        System.out.print("Masukkan Jumlah Penjualan Earphone : ");
        jumlahPenjualanEarphone = sc.nextInt();

        // Input Data Faktor Kerusakan Per Barang //
        System.out.print("Masukkan Faktor Kerusakan Handphone : ");
        faktorKerusakanHp = sc.nextDouble();
        System.out.print("Masukkan Faktor Kerusakan Kabel : ");
        faktorKerusakanKabel = sc.nextDouble();
        System.out.print("Masukkan Faktor Kerusakan Earphone : ");
        faktorKerusakanEarphone = sc.nextDouble();

        // Target Keuntungan Per Produk //
        System.out.print("Masukkan JumlahTarget Keuntungan Handphone : ");
        targetKeuntunganHp = sc.nextInt();
        System.out.print("Masukkan Jumlah Target Keuntungan Kabel : ");
        targetKeuntunganKabel = sc.nextInt();
        System.out.print("Masukkan Jumlah Target Keuntungan Earphone : ");
        targetKeuntunganEarphone = sc.nextInt();

        // ================================================================= //

        // Perhitungan Diskon Per Produk //
        setelahDiskonHp = (double) ( hargaJualHp * diskonHargaHp );
        setelahDiskonKabel = (double) ( hargaJualKabel * diskonHargaKabel );
        setelahDiskonEarphone = (double) ( hargaJualEarphone * diskonHargaEarphone );

        // Perhitungan Keuntungan Per Produk //
        keuntunganHpItem = (double) ( hargaJualHp - hargaBeliHp - biayaPengemasanHp - biayaPengirimanHp - setelahDiskonHp );
        keuntunganKabelItem = (double) ( hargaJualKabel - hargaBeliKabel - biayaPengemasanKabel - biayaPengirimanKabel - setelahDiskonKabel );
        keuntunganEarphoneItem = (double) ( hargaJualEarphone - hargaBeliEarphone - biayaPengemasanEarphone - biayaPengirimanEarphone - setelahDiskonEarphone );

        // ================================================================= //

        // Perhitungan Jumlah Penghitung Keuntungan Per Produk //
        jumlahKeuntunganHp =  ( jumlahPenjualanHp - (faktorKerusakanHp * jumlahPenjualanHp) );
        jumlahKeuntunganKabel = ( jumlahPenjualanKabel - (faktorKerusakanKabel * jumlahPenjualanKabel) );
        jumlahKeuntunganEarphone = ( jumlahPenjualanEarphone - (faktorKerusakanEarphone * jumlahPenjualanEarphone) );

        // ================================================================= //

        // Perhitungan Keuntungan Total Per Produk //
        keuntunganHp = (double) ( keuntunganHpItem * jumlahKeuntunganHp );
        keuntunganKabel = (double) ( keuntunganKabelItem * jumlahKeuntunganKabel );
        keuntunganEarphone = (double) ( keuntunganEarphoneItem * jumlahKeuntunganEarphone );

        // Total Keuntungan Semua Produk //
        totalKeuntungan = ( keuntunganHp + keuntunganKabel + keuntunganEarphone );

        // Total Jumlah Item Penghitung Keuntungan Semua Produk //
        totalJumlahKeuntungan = ( jumlahKeuntunganHp + jumlahKeuntunganKabel + jumlahKeuntunganEarphone );

        // Total Target Keuntungan Semua Produk //
        int totalTargetKeuntungan = ( targetKeuntunganHp + targetKeuntunganKabel + targetKeuntunganEarphone );

        // ================================================================= //

        // 1. Output Hasil Perhitungan Keuntungan Per Produk //
        System.out.println("\n1. 1. Keuntungan Handphone : " + (int) keuntunganHp);
        System.out.println("1. 2. Keuntungan Kabel : " + (int) keuntunganKabel);
        System.out.println("1. 3. Keuntungan Earphone : " + (int) keuntunganEarphone);

        // 2. Output Keuntungan Total Semua Produk //
        System.out.println("2. Keuntungan Total Semua Produk : " + (int) totalKeuntungan);

        // 3. Output Rata-Rata Keuntungan Semua Produk //
        double rataRataKeuntungan = totalKeuntungan / totalJumlahKeuntungan;
        System.out.println("3. Rata-Rata Keuntungan Semua Produk : " + (double) rataRataKeuntungan);

        // 4. Output Persentase Keuntungan Total Produk Yang Diharapkan //
        double persentaseKeuntungan = (double) ( totalKeuntungan / totalTargetKeuntungan ) * 100;
        System.out.println("4. Persentase Keuntungan Total Produk Yang Diharapkan : " + (double) persentaseKeuntungan + "%");

    }
}    
