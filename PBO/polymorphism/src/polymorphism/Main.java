package polymorphism;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Menggunakan referensi superclass
        Induk pegawai1 = new PegawaiTetap("Zaki");
        Induk pegawai2 = new PegawaiKontrak("Budi");

        // Memanggil metode yang telah di-override
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
