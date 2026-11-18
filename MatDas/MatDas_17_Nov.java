import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class MatDas_17_Nov {

    public static void main(String[] args) {
        String input = "AABBCC";
        BigInteger totalKombinasi = hitungPermutasiUnik(input);

        System.out.println("Input: " + input);
        System.out.println("Jumlah String Berbeda Yang Bisa Dibuat: " + totalKombinasi);
    }

    public static BigInteger hitungPermutasiUnik(String str) {
        if (str == null || str.isEmpty()) {
            return BigInteger.ZERO;
        }

        Map<Character, Integer> frekuensiMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frekuensiMap.put(c, frekuensiMap.getOrDefault(c, 0) + 1);
        }

        BigInteger pembilang = faktorial(str.length());
        BigInteger penyebut = BigInteger.ONE;
        
        for (int jumlah : frekuensiMap.values()) {
            penyebut = penyebut.multiply(faktorial(jumlah));
        }

        return pembilang.divide(penyebut);
    }

    private static BigInteger faktorial(int n) {
        BigInteger hasil = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            hasil = hasil.multiply(BigInteger.valueOf(i));
        }
        return hasil;
    }
}
