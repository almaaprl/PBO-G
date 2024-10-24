class Book {
    String judul;
    String penulis;
    int tahunTerbit;
    String namaPenerbit;
    String kategori;

    // Konstruktor 
    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategori = kategori;
    }

    public void printDetails() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Penerbit: " + namaPenerbit);
        System.out.println("Kategori: " + kategori);
    }
}

public class Main {
    public static void main(String[] args) {
        Book buku1 = new Book("PBO", "Mr X", 2024, "PT. Apa", "Coding");
        buku1.printDetails();
    }
}
