import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenInventaris inventaris = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== Menu Inventaris EAD LAB =====");
            System.out.println("1. Tambah Barang Elektronik");
            System.out.println("2. Tambah Barang Non-Elektronik");
            System.out.println("3. Tampilkan Semua Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    inventaris.tambahBarangElektronik();
                    break;
                case 2:
                    inventaris.tambahBarangNonElektronik();
                    break;
                case 3:
                    inventaris.tampilkanSemuaBarang();
                    break;
                case 4:
                    running = false;
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
