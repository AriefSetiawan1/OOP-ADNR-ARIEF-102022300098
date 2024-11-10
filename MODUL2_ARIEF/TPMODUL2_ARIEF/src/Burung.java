public class Burung extends Hewan {

    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void suara() {
        System.out.println("cicuit");

    }

    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("warna bulu:" + warnaBulu);
    }
}
