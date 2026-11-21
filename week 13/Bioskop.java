public class Bioskop {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.println();
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println();
        System.out.println("Panjang Baris: " + penonton.length);

        System.out.println();
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang Baris Ke-" + (i + 1) + ": " + penonton[i].length);
        }

        System.out.println();
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang Baris: " + barisPenonton.length);
        }

        System.out.println();
        System.out.println("Penonton Baris Ke-3:");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.print(" | " + penonton[2][i] + " | ");
        }

        System.out.println("\n");
        System.out.println("Penonton Baris Ke-3:");
        for (String i : penonton[2]) {
            System.out.print(" | " + i + " | ");
        }

        System.out.println("\n");
        System.out.println("Penonton Pada Setiap Baris:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton Pada Baris Ke-" + (i + 1) + ": " + String.join(" | ", penonton[i]));
        }
    }
}
