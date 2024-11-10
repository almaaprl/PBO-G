// Subclass Sepeda
public class Sepeda extends Kendaraan {
    private String jenisSepeda;

    public Sepeda(String merk, String model, int tahunProduksi, String jenisSepeda) {
        super(merk, model, tahunProduksi);
        this.jenisSepeda = jenisSepeda;
    }

    public String getDetail() {
        return "Sepeda: " + getMerk() + " " + getModel() + " (" + getTahunProduksi() + "), Jenis: Sepeda " + jenisSepeda;
    }
}