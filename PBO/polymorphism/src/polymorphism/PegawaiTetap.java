package polymorphism;

public class PegawaiTetap extends Induk {

    public PegawaiTetap(String nama) {
        super(nama, "Pegawai Tetap", 5000000); // Set status dan gaji
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Pegawai Tetap ===");
        super.tampilkanInfo();
    }
}
