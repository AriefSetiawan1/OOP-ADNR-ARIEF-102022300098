public class Tiket {
    private String nik;
    private String namaDepan;
    private String namaBelakang;
    private Penerbangan penerbangan;

    public Tiket(String nik, String namaDepan, String namaBelakang, Penerbangan penerbangan) {
        this.nik = nik;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.penerbangan = penerbangan;
    }

    public void tampilkanPesanan() {
        System.out.println("======= Detail Tiket Penerbangan =======");
        System.out.println("Nomor Induk Kependudukan: " + nik);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
        System.out.println("Nomor Penerbangan: " + penerbangan.getNomorPenerbangan());
        System.out.println("Harga Tiket: Rp." + penerbangan.getHargaTiket());
        System.out.println("-------------------------------");
    }
}
