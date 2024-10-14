import java.util.ArrayList;
import java.util.Scanner;

public class MODUL1_ARIEF {
    static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    static ArrayList<Tiket> tiketDibeli = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tambahkan penerbangan
        daftarPenerbangan.add(new Penerbangan("HAJ293", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("JAE033", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));
        daftarPenerbangan.add(new Penerbangan("YHV378", "BDO, Bandung", "AMQ, AMBON", "04:00", "06:45", 1500000));

        int pilihanMenu = 0;

        while (pilihanMenu != 4) {
            // Tampilkan menu utama
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihanMenu = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihanMenu) {
                case 1:
                    // Tampilkan daftar penerbangan
                    System.out.println("Daftar Penerbangan Tersedia:");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan(i + 1);
                    }
                    break;

                case 2:
                    // Proses pembelian tiket
                    System.out.println("Silahkan isi data diri anda terlebih dahulu!");
                    System.out.print("Masukkan NIK: ");
                    String nik = scanner.nextLine();
                    System.out.print("Masukkan Nama Depan: ");
                    String namaDepan = scanner.nextLine();
                    System.out.print("Masukkan Nama Belakang: ");
                    String namaBelakang = scanner.nextLine();

                    // Tampilkan daftar penerbangan dan pilih penerbangan
                    System.out.println("Terima kasih telah mengisi data. Silahkan pilih penerbangan.");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan(i + 1);
                    }

                    System.out.print("Pilih nomor penerbangan: ");
                    int nomorPenerbanganDipilih = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (nomorPenerbanganDipilih < 1 || nomorPenerbanganDipilih > daftarPenerbangan.size()) {
                        System.out.println("Penerbangan tidak ada!");
                    } else {
                        Penerbangan penerbanganDipilih = daftarPenerbangan.get(nomorPenerbanganDipilih - 1);
                        Tiket tiketBaru = new Tiket(nik, namaDepan, namaBelakang, penerbanganDipilih);
                        tiketDibeli.add(tiketBaru);
                        System.out.println("Pemesanan tiket berhasil dilakukan!");
                    }
                    break;

                case 3:
                    // Tampilkan tiket yang sudah dipesan
                    if (tiketDibeli.isEmpty()) {
                        System.out.println("Pembelian Tiket Tidak Ada.");
                    } else {
                        for (Tiket tiket : tiketDibeli) {
                            tiket.tampilkanPesanan();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}

