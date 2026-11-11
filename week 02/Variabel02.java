public class Variabel02 {

    public static void main(String[] args) {

        String salahSatuHobySayaAdalah = "membaca buku";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 18;
        double $ipk = 4.00, tinggi = 1.70;
        double beratBadan = 58.5;
        System.out.println("Hoby saya adalah " + salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %.2f, dengan tinggi badan %.2f", $ipk, tinggi));
        System.out.println(String.format("Saya berumur %d tahun, dengan berat badan %.2f", _umurSayaSekarang, beratBadan));
    }
}