import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner input = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\n===System Management Menu Restaurant===");
            System.out.println("1) Tambah Menu dan Stok");
            System.out.println("2) Hapus Menu");
            System.out.println("3) Tampilkan Update Menu");
            System.out.println("4) Quit");
            System.out.print("Masukkan Pilihan Anda: "); // pakai print agar input di baris yang sama
            int pilih = input.nextInt();
            input.nextLine(); // newline setelah input angka

            switch (pilih) {
                case 1:
                    System.out.print("Nama menu: ");
                    String menu = input.nextLine();
                    System.out.print("Jumlah: ");
                    int jumlah = input.nextInt();
                    input.nextLine(); 
                    System.out.print("Kategori (makanan/minuman): ");
                    String kategori = input.nextLine();
                    inventory.tambahItem(menu, jumlah, kategori);
                    break;

                case 2:
                    System.out.print("Nama menu: ");
                    String dihapus = input.nextLine();
                    System.out.print("Kategori (makanan/minuman): ");
                    String kategoriHapus = input.nextLine();
                    inventory.hapusItem(dihapus, kategoriHapus);
                    break;

                case 3:
                    inventory.tampilkanItem();
                    break;

                case 4:
                    quit = true;
                    System.out.println("Anda telah keluar dari sistem. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
        input.close();
    }
}
