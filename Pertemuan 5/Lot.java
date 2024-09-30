//Setiap lot memiliki nomor unik, deskripsi, dan tawaran tertinggi (jika ada)
public class Lot {
    private int number; // Nomor unik lot
    private String description; //nama item
    private Bid highestBid; //tawaran

    public Lot(int number, String description) {
        this.number = number;
        this.description = description;
        this.highestBid = null; // Awalnya belum ada tawaran
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

    public boolean bidFor(Bid bid) {
        if (highestBid == null) {
            highestBid = bid;
            return true;
        } else if (bid.getValue() > highestBid.getValue()) {
            highestBid = bid;
            return true;
        } else {
            return false;
        }
    }

    public String cetak() {
        String details = + number + ") " + description;
        if (highestBid != null) {
            details += " - Highest bid: " + highestBid.getValue();
        } else {
            details += " - No bids";
        }
        return details;
    }
}
