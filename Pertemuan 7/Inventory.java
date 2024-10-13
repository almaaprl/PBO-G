import java.util.HashMap;
import java.util.Map;

class Inventory implements Storable {
    private Map<String, Integer> makanan; 
    private Map<String, Integer> minuman; 
    private int totalItem;

    public Inventory() {
        makanan = new HashMap<>(); 
        minuman = new HashMap<>();
        totalItem = 0;
    }

    public void tambahItem(String item, int jumlah, String kategori) {
        if (kategori.equalsIgnoreCase("makanan")) {
            makanan.put(item, makanan.getOrDefault(item, 0) + jumlah);
            System.out.println(item + " = " + jumlah + " Berhasil ditambahkan!");
        } else if (kategori.equalsIgnoreCase("minuman")) {
            minuman.put(item, minuman.getOrDefault(item, 0) + jumlah);
            System.out.println(item + " = " + jumlah + " Berhasil ditambahkan!");
        } else {
            System.out.println("Kategori tidak valid. Pilih kategori 'makanan' atau 'minuman'!");
        }
        totalItem += jumlah;
    }

    public void hapusItem(String item, String kategori) {
        if (kategori.equalsIgnoreCase("makanan")) {
            if (makanan.containsKey(item)) {
                totalItem -= makanan.get(item); // kurangi totalItem dengan jumlah yang dihapus
                makanan.remove(item);                
                System.out.println(item + " berhasil dihapus dari menu!");
            } else {
                System.out.println(item + " tidak valid!");
            }
        } else if (kategori.equalsIgnoreCase("minuman")) {
            if (minuman.containsKey(item)) {
                totalItem -= minuman.get(item); // kurangi totalItem dengan jumlah yang dihapus
                minuman.remove(item);                
                System.out.println(item + " berhasil dihapus dari menu!");
            } else {
                System.out.println(item + " tidak valid!");
            }
        } else {
            System.out.println("Kategori tidak valid. Pilih kategori 'makanan' atau 'minuman'!");
        }
    }

    public void tampilkanItem() {
        System.out.println("\n--Update Stok yang Tersedia--");
        System.out.println("\nMenu Makanan:");
        if (makanan.isEmpty()) {
            System.out.println("Tidak ada makanan yang tersedia!");
        } else {
            for (Map.Entry<String, Integer> entry : makanan.entrySet()) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " porsi");
            }
        }
        System.out.println("\nMenu Minuman:");
        if (minuman.isEmpty()) {
            System.out.println("Tidak ada minuman yang tersedia!");
        } else {
            for (Map.Entry<String, Integer> entry : minuman.entrySet()) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " porsi");
            }
        }
        System.out.println("Total menu yang tersedia: " + totalItem);
    }
}

//sc : https://codekey.id/java/java-map/
