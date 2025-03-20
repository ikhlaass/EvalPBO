package polymorphism;

// Subclass dari Induk
public class PegawaiKontrak extends Induk {

    public PegawaiKontrak(String nama) {
        super(nama, "Pegawai Kontrak", 3000000);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Pegawai Kontrak ===");
        super.tampilkanInfo();
    }
}
