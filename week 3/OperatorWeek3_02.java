public class OperatorWeek3_02 {

    public static void main(String[] args) {
        
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah evaluasi x = " + x);
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi x = " + x);

        System.out.println("\n====================");

        x = 10;
        System.out.println("\n++x = " + ++x);
        System.out.println("Setelah evaluasi x = " + x);
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi x = " + x);
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi x = " + x);

        System.out.println("\n====================");

        int y = 14;
        System.out.println("\nHasil dari x > y || y == x && y <= x adalah " + (x > y || y == x && y <= x));

        int l = 15;

        //Bitwise Xor//

        int z = x ^ y;
        int m = x ^ l;

        System.out.println("Hasil x ^ y adalah " + z);
        System.out.println("Hasil x ^ l adalah " + m);

        z %= 2;
        System.out.println("Hasil Akhir " +z);

    }
}
