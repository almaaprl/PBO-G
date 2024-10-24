// Kelas induk (Superclass)
class Kendaraan {
    String nama;
    int kecepatanMaks;

    public Kendaraan(String nama, int kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }
}

// Kelas turunan (Subclass)
class Mobil extends Kendaraan {
    public Mobil(String nama, int kecepatanMaks) {
        super(nama, kecepatanMaks); // Memanggil constructor 
    }

    public void berjalan() {
        System.out.println(nama + " melaju di jalan dengan kecepatan " + kecepatanMaks + " km/jam.");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Honda Civic", 200);
        mobil1.berjalan();  // Output: Honda Civic melaju di jalan dengan kecepatan 200 km/jam.
    }
}
