package polymorphism;

// Subclass dari Induk
public class PegawaiKontrak extends Induk {

    // Konstruktor
    public PegawaiKontrak(String nama) {
        super(nama, "Pegawai Kontrak", 3000000); // Set status dan gaji
    }

    // Override metode dari superclass
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Pegawai Kontrak ===");
        super.tampilkanInfo();
    }
}
