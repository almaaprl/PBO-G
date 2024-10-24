public class ParkingTicketMachine {
    private int balance; // saldo 
    private int ticketPrice; 
    private int ticketTime;  

    // Konstruktor
    public ParkingTicketMachine(int ticketPrice) {
        this.balance = 0;
        this.ticketPrice = ticketPrice;
        this.ticketTime = 0;
    }

    // tambah uang
    public void insertMoney(int amount) {
        balance += amount;
        System.out.println("Sukses! Rp" + amount + " telah ditambahkan. Saldo sekarang: Rp" + balance);
    }

    // cetak tiket
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;
            balance = balance % ticketPrice; 
            System.out.println("===== Parking Ticket =====");
            System.out.println("Tiket: " + ticketTime + " jam parkir. Sisa saldo: Rp" + balance);
        } else {
            System.out.println("Saldo tidak cukup! Tambahkan saldo anda.");
        }
    }

    public int getTimePurchased() {
        return ticketTime;
    }

    public static void main(String[] args) {
        ParkingTicketMachine machine = new ParkingTicketMachine(8000); // Harga tiket 
        machine.insertMoney(20000); // isi saldo
        machine.issueTicket(); // cetak tiket
        System.out.println("Waktu parkir: " + machine.getTimePurchased() + " jam");
    }
}
