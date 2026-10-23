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
    * **Jawab:** Nilai 0 adalah batas bawah terkecil. Ketika nilai mahasiswa pertama dimasukkan (misal: 75), program membandingkan 75 > 0 (Benar), sehingga variabel tertinggi langsung diperbarui menjadi 75. Nilai 100 adalah batas atas terbesar. Ketika nilai mahasiswa pertama dimasukkan (75), program membandingkan 75 < 100 (Benar), sehingga variabel terendah langsung diperbarui menjadi 75.

![Gambar Soal Nomor 01](/week%209/foto/soal%20nomor%2001.PNG)
* **Pertanyaan 3:** Jelaskan fungsi dan alur kerja dari potongan kode di atas!
    * **Jawab:** 
	Jika tertinggi = 100, tidak ada nilai mahasiswa (rentang 0-100) yang bisa lebih besar dari 100. Akibatnya, kondisi if (nilai > tertinggi) akan selalu salah (false), dan hasil akhir nilai tertinggi akan selalu tetap 100.
	Jika terendah = 0, tidak ada nilai mahasiswa yang bisa lebih kecil dari 0. Akibatnya, kondisi if (nilai < terendah) akan selalu salah (false), dan hasil akhir nilai terendah akan selalu tetap 0.


* **Pertanyaan 4:** Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!
* **Jawab:**
  
![Gambar Soal Nomor 01](/week%209/foto/hasil%20SiakadFor.PNG)

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
    * **Jawab:** Berfungsi `nilai < 0 || nilai > 100` : sebagai validasi batas input. Skala nilai mahasiswa yang sah berada di rentang 0 sampai 100. Kondisi ini digunakan untuk menyaring dan mendeteksi jika pengguna tidak sengaja memasukkan angka di luar batas (seperti -10 atau 105) agar tidak diproses ke tahap akreditasi. `Continue` : Saat mendeteksi nilai tidak valid, program akan langsung melompat kembali ke baris pengecekan kondisi while (i < jml). Perintah ini berguna agar nilai yang salah tersebut langsung dilewati dan tidak ikut dicetak akreditasinya oleh perintah if-else di bawahnya.
* **Pertanyaan 2:** Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE?
    * **Jawab:** Agar nilai i tetap konsisten sejak awal input hingga proses cetak akreditasi untuk mahasiswa yang sama selesai dilakukan. Sebagai contoh, ketika i = 0, cetakan teks (i + 1) akan memproses "Mahasiswa ke-1". Setelah seluruh akreditasi mahasiswa ke-1 berhasil dicetak, barulah i++ menaikkan nilai menjadi 1 untuk bersiap memproses mahasiswa berikutnya pada putaran berikutnya. Akan terjadi pergeseran indeks logika. Pada putaran pertama, i yang awalnya 0 langsung berubah menjadi 1 sebelum input diminta. Akibatnya, cetakan teks (i + 1) akan langsung menampilkan "Masukkan nilai mahasiswa ke- 2", sehingga mahasiswa ke-1 terlewati.
* **Pertanyaan 3:** Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan?
    * **Jawab:** Perulangan akan berjalan tepat sebanyak 19 kali (dimulai dari i = 0 hingga i = 18). Jika pengguna salah memasukkan nilai (misal 150), program akan memicu perintah continue. Karena continue langsung melompat ke atas sebelum melewati i++, nilai i tidak akan pernah bertambah. Akibatnya, perulangan akan terjebak dan berjalan tanpa batas (infinite loop) pada nomor mahasiswa tersebut
* **Pertanyaan 4:** Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
    * **Jawab:**
	
	![Gambar Output Percobaan 2](/week%209/foto/hasil%20SiakadWhile.PNG)
 
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
    * **Jawab:** Jika nama pelanggan pertama yang dimasukkan adalah "batal", perulangan dilakukan sebanyak 1 kali.
* **Pertanyaan 2:** Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
    * **Jawab:**
     Namun, secara logis di dalam blok kode, kondisi berhentinya adalah ketika variabel namaPelanggan bernilai "batal" Ketika kondisi ini terpenuhi, perintah `break;` dieksekusi untuk menghentikan perulangan secara paksa.
* **Pertanyaan 3:**  Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
    * **Jawab:** Teknik ini digunakan agar kontrol penuh kapan perulangan harus berhenti dipindahkan ke dalam blok kode (menggunakan kombinasi if dan break). Hal ini sangat ideal untuk aplikasi kasir yang harus selalu siaga menerima pesanan pelanggan baru tanpa batasan jumlah putaran yang kaku.
* **Pertanyaan 4:** Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?
    * **Jawab:** 1. Kondisi Dikunci true: Karena kondisinya selalu true, program tidak memerlukan variabel counter angka untuk mengecek batas akhir perulangan 2. Update Dinamis Lewat Input: Proses pembaruan status perulangan terjadi secara dinamis melalui baris namaPelanggan = sc.nextLine();. Setiap kali loop berputar, isi variabel tersebut diperbarui langsung berdasarkan apa yang diketik oleh pengguna. 3. Kontrol Melalui break: Fungsi penghenti perulangan diambil alih oleh seleksi kondisi if yang mendeteksi kata "batal". Selama pengguna tidak mengetik kata tersebut, loop akan terus berputar secara otomatis.

    
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

