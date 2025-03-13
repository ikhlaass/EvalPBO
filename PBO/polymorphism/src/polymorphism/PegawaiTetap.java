package polymorphism;

// Subclass dari Induk
public class PegawaiTetap extends Induk {

    // Konstruktor
    public PegawaiTetap(String nama) {
        super(nama, "Pegawai Tetap", 5000000); // Set status dan gaji
    }

    // Override metode dari superclass
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Pegawai Tetap ===");
        super.tampilkanInfo();
    }
}
