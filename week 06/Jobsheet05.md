# JOBSHEET 6 - PEMILIHAN BERSARANG

**Identitas Mahasiswa:**
* **Nama:** [ Achmad Labib Zainullah ]
* **NIM:** [ 264107020149 ]
* **Kelas / No. Presensi:** [ TI - 1D / 02 ]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks
pemilihan bersarang
2. Mahasiswa mampu menerapkan sintaks pemilihan bersarang ke dalam program Jawa
3. Mahasiswa mampu menerapkan operator logika &&, ||, dan ! pada struktur pemilihan


---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi


Seorang mahasiswa akan mendaftar ujian skripsi. Sistem SIMTA akan memeriksa syarat
administrasi terlebih dahulu, yaitu mahasiswa harus bebas kompen. Jika syarat ini terpenuhi,
sistem kemudian memeriksa catatan log bimbingan. Untuk bisa mendaftar ujian, mahasiswa
harus memiliki minimal 8 kali bimbingan dengan pembimbing 1 dan minimal 4 kali bimbingan
dengan pembimbing 2. Jika semua syarat terpenuhi, mahasiswa dapat melanjutkan ke proses
pendaftaran ujian skripsi. Jika tidak, sistem akan menampilkan alasan kegagalan. 

#### 2.1.1 Kode Program Java
```java

import java.util.Scanner;

public class nestedUjianSkripsi02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah Mahasiswa Sudah Bebas Kompen ? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >=4) {
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
            pesan = "Gagal! Log bimbingan P1 Kurang dari 8 Kali dan P2 Kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
            pesan = "Gagal log bimbingan P1 belum mencapai 8 kali";
            } else {
            pesan = "Gagal log bimbingan P2 belum mencapai 4 kali";
            }
        }else {
            pesan = "Gagal mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 1](/week%206/Foto/hasil%20nested%20skripsi.PNG)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?
    * **Jawab:** Jika kita memasukkan input `no` maka program akan membaca bahwa nilai dari input tersebut adalah `false` karena yang kita    tulis pada program bada bagian `if string` kita memasukkan input `yes` maka hasil yang dihasilkan akan masuk pada program bagian `else`   langsung.
* **Pertanyaan 2:** Jelaskan maksud dari potongan kode berikut!?
    * **Jawab:** Perintah tersebut masuk pada `If Else` yang mempunyai makna `true` Jika kondisi didalam kurung terpenuhi. yaitu jika
jumlah bimbingan P1 lebih dari sama dengan 8 dan P2 lebih dari sama dengan 4.
* **Pertanyaan 3:** Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!
    * **Jawab:** Sistem SIMTA akan memeriksa syarat
administrasi terlebih dahulu, yaitu mahasiswa harus bebas kompen. Jika syarat ini terpenuhi,
sistem kemudian memeriksa catatan log bimbingan. Untuk bisa mendaftar ujian, mahasiswa
harus memiliki minimal 8 kali bimbingan dengan pembimbing 1 dan minimal 4 kali bimbingan
dengan pembimbing 2. Jika semua syarat terpenuhi, mahasiswa dapat melanjutkan ke proses
pendaftaran ujian skripsi. Jika tidak, sistem akan menampilkan output gagal dengan alasan yang berbeda sesuai tahap berapa yang gagal .

---

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

Sistem WiFi kampus hanya dapat digunakan oleh mahasiswa atau dosen yang akunnya
tidak diblokir. Program menerima informasi apakah pengguna merupakan mahasiswa, dosen,
dan apakah akun pengguna sedang diblokir. Akses diberikan apabila pengguna merupakan
mahasiswa atau dosen, dan akun pengguna tidak diblokir. Percobaan ini digunakan untuk
mempraktikkan operator logika && (AND), || (OR), dan ! (NOT).

#### 2.2.1 Kode Program Java

```java

import java.util.Scanner;

public class operatorLogikaWifi02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa, dosen, akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses Wifi Diberikan");
        } else {
            System.out.println("Akses Wifi Ditolak");
        }
    }
}

```

#### 2.2.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 2](/week%206/Foto/hasil%20operator%20logika%20wifi.PNG)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jelaskan fungsi operator ||, &&, dan ! pada kondisi program tersebut.
    * **Jawab:** Fungsi operator `||` memiliki arti OR yaitu jika kita ingin membuat kondisi bila satu kondisi `true` maka otomatis kondisi yang satunya lagi akan `true` juga pada program diatas digunakan untuk mengetahui apakah anda dosen atau mahasiswa. Fungsi operator `&&` memiliki arti `AND` yaitu jika kita ingin membuat kondisi bila satu kondisi `true` maka kondisi satunya lagi akan di cek juga jika `true` maka kondisi bernilai `true` jika false maka kondisi akan bernilai `false` pada program diatas digunakan untuk mengecek apakah anda dosen/mahasiswa dan akun anda tidak diblokir. Fungsi operator `!` memiliki arti Negasi yaitu jika kita ingin membuat kondisi `true` maka kita harus memasukkan input sebaliknya contohnya jika kita ingin output `true` kita harus input nilai `false` pada program diatas digunakan untuk mengetahui apakah akun anda diblokir 
* **Pertanyaan 2:** Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai mahasiswa = false?
    * **Jawab:** Karena pada program diatas menggunakan perintah `||` yang memiliki arti atau makna sebagai `OR` jika satu`true` maka yang lain juga ikut `true` meskipun yang lain bernilai `false`
* **Pertanyaan 3:** Ubah operator || menjadi &&. Jalankan kembali program menggunakan data uji 1 dan 2. Apa yang terjadi dan mengapa?
    * **Jawab:** Jika operator || pada (mahasiswa || dosen) diubah menjadi &&, maka akses WiFi hanya diberikan jika pengguna adalah mahasiswa DAN dosen sekaligus, serta akun tidak sedang diblokir. Jadi, jika data uji 1 atau 2 hanya memiliki salah satu dari mahasiswa atau dosen bernilai true, hasilnya berubah menjadi `Akses Wifi Ditolak`
* **Pertanyaan 4:** Pada ekspresi mahasiswa || dosen, kapan kondisi dosen tidak perlu dievaluasi? Jelaskan berdasarkan short-circuit          evaluation.
    * **Jawab:** Kondisi dosen tidak perlu dievaluasi ketika mahasiswa bernilai `true`. Hal ini karena operator `||` berarti `OR` (atau). Jika bagian pertama sudah `true`, hasil keseluruhan pasti `true`, sehingga Java tidak perlu memeriksa kondisi kedua.
* **Pertanyaan 5:** Pada ekspresi (mahasiswa || dosen) && !akunDiblokir, kapan kondisi !akunDiblokir tidak perlu dievaluasi? Jelaskan.
    * **Jawab:** Kondisi `!akunDiblokir` tidak perlu dievaluasi ketika (mahasiswa || dosen) bernilai `false`. Hal ini karena operator `&&` berarti `AND` (dan). Jika kondisi pertama sudah `false`, hasil keseluruhan pasti `false`, sehingga Java tidak perlu mengevaluasi kondisi kedua.
 
### 2.3 Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratorium

Mahasiswa dapat menggunakan laboratorium di luar jadwal kuliah apabila statusnya aktif
dan tidak sedang mendapatkan sanksi. Jika syarat tersebut terpenuhi, sistem melakukan
pemeriksaan kedua. Akses laboratorium diberikan apabila mahasiswa memiliki izin dosen
atau merupakan asisten laboratorium. Kasus ini menggabungkan pemilihan bersarang dengan
operator logika.

#### 2.3.1 Kode Program Java

```java

import java.util.Scanner;

public class nesdetAksesLab02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisaksi, punyaIzinDosen, asistenLab;

        System.out.println("Jawab lah True Atau False");

        System.out.print("Apakah mahasiswa aktif: ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang di sakasi: ");
        sedangDisaksi = sc.nextBoolean();
        System.out.print("Apakah mahasiswa punya izin dosen: ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah mahasiswa merupakan asisten Lab: ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisaksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses labolatorium diberikan");
            } else {
                System.out.println("Akses ditolak : membutuhkan izin dosen atau status asisten Lab");
            }
        } else {
            System.out.println("Akses ditolak : status mahasiswa tidak memenuhi syarat");
        }
    }
}

```

#### 2.3.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Percobaan 3](/week%206/Foto/hasil%20neted%20akses%20lab.PNG)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Mengapa pemeriksaan punyaIzinDosen || asistenLab ditempatkan di dalam IF pertama?
    * **Jawab:** Karena mahasiswa harus memenuhi syarat utama terlebih dahulu, yaitu mahasiswa aktif dan tidak sedang disanksi. Setelah syarat tersebut terpenuhi, barulah program memeriksa apakah mahasiswa memiliki izin dosen atau merupakan asisten lab.
      Urutanya :
      * mahasiswaAktif && !sedangDisaksi → syarat utama.
      * punyaIzinDosen || asistenLab → syarat tambahan.
      * Jika semua terpenuhi → akses laboratorium diberikan.
* **Pertanyaan 2:** Jelaskan fungsi operator &&, ||, dan ! pada program tersebut.
    * **Jawab:**
      * && -- AND -- Kedua kondisi harus bernilai true. Digunakan untuk memastikan mahasiswa aktif dan tidak sedang disanksi
      * ! -- NOT -- Membalik nilai boolean. !sedangDisaksi berarti mahasiswa tidak sedang disanksi.
* **Pertanyaan 3:** Apakah syarat akses dapat ditulis menjadi satu kondisi: mahasiswaAktif &&
!sedangDisanksi && (punyaIzinDosen || asistenLab)? Jelaskan apakah keputusan akses
akhirnya sama.
    * **Jawab:** Ya, dapat. Keputusan akses akhirnya sama, karena kedua bentuk program memiliki syarat logika yang sama. Syarat akses adalah:
      * Mahasiswa aktif -- AND
      * tidak sedang disanksi -- AND
      * (punya izin dosen OR asisten lab).
    * Perbedaannya adalah Nested IF lebih mudah digunakan jika ingin memberikan alasan penolakan yang berbeda.
* **Pertanyaan 4:** Apa keuntungan menggunakan Nested IF pada kasus ini dibandingkan hanya satu IF jika
sistem perlu menampilkan alasan penolakan yang berbeda?
    * **Jawab:** Keuntungan `Nested IF` adalah program dapat membedakan alasan penolakan berdasarkan tahap pemeriksaan. Dengan `satu if` saja, logika tetap bisa dibuat, tetapi untuk membedakan alasan penolakan biasanya diperlukan kondisi tambahan sehingga kode dapat menjadi kurang terstruktur.
* **Pertanyaan 5:** Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan
satu kombinasi yang menyebabkan akses ditolak pada level kedua.
    * **Jawab:**
    * **Kombinasi 01**
      * ![Gambar Output Kombinasi 01](/week%206/Foto/hasil%20kombinasi%2001.PNG)
    * **Kombinasi 02**
      * ![Gambar Output Kombinasi 02](/week%206/Foto/hasil%20kombinasi%2002.PNG)

    
## 3: TUGAS MANDIRI

* **Tugas No 01** Implementasikan flowchart yang telah Anda buat pada Latihan 2 Pertemuan 6 terkait
    sistem diskon toko buku ke dalam program Java. Program wajib menerapkan struktur
    pemilihan bersarang (Nested IF). Gunakan operator logika apabila diperlukan
* **Tugas No 01** Buatlah program Java untuk sistem seleksi calon asisten praktikum berdasarkan ketentuan berikut:
  * Mahasiswa dapat mengikuti seleksi apabila berstatus aktif dan tidak sedang
    mendapatkan sanksi akademik.
  * Jika syarat tersebut terpenuhi, mahasiswa harus memenuhi syarat berikutnya yaitu
    nilai Dasar Pemrograman minimal 80 atau memiliki sertifikat kompetensi
    pemrograman.
  * Jika lolos 2 syarat tersebut, mahasiswa akan dipanggil untuk mengikuti wawancara.
    Mahasiswa diterima sebagai asisten apabila nilai wawancara minimal 75.
  * Program harus menampilkan alasan apabila mahasiswa gagal pada setiap tahap
    seleksi.
  * Gunakan pemilihan bersarang dan operator logika. Simpan file dengan nama
    tugas2SeleksiAsistenNoPresensi.java.

### 3.1 Implementasi Kode Tugas

* **Kode Program No 01**

```java

import java.util.Scanner;

public class DiskonTokoBuku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hariApa, jenisBuku;
        int diskonKamus, diskonNovel, diskonSelainBuku, jumlahBuku, diskonNovel2;

        System.out.print("Hari apa anda membeli buku di sini ? ");
        hariApa = sc.nextLine();
        System.out.print("Jenis buku yang anda beli: ");
        jenisBuku = sc.nextLine();
        System.out.print("Berapa buku yang anda beli: ");
        jumlahBuku = sc.nextInt();

        diskonKamus = 10 + 2;
        diskonNovel = 7 + 2;
        diskonNovel2 = 7 + 1;
        diskonSelainBuku = 5;

        if (hariApa.equalsIgnoreCase("RABU")) {
            if (jenisBuku.equalsIgnoreCase("KAMUS")) {
                System.out.println("diskon: " + diskonKamus + " %");
            } else if (jenisBuku.equalsIgnoreCase("NOVEL")) {
                if (jumlahBuku > 3) {
                    System.out.println("diskon: " + diskonNovel + " %");
                } else if (jumlahBuku <= 3) {
                    System.out.println("diskon: " + diskonNovel2 + " %");
                }
            } else {
                if (jumlahBuku > 3) {
                    System.out.println("Diskon: " + diskonSelainBuku + " %");
                } else {
                    System.out.println("Tidak ada diskon");
                }
            }
        }
    }
}
  
```

* **Kode Program No 02**

```java

import java.util.Scanner;

public class Tugas2SeleksiAsisten02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean status, sanksi, memilikiSertif;
        int nilaiDasar, nilaiWawancara;

        System.out.print("Apakah mahasiswa berstatus aktif ? (true/false) ");
        status = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi ? (true/false) ");
        sanksi = sc.nextBoolean();
        System.out.print("Apakah mahasiswa memiliki sertifikat kompetensi pemrograman ? (true/false) ");
        memilikiSertif = sc.nextBoolean();
        System.out.print("Berapa nilai dasar pemrograman mahasiswa : ");
        nilaiDasar = sc.nextInt();
        System.out.print("Berapa nilai wawancara mahasiswa : ");
        nilaiWawancara = sc.nextInt();

        if (status && !sanksi) {
            if (nilaiDasar >= 80 || memilikiSertif) {
                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa Diterima Menjadi Asisten");
                } else {
                    System.out.println("Mahasiswa gagal pada tahap wawancara. karena nilai kurang dari 75 ");
                }
            } else {
                System.out.println("Mahasiswa gagal menjadi asisten. karena gagal pada tahap nilai dan sertifikat ");
            }
        } else {
            System.out.println("Mahasiswa gagal pada tahap pertama. Mahasisa tidak aktif dan terkena sanksi");
        }
    }
}

```

#### 3.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

* **Hasil Kode Program Nomor 01**
![Gambar Output Percobaan 1 Tugas Mandiri](/week%206/Foto/hasil%20diskon%20toko%20buku.PNG)

* **Hasil Kode Program Nomor 01**
![Gambar Output Percobaan 2 Tugas Mandiri](/week%206/Foto/hasil%20tugas%202%20seleksi%20asisten.PNG)


## 4: KESIMPULAN

* **Kesimpulan** obsheet 6 Dasar Pemrograman 2026 dari Politeknik Negeri Malang ini berisi panduan praktikum mengenai struktur pemilihan bersarang (Nested IF) dan operator logika (&&, ||, !) dalam bahasa Java. Melalui tiga modul percobaan—yaitu pengecekan syarat ujian skripsi, akses WiFi kampus, dan izin laboratorium—mahasiswa dilatih untuk menyusun logika kondisi yang kompleks.
