class Mahasiswa {
    String nama;
    String nrp;

    // Constructor  Mahasiswa
    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NRP: " + nrp);
    }
}
