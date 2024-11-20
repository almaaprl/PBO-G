import java.util.Scanner;

public class ReservasiTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Sistem Reservasi Penerbangan ====");
            System.out.println("1. Tiket Ekonomi");
            System.out.println("2. Tiket Bisnis");
            System.out.println("3. Tiket First Class");
            System.out.println("4. Keluar");
            System.out.print("Pilih jenis tiket (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 4) {
                System.out.println("Terima kasih telah menggunakan sistem!");
                break;
            }

            System.out.print("Masukkan nama penumpang: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan tujuan: ");
            String destination = scanner.nextLine();
            System.out.print("Masukkan harga dasar: ");
            double baseFare = scanner.nextDouble();

            Ticket ticket = null;

            switch (choice) {
                case 1:
                    ticket = new EconomyTicket(name, destination, baseFare);
                    break;
                case 2:
                    ticket = new BusinessTicket(name, destination, baseFare);
                    break;
                case 3:
                    ticket = new FirstClassTicket(name, destination, baseFare);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
            }

            if (ticket != null) {
                ticket.displayTicketInfo();
            }
        }

        scanner.close();
    }
}
