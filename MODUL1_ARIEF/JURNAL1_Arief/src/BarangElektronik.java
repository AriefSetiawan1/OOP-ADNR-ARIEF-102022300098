public class BarangElektronik extends Barang {
    //Atribut
    private String garansi;
    // Constructor BarangElektronik
    public BarangElektronik(String garansi ,String nama, Integer jumlah, double harga) {
        super(nama, jumlah, harga); 
        this.garansi = garansi;
    }

    // Getter dan Setter untuk garansi
    public String getGaransi() {
        return garansi;
    }

    

    // Override method tampilkanData
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        // Tampilan
        System.out.println("Garansi: "+garansi);
    }
}
