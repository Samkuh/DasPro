# JOBSHEET 12 WEEK 14 - Fungsi 1

**Identitas Mahasiswa:**
* **Nama:** [ Achmad Labib Zainullah ]
* **NIM:** [ 264107020149 ]
* **Kelas / No. Presensi:** [ TI - 1D / 02 ]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

 * Memahami penggunaan fungsi *static* pada Java dengan parameter dan mengembalikan nilai.
 * Membuat program menggunakan fungsi *static* dan mengeksekusi fungsi tersebut.
 * Menggunakan parameter *varargs* dan membandingkan program yang ditulis dengan fungsi dan tanpa fungsi.


---

## 2: PRAKTIKUM

### Percobaan 1: Membuat Fungsi Tanpa Parameter

#### Kode Program Java
```java

public class Kafe_02 {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        System.out.println("---- MENU RESTO KAFE ----");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("---------------------------");
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2014/Foto/Kafe_02.PNG)

* **Pertanyaan 1:** Apakah fungsi tanpa parameter selalu harus bertipe `void`? Jelaskan, lalu berikan satu contoh fungsi tanpa parameter yang mengembalikan nilai dalam konteks program kafe (misalnya `jumlahMenu()` yang mengembalikan nilai 6).
    * **Jawab:** Tidak. Tipe kembalian (`void` atau bukan) tidak ada hubungannya dengan ada atau tidaknya parameter. Fungsi tanpa parameter boleh bertipe `int`, `double`, `String`, dan sebagainya, selama fungsi tersebut diakhiri dengan `return` yang sesuai tipenya. Contoh:
```java

public static int jumlahMenu() {
    return 6;
}

```
      Pemanggilannya: `int jumlah = jumlahMenu();`, maka variabel `jumlah` berisi 6.

* **Pertanyaan 2:** Panggil fungsi `Menu()` sebanyak tiga kali di dalam fungsi `main`, lalu jalankan program. Bandingkan dengan cara menampilkan daftar menu tiga kali dengan menulis langsung perintahnya di `main` tanpa fungsi: berapa baris kode yang harus ditulis pada masing-masing cara? Apa keuntungan menggunakan fungsi?

* **Setelah Modifikasi**
```java

public class Kafe_02 {

    public static void main(String[] args) {
        Menu();
        Menu();
        Menu();
    }

    public static void Menu() {
        System.out.println("---- MENU RESTO KAFE ----");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("---------------------------");
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%2014/Foto/Kafe_02_02.PNG)

    * **Jawab:**
        * **Dengan fungsi:** di `main` cukup 3 baris (`Menu();` sebanyak 3 kali). Isi menu (8 baris `println`) hanya ditulis satu kali di dalam fungsi `Menu()`.
        * **Tanpa fungsi:** 8 baris `println` harus ditulis ulang 3 kali di `main`, sehingga totalnya 24 baris.
        * **Keuntungan fungsi:** kode lebih ringkas, tidak ada pengulangan penulisan (*reusable*), dan mudah dirawat, karena jika isi menu berubah cukup diubah di satu tempat saja.

* **Pertanyaan 3:** Hapus kata kunci `static` pada fungsi `Menu()`, lalu kompilasi program. Pesan *error* apa yang muncul? Jelaskan mengapa *error* tersebut terjadi.
    * **Jawab:** Muncul pesan *error*: `non-static method Menu() cannot be referenced from a static context`. Hal ini terjadi karena `main` bersifat `static` (berjalan tanpa membuat objek), sedangkan `Menu()` yang tidak `static` adalah milik objek. Fungsi non-static hanya bisa dipanggil lewat objek (instance) dari class tersebut, sehingga `main` tidak bisa memanggilnya secara langsung.

* **Pertanyaan 4:** Pindahkan deklarasi fungsi `Menu()` ke bawah fungsi `main`, lalu jalankan program. Apakah hasilnya berubah? Uraikan alur eksekusi program, mulai dari program dijalankan sampai daftar menu tampil di layar, lalu jelaskan mengapa urutan penulisan fungsi di dalam class tidak memengaruhi urutan eksekusinya.
    * **Jawab:** Hasilnya tidak berubah (pada program ini `Menu()` memang sudah berada di bawah `main`). Alur eksekusinya:
        1. JVM menjalankan program dan mencari fungsi `main` sebagai titik awal.
        2. Eksekusi dimulai dari baris pertama di dalam `main`, yaitu `Menu();`.
        3. Program berpindah (melompat) ke definisi fungsi `Menu()`, lalu menjalankan semua `println` di dalamnya sehingga daftar menu tampil di layar.
        4. Setelah `}` penutup `Menu()`, program kembali ke `main` pada baris setelah pemanggilan.
        5. Tidak ada baris lagi di `main`, sehingga program selesai.

      Urutan penulisan tidak memengaruhi eksekusi karena compiler Java membaca seluruh isi class terlebih dahulu dan mengenali semua fungsi yang ada. Eksekusi selalu dimulai dari `main`, dan fungsi lain hanya berjalan ketika dipanggil, bukan berdasarkan urutan penulisannya.


### Percobaan 2: Membuat Fungsi Dengan Parameter

#### Kode Program Java
```java

public class Kafe_2_02 {

    public static void main(String[] args) {
        Menu("Labib", true);
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang. " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member. Dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println();
        System.out.println("---- MENU RESTO KAFE ----");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("---------------------------");
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 2](/week%2014/Foto/Kafe_2_02.PNG)

Setelah pemanggilan diubah menjadi `Menu("Budi", false)`:

![Gambar Output Percobaan 2](/week%2014/Foto/Kafe_2_02_Budi.PNG)

* **Pertanyaan 1:** Apakah kegunaan parameter di dalam fungsi? Jelaskan dengan mengacu pada parameter `namaPelanggan` dan `isMember` pada fungsi `Menu()`: bagaimana nilai yang dikirim dari `main` memengaruhi output? Bandingkan hasil `Menu("Andi", true)` dan `Menu("Budi", false)` pada langkah 4.
    * **Jawab:** Parameter berfungsi untuk menerima data dari luar fungsi sehingga satu fungsi dapat menghasilkan output yang berbeda-beda sesuai data yang dikirim, tanpa harus menulis ulang fungsinya.
        * `Menu("Andi", true)`: tampil "Selamat Datang. Andi!" dan pesan "Anda Adalah Member. Dapatkan diskon 10%...", lalu daftar menu.
        * `Menu("Budi", false)`: tampil "Selamat Datang. Budi!" tanpa pesan member (karena `if (isMember)` bernilai false), lalu daftar menu.

      Jadi `namaPelanggan` menentukan nama yang disapa, dan `isMember` menentukan apakah pesan diskon member ditampilkan.

* **Pertanyaan 2:** Jelaskan perbedaan antara parameter dan argumen dengan menunjuk langsung pada deklarasi `Menu(String namaPelanggan, boolean isMember)` dan pemanggilan `Menu("Andi", true)`.
    * **Jawab:**
        * **Parameter** adalah variabel yang dideklarasikan pada definisi fungsi, yaitu `String namaPelanggan` dan `boolean isMember` pada `Menu(String namaPelanggan, boolean isMember)`. Parameter berfungsi sebagai "wadah" penerima nilai.
        * **Argumen** adalah nilai nyata yang dikirim saat fungsi dipanggil, yaitu `"Andi"` dan `true` pada `Menu("Andi", true)`. Argumen `"Andi"` masuk ke parameter `namaPelanggan`, dan `true` masuk ke `isMember`.

* **Pertanyaan 3:** Coba dua pemanggilan berikut secara bergantian: `Menu()` dan `Menu(true, "Andi")`. Tuliskan pesan *error* yang muncul untuk masing-masing pemanggilan. Berdasarkan kedua *error* tersebut, aturan apa saja yang harus dipenuhi argumen ketika memanggil sebuah fungsi?
    * **Jawab:**
        * `Menu()` : *error* `method Menu in class Kafe_2_02 cannot be applied to given types; required: String,boolean; found: no arguments; reason: actual and formal argument lists differ in length`. Penyebabnya jumlah argumen tidak sesuai.
        * `Menu(true, "Andi")` : *error* `incompatible types: boolean cannot be converted to String`. Penyebabnya urutan/tipe argumen tidak sesuai dengan parameter.

      Aturan yang harus dipenuhi argumen: (1) **jumlah** argumen harus sama dengan jumlah parameter, (2) **tipe data** tiap argumen harus sesuai dengan tipe parameter, dan (3) **urutan** argumen harus sama dengan urutan parameter.

* **Pertanyaan 4:** Modifikasi program sebagai berikut:
   *  a. Tambahkan parameter `jamKunjung` (int) pada fungsi `Menu()`. Jika `jamKunjung` bernilai 14 sampai 16, tampilkan pesan "Happy Hour! Diskon 20% untuk semua minuman".
   *  b. Ubah fungsi `main` agar nama pelanggan, status member (y/n), dan jam kunjung dibaca dari *keyboard* menggunakan `Scanner`, lalu dikirim sebagai argumen ke `Menu()`.
   *  c. Uji program untuk pelanggan "Budi" yang merupakan member dan datang pukul 15.

* **Setelah Modifikasi**
```java

import java.util.Scanner;

public class Kafe_2_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = sc.nextLine();

        System.out.print("Apakah Member? (y/n): ");
        String statusMember = sc.nextLine();
        boolean isMember = statusMember.equalsIgnoreCase("y");

        System.out.print("Masukkan Jam Kunjung (0 - 23): ");
        int jam = sc.nextInt();

        System.out.println();
        Menu(nama, isMember, jam);

        sc.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat Datang. " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member. Dapatkan diskon 10% untuk setiap pembelian");
        }

        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println();
        System.out.println("---- MENU RESTO KAFE ----");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("---------------------------");
    }
}

```

#### Hasil Running / Screenshot Output (Budi, member, pukul 15)
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 2](/week%2014/Foto/Kafe_2_02_01.PNG)

* **Pertanyaan 5:** Perhatikan potongan kode berikut. Tuliskan output yang dihasilkan, lalu jelaskan mengapa perubahan nilai `nama` di dalam fungsi `ubahNama()` tidak memengaruhi variabel `nama` di fungsi `main`. Berdasarkan hasil tersebut, apakah parameter sama dengan variabel di `main`? Jelaskan.
```java

public static void ubahNama(String nama) {
    nama = "Tamu";
    System.out.println("Di dalam fungsi: " + nama);
}

public static void main(String[] args) {
    String nama = "Andi";
    ubahNama(nama);
    System.out.println("Di main: " + nama);
}

```
    * **Jawab:** Output yang dihasilkan:
```
Di dalam fungsi: Tamu
Di main: Andi
```
      Perubahan tidak memengaruhi `main` karena Java menggunakan *pass by value*: saat `ubahNama(nama)` dipanggil, yang dikirim adalah **salinan** nilai dari variabel `nama` di `main`. Parameter `nama` di `ubahNama()` adalah variabel lokal yang berbeda, hanya berlaku di dalam fungsi tersebut. Mengubah salinan tidak mengubah variabel aslinya. Jadi parameter **tidak sama** dengan variabel di `main`; keduanya hanya kebetulan bernama sama, tetapi merupakan dua variabel terpisah dengan lingkup (*scope*) masing-masing.


### Percobaan 3: Membuat Fungsi dengan Nilai Kembalian

#### Kode Program Java
```java

import java.util.Scanner;

public class Kafe_3_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Labib", true);

        System.out.println();
        System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan Jumlah Item Yang Ingin Dipesan: ");
        int banyakItem = sc.nextInt();

        int totalBayar = hitungTotalHarga02(pilihanMenu, banyakItem);

        System.out.println();
        System.out.println("Total harga untuk pesanan Anda: Rp. " + totalBayar);

    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang. " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member. Dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println();
        System.out.println("---- MENU RESTO KAFE ----");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("---------------------------");
    }

    public static int hitungTotalHarga02(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 3](/week%2014/Foto/Kafe_3_02.PNG)

* **Pertanyaan 1:** Sebutkan tipe data nilai kembalian dan parameter fungsi `hitungTotalHarga02` serta arti masing-masing parameter dalam konteks program kafe. Bandingkan dengan fungsi `Menu()` yang bertipe `void`. Kapan suatu fungsi membutuhkan nilai kembalian dan kapan tidak?
    * **Jawab:**
        * Tipe data nilai kembalian: `int` (total harga dalam rupiah).
        * Parameter `int pilihanMenu`: nomor menu yang dipilih pelanggan (1 - 6), dipakai untuk mengambil harga dari array `hargaItems` (indeks `pilihanMenu - 1`).
        * Parameter `int banyakItem`: jumlah porsi yang dipesan, sebagai pengali harga.
        * `Menu()` bertipe `void` karena tugasnya hanya menampilkan daftar menu ke layar dan tidak menghasilkan nilai untuk dipakai pemanggil.
        * Fungsi **membutuhkan nilai kembalian** jika hasilnya akan dipakai lagi oleh pemanggil (disimpan ke variabel, dihitung lanjut, atau dibandingkan), seperti `totalBayar`. Fungsi **tidak membutuhkannya** (`void`) jika hanya menjalankan aksi, misalnya mencetak tampilan.

* **Pertanyaan 2:** Lakukan dua percobaan berikut, lalu bandingkan hasilnya:
   *  a. Panggil `hitungTotalHarga02` tanpa menyimpan nilai kembaliannya ke variabel `totalBayar`.
   *  b. Hapus baris `return hargaTotal;` lalu kompilasi.
Mana yang menimbulkan *error* dan mana yang tidak? Apa yang dapat disimpulkan tentang aturan penggunaan `return`?
    * **Jawab:**
        * **Percobaan a** (`hitungTotalHarga02(pilihanMenu, banyakItem);` tanpa disimpan): **tidak error**. Program tetap berjalan, namun nilai kembaliannya dibuang sehingga tidak bisa ditampilkan.
        * **Percobaan b** (hapus `return hargaTotal;`): **error** `missing return statement`, karena fungsi bertipe `int` wajib mengembalikan nilai `int`.
        * **Kesimpulan:** fungsi yang bertipe selain `void` wajib memiliki `return` dengan tipe yang sesuai di setiap jalur eksekusinya, sedangkan pemanggil boleh saja mengabaikan nilai kembaliannya.

* **Pertanyaan 3:** Jalankan program lalu masukkan nomor menu 7, kemudian 0. *Error* apa yang muncul dan apa penyebabnya? Selanjutnya, modifikasi program agar:
   *  a. pengguna dapat memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus) dan program menampilkan total keseluruhan pesanan;
   *  b. nomor menu di luar 1 sampai 6 ditolak dengan pesan "Menu tidak tersedia".
    * **Jawab:** Saat memasukkan nomor menu 7 muncul `ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6`, dan saat memasukkan 0 muncul `ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6`. Penyebabnya, array `hargaItems` hanya punya indeks 0 sampai 5, sedangkan nomor 7 diakses sebagai indeks 6 dan nomor 0 sebagai indeks -1, sehingga keduanya di luar batas array.

#### Hasil Running / Screenshot Output (error)
![Gambar Output Percobaan 3](/week%2014/Foto/Kafe_3_02_Error.PNG)

* **Setelah Modifikasi (soal 3 dan 4)**

Pada modifikasi ini ditambahkan juga fungsi `hitungDiskon` (soal 4). Diskon member (10%) dijumlahkan dengan diskon kode promo, dan perhitungan ditulis sebagai `total * persen / 100` (perkalian dahulu, baru pembagian) agar hasil pada tipe `int` tidak terpotong menjadi 0.
```java

import java.util.Scanner;

public class Kafe_3_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isMember = true;

        Menu("Labib", isMember);

        int totalHarga = 0;

        System.out.println();
        while (true) {
            System.out.print("Masukkan nomor menu yang ingin anda pesan (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
                continue;
            }

            System.out.print("Masukkan Jumlah Item Yang Ingin Dipesan: ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga02(pilihanMenu, banyakItem);
        }
        sc.nextLine();

        System.out.print("Masukkan Kode Promo (kosongkan jika tidak ada): ");
        String kodePromo = sc.nextLine();

        int diskon = hitungDiskon(totalHarga, kodePromo, isMember);
        int totalBayar = totalHarga - diskon;

        System.out.println();
        System.out.println("Total Harga   : Rp. " + totalHarga);
        System.out.println("Besar Diskon  : Rp. " + diskon);
        System.out.println("Total Bayar   : Rp. " + totalBayar);

        sc.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang. " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member. Dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println();
        System.out.println("---- MENU RESTO KAFE ----");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("---------------------------");
    }

    public static int hitungTotalHarga02(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon += total * 50 / 100;
        } else if (kodePromo.equals("DISKON30")) {
            diskon += total * 30 / 100;
        } else {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            diskon += total * 10 / 100;
        }

        return diskon;
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 3](/week%2014/Foto/Kafe_3_02_01.PNG)

* **Pertanyaan 4:** Buat fungsi baru `hitungDiskon(int total, String kodePromo, boolean isMember)` yang mengembalikan nominal diskon (kode promo "DISKON50" = 50%, "DISKON30" = 30%, selain itu tampilkan "Kode promo invalid"; member mendapat tambahan 10%; `main` menampilkan total harga, besar diskon, dan total yang harus dibayar).
    * **Jawab:** Fungsi `hitungDiskon` sudah dibuat pada kode "Setelah Modifikasi" di atas. Contoh: pesan Kopi Hitam 2 porsi dan Latte 1 porsi (total Rp. 52.000), kode promo `DISKON50`, dan member, maka diskon = 26.000 + 5.200 = Rp. 31.200 (sesuai rumus `total * persen / 100`), sehingga total bayar = Rp. 20.800.


### Percobaan 4: Fungsi Varargs

#### Kode Program Java
```java

public class PengunjungKafe_02 {

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println(". " + namaPengunjung[i]);
        }
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan. Terlihat bahwa jumlah argumen yang dikirim bisa berbeda-beda (3, 1, dan 4 argumen), dan fungsi tetap dapat menampilkan semuanya:

![Gambar Output Percobaan 4](/week%2014/Foto/PengunjungKafe_02.PNG)

* **Pertanyaan 1:** Jelaskan arti penulisan parameter `String... namaPengunjung` pada Percobaan 4. Berapa banyak argumen yang boleh dikirim ke fungsi tersebut? Buktikan dengan memanggil `daftarPengunjung()` tanpa argumen: apakah program *error* saat kompilasi, *error* saat dijalankan, atau tetap berjalan? Bagaimana outputnya?
    * **Jawab:** Penulisan `String... namaPengunjung` adalah *varargs* (*variable-length arguments*), artinya fungsi dapat menerima **nol atau lebih** argumen bertipe `String`. Jumlah argumen yang boleh dikirim tidak dibatasi (0, 1, 2, dan seterusnya). Jika dipanggil `daftarPengunjung()` tanpa argumen, program **tidak error** (baik saat kompilasi maupun saat dijalankan) dan tetap berjalan. Outputnya hanya judul `Daftar Nama Pengunjung:` tanpa nama apa pun, karena `namaPengunjung.length` bernilai 0 sehingga perulangan tidak dijalankan.

* **Pertanyaan 2:** Di dalam fungsi, `namaPengunjung` diperlakukan sebagai array. Buktikan hal tersebut dengan dua cara berikut:
   *  a. Modifikasi fungsi `daftarPengunjung` menggunakan perulangan for-each.
   *  b. Jalankan pemanggilan pada potongan kode berikut:
      `String[] tamu = {"Ali", "Budi", "Citra"}; daftarPengunjung(tamu);`

* **Setelah Modifikasi**
```java

public class PengunjungKafe_02 {

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung();

        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(tamu);
    }

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println(". " + nama);
        }
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 4](/week%2014/Foto/PengunjungKafe_02_02.PNG)

    * **Jawab:** Fungsi dapat dimodifikasi dengan perulangan for-each (`for (String nama : namaPengunjung)`) dan dapat dipanggil dengan mengirim array `String[] tamu` secara langsung. Hal ini membuktikan bahwa parameter varargs sebenarnya adalah **array** di dalam fungsi. Varargs hanyalah penulisan yang lebih praktis, karena pemanggil boleh mengirim argumen satu per satu (Java otomatis membungkusnya menjadi array) atau langsung berupa array.

* **Pertanyaan 3:** Ubah fungsi menjadi `daftarPengunjung(int nomorMeja, String... namaPengunjung)` sehingga dapat menampilkan nomor meja beserta daftar pengunjungnya. Kemudian coba ubah deklarasinya menjadi kedua bentuk berikut, lalu kompilasi:
   *  a. `(String... namaPengunjung, int nomorMeja)`
   *  b. `(String... namaPengunjung, int... nomorMeja)`
Berdasarkan hasilnya, sebutkan dua aturan penulisan parameter varargs di Java.

* **Setelah Modifikasi**
```java

public class PengunjungKafe_02 {

    public static void main(String[] args) {
        daftarPengunjung(1, "Ali", "Budi", "Citra");
        daftarPengunjung(2, "Andi");
        daftarPengunjung(3, "Doni", "Eti", "Fahmi", "Galih");
    }

    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Meja Nomor " + nomorMeja);
        System.out.println("Daftar Nama Pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println(". " + nama);
        }
        System.out.println();
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 4](/week%2014/Foto/PengunjungKafe_02_03.PNG)

    * **Jawab:**
        * Bentuk a. `(String... namaPengunjung, int nomorMeja)` : *error* `varargs parameter must be the last parameter`.
        * Bentuk b. `(String... namaPengunjung, int... nomorMeja)` : *error* yang sama, `varargs parameter must be the last parameter`.
        * **Dua aturan penulisan varargs di Java:** (1) parameter varargs **harus berada di posisi paling akhir** dalam daftar parameter, dan (2) dalam satu fungsi **hanya boleh ada satu** parameter varargs.

* **Pertanyaan 4:** Buat fungsi `hitungTotalBelanja(int... harga)` yang mengembalikan jumlah seluruh harga yang dikirimkan. Uji fungsi tersebut dengan 1, 3, dan 5 argumen, lalu tampilkan hasilnya di fungsi `main`.

* **Setelah Modifikasi**
```java

public class TotalBelanja_02 {

    public static void main(String[] args) {
        System.out.println("Total 1 argumen : Rp. " + hitungTotalBelanja(15000));
        System.out.println("Total 3 argumen : Rp. " + hitungTotalBelanja(15000, 20000, 22000));
        System.out.println("Total 5 argumen : Rp. " + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));
    }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        return total;
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan (15.000, 57.000, dan 79.000):

![Gambar Output Percobaan 4](/week%2014/Foto/TotalBelanja_02.PNG)


### Percobaan 5: Pembuatan Kode Program dengan Fungsi versus Tanpa Fungsi

#### Kode Program Java (Tanpa Fungsi)
```java

import java.util.Scanner;

public class HitungBalokTanpaFungsi_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan Panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        l = sc.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t = sc.nextInt();

        L = p * l;
        System.out.println();
        System.out.println("Luas persegi panjang adalah: " + L);

        vol = p * l * t;
        System.out.println("Volume Balok Adalah: " + vol);

        sc.close();
    }
}

```

#### Kode Program Java (Dengan Fungsi)
```java

import java.util.Scanner;

public class HitungBalok_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan Panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        l = sc.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println();
        System.out.println("Luas persegi panjang adalah: " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok Adalah: " + vol);

        sc.close();
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan dengan input panjang = 4, lebar = 3, dan tinggi = 5:

![Gambar Output Percobaan 5](/week%2014/Foto/HitungBalok_02.PNG)

* **Pertanyaan 1:** Jalankan program `HitungBalok` versi tanpa fungsi dan versi dengan fungsi menggunakan input panjang = 4, lebar = 3, dan tinggi = 5. Apakah outputnya sama? Uraikan urutan eksekusi pada versi dengan fungsi, mulai dari program dijalankan sampai luas persegi panjang dan volume balok tampil, termasuk saat fungsi `hitungLuas` dipanggil dari dalam `hitungVolume`.
    * **Jawab:** Ya, outputnya sama, yaitu `Luas persegi panjang adalah: 12` dan `Volume Balok Adalah: 60`. Urutan eksekusi pada versi dengan fungsi:
        1. Program dimulai dari `main`; nilai `p = 4`, `l = 3`, `t = 5` dibaca dari keyboard.
        2. `L = hitungLuas(p, l)` dipanggil, sehingga program melompat ke `hitungLuas(4, 3)`, menghitung 4 * 3 = 12, lalu mengembalikan 12 ke `main`. Nilai `L = 12` dicetak.
        3. `vol = hitungVolume(t, p, l)` dipanggil, sehingga program melompat ke `hitungVolume(5, 4, 3)` (`tinggi = 5`, `a = 4`, `b = 3`).
        4. Di dalam `hitungVolume`, dipanggil `hitungLuas(a, b)` = `hitungLuas(4, 3)` yang mengembalikan 12.
        5. `hitungVolume` menghitung 12 * 5 = 60 lalu mengembalikannya ke `main`. Nilai `vol = 60` dicetak, kemudian program selesai.

* **Pertanyaan 2:** Perhatikan program berikut. Tanpa menjalankannya, tuliskan output program tersebut, lalu jalankan untuk memeriksa jawaban Anda. Jelaskan urutan pemanggilan fungsi yang terjadi pada baris 18 sampai 21.
```java

public class LacakFungsi {
    static int kali2(int x) {
        return x * 2;
    }

    static int tambah(int a, int b) {
        return a + b;
    }

    static void cetak(int n) {
        for (int i = n; i > 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a = kali2(3);
        int b = tambah(a, kali2(1));
        cetak(b);
        cetak(tambah(b, -a) + 1);
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 5](/week%2014/Foto/LacakFungsi.PNG)

    * **Jawab:** Output program:
```
8 6 4 2 
3 1 
```
      Urutan pemanggilan pada baris 18 sampai 21:
        * **Baris 18:** `kali2(3)` dipanggil, mengembalikan 6, sehingga `a = 6`.
        * **Baris 19:** argumen dievaluasi lebih dulu, yaitu `kali2(1)` = 2. Lalu `tambah(6, 2)` dipanggil dan mengembalikan 8, sehingga `b = 8`.
        * **Baris 20:** `cetak(8)` dijalankan dengan `i = 8, 6, 4, 2` (berkurang 2 tiap putaran), mencetak `8 6 4 2`, lalu pindah baris.
        * **Baris 21:** `tambah(b, -a)` = `tambah(8, -6)` = 2, lalu ditambah 1 menjadi 3. Kemudian `cetak(3)` dijalankan dengan `i = 3, 1`, mencetak `3 1`, lalu pindah baris.

* **Pertanyaan 3:** Fungsi `hitungVolume` dideklarasikan dengan urutan parameter `(int tinggi, int a, int b)` dan dipanggil dengan `hitungVolume(t, p, l)`. Jika pemanggilan diubah menjadi `hitungVolume(p, l, t)`, apakah hasilnya berbeda? Mengapa? Berikan satu contoh fungsi lain yang hasilnya menjadi salah jika urutan argumennya tertukar. Apakah *compiler* dapat mendeteksi kesalahan tersebut? Bandingkan dengan pemanggilan `Menu(true, "Andi")` di Percobaan 2.
    * **Jawab:** Hasilnya **tidak berbeda** (tetap 60). Jika dipanggil `hitungVolume(p, l, t)`, maka `tinggi = p`, `a = l`, `b = t`, sehingga volume = (l * t) * p. Perkalian bersifat komutatif, jadi hasilnya tetap sama dengan p * l * t.
      Contoh fungsi yang hasilnya salah jika urutan argumen tertukar adalah fungsi yang tidak komutatif, misalnya `static int kurang(int a, int b) { return a - b; }`. Pemanggilan `kurang(10, 3)` menghasilkan 7, tetapi `kurang(3, 10)` menghasilkan -7. Contoh lain: `volumeLimasPersegi(int s, int t)`, jika tertukar menjadi t * t * s / 3 yang bernilai salah.
      *Compiler* **tidak dapat mendeteksi** kesalahan ini karena semua argumennya bertipe `int`, sehingga tipenya tetap cocok dan hanya menjadi kesalahan logika (*logic error*). Berbeda dengan `Menu(true, "Andi")` pada Percobaan 2, yang langsung terdeteksi *error* oleh compiler karena tipe argumen (`boolean`, `String`) tidak sesuai dengan parameter (`String`, `boolean`).

* **Pertanyaan 4:** Tambahkan fungsi `hitungLuasPermukaanBalok(int p, int l, int t)` yang memanfaatkan fungsi `hitungLuas`. Kemudian gunakan program tersebut untuk menghitung luas permukaan dan volume 3 balok dengan ukuran berbeda. Bandingkan jika hal yang sama dilakukan pada versi tanpa fungsi: versi mana yang kodenya lebih ringkas dan lebih mudah diperbaiki jika ada rumus yang salah? Jelaskan alasannya.

* **Setelah Modifikasi**
```java

import java.util.Scanner;

public class HitungBalok_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("--- Balok ke- " + i + " ---");
            System.out.print("Masukkan Panjang: ");
            int p = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            int l = sc.nextInt();
            System.out.print("Masukkan Tinggi: ");
            int t = sc.nextInt();

            System.out.println("Luas Alas (p x l)     : " + hitungLuas(p, l));
            System.out.println("Luas Permukaan Balok  : " + hitungLuasPermukaanBalok(p, l, t));
            System.out.println("Volume Balok          : " + hitungVolume(t, p, l));
            System.out.println();
        }

        sc.close();
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan dengan 3 balok berukuran 4x3x5 (luas permukaan 94, volume 60), 2x2x2 (luas permukaan 24, volume 8), dan 6x4x3 (luas permukaan 108, volume 72):

![Gambar Output Percobaan 5](/week%2014/Foto/HitungBalok_02_02.PNG)

    * **Jawab:** Versi **dengan fungsi** lebih ringkas dan lebih mudah diperbaiki. Alasannya, rumus luas dan volume hanya ditulis satu kali di dalam fungsi dan cukup dipanggil setiap kali dibutuhkan untuk balok ke-1, ke-2, dan ke-3. Jika ada rumus yang salah, perbaikan cukup dilakukan di satu tempat dan otomatis berlaku untuk semua pemanggilan. Pada versi **tanpa fungsi**, rumus harus ditulis ulang (disalin) untuk setiap balok sehingga kode menjadi panjang, dan jika ada rumus yang salah, setiap salinan harus dicari dan diperbaiki satu per satu sehingga rawan ada yang terlewat.


---

## 3: TUGAS

### Tugas 1: Program Bangun Ruang (Nomor Absen 02 / Genap: Kubus dan Limas)

#### Kode Program Java
```java

import java.util.Scanner;

public class KubusLimas_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu, sisi, tinggi, L, vk, lpk;
        double vlp;

        System.out.println("--- PILIHAN MENU ---");
        System.out.println("0. Keluar Program");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Volume Kubus");
        System.out.println("3. Luas Permukaan Kubus");
        System.out.println("4. Volume Limas Persegi");

        do {

        System.out.println();
        System.out.print("Masukkan menu yang ingin anda akses: ");
        menu = sc.nextInt();


            switch (menu) {
                case 1:

                System.out.print("Masukkan Panjang Sisi: ");
                sisi = sc.nextInt();

                System.out.println();

                L = luasPersegi(sisi);
                System.out.println("Luas Persegi: " + L);
                System.out.println();

                break;


                case 2:

                System.out.print("Masukkan Panjang Sisi: ");
                sisi = sc.nextInt();

                System.out.println();

                vk = volumeKubus(sisi);
                System.out.println("Volume Kubus: " + vk);
                System.out.println();

                break;

                case 3:

                System.out.print("Masukkan Panjang Sisi: ");
                sisi = sc.nextInt();

                System.out.println();

                lpk = luasPermukaanKubus(sisi);
                System.out.println("Luas Permukaan Kubus: " + lpk);
                System.out.println();

                break;

                case 4:

                System.out.print("Masukkan Panjang Sisi: ");
                sisi = sc.nextInt();
                System.out.print("Masukkan Panjang Tinggi: ");
                tinggi = sc.nextInt();

                System.out.println();

                vlp = volumeLimasPersegi(sisi, tinggi);
                System.out.printf("Volume Limas Persegi %.2f", vlp);
                System.out.println();

                break;

                case 0:
                    
                    break;
            
                default:
                    break;
            }

        } while (menu != 0);
    }

    static int luasPersegi(int s) {
        int Luas = s * s;
        return Luas;
    }

    static int volumeKubus(int s) {
        int volumeKubus = luasPersegi(s) * s;
        return volumeKubus;
    }

    static int luasPermukaanKubus(int s) {
        int luasPermukaan = luasPersegi(s) * 6;
        return luasPermukaan;
    }

    static double volumeLimasPersegi(int s, int t) {
        double volumeLimas = luasPersegi(s) * t / 3.0;
        return volumeLimas;
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Tugas 1](/week%2014/Foto/KubusLimas_02.PNG)


### Tugas 2: Bank Sampah

#### Kode Program Java
```java

import java.util.Scanner;

public class BankSampah_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double HARGA_PER_KG = 3000.0;

        System.out.print("Masukkan Jumlah Nasabah: ");
        int nasabah = sc.nextInt();

        if (nasabah <= 0) {
            System.out.println("Jumlah nasabah harus lebih dari 0.");
            return;
        }

        double[] dataSetoran = inputSetoran(nasabah);

        tampilSetoran(dataSetoran);

        System.out.println("\n--- Saldo Setiap Nasabah ( Harga: Rp.3000 Per Kg ) ---");
        for (int i = 0; i < dataSetoran.length; i++) {
            double saldo = hitungSaldo(dataSetoran[i], HARGA_PER_KG);
            System.out.printf("Nasabah ke- %d : Rp%,.2f\n", (i + 1), saldo);
        }

        double totalBerat = totalSetoran(dataSetoran);
        System.out.printf("\nTotal Berat Setoran Seluruh Nasabah: %.2f kg\n", totalBerat);

        int terbanyak = nasabahTerbanyak(dataSetoran);
        System.out.printf("Nasabah dengan setoran Terbanyak: Nasabah ke-%d ( Array ke- %d ) dengan berat %.2f kg\n"
        , (terbanyak + 1), terbanyak, dataSetoran[terbanyak]);
    }

    static double[] inputSetoran(int n) {
        Scanner sc = new Scanner(System.in);
        double[] setoran = new double[n];

        System.out.println("\n--- Input Data Setoran Sampah ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan berat setoran nasabah ke- " + (i + 1) + " Kg : ");
            setoran[i] = sc.nextDouble();
        }

        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("\n--- Daftar Setoran Sampah Nasabah ---");

        for (int i = 0; i < setoran.length; i++) {
            System.out.printf("Nasabah Ke- %d : %.2f Kg\n", (i + 1), setoran[i]);
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;
        for (int i = 0; i < setoran.length; i++) {
            total += setoran[i];
        }

        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg) {
        return berat * hargaPerKg;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int max = 0;
        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[max]) {
                max = i;
            }
        }

        return max; 
    }
}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Tugas 2](/week%2014/Foto/BankSampah_02.PNG)


### Tugas 3: Rekap Laundry Pak Rudi

#### 3 (a) Kode Program Java
```java

import java.util.Scanner;

public class RekapLaundry_02 {

    public static void main(String[] args) {
        String[] layanan = {"Cuci Kering", "Cuci Setrika", "Setrika Saja", "Express"};
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum`at", "Sabtu"};
        int[] harga = {6000, 8000, 5000, 12000};

        Menu();

        System.out.println();
        int[][] dataBerat = inputDataBerat();

        System.out.println();
        tampilkanData(dataBerat);

        System.out.println();
        System.out.println("--- TOTAL BERAT PER LAYANAN ---");
        for (int i = 0; i < dataBerat.length; i++) {
            int total = totalPelayanan(dataBerat, i);
            System.out.println("Layanan ke- " + (i + 1) + " (" + layanan[i] + ") : " + total + " Kg");
        }

        System.out.println();
        layananBeratTertinggi(dataBerat, layanan);

        System.out.println();
        int hariTersibuk = hariTersibuk(dataBerat);
        System.out.println("--- HARI TERSIBUK ---");
        System.out.println("Hari Tersibuk : " + hari[hariTersibuk]);

        System.out.println();
        int totalPendapatan = tampilHitungPendapatan(dataBerat, layanan, harga);
        System.out.println();
        System.out.println("--- REKAP PENDAPATAN ---");
        System.out.println("Total Pendapatan ( 6 hari ): " + totalPendapatan);
    }

    public static void Menu() {
        System.out.println("--- LAYANAN ----");
        System.out.println("1. Cuci Kering : 6000 / Kg");
        System.out.println("2. Cuci Setrika : 8000 / Kg");
        System.out.println("3. Setrika Saja : 5000 / Kg");
        System.out.println("4. Express : 12000 / Kg");
    }

    static int[][] inputDataBerat() {
        Scanner sc = new Scanner(System.in);
        int beratCucian[][] = new int[4][6];
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.println("Layanan Ke- " + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Hari Ke- " + (j + 1) + ": ");
                beratCucian[i][j] = sc.nextInt();
            }
        }

        return beratCucian;
    }

    static void tampilkanData(int[][] dataBerat) {
        String[] layanan = {
            "Cuci Kering",
            "Cuci Setrika",
            "Setrika Saja",
            "Express"
        };

        int[] harga = {
            6000, 8000, 5000, 12000
        };

        String[] hari = {
            "Senin", "Selasa", "Rabu",
            "Kamis", "Jum`at", "Sabtu"
        };

        System.out.println("--- REKAP DATA LAUNDRY ---");
        System.out.println();

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-18s %12s", "Layanan", "Harga / Kg");

        for (int i = 0; i < hari.length; i++) {
            System.out.printf("%10s", hari[i]);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            String hargaFormat = String.format("%,d", harga[i]).replace(',', '.');
            System.out.printf("%-18s   Rp%-8s", layanan[i], hargaFormat);

            for (int j = 0; j < 6; j++) {
                System.out.printf("%10d", dataBerat[i][j]);
            }

            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");
    }

    static int totalPelayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int i = 0; i < 6; i++) {
            total += data[idxLayanan][i];
        }

        return total;
    }

    static void layananBeratTertinggi(int[][] x, String[] l) {
        int indexMax = 0;
        int max = 0;

        for (int i = 0; i < x.length; i++) {    
            int total = totalPelayanan(x, i);

            if (total > max) {
                max = total;
                indexMax = i;
            }
        }

        System.out.println("--- LAYANAN BERAT TERTINGGI ---");
        System.out.println("Layanan : " + l[indexMax]);
        System.out.println("Total   : " + max + " Kg");
    }

    static int hariTersibuk (int[][] data) {
        int max = 0;
        int indexMax = 0;

        for (int i = 0; i < data[0].length; i++) {
            int totalPerHari = 0;
            
            for (int j = 0; j < data.length; j++) {
                totalPerHari += data[j][i];
            }

            if (totalPerHari > max) {
                max = totalPerHari;
                indexMax = i;
            }
        }

        return indexMax;
    }

    static int tampilHitungPendapatan (int [][] x, String[] layanan, int[] harga) {
        int totalSemuaPendapatan = 0;

        System.out.println("--- PENDAPATAN PER LAYANAN ---");
        for (int i = 0; i < x.length; i++) {
            int totalBeratLayanan = totalPelayanan(x, i);
            int pendapatanLayanan = totalBeratLayanan * harga[i];
            totalSemuaPendapatan += pendapatanLayanan;

            System.out.println("Layanan ke- " + (i + 1) + " ( " + layanan[i] + " ) : Rp. " + pendapatanLayanan);
        }

        return totalSemuaPendapatan;
    }

}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Tugas 3a](/week%2014/Foto/RekapLaundry_02.PNG)

#### 3 (b) Kode Program Java (Jumlah Layanan dan Hari dari Input)
```java

import java.util.Scanner;

public class RekapLaundry_B_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Layanan: ");
        int jumlahLayanan = sc.nextInt();
        sc.nextLine();

        System.out.println();

        System.out.print("Masukkan Jumlah Hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        String layanan[] = new String[jumlahLayanan];
        int harga[] = new int[jumlahLayanan];

        System.out.println();
        inputDataLayanan(layanan, harga);

        Menu(layanan, harga);

        System.out.println();
        int[][] dataBerat = inputDataBerat(jumlahLayanan, jumlahHari, layanan);

        System.out.println();
        tampilkanData(dataBerat, layanan, harga, jumlahHari);

        System.out.println();
        System.out.println("--- TOTAL BERAT PER LAYANAN ---");
        for (int i = 0; i < dataBerat.length; i++) {
            int total = totalPelayanan(dataBerat, i);
            System.out.println("Layanan ke- " + (i + 1) + " (" + layanan[i] + ") : " + total + " Kg");
        }

        System.out.println();
        layananBeratTertinggi(dataBerat, layanan);

        System.out.println();
        int hariTersibuk = hariTersibuk(dataBerat);
        int totalBeratHariTersibuk = 0;
        for (int i = 0; i < dataBerat.length; i++) {
            totalBeratHariTersibuk += dataBerat[i][hariTersibuk];
        }
        System.out.println("--- HARI TERSIBUK ---");
        System.out.println("Hari Ke- " + (hariTersibuk + 1));
        System.out.println("Total Berat: " + totalBeratHariTersibuk + " Kg");

        System.out.println();
        int totalPendapatan = tampilHitungPendapatan(dataBerat, layanan, harga);
        System.out.println();
        System.out.println("--- REKAP PENDAPATAN ---");
        System.out.println("Total Pendapatan ( " + jumlahHari + " ): " + totalPendapatan);
    }


    static void inputDataLayanan (String[] layanan, int[] harga) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < layanan.length; i++) {
            System.out.println("--- LAYANAN KE " + (i + 1) + " ---");
            System.out.print("Masukkan Nama Layanan: ");
            layanan[i] = sc.nextLine();

            System.out.print("Harga Per Kg: ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    public static void Menu(String[] layanan, int[] harga) {
        System.out.println();
        System.out.println("--- LAYANAN ---");
        for (int i = 0; i < layanan.length; i++) {
            System.out.println((i + 1) + ". " + layanan[i] + " : " + harga[i] + " / Per Kg");
            
        }
    }

    static int[][] inputDataBerat(int jumlahLayanan, int jumlahHari, String[] layanan) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT DATA BERAT ---");
        int beratCucian[][] = new int[jumlahLayanan][jumlahHari];
        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.println();
            System.out.println("Layanan Ke- " + (i + 1));
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari Ke- " + (j + 1) + ": ");
                beratCucian[i][j] = sc.nextInt();
            }
        }

        return beratCucian;
    }

    static void tampilkanData(int[][] dataBerat, String[] layanan, int[] harga, int jumlahHari) {
       
        System.out.println("--- REKAP DATA LAUNDRY ---");
        System.out.println();

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-18s %12s", "Layanan", "Harga / Kg");

        for (int i = 0; i < jumlahHari; i++) {
            System.out.printf("%14s", "Hari ke- " + (i + 1));
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");

        for (int i = 0; i < layanan.length; i++) {
            String hargaFormat = String.format("%,d", harga[i]).replace(',', '.');
            System.out.printf("%-18s   Rp%-8s", layanan[i], hargaFormat);

            for (int j = 0; j < jumlahHari; j++) {
                System.out.printf("%12d", dataBerat[i][j]);
            }

            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");
    }

    static int totalPelayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int i = 0; i < data[idxLayanan].length; i++) {
            total += data[idxLayanan][i];
        }

        return total;
    }

    static void layananBeratTertinggi(int[][] x, String[] l) {
        int indexMax = 0;
        int max = 0;

        for (int i = 0; i < x.length; i++) {    
            int total = totalPelayanan(x, i);

            if (total > max) {
                max = total;
                indexMax = i;
            }
        }

        System.out.println("--- LAYANAN BERAT TERTINGGI ---");
        System.out.println("Layanan : " + l[indexMax]);
        System.out.println("Total   : " + max + " Kg");
    }

    static int hariTersibuk (int[][] data) {
        int max = 0;
        int indexMax = 0;

        for (int i = 0; i < data[0].length; i++) {
            int totalPerHari = 0;
            
            for (int j = 0; j < data.length; j++) {
                totalPerHari += data[j][i];
            }

            if (totalPerHari > max) {
                max = totalPerHari;
                indexMax = i;
            }
        }

        return indexMax;
    }

    static int tampilHitungPendapatan (int [][] x, String[] layanan, int[] harga) {
        int totalSemuaPendapatan = 0;

        System.out.println("--- PENDAPATAN PER LAYANAN ---");
        for (int i = 0; i < x.length; i++) {
            int totalBeratLayanan = totalPelayanan(x, i);
            int pendapatanLayanan = totalBeratLayanan * harga[i];
            totalSemuaPendapatan += pendapatanLayanan;

            System.out.println("Layanan ke- " + (i + 1) + " ( " + layanan[i] + " ) : Rp. " + pendapatanLayanan);
        }

        return totalSemuaPendapatan;
    }

}

```

#### Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Tugas 3b](/week%2014/Foto/RekapLaundry_B_02.PNG)

#### KESIMPULAN

Fungsi dalam Java digunakan untuk memecah program menjadi bagian-bagian kecil yang dapat dipanggil berulang kali sehingga kode lebih ringkas, terstruktur, dan mudah diperbaiki. Melalui percobaan ini, mahasiswa mempelajari pembuatan fungsi `static` tanpa parameter, dengan parameter, serta dengan nilai kembalian (`return`). Selain itu, mahasiswa memahami perbedaan parameter dan argumen, sifat *pass by value*, penggunaan *varargs* beserta aturannya, dan perbandingan program yang ditulis dengan fungsi dan tanpa fungsi. Dengan demikian, praktikum ini membantu meningkatkan kemampuan dalam menyusun program yang modular, termasuk studi kasus bangun ruang, bank sampah, dan rekap laundry yang memanfaatkan fungsi dan array.

