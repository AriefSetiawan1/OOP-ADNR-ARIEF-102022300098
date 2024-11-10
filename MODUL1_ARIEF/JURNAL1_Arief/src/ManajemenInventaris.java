import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Deklarasi ArrayList untuk menyimpan barang
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    
    private Scanner scanner = new Scanner(System.in);

    // Method untuk menambah barang elektronik

        public void tambahBarangElektronik() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Masukkan Garansi Barang: ");
        String garansi = scanner.nextLine();

        BarangElektronik barangElektronik = new BarangElektronik(garansi, nama, jumlah, harga );
        daftarBarang.add(barangElektronik);
        System.out.println("Barang Elektronik berhasil ditambahkan!");
        scanner.close();
    }
    
        // Membuat objek barang elektronik baru

    // Method untuk menambah barang non-elektronik
        public void tambahBarangNonElektronik() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Masukkan Material Barang: ");
        String material = scanner.nextLine();

        BarangNonElektronik barangNonElektronik = new BarangNonElektronik(nama, jumlah, harga, material);
        daftarBarang.add(barangNonElektronik);
        System.out.println("Barang Non-Elektronik berhasil ditambahkan!");
        scanner.close();
    }

        // Scanner
            public void tampilkanSemuaBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada barang yang terdaftar.");
        } else {
            for (Barang barang : daftarBarang) {
                System.out.println("=============================");
                barang.tampilkanData();
                System.out.println("=============================");
            }
        }
        scanner.close();
    }

        // Input Nama Barang, Jumlah Barang, Harga Barang, Material Barang

        // Membuat objek barang non-elektronik baru


    // Method untuk menampilkan semua barang memakai if-else (jika tidak ada barang akan menampilkan tidak ada barang dalam inventaris)
    

}

