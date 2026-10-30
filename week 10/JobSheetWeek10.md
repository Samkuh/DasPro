# JOBSHEET 8 WEEK 10- PERULANGAN 02

**Identitas Mahasiswa:**
* **Nama:** [ Achmad Labib Zainullah ]
* **NIM:** [ 264107020149 ]
* **Kelas / No. Presensi:** [ TI - 1D / 02 ]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

 * Memahami konsep perulangan bersarang pada algoritma
 * Memahami alur perulangan bersarang
 * Mengenal sintaks perulangan bersarang
 * Mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus
sederhana.


---

## 2: PRAKTIKUM

### 2.1 Percobaan 1:  Review Perulangan 1


Percobaan ini mengulang konsep perulangan FOR sebelum mempelajari perulangan
bersarang. Program menampilkan karakter * sebanyak n kali secara mendatar (ke arah
samping). Gunakan input n berupa bilangan bulat positif.

#### 2.1.1 Kode Program Java
```java

import java.util.Scanner;

public class Star02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%209/foto/SiakadaFor.PNG)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jika inisialisasi i = 1 diubah menjadi i = 0 tanpa mengubah kondisi, berapa karakter *
yang tercetak ketika n = 5? Jelaskan.
    * **Jawab** 1. INISIALISASI : `int i = 1`, 2. KONDISI : `i <= 10` , 3. UPDATE : `I++`
      
* **Pertanyaan 2:** Jika kondisi i <= n diganti menjadi i < n, berapa kali perulangan dijalankan saat n = 5?
Mengapa hasilnya berbeda?
    * **Jawab:** Nilai 0 adalah batas bawah terkecil. Ketika nilai mahasiswa pertama dimasukkan (misal: 75), program membandingkan 75 > 0 (Benar), sehingga variabel tertinggi langsung diperbarui menjadi 75. Nilai 100 adalah batas atas terbesar. Ketika nilai mahasiswa pertama dimasukkan (75), program membandingkan 75 < 100 (Benar), sehingga variabel terendah langsung diperbarui menjadi 75.

* **Pertanyaan 3:** Prediksi output potongan kode berikut ketika n = 9, kemudian buktikan dengan
mengganti perulangan FOR pada program Anda dan menjalankannya.
```java

for (int i = 2; i <= n; i += 2) {
 System.out.print(i + " ");
}

```

Modifikasi kode tersebut agar mencetak bilangan ganjil positif yang tidak melebihi n.
* **Jawab:** 
	Jika tertinggi = 100, tidak ada nilai mahasiswa (rentang 0-100) yang bisa lebih besar dari 100. Akibatnya, kondisi if (nilai > tertinggi) akan selalu salah (false), dan hasil akhir nilai tertinggi akan selalu tetap 100.
	Jika terendah = 0, tidak ada nilai mahasiswa yang bisa lebih kecil dari 0. Akibatnya, kondisi if (nilai < terendah) akan selalu salah (false), dan hasil akhir nilai terendah akan selalu tetap 0.

* **Pertanyaan 4:** Jelaskan mengapa perubahan increment i++ menjadi i-- (dengan kondisi tetap i <= n)
membuat perulangan berjalan terus-menerus dan tidak berhenti dalam waktu wajar
untuk n positif. Jangan menjalankan versi tersebut; jika terlanjur berjalan, hentikan
program dengan menekan Ctrl + C pada terminal.
* **Jawab:**
  

---

### 2.2 Percobaan 2: Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)

Pada percobaan ini digunakan nested loop FOR untuk mencetak persegi panjang bintang.
Jumlah baris dan kolom dimasukkan secara terpisah sehingga peran kedua loop dapat diamati
dengan jelas: outer loop mengatur baris, sedangkan inner loop mengatur kolom (ingat analogi
rak/loker pada materi).
#### 2.2.1 Kode Program Java

```java

import java.util.Scanner;

public class Rectangle02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();

        for (int b = 1; b <= baris; b++) {
            for (int k = 1; k <= kolom; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

```

#### 2.2.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 2](/week%209/foto/SiakadaWhile.PNG)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Tentukan fungsi variabel i dan j pada program tersebut.
    * **Jawab:** Berfungsi `nilai < 0 || nilai > 100` : sebagai validasi batas input. Skala nilai mahasiswa yang sah berada di rentang 0 sampai 100. Kondisi ini digunakan untuk menyaring dan mendeteksi jika pengguna tidak sengaja memasukkan angka di luar batas (seperti -10 atau 105) agar tidak diproses ke tahap akreditasi. `Continue` : Saat mendeteksi nilai tidak valid, program akan langsung melompat kembali ke baris pengecekan kondisi while (i < jml). Perintah ini berguna agar nilai yang salah tersebut langsung dilewati dan tidak ikut dicetak akreditasinya oleh perintah if-else di bawahnya.
      
* **Pertanyaan 2:**Berapa kali outer loop, inner loop, dan perintah print("*") dijalankan untuk baris = 4
dan kolom = 7?
    * **Jawab:** Agar nilai i tetap konsisten sejak awal input hingga proses cetak akreditasi untuk mahasiswa yang sama selesai dilakukan. Sebagai contoh, ketika i = 0, cetakan teks (i + 1) akan memproses "Mahasiswa ke-1". Setelah seluruh akreditasi mahasiswa ke-1 berhasil dicetak, barulah i++ menaikkan nilai menjadi 1 untuk bersiap memproses mahasiswa berikutnya pada putaran berikutnya. Akan terjadi pergeseran indeks logika. Pada putaran pertama, i yang awalnya 0 langsung berubah menjadi 1 sebelum input diminta. Akibatnya, cetakan teks (i + 1) akan langsung menampilkan "Masukkan nilai mahasiswa ke- 2", sehingga mahasiswa ke-1 terlewati.
      
* **Pertanyaan 3:** Apa yang terjadi jika batas perulangan luar dan dalam ditukar (outer menggunakan
kolom, inner menggunakan baris)? Gunakan baris = 3 dan kolom = 6 untuk menjelaskan.
    * **Jawab:** Perulangan akan berjalan tepat sebanyak 19 kali (dimulai dari i = 0 hingga i = 18). Jika pengguna salah memasukkan nilai (misal 150), program akan memicu perintah continue. Karena continue langsung melompat ke atas sebelum melewati i++, nilai i tidak akan pernah bertambah. Akibatnya, perulangan akan terjebak dan berjalan tanpa batas (infinite loop) pada nomor mahasiswa tersebut
      
* **Pertanyaan 4:** Jelaskan akibat penghapusan System.out.println(); setelah inner loop.
    * **Jawab:**

* **Pertanyaan 5:** Modifikasi program agar karakter yang dicetak adalah #, lalu commit dan push perubahan
ke GitHub.
	
	
 
### 2.3 Percobaan 3: Debugging Bintang Segitiga – Nested WHILE

Kode awal pada percobaan ini sengaja dibuat belum menghasilkan format segitiga yang
benar. Tugas Anda adalah mengidentifikasi kesalahannya dan memperbaikinya tanpa
mengganti struktur WHILE menjadi FOR. 

#### 2.3.1 Kode Program Java

```java

import java.util.Scanner;

public class Triangle02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();

        System.out.println();
        
        i = n;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}

```

#### 2.3.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 3](/week%209/foto/KafeDoWhile.PNG)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:**  Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk
menghasilkan pola segitiga bertingkat.
    * **Jawab:** Jika nama pelanggan pertama yang dimasukkan adalah "batal", perulangan dilakukan sebanyak 1 kali.
      
* **Pertanyaan 2:** Jelaskan peran variabel i dan j. Mengapa nilai j harus diinisialisasi kembali ke 0 pada
setiap iterasi outer loop? Apa yang terjadi jika j tidak di-reset?
    * **Jawab:**
     Namun, secara logis di dalam blok kode, kondisi berhentinya adalah ketika variabel namaPelanggan bernilai "batal" Ketika kondisi ini terpenuhi, perintah `break;` dieksekusi untuk menghentikan perulangan secara paksa.

* **Pertanyaan 3:**  Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (update) pada outer loop
yang diperlukan untuk membentuk segitiga terbalik.
    * **Jawab:** Teknik ini digunakan agar kontrol penuh kapan perulangan harus berhenti dipindahkan ke dalam blok kode (menggunakan kombinasi if dan break). Hal ini sangat ideal untuk aplikasi kasir yang harus selalu siaga menerima pesanan pelanggan baru tanpa batasan jumlah putaran yang kaku.
      
    
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

* **Kesimpulan**
Berdasarkan Jobsheet 7 tentang Perulangan 1, dapat disimpulkan bahwa perulangan `for`, `while`, dan `do-while` dalam Java digunakan untuk menjalankan perintah secara berulang sesuai kondisi tertentu. Melalui praktikum ini, mahasiswa dapat menerapkan perulangan untuk mengolah nilai mahasiswa, menentukan kategori nilai, dan menghitung total transaksi. Selain itu, mahasiswa dapat memahami penggunaan kondisi percabangan untuk membuat program yang lebih efektif dan sesuai kebutuhan.

