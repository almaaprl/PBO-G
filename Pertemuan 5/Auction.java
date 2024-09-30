import java.util.ArrayList;

public class Auction {
    private ArrayList<Lot> lots; //daftar Lot dalam auction
    private int nextLotNumber; //nomor unik untuk lot berikutnya

    //membuat object auction baru
    public Auction() {
        lots = new ArrayList<Lot>();
        nextLotNumber = 1;
    }

    //Memasukkan lot baru ke dalam auction
    public void enterLot(String description){
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    //cetak lot
    public void showLots(){
        for(Lot lot : lots) {
            System.out.println(lot.cetak());
        }
    }

    public void makeABid(int lotNumber, Person bidder, long value) {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(bid);
            if (successful) {
                System.out.println("Penawaran lot nomor " + lotNumber + " berhasil!");
            } else {
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Penawaran lot nomor " + lotNumber + " tidak berhasil!");
            }
        } else {
            System.out.println("Lot nomor " + lotNumber + " tidak valid!");
        }
    }

    //Mengembalikan lot berdasarkan nomor lot yang diberikan
    //Mengembalikan null jika lot dengan nomor tersebut tidak ada
    public Lot getLot(int lotNumber) {
        if (lotNumber >= 1 && lotNumber < nextLotNumber) {
            Lot selectedLot = lots.get(lotNumber - 1);
            if (selectedLot.getNumber() != lotNumber) {
                System.out.println("Kesalahan internal: Lot nomor " + selectedLot.getNumber() +
                        " dikembalikan bukan " + lotNumber);
                return null;
            }
            return selectedLot;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        // Membuat objek Auction baru
        Auction auction = new Auction();

        // Membuat beberapa objek Person
        Person alma = new Person("Alma");
        Person anya = new Person("Anya");

        // Memasukkan beberapa Lot ke dalam Auction
        auction.enterLot("Porsche Taycan");
        auction.enterLot("Iphone 16 Pro");

        // cetak daftar lot
        System.out.println("Current List lot: ");
        auction.showLots();

        // Membuat bid untuk lot nomor 1
        System.out.println("\n");
        auction.makeABid(1, alma, 1000);  // alma menawar 1000
        auction.makeABid(1, anya, 200);    // anya menawar 1200

        // cetak daftar lot setelah tawaran
        System.out.println("\n");
        System.out.println("Current List Lot: ");
        auction.showLots();
    }
}
