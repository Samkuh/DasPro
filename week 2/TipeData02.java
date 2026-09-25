public class TipeData02 {

    public static void main(String[] args) {
        
        char golonganDarah = 'L';
        byte jarak = (byte) 127;
        short jumlahPendudukDalamSatuDusun = 1000;
        float suhu = 60.55f;
        double suhu2 = 50.55d;
        double berat = 0.5467812345;
        long saldo = 1500000000;
        int angkaDesimal = 0xFF;

        System.out.println("Golongan darah\t\t\t\t\t\t\t: " + (short) golonganDarah);
        System.out.println("Jarak\t\t\t\t\t\t\t\t: " + jarak);
        System.out.println("Jumlah penduduk dalam satu dusun\t\t\t\t: " + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu\t\t\t\t\t\t\t\t: " + suhu);
        System.out.println("Suhu 2\t\t\t\t\t\t\t\t: " + suhu2);
        System.out.println("Berat\t\t\t\t\t\t\t\t: " + (float)berat);
        System.out.println("Saldo\t\t\t\t\t\t\t\t: " + saldo);
        System.out.println("Angka desimal\t\t\t\t\t\t\t: " + angkaDesimal);
    }
}