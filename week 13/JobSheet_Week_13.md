# JOBSHEET 11 WEEK 13 - Array 2 Dimensi

**Identitas Mahasiswa:**
* **Nama:** [ Achmad Labib Zainullah ]
* **NIM:** [ 264107020149 ]
* **Kelas / No. Presensi:** [ TI - 1D / 02 ]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

 * Mendeklarasikan, menginstansiasi, dan menginisialisasi array 2 dimensi dalam bahasa Java.
 * Mengakses dan mengisi elemen array 2 dimensi menggunakan indeks baris dan kolom.
 * Memproses array 2 dimensi dengan nested loop, baik for maupun foreach.
 * Membuat array 2 dimensi dengan panjang baris yang berbeda (*jagged array*).
 * Menghitung nilai rata-rata per baris dan per kolom pada studi kasus nyata.


---

## 2: PRAKTIKUM

### Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi

#### Kode Program Java
```java

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
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

* **Pertanyaan 1:** Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0?
Jelaskan!
    * **Jawab:**
 
* **Pertanyaan 2:** Mengapa terdapat null pada daftar nama penonton? Jelaskan dari sisi nilai default array
    * **Jawab:**
 
* **Pertanyaan 3:** Lengkapi pengisian pada langkah 3 jika ada elemen yang belum terisi, lalu jalankan
kembali program.
    * **Jawab:**
      Berikut adalah contoh tampilan *output* setelah program dijalankan:
      ![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)
      

* **Pertanyaan 4:** Tambahkan kode berikut setelah langkah 4. Jelaskan fungsi dari penonton.length dan
penonton[0].length!
   *  1 System.out.println(penonton.length);
   *  2 System.out.println(penonton[0].length);
   *  3 System.out.println(penonton[1].length);
   *  4 System.out.println(penonton[2].length);
   *  5 System.out.println(penonton[3].length);

* **Jawab:**
      LABIB
* **Setelah Modifikasi**
```java

import java.util.Scanner;
import  java.util.Arrays;

public class ArrayBilangan_02 {

    public static void main(String[] args) {
        
        int[] bil = {5, 13, -7, 17};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("Bil [ " + i + " ] = " + bil[i] + " | Double = " + (bil[i] * 2));
        } 

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}

```
* **Pertanyaan 5:** Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan
penonton[3].length memiliki nilai yang sama? Mengapa?
    * **Jawab:**

* **Pertanyaan 6:** Modifikasi kode pada pertanyaan 4 untuk menampilkan panjang setiap baris
menggunakan for loop. Compile, run, lalu amati hasilnya.
   *  1 System.out.println(penonton.length);
   *  2 for (int i = 0; i < penonton.length; i++) {
   *  3 System.out.println("Panjang baris ke-" + (i + 1) + ": " +
   penonton[i].length);
* **Jawab:**
      Berikut adalah contoh tampilan *output* setelah program dijalankan:
      ![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

* **Pertanyaan 7:** Modifikasi kode pada pertanyaan 5 untuk menampilkan panjang setiap baris
menggunakan foreach loop. Compile, run, lalu amati hasilnya.
   *  1 System.out.println(penonton.length);
   *  2 for (String[] barisPenonton : penonton) {
   *  3 System.out.println("Panjang baris: " + barisPenonton.length):
* **Jawab:**
      Berikut adalah contoh tampilan *output* setelah program dijalankan:
      ![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)
 
* **Pertanyaan 8:** Tambahkan kode untuk menampilkan nama penonton pada baris ke-3 (indeks 2)
menggunakan for loop. Compile, run, lalu amati hasilnya.
   *  1 System.out.println("Penonton pada baris ke-3: ");
   *  2 for (int i = 0; i < penonton[2].length; i++) {
   *  3 System.out.println(penonton[2][i]);
* **Jawab:**
      Berikut adalah contoh tampilan *output* setelah program dijalankan:
      ![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)
  
* **Pertanyaan 9:** Modifikasi kode pada pertanyaan 8 menjadi perulangan dengan foreach loop. Compile,
run, lalu amati hasilnya.
   *  1 System.out.println("Penonton pada baris ke-3: ");
   *  2 for (String i : penonton[2]) {
   *  3 System.out.println(i);
* **Jawab:**
      Berikut adalah contoh tampilan *output* setelah program dijalankan:
      ![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)
  
* **Pertanyaan 10:** Modifikasi kode pada pertanyaan 9 untuk menampilkan nama penonton setiap baris.
Gunakan String.join(), compile, run, lalu amati hasilnya.
   *  1 for (int i = 0; i < penonton.length; i++) {
   *  2 System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + 
   *  3 String.join(", ", penonton[i]));
* **Jawab:**
      Berikut adalah contoh tampilan *output* setelah program dijalankan:
      ![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG) 

* **Pertanyaan 11:** Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan for loop?
    * **Jawab:**
 
* **Pertanyaan 12:** Berapa indeks baris maksimal untuk array penonton? Dari mana nilai itu diperoleh?
    * **Jawab:**
 
* **Pertanyaan 13:** Berapa indeks kolom maksimal untuk array penonton? Apakah nilainya sama untuk setiap
baris?
    * **Jawab:**
 
* **Pertanyaan 14:** Apa fungsi dari String.join()? Jelaskan parameter yang diterimanya.
    * **Jawab:**


### Percobaan 2: Scanner dan Perulangan untuk Input dan Output Array 2 Dimensi

#### Kode Program Java
```java

import java.util.Scanner;

public class Bioskop_With_Scanner_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan Baris (1 - 4): ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom (1 - 2): ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = sc.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }

            System.out.println();
            System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
            System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
            System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
            System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
            System.out.println();
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

* **Pertanyaan 1:** Apakah pengisian elemen array dari Scanner harus dilakukan secara berurutan mulai dari
indeks ke-0? Jelaskan!
    * **Jawab:**

* **Pertanyaan 2:** Modifikasi program agar menampilkan menu berikut:
   *  1 Input data penonton
   *  2 Tampilkan daftar penonton
   *  3 Exit

* **Setelah Modifikasi**
```java

import java.util.Scanner;
import  java.util.Arrays;

public class ArrayBilangan_02 {

    public static void main(String[] args) {
        
        int[] bil = {5, 13, -7, 17};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("Bil [ " + i + " ] = " + bil[i] + " | Double = " + (bil[i] * 2));
        } 

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}

```

* **Pertanyaan 3:** Modifikasi program untuk menangani nomor baris atau kolom yang tidak tersedia
(misalnya baris 7 atau kolom 0).

Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

* **Pertanyaan 4:** Pada menu 1, tampilkan peringatan jika kursi yang dipilih sudah terisi penonton lain, lalu
minta baris dan kolom kembali.

Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

* **Pertanyaan 5:** Pada menu 2, jika sebuah kursi kosong (null), tampilkan *** sebagai pengganti null.

Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)


### Percobaan 3: Array 2 Dimensi dengan Panjang Baris Berbeda

#### Kode Program Java
```java

import java.util.Arrays;
import java.util.Scanner;

public class MyNumbers {

    public static void main(String[] args) {

    int[][] myNumbers = new int[3][];
    myNumbers[0] = new int[5];
    myNumbers[1] = new int[3];
    myNumbers[2] = new int[1];

        

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }   
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

* **Pertanyaan 1:**  Apa fungsi dari Arrays.toString()?
    * **Jawab:**

* **Pertanyaan 2:** Pada Kode 16, Arrays.toString() dipanggil pada myNumbers[i]. Ganti pemanggilannya
menjadi Arrays.toString(myNumbers), lalu compile dan jalankan. Apa yang tampil?
Jelaskan.
    * **Jawab:**
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

* **Pertanyaan 3:** Jalankan juga System.out.println(Arrays.deepToString(myNumbers));. Bandingkan
hasilnya dengan Kode 16. Mengapa deepToString() diperlukan untuk array 2 dimensi?
    * **Jawab:**
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

* **Pertanyaan 4:**  Apa nilai default untuk elemen array dengan tipe data int?
    * **Jawab:**
 
* **Pertanyaan 5:** Tambahkan kode berikut untuk menampilkan panjang setiap baris. Compile dan run, lalu
amati hasilnya.
   *  1 for (int i = 0; i < myNumbers.length; i++) {
   *  2 System.out.println("Panjang baris ke-" + (i + 1) + ": " +
   *  3 myNumbers[i].length);
* **Jawab:**
      Berikut adalah contoh tampilan *output* setelah program dijalankan:
      ![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

* **Pertanyaan 6:**  Array myNumbers memiliki panjang yang berbeda untuk setiap barisnya. Apakah panjang
array dapat dimodifikasi setelah diinstansiasi? Jelaskan.
    * **Jawab:**
 
* **Pertanyaan 7:** Jalankan myNumbers[0] = new int[7]; setelah instansiasi, lalu cetak myNumbers.length dan
myNumbers[0].length. Bagian mana yang berubah? Mengapa?
   *  1 for (int i = 0; i < myNumbers.length; i++) {
   *  2 System.out.println("Panjang baris ke-" + (i + 1) + ": " +
   *  3 myNumbers[i].length);
* **Jawab:**
      Berikut adalah contoh tampilan *output* setelah program dijalankan:
      ![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)

### Percobaan 4: Studi Kasus SIAKAD

#### Kode Program Java
```java

import java.util.Scanner;

public class Bioskop_With_Scanner_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan Baris (1 - 4): ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom (1 - 2): ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = sc.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }

            System.out.println();
            System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
            System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
            System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
            System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
            System.out.println();
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2012/Foto/Array_Bilangan.PNG)
