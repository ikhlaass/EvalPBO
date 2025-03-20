package polymorphism;

// Kelas induk (Superclass)
public class Induk {
    String nama;
    String status;
    int gaji;

    public Induk(String nama, String status, int gaji) {
        this.nama = nama;
        this.status = status;
        this.gaji = gaji;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Status Pegawai: " + status);
        System.out.println("Gaji Diterima: Rp " + gaji);
    }

    public static void main(String[] args) {
        String[] arr = new String[5];
        Main.main(arr);
    }
}


