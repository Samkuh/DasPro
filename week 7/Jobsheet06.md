# JOBSHEET 7 - STUDI KASUS PEMILIHAN DENGAN GIT DAN GITHUB

**Identitas Mahasiswa:**
* **Nama:** [ Achmad Labib Zainullah ]
* **NIM:** [ 264107020149 ]
* **Kelas / No. Presensi:** [ TI - 1D / 02 ]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan studi kasus menggunakan struktur pemilihan dasar dan
pemilihan bersarang
2. Mahasiswa mampu menyimpan dan mengumpulkan pekerjaan menggunakan Git dan GitHub
melalui Visual Studio Code
3. Mahasiswa mampu berkolaborasi dengan teman menggunakan GitHub


---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.3 Percobaan 2: Studi Kasus 1 – Pemilihan Dasar

Kedai Kopi Senja menjual Kopi Susu Gula Aren seharga Rp18.000 per cup dan memberikan
diskon 10% untuk pembelian minimal Rp100.000. Pemilik kedai membutuhkan program kasir
sederhana untuk menghitung total bayar dan kembalian. Buatlah program Java berdasarkan flowchart
berikut.

![Gambar FlowChart](/week%207/foto/Foto%20FlowChart.PNG)

#### 2.3.1 Kode Program Java
```java
import java.util.Scanner;

public class StudiKasus102 {

    public static void main(String[] args) {

        int jumlahCup, hargaBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang, hargaCup;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Harga Per Cup: ");
        hargaCup = sc.nextInt();
        System.out.print("Masukkan Jumlah Cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan Nominal Uang Bayar: ");
        hargaBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }

        System.out.println("Total Harga: Rp." + totalHarga);
        System.out.println("diskon: Rp." + diskon);
        System.out.println("Total Bayar: Rp." + totalBayar);

        if (hargaBayar >= totalBayar) {
            kembalian = hargaBayar - totalBayar;
            System.out.println("Kembalian: Rp." + kembalian);
        } else {
            kurang = totalBayar - hargaBayar;
            System.out.println("Kurang: Rp" + kurang);
        }
    }
}
```

#### 2.3.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Studi Kasus 1](/week%207/foto/Hasil%20StudiKasus%2001.PNG)

---

### 2.4 Percobaan 3: Studi Kasus 2 – Pemilihan Bersarang

* Bagian Kemahasiswaan Politeknik Negeri Malang menerbitkan surat mengenai validasi
kelengkapan dokumen prestasi mahasiswa Tahun Kegiatan 2026 Tahap I. Berdasarkan ketentuan
dalam surat tersebut, dana penghargaan dari institusi diberikan kepada mahasiswa dengan ketentuan
sebagai berikut:
    * a. Untuk perlombaan yang diselenggarakan oleh BELMAWA, BAKORMA, atau Mandiri, dana
penghargaan hanya diberikan kepada peraih Juara 1, 2, atau 3. Juara Harapan atau peserta tidak
memperoleh dana penghargaan.
    * b. Untuk Program Kreativitas Mahasiswa (PKM), dana penghargaan diberikan kepada tim yang
lolos pendanaan.
    * c. Kegiatan di luar kedua ketentuan di atas (Lainnya) tidak memperoleh dana penghargaan.
    
* Kegiatan di luar kedua ketentuan di atas (Lainnya) tidak memperoleh dana penghargaan.
Selain itu, mahasiswa yang memenuhi ketentuan a atau b wajib mengupload 4 dokumen secara
lengkap di SIAKAD, yaitu Surat Tugas, Sertifikat, Foto Kegiatan, dan Poster Kegiatan. Jika dokumen
yang diupload kurang dari 4, data dianggap tidak lengkap dan dana penghargaan tidak diberikan.

* Buatlah program untuk membantu Admin Kemahasiswaan mengecek status dana penghargaan
mahasiswa. Program hanya menanyakan data yang diperlukan sesuai jenis kegiatan, lalu menampilkan
status dana penghargaan beserta alasannya. Jika dokumen tidak lengkap, tampilkan juga jumlah
dokumen yang masih kurang. Selesaikan menggunakan pemilihan bersarang (nested IF) dengan
kedalaman maksimal 3 tingkat. Gunakan ketentuan data masukan berikut:

![Gambar Output Tabel Studi Kasus 2](/week%207/foto/Tabel%20Studi%20Kasus%2002.PNG)

#### 2.4.1 Kode Program Java

```java

import java.util.Scanner;

public class StudiKasus202 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan, statusPendanaan;
        int jumlahDokumen, peringkatJuara;

        System.out.print("Masukkan Nama Mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan Jenis Kegiatan (Belmawa/Bakorma/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Masukkan Status Pendanaan Tim (Lulus/Tidak Lulus): ");
        statusPendanaan = sc.nextLine();
        System.out.print("Masukkan Peringkat Juara (1/2/3): ");
        peringkatJuara = sc.nextInt();
        System.out.print("Masukkan Jumlah Dokumen Yang Sudah Diupload (1/2/3/4): ");
        jumlahDokumen = sc.nextInt();

        System.out.println("------------------------------");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Jenis Kegiatan (Belmawa/Bakorma/Mandiri/Pkm/Lainnya) : " + jenisKegiatan);
        System.out.println("Jumlah Dokumen: " + jumlahDokumen);
        System.out.println("Peringkat Juara: " + peringkatJuara);

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") 
            || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 1) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 3 Dokumen). Dana Penghargaan Tidak Di Berikan");
                } else if (jumlahDokumen == 2) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 2 Dokumen). Dana Penghargaan Tidak Di Berikan");
                } else if (jumlahDokumen == 3) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 1 Dokumen). Dana Penghargaan Tidak Di Berikan");
                } else {
                    System.out.println("Status: Dokumen Lengkap Dan Juara 1/2/3. Dana Penghargaan Di Berikan");
                }
            } else {
                System.out.println("Status: Juara Harapan Atau Peserta.Tidak Memperoleh Dana Penghargaan");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.println("");
            if (statusPendanaan.equalsIgnoreCase("LULUS")) {
                if (jumlahDokumen == 1) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 3 Dokumen). Dana Penghargaan Tidak Di Berikan");
                } else if (jumlahDokumen == 2) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 2 Dokumen). Dana Penghargaan Tidak Di Berikan");
                } else if (jumlahDokumen == 3) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 1 Dokumen). Dana Penghargaan Tidak Di Berikan");
                } else {
                    System.out.println("Status: Dokumen Lengkap Dan Status Pendanaan lulus. Dana Penghargaan Di Berikan");
                }
            } else {
                System.out.println("Status: Status Pendanaan Tidak Lulus.Tidak Memperoleh Dana Penghargaan");
            }
        } else {
            System.out.println("Status: Mengikuti Kegiatan Yang Tidak Diakui Kampus.Tidak Memperoleh Dana Penghargaan");
        }
    }
}

```

#### 2.4.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Gambar Output Studi Kasus 2](/week%207/foto/Hasil%20StudiKasus%2002.PNG)


## 3: KESIMPULAN

**Kesimpulan**
* Berdasarkan Jobsheet 6 Dasar Pemrograman 2026, dapat disimpulkan bahwa praktikum ini membahas penerapan struktur pemilihan dasar dan pemilihan bersarang (nested if) dalam pemrograman Java melalui beberapa studi kasus. Mahasiswa dilatih untuk membuat program yang mampu mengambil keputusan berdasarkan kondisi tertentu, seperti pemberian diskon, perhitungan pembayaran, serta penentuan hak dana penghargaan mahasiswa
* Selain kemampuan pemrograman, jobsheet ini juga memberikan pemahaman mengenai penggunaan Git dan GitHub melalui Visual Studio Code, mulai dari membuat repository, melakukan clone, add, commit, push, pull, dan sync. Mahasiswa juga belajar melakukan kolaborasi dengan teman melalui fitur repository dan melakukan uji silang terhadap program yang dibuat.
* Dengan demikian, praktikum ini tidak hanya meningkatkan kemampuan dalam membuat program Java menggunakan percabangan, tetapi juga membiasakan mahasiswa menerapkan version control, pengelolaan kode, pengujian program, dan kolaborasi menggunakan GitHub dalam proses pengembangan perangkat lunak.

