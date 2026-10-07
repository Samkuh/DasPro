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
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 3 Dokumen). Dana Penghargaan Tidak Berikan");
                } else if (jumlahDokumen == 2) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 2 Dokumen). Dana Penghargaan Tidak Berikan");
                } else if (jumlahDokumen == 3) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 1 Dokumen). Dana Penghargaan Tidak Berikan");
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
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 3 Dokumen). Dana Penghargaan Tidak Berikan");
                } else if (jumlahDokumen == 2) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 2 Dokumen). Dana Penghargaan Tidak Berikan");
                } else if (jumlahDokumen == 3) {
                    System.out.println("Status: Dokumen Tidak Lengkap (Kurang 1 Dokumen). Dana Penghargaan Tidak Berikan");
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