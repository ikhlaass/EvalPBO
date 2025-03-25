import java.util.ArrayList;
import java.util.List;

public class Mahasiswa   {
    private String nama;
    private String nim;
    private String prodi;
    private List<Matakuliah> matakuliah;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.matakuliah = new ArrayList<>();
    }

    public void tambahMatakuliah(Matakuliah newMataKuliah) {
        this.matakuliah.add(newMataKuliah);
    }

    public void infoMahasiswa() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Nim : " + this.nim);
        System.out.println("Prodi : " + this.prodi);

        System.out.println("===== MATA KULIAH =====");
        for(Matakuliah matakuliah : this.matakuliah) {
            System.out.println(matakuliah.namaMataKuliah + " (" + matakuliah.sks + " SKS)");
        }
    }
}

