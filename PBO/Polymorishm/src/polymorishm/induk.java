package polymorishm;

public class induk {
    private String nama;
    private String status;
    private String gaji;

    // Konstruktor
    public induk(String nama, String status, String gaji) {
        this.nama = nama;
        this.status = status;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Status Pegawai: " + getStatus());
        System.out.println("Gaji Diterima: " + getGaji());
    }
}
