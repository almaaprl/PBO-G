public class TicketMachine {
    //atribut untuk harga tiket, saldo, dan total
    private int harga;  
    private int saldo;   
    private int total; 

    //constructor inisialisasi ticket machine
    public TicketMachine (int ticketPrice){
        harga = ticketPrice;
        saldo = 0;
        total = 0;
    }

    public int getPrice() { //method untuk harga tiket
        return harga;
    }

    public int getSaldo() { //method untuk saldo
        return saldo;
    }

    public int getTotal() { //method untuk total
        return total;
    }

    public void insertMoney (int amount){ // method untuk menambahkan saldo
        if (amount > 0){
            saldo = saldo + amount;
            System.out.println("Saldo telah ditambahkan! Saldo sekarang: " + getSaldo());
        }else {
            System.out.println("Pengisian saldo tidak valid!");
        }
    }

    public void printTicket (){ //method untuk print ticket
        if(saldo >= harga){
            System.out.println("###########################");
            System.out.println("## Ini Tiket ##");
            System.out.println("# Harga: " + harga);
            System.out.println("############################");
            System.out.println(" ");

            saldo = saldo - harga;
            total = total + harga;
        } else {
            System.out.println("Saldo anda tidak mencukupi untuk membayar ticket. Tambahkan saldo minimal: " + (harga - saldo));
        }
    }

    public int refundSaldo(){ //method refund saldo
        int jumlahRefund = saldo;
        saldo = 0;
        return jumlahRefund;
    }
    
    //method main 
    public static void main(String[] args) { 

        //Membuat objek dengan ticket price: 50 dan menampilkannya
        TicketMachine machine = new TicketMachine(50);
        System.out.println("Harga Tiket: " + machine.getPrice());
        
        //Mengisi saldo dengan jumlah 30 dan mencoba bayar/print ticket
        machine.insertMoney(30);
        machine.printTicket(); 

        //memasukkan saldo lagi sejumlah 30 dan mencoba bayar/print ticket
        machine.insertMoney(30);
        machine.printTicket(); //pembayaran/print ticket berhasil

        //Melakukan refund saldo
        System.out.println("Kembalian: " + machine.refundSaldo());
    }
}
