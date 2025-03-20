package polymorphism;

public class Main {
    public static void main(String[] args) {
        Induk pegawai1 = new PegawaiTetap("Zaki");
        Induk pegawai2 = new PegawaiKontrak("Budi");

        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
