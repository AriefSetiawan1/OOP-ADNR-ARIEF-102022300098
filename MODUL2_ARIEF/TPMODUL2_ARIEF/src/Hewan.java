public class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void suara() {
        System.out.println("Hewan bersuara");
    }

    public void makan() {
        System.out.println("Hewan makan");
    }

    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }

    public void infoHewan() {
        System.out.println("Nama: ini adalah " + nama);
        System.out.println("Umur: " + umur);
    }
}
