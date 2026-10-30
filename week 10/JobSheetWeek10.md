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

![Gambar Output Percobaan 1](/week%2010/Foto/Star02.PNG)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jika inisialisasi i = 1 diubah menjadi i = 0 tanpa mengubah kondisi, berapa karakter *
yang tercetak ketika n = 5? Jelaskan.
    * **Jawab:** INISIALISASI : `int i = 1`, 2. KONDISI : `i <= 10` , 3. UPDATE : `I++`
      
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

![Gambar Output Percobaan 2](/week%2010/Foto/Ractangle02.PNG)

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

![Gambar Output Percobaan 3](/week%2010/Foto/Triangle02.PNG)

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


### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

Dalam penilaian proyek kelompok, setiap kelompok memperoleh nilai dari sejumlah penilai.
Program menerima jumlah kelompok dan jumlah penilai yang sama untuk setiap kelompok,
kemudian menghitung rata-rata nilai tiap kelompok dan menentukan kelompok dengan ratarata tertinggi. Kasus ini diselesaikan dengan nested loop tanpa perlu menyimpan seluruh nilai:
WHILE (luar) untuk kelompok, FOR (tengah) untuk penilai, dan DO-WHILE (dalam) untuk
mengulang input nilai yang tidak valid.

#### 2.4.1 Kode Program Java

```java

import java.util.Scanner;

public class NilaiKelompok02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahKelompok <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus lebih dari 0");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok : " + nomorKelompok);
                double totalNilai = 0;

                for (int i = 1; i <= jumlahPenilai; i++) {
                    int nilai;
                    do {
                        System.out.print(" Nilai dari Penilai " + i + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println(" Nilai harus bernilai antara 0 sampai 100. Ulangi input");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }

                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata - rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                   rataTertinggi = rataNilai;
                   kelompokTerbaik = nomorKelompok;
                }
                nomorKelompok++;
            }
                System.out.println("=============");
                System.out.println("Kelompok terbaik : " + kelompokTerbaik);
                System.out.println("Rata rata tertinggi : " + rataTertinggi);
        }
        sc.close();
    }
}

```

#### 2.4.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 3](/week%2010/Foto/NilaiKelompok02.PNG)

#### 2.4.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:**  Mengapa totalNilai perlu di-reset di dalam outer loop, tetapi rataTertinggi tidak
boleh di-reset pada setiap kelompok?
    * **Jawab:** Jika nama pelanggan pertama yang dimasukkan adalah "batal", perulangan dilakukan sebanyak 1 kali.
      
* **Pertanyaan 2:** Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan
FOR dijalankan secara keseluruhan?
    * **Jawab:**
     Namun, secara logis di dalam blok kode, kondisi berhentinya adalah ketika variabel namaPelanggan bernilai "batal" Ketika kondisi ini terpenuhi, perintah `break;` dieksekusi untuk menghentikan perulangan secara paksa.

* **Pertanyaan 3:**  Apa yang terjadi jika totalNilai dideklarasikan sebagai int dan rata-rata dihitung
menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.
    * **Jawab:** Teknik ini digunakan agar kontrol penuh kapan perulangan harus berhenti dipindahkan ke dalam blok kode (menggunakan kombinasi if dan break). Hal ini sangat ideal untuk aplikasi kasir yang harus selalu siaga menerima pesanan pelanggan baru tanpa batasan jumlah putaran yang kaku.

* **Pertanyaan 4:**  Mengapa rataTertinggi diberi nilai awal -1, bukan 0? Berikan contoh input yang
membuat hasil salah apabila nilai awalnya 0.
    * **Jawab:** Teknik ini digunakan agar kontrol penuh kapan perulangan harus berhenti dipindahkan ke dalam blok kode (menggunakan kombinasi if dan break). Hal ini sangat ideal untuk aplikasi kasir yang harus selalu siaga menerima pesanan pelanggan baru tanpa batasan jumlah putaran yang kaku.

* **Pertanyaan 5:**   Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan
beserta perannya.
    * **Jawab:** Teknik ini digunakan agar kontrol penuh kapan perulangan harus berhenti dipindahkan ke dalam blok kode (menggunakan kombinasi if dan break). Hal ini sangat ideal untuk aplikasi kasir yang harus selalu siaga menerima pesanan pelanggan baru tanpa batasan jumlah putaran yang kaku.
    
## 3: TUGAS MANDIRI
Kerjakan tugas berikut secara mandiri. Gunakan nested loop, struktur pemilihan jika
diperlukan, dan cukup gunakan variabel biasa (variabel penampung dan penghitung) untuk
menyimpan hasil perhitungan. Buat file terpisah untuk setiap tugas. Commit dan push seluruh
file ke repository daspro-jobsheet8 di GitHub.

* **Tugas No 01** Buat program untuk mencetak pola bilangan 1 sampai nomor baris. Masukkan bilangan bulat
n (n minimal 1). Pada baris pertama tercetak 1, pada baris kedua 1 2, dan seterusnya sampai
baris ke-n. Setelah pola selesai, tampilkan total banyaknya angka yang telah dicetak. Simpan
dengan nama file: Tugas1NoAbsen.java.
Contoh untuk n = 5:


* **Tugas No 02** Buat program untuk menampilkan tabel perkalian berukuran n × n menggunakan nested FOR
atau WHILE. Nilai n minimal 3. Setiap posisi menampilkan hasil perkalian nomor baris dan
nomor kolom. Atur spasi agar keluaran rapi, lalu tampilkan jumlah seluruh angka pada tabel.
Simpan program dengan nama file: Tugas2NoAbsen.java.


* **Tugas No 03** Sebuah pusat perbelanjaan memiliki beberapa toko. Setiap toko melayani sejumlah
pelanggan pada hari yang sama, dan setiap pelanggan membeli beberapa barang. Program
meminta jumlah toko, kemudian jumlah pelanggan pada masing-masing toko, dan jumlah
barang yang dibeli setiap pelanggan. Hitung dan tampilkan total pelanggan serta total barang
per toko, total barang seluruh toko, dan nomor toko dengan jumlah barang terbanyak. Jika
terdapat nilai tertinggi yang sama, tampilkan toko dengan nomor paling kecil. Simpan
program dengan nama file: Tugas3NoAbsen.java.

Ketentuan: jumlah toko minimal 1; jumlah pelanggan dan jumlah barang setiap pelanggan
boleh 0, tetapi tidak boleh negatif. Gunakan perulangan bersarang; data tidak perlu disimpan
satu per satu, cukup diakumulasikan ke variabel total.


### 3.1 Implementasi Kode Tugas

* **Kode Program No 01**

```java

import java.util.Scanner;

public class Tugas1_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        int i = 0;
        int total = 0;
        while (i <= n) {
            int j = 0;
            int k = 1;
            while (j < i) {
                System.out.print(k + " ");
                j++;
                k++;
            }
        total += i;
        i++;
        System.out.println();
        }
        System.out.println("Total Angka tercetak : " + total);
        sc.close();
    }
}
  
```

* **Kode Program No 02**

```java

import java.util.Scanner;

public class Tugas2_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah n : ");
        int n = sc.nextInt();
        int total = 0;
        int a = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
                a = i * j;
                total += a;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka : " + total);
        sc.close();
    }
}

```


* **Kode Program No 03**

```java

import java.util.Scanner;

public class Tugas3_02 {

    public static void main(String[] args) {
        Scanner labib = new Scanner(System.in);
        
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko (minimal 1) : ");
            jumlahToko = labib.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko tidak boleh kurang dari 1. Ulangi ");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;

        String ringkasanPerToko = "";

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\n--- Data Toko " + i + " ---");
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + " : ");
                jumlahPelanggan = labib.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif. Ulangi");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangTokoIni = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;
                do {
                    System.out.print(" Jumlah barang pelanggan ke- " + j + " : ");
                    jumlahBarang = labib.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println( " jumlah barang tidak boleh negatif. Ulangi");
                    }
                } while (jumlahBarang < 0);
                totalBarangTokoIni += jumlahBarang;
            }

            ringkasanPerToko += "Toko " + i + " - pelanggan: " + jumlahPelanggan + " - total barang: " + totalBarangTokoIni + "\n";
            totalBarangSeluruhToko += totalBarangTokoIni;

            if (totalBarangTokoIni > barangTerbanyak) {
                barangTerbanyak = totalBarangTokoIni;
                tokoTerbanyak = i;
            }
        }
            System.out.println("\n======= Ringkasan Rekap ===========");
            System.out.print(ringkasanPerToko);
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);    
            labib.close();
    }
}


```
#### 3.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

* **Hasil Kode Program Nomor 01**

![Gambar Output Percobaan 1 Tugas Mandiri](/week%2010/Foto/Tugas_01.PNG)

* **Hasil Kode Program Nomor 02**
  
![Gambar Output Percobaan 2 Tugas Mandiri](/week%2010/Foto/Tugas_02.PNG)

* **Hasil Kode Program Nomor 03**
  
![Gambar Output Percobaan 2 Tugas Mandiri](/week%2010/Foto/Tugas_03.PNG)

## 4: KESIMPULAN

* **Kesimpulan**
Kesimpulan:
Berdasarkan Jobsheet 8, dapat disimpulkan bahwa perulangan bersarang (nested loop) merupakan perulangan di dalam perulangan yang digunakan untuk membuat pola dan menyelesaikan perhitungan secara berulang. Dengan memahami penggunaan FOR, WHILE, dan DO-WHILE, kita dapat membuat program yang lebih terstruktur, seperti pola bintang, tabel perkalian, serta pengolahan data nilai dan penjualan.

