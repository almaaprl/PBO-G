public class Main {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing subclass
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();

        // Memanggil method dari masing-masing objek
        System.out.println("=== Manusia ===");
        manusia.hidup();
        manusia.aktivitasUtama();
        manusia.kemampuanKhusus();

        System.out.println("\n=== Hewan ===");
        hewan.hidup();
        hewan.aktivitasUtama();
        hewan.kemampuanKhusus();

        System.out.println("\n=== Tumbuhan ===");
        tumbuhan.hidup();
        tumbuhan.aktivitasUtama();
        tumbuhan.kemampuanKhusus();
    }
}
