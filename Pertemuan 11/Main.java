public class Main {
    public static void main(String[] args) {
        Penyewaan rental = new Penyewaan();

        // menambahkan kendaraan
        Mobil mobil1 = new Mobil("Honda", "HRV", 2018, 4);
        Mobil mobil2 = new Mobil("Porsche", "Taycan", 2019, 4);
        Mobil mobil3 = new Mobil ("Toyota", "Alphard", 2020, 4);
        Motor motor1 = new Motor("Honda", "Scoopy", 2019, 2);
        Motor motor2 = new Motor("Yamaha", "Grand Filano", 2024, 2);
        Sepeda sepeda1 = new Sepeda("Exotic", "ET 5503 MX", 2021, "Citybike");
        Sepeda sepeda2 = new Sepeda("Polygon", "Monarch", 2023, "Gunung");
        
        rental.tambahKendaraan(mobil1);
        rental.tambahKendaraan(mobil2);
        rental.tambahKendaraan(mobil3);
        rental.tambahKendaraan(motor1);
        rental.tambahKendaraan(motor2);
        rental.tambahKendaraan(sepeda1);
        rental.tambahKendaraan(sepeda2);

        // menambahkan penyewa
        rental.tambahPenyewa("Alma", mobil2);
        rental.tambahPenyewa("Iqbal", sepeda2);

        rental.cetakListKendaraan();
        System.out.println();
        rental.cetakListPenyewa();
    }
}