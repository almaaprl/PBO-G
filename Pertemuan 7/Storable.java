public interface Storable {
    void tambahItem(String item, int jumlah, String kategori); //kategori makanan/minuman
    void hapusItem(String item, String kategori);
    void tampilkanItem();
}
