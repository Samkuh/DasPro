# JOBSHEET 5 - PEMILIHAN BERSARANG

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

![Contoh Gambar Output Percobaan 1](/contoh-gambar.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?
  * **Jawab:** Perintah `if` digunakan untuk mengeksekusi sebuah blok kode hanya jika kondisi bernilai `true`.
* **Pertanyaan 2:** Jelaskan maksud dari potongan kode berikut!?
  * **Jawab:** Program akan melewati blok `if` dan mengeksekusi blok `else` (jika ada).
* **Pertanyaan 3:** Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!
  * **Jawab:** Program akan melewati blok `if` dan mengeksekusi blok `else` (jika ada).

---

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

Sistem WiFi kampus hanya dapat digunakan oleh mahasiswa atau dosen yang akunnya
tidak diblokir. Program menerima informasi apakah pengguna merupakan mahasiswa, dosen,
dan apakah akun pengguna sedang diblokir. Akses diberikan apabila pengguna merupakan
mahasiswa atau dosen, dan akun pengguna tidak diblokir. Percobaan ini digunakan untuk
mempraktikkan operator logika && (AND), || (OR), dan ! (NOT).

#### 2.2.1 Tabel Pengujian Parameter Output

Berikut adalah hasil uji coba program dengan beberapa variasi masukan *dummy*:

| No | Input Parameter | Output yang Dihasilkan | Status Eksekusi |
| :---: | :--- | :--- | :---: |
| 1 | `Case 1` | "Pilihan 1 Dipilih" | Valid |
| 2 | `Case 2` | "Pilihan 2 Dipilih" | Valid |
| 3 | `Default` | "Pilihan Tidak Tersedia" | Invalid |

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Mengubah struktur `if-else` menjadi *Ternary Operator*.
- [x] **Tugas 2:** Membuat program berdasarkan *Flowchart* penentuan SKS.
- [ ] **Tugas 3:** Mengimplementasikan studi kasus parkir & antrean.

### 3.1 Implementasi Kode Tugas

```java
// Contoh Kode Program Tugas Mandiri
public class TugasMandiri {
    public static void main(String[] args) {
        int sks = 20;
        String status = (sks <= 24) ? "KRS Valid" : "Melebihi Batas";
        System.out.println(status);
    }
}
```

---

## 4: KESIMPULAN

Tuliskan paragraf kesimpulan di sini. Secara singkat, struktur pemilihan sangat penting digunakan untuk mengatur alur jalannya program (*flow control*) berdasarkan variabel atau pilihan yang ditentukan oleh pengguna.
