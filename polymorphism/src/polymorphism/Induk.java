package polymorphism;

// Kelas induk (Superclass)
public class Induk {
    String nama;
    String status;
    int gaji; // Menggunakan tipe data int untuk gaji

    // Konstruktor
    public Induk(String nama, String status, int gaji) {
        this.nama = nama;
        this.status = status;
        this.gaji = gaji;
    }

    // Metode yang akan di-override oleh subclass
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Status Pegawai: " + status);
        System.out.println("Gaji Diterima: Rp " + gaji);
    }
}
