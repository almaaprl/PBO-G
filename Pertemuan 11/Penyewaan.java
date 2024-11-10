import java.util.ArrayList;
import java.util.List;

public class Penyewaan {
    private List<Kendaraan> daftarKendaraan = new ArrayList<>();
    private List<String> daftarPenyewa = new ArrayList<>();

    public void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
    }

    public void tambahPenyewa(String namaPenyewa, Kendaraan kendaraan) {
        daftarPenyewa.add("Penyewa: " + namaPenyewa + ", Kendaraan: " + kendaraan.getDetail());
    }

    public void cetakListKendaraan() {
        System.out.println("List Kendaraan yang Tersedia:");
        for (Kendaraan kendaraan : daftarKendaraan) {
            System.out.println(kendaraan.getDetail());
        }
    }

    public void cetakListPenyewa() {
        System.out.println("List Penyewa dan Kendaraan yang Disewa:");
        for (String penyewa : daftarPenyewa) {
            System.out.println(penyewa);
        }
    }
}