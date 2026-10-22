# JOBSHEET 7 WEEK 9- PERULANGAN 01

**Identitas Mahasiswa:**
* **Nama:** [ Achmad Labib Zainullah ]
* **NIM:** [ 264107020149 ]
* **Kelas / No. Presensi:** [ TI - 1D / 02 ]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa dapat menjelaskan format penulisan program perulangan (for, while,
dan do-while)
2.  Mahasiswa dapat mengimplementasikan flowchart perulangan menggunakan
bahasa pemrograman Java 


---

## 2: PRAKTIKUM

### 2.1 Percobaan 1:  Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan FOR


Di dalam Sistem Informasi Akademik (SIAKAD), dosen mengisi nilai mata kuliah Praktikum
Dasar Pemrograman yang ditempuh oleh mahasiswa. Dosen tersebut ingin mencari nilai
tertinggi dan terendah Kuis dari 10 mahasiswa di dalam satu kelas. Dosen tersebut harus
memasukkan nilai dari setiap siswa, kemudian menentukan dan menampilkan nilai tertinggi
dan terendah. Perhatikan flowchart berikut ini:

![Gambar Output Percobaan 1](/week%209/foto/FlowChart%20Tugas%2001.PNG)

#### 2.1.1 Kode Program Java
```java

import java.util.Scanner;

public class SiakadFor02 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
        System.out.print("Masukkan nilai mahasiswa ( 1 - 100 ) ke- " + i + ": ");
        nilai = sc.nextDouble();
            if (nilai > tertinggi) {
            tertinggi = nilai;
            }
            if (nilai < terendah) {
            terendah = nilai;
            }
        }
        System.out.println("");
        System.out.println("============================");
        System.out.println("Nilai Tertinggi: " + tertinggi);    
        System.out.println("Nilai Terendah: " + terendah);    
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%209/foto/SiakadaFor.PNG)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!
    * **Jawab** 1. INISIALISASI : `int i = 1`, 2. KONDISI : `i <= 10` , 3. UPDATE : `I++`
* **Pertanyaan 2:** Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
    * **Jawab:** Perintah tersebut masuk pada `If Else` yang mempunyai makna `true` Jika kondisi didalam kurung terpenuhi. yaitu jika
jumlah bimbingan P1 lebih dari sama dengan 8 dan P2 lebih dari sama dengan 4.

![Gambar Soal Nomor 01](/week%209/foto/soal%20nomor%2001.PNG)
* **Pertanyaan 3:** Jelaskan fungsi dan alur kerja dari potongan kode di atas!
    * **Jawab:** Sistem SIMTA akan memeriksa syarat
administrasi terlebih dahulu, yaitu mahasiswa harus bebas kompen. Jika syarat ini terpenuhi,
sistem kemudian memeriksa catatan log bimbingan. Untuk bisa mendaftar ujian, mahasiswa
harus memiliki minimal 8 kali bimbingan dengan pembimbing 1 dan minimal 4 kali bimbingan
dengan pembimbing 2. Jika semua syarat terpenuhi, mahasiswa dapat melanjutkan ke proses
pendaftaran ujian skripsi. Jika tidak, sistem akan menampilkan output gagal dengan alasan yang berbeda sesuai tahap berapa yang gagal .
* **Pertanyaan 4:** Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!
* **Jawab:** 


---

### 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan WHILE

Seorang dosen ingin memasukkan nilai beberapa mahasiswa ke dalam SIAKAD untuk
ditentukan kategori nilai hurufnya. Program harus meminta dosen untuk memasukkan nilai
setiap mahasiswa. Jika dosen memasukkan nilai yang tidak valid (negatif atau lebih dari 100),
program harus mengabaikan input tersebut dan meminta dosen untuk melakukan input
ulang. Selanjutnya, nilai yang valid dikelompokkan ke dalam kategori huruf A (80 < nilai ≤ 100),
B+ (73 < nilai ≤ 80), B (65 < nilai ≤ 73), C+ (60 < nilai ≤ 65), C (50 < nilai ≤ 60), D (39 < nilai ≤ 50),
dan E (nilai ≤ 39).
#### 2.2.1 Kode Program Java

```java

import java.util.Scanner;

public class SiakadWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        System.out.print("");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("");
            System.out.println("======== NILAI ========");
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai mahasiswa tidak valid. Masukkan lagi nilai mahasiswa");
                continue;
            }

            if (nilai > 80 && nilai <=100) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah A");
                System.out.println("");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah B+");
                System.out.println("");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah B");
                System.out.println("");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah C+");
                System.out.println("");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah C");
                System.out.println("");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah D");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("=========== AKREDITASI =========");
                System.out.println("Nilai mahasiswa ke- " + (i + 1) + " Adalah E");
                System.out.println("");
            }
            i++;
        }
    }
}

```

#### 2.2.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 2](/week%209/foto/SiakadaWhile.PNG)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
![Gambar Output Percobaan 2](/week%209/foto/soal%20nomor%2002.PNG)
* **Pertanyaan 1:** Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks di atas:
    * **Jawab:** Fungsi operator `||` memiliki arti OR yaitu jika kita ingin membuat kondisi bila satu kondisi `true` maka otomatis kondisi yang satunya lagi akan `true` juga pada program diatas digunakan untuk mengetahui apakah anda dosen atau mahasiswa. Fungsi operator `&&` memiliki arti `AND` yaitu jika kita ingin membuat kondisi bila satu kondisi `true` maka kondisi satunya lagi akan di cek juga jika `true` maka kondisi bernilai `true` jika false maka kondisi akan bernilai `false` pada program diatas digunakan untuk mengecek apakah anda dosen/mahasiswa dan akun anda tidak diblokir. Fungsi operator `!` memiliki arti Negasi yaitu jika kita ingin membuat kondisi `true` maka kita harus memasukkan input sebaliknya contohnya jika kita ingin output `true` kita harus input nilai `false` pada program diatas digunakan untuk mengetahui apakah akun anda diblokir 
* **Pertanyaan 2:** Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE?
    * **Jawab:** Karena pada program diatas menggunakan perintah `||` yang memiliki arti atau makna sebagai `OR` jika satu`true` maka yang lain juga ikut `true` meskipun yang lain bernilai `false`
* **Pertanyaan 3:** Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan?
    * **Jawab:** Jika operator || pada (mahasiswa || dosen) diubah menjadi &&, maka akses WiFi hanya diberikan jika pengguna adalah mahasiswa DAN dosen sekaligus, serta akun tidak sedang diblokir. Jadi, jika data uji 1 atau 2 hanya memiliki salah satu dari mahasiswa atau dosen bernilai true, hasilnya berubah menjadi `Akses Wifi Ditolak`
* **Pertanyaan 4:** Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
    * **Jawab:** Kondisi dosen tidak perlu dievaluasi ketika mahasiswa bernilai `true`. Hal ini karena operator `||` berarti `OR` (atau). Jika bagian pertama sudah `true`, hasil keseluruhan pasti `true`, sehingga Java tidak perlu memeriksa kondisi kedua.
 
### 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe – Perulangan DO-WHILE 

Di sebuah kafe, kasir ingin memproses transaksi beberapa pelanggan. Pelanggan dapat
membeli lebih dari satu item (kopi dengan harga Rp 12.000, teh dengan harga Rp 7.000, dan
roti dengan harga Rp 20.000), dan kasir akan terus memasukkan jumlah pembelian untuk
setiap pelanggan. Jika ada pelanggan yang memutuskan untuk membatalkan transaksi
(dengan memasukkan "batal"), maka kasir akan menghentikan input transaksi dan program
berhenti.

#### 2.3.1 Kode Program Java

```java

import java.util.Scanner;

public class KafeDoWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int itemKopi, itemTeh, itemRoti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        System.out.println("==== MENU ====");
        System.out.println("KOPI : 12.000");
        System.out.println("TEH : 7.000");
        System.out.println("ROTI : 20.000");

        do {
            System.out.println("");
            System.out.print("Masukkan Nama Pelanggan ( Ketik batal untuk keluar ): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("");
                System.out.println("Transaksi Di Batalkan");
                break;
            }
            System.out.println("");
            System.out.println("======= JUMLAH ======");
            System.out.print("Jumlah Kopi: ");
            itemKopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            itemTeh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            itemRoti = sc.nextInt();

            totalHarga = (itemKopi * hargaKopi) + (itemTeh * hargaTeh) + (itemRoti * hargaRoti);

            System.out.println("");
            System.out.println("====== STRUCK HARGA TOTAL =====");
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua Transaksi Selesai");
    }
}

```

#### 2.3.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 3](/week%209/foto/KafeDoWhile.PNG)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:**  Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan?
    * **Jawab:** Karena mahasiswa harus memenuhi syarat utama terlebih dahulu, yaitu mahasiswa aktif dan tidak sedang disanksi. Setelah syarat tersebut terpenuhi, barulah program memeriksa apakah mahasiswa memiliki izin dosen atau merupakan asisten lab.
      Urutanya :
      * mahasiswaAktif && !sedangDisaksi → syarat utama.
      * punyaIzinDosen || asistenLab → syarat tambahan.
      * Jika semua terpenuhi → akses laboratorium diberikan.
* **Pertanyaan 2:** Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
    * **Jawab:**
      * && -- AND -- Kedua kondisi harus bernilai true. Digunakan untuk memastikan mahasiswa aktif dan tidak sedang disanksi
      * ! -- NOT -- Membalik nilai boolean. !sedangDisaksi berarti mahasiswa tidak sedang disanksi.
* **Pertanyaan 3:**  Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
    * **Jawab:** Ya, dapat. Keputusan akses akhirnya sama, karena kedua bentuk program memiliki syarat logika yang sama. Syarat akses adalah:
      * Mahasiswa aktif -- AND
      * tidak sedang disanksi -- AND
      * (punya izin dosen OR asisten lab).
    * Perbedaannya adalah Nested IF lebih mudah digunakan jika ingin memberikan alasan penolakan yang berbeda.
* **Pertanyaan 4:** Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?
    * **Jawab:** Keuntungan `Nested IF` adalah program dapat membedakan alasan penolakan berdasarkan tahap pemeriksaan. Dengan `satu if` saja, logika tetap bisa dibuat, tetapi untuk membedakan alasan penolakan biasanya diperlukan kondisi tambahan sehingga kode dapat menjadi kurang terstruktur.
    
## 3: TUGAS MANDIRI

* **Tugas No 01** Seorang pengelola bioskop ingin membuat program untuk menghitung total penjualan
tiket dalam satu hari. Tiket dijual dengan harga Rp 50.000 per tiket. Program harus
menghitung total tiket yang terjual dan total harga penjualan tiket selama satu hari
dengan ketentuan sebagai berikut:
    * Jika pelanggan membeli lebih dari 4 tiket, pelanggan mendapatkan diskon 10%
    * Jika pelanggan membeli lebih dari 10 tiket, pelanggan mendapatkan diskon 15%.
    * Jika input jumlah tiket tidak valid (negatif), program akan mengabaikan input 

* **Tugas No 02** Sebuah tempat parkir ingin membuat program untuk menghitung total
pembayaran parkir dari beberapa kendaraan. Tarif parkir adalah Rp 3.000 per jam
untuk mobil dan Rp 2.000 per jam untuk motor. Program akan terus meminta
masukan selama input bukan 0. Implementasikan flowchart tersebut ke dalam
bentuk kode program Java!

![Gambar Output Percobaan 3](/week%209/foto/FlowChart%20Tugas%2002.PNG)

### 3.1 Implementasi Kode Tugas

* **Kode Program No 01**

```java

import java.util.Scanner;

public class Tugas1PertemuanSembilan02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tiket, totalTiket = 0, hargaTiket = 50000, i = 0, jmlPelanggan;
        double diskonSepuluh = 0.10, diskonLimaBelas = 0.15, diskonNol = 0, totalHarga = 0;

        System.out.println("Harga Tiket: Rp.50.000");
        System.out.println("Diskon 10% Untuk Pembelian Tiket 4 Sampai 10");
        System.out.println("Diskon 15% Untuk Pembelian Tiket lebih dari 10");
        System.out.println("");

        System.out.print("Masukkan jumlah pelanggan: ");
        jmlPelanggan = sc.nextInt();
        System.out.print("");

        if (jmlPelanggan < 0) {
            System.out.println("");
            System.out.println("Input Tidak Valid");
        } 

        while (i < jmlPelanggan) {
            System.out.println("");
            System.out.println("===== JUMLAH TIKET =====");
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke- " + (i + 1) + ": ");
            tiket = sc.nextInt();

            if (tiket >= 0 && tiket <= 4) {
                totalHarga += (tiket * hargaTiket) - ( tiket * hargaTiket * diskonNol);
                totalTiket += tiket;
            } else if (tiket > 4 && tiket <= 10) {
                totalHarga += (tiket * hargaTiket) - (tiket * hargaTiket * diskonSepuluh);
                totalTiket += tiket;
            } else {
                totalHarga += (tiket * hargaTiket) - (tiket * hargaTiket * diskonLimaBelas);
                totalTiket += tiket;
            }
            i++;
        }
        System.out.println("");
        System.out.println("==== TOTAL BAYAR DAN TOTAL TIKET ====");
        System.out.println("Total Pendapatan Penjualan Tiket: " + (int) totalHarga);
        System.out.println("Total Tiket yang Terjual: " + (int) totalTiket);
    }
}
  
```

* **Kode Program No 02**

```java

import java.util.Scanner;

public class TugasPertemuanSembilan02 {

    public static void main(String[] args) {
        
       int jenis, durasi, total = 0;

       Scanner sc = new Scanner(System.in);

       do {
        System.out.println("");
        System.out.println("01. MOBIL");
        System.out.println("02. SEPEDA MOTOR");
        System.out.println("00. BERHENTI");

        System.out.println("");
        System.out.println("==== JENIS KENDARAAN ====");
        System.out.print("Masukkan jenis kendaraan:");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.println("");
            System.out.println("==== DURASI ====");
            System.out.print("Masukkan Durasi Parkir Dalam Jam: ");
            durasi = sc.nextInt();

            if (jenis == 1) {
                total += durasi * 3000;
            } else {
                total += durasi * 2000;
            }
        }
       } while (jenis != 0);

       System.out.println("");
       System.out.println("==== TOTAL PENDAPATAN ====");
       System.out.println("Total pendapatan parkir: Rp." + total);
    }
}

```

#### 3.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

* **Hasil Kode Program Nomor 01**

![Gambar Output Percobaan 1 Tugas Mandiri](/week%209/foto/TUGAS%2001.PNG)

* **Hasil Kode Program Nomor 02**
  
![Gambar Output Percobaan 2 Tugas Mandiri](/week%209/foto/TUGAS%2002.PNG)


## 4: KESIMPULAN

* **Kesimpulan** obsheet 6 Dasar Pemrograman 2026 dari Politeknik Negeri Malang ini berisi panduan praktikum mengenai struktur pemilihan bersarang (Nested IF) dan operator logika (&&, ||, !) dalam bahasa Java. Melalui tiga modul percobaan—yaitu pengecekan syarat ujian skripsi, akses WiFi kampus, dan izin laboratorium—mahasiswa dilatih untuk menyusun logika kondisi yang kompleks.

