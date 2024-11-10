public class Main {
    public static void main(String[] args)  {
        Kucing kucing = new Kucing("Paseo", 3, "Scottish Fold");
        System.out.println("Info Kucing:");
        kucing.infoHewan();
        kucing.suara();
        kucing.makan();
        kucing.makan("Ikan");

        System.out.println();

        Burung burung = new Burung("Rio", 1, "Hijau");
        System.out.println("Info Burung:");
        burung.infoHewan();
        burung.suara();
        burung.makan();
        burung.makan("Biji-bijian");
    }
}
