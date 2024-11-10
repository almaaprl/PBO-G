// subclass Motor
public class Motor extends Kendaraan {
    private int jumlahRoda;

    public Motor(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    public String getDetail() {
        return "Motor: " + getMerk() + " " + getModel() + " (" + getTahunProduksi() + "), Roda: " + jumlahRoda;
    }
}