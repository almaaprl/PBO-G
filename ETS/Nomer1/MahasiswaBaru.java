class MahasiswaBaru extends Mahasiswa {
    String jurusan;

    // Constructor
    public MahasiswaBaru(String nama, String nrp, String jurusan) {
        super(nama, nrp);
        this.jurusan = jurusan;
    }

    public void tampilkanInfoMahasiswaBaru() {
        tampilkanInfo(); // Memanggil method dari kelas induk
        System.out.println("Jurusan: " + jurusan);
    }

    public static void main(String[] args) {
        MahasiswaBaru mahasiswa1 = new MahasiswaBaru("Ama", "5025", "Teknik Informatika");
        mahasiswa1.tampilkanInfoMahasiswaBaru();  
    }
}
