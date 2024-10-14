public class Barang {
    //Atribut
    private String nama;
    private int jumlah;
    private double harga;
    // Constructor Barang
    public Barang(String nama, Integer jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    public Integer getJumlah() {
        return jumlah;
    }
    public double getHarga() {
        return harga;
    }



    // Method tampilkanData
    public void tampilkanData() {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Jumlah Barang : " + jumlah);
        System.out.println("Harga Barang : " + harga);

    }
}
