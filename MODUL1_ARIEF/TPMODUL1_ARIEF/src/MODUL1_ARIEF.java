import java.util.ArrayList;
import java.util.Scanner;

public class MODUL1_ARIEF {
    public static void main(String[] args) {
        // ArrayList untuk menyimpan data penerbangan
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();

        // Menambahkan data penerbangan
        daftarPenerbangan.add(new Penerbangan("GA123", "Soekarno-Hatta", "Ngurah Rai", "06:00", "08:00", 1500000));
        daftarPenerbangan.add(new Penerbangan("JT456", "Soekarno-Hatta", "Juanda", "09:00", "10:30", 900000));
        daftarPenerbangan.add(new Penerbangan("SQ789", "Changi", "Soekarno-Hatta", "14:00", "16:00", 2500000));

        // Scanner untuk input data dari user
        Scanner scanner = new Scanner(System.in);

        // Menampilkan daftar penerbangan
        System.out.println("Daftar Penerbangan Tersedia:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + daftarPenerbangan.get(i).getNomorPenerbangan());
        }

        // Memilih penerbangan
        System.out.print("Pilih nomor penerbangan yang ingin dipesan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (pilihan < 1 || pilihan > daftarPenerbangan.size()) {
            System.out.println("Nomor penerbangan tidak valid.");
            return;
        }

        Penerbangan penerbanganTerpilih = daftarPenerbangan.get(pilihan - 1);

        // Memasukkan data penumpang
        System.out.print("Masukkan NIK: ");
        String NIK = scanner.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = scanner.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = scanner.nextLine();

        // Membuat objek Penumpang
        Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

        // Menampilkan detail pesanan
        System.out.println("\n--- Detail Pesanan Tiket ---");
        penerbanganTerpilih.tampilDaftarPenerbangan();
        penumpang.tampilDaftarPenumpang();

        System.out.println("Tiket berhasil dipesan!");
    }
}
