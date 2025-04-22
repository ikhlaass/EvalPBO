
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB CV-00
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private List<MataKuliah> mataKuliah;
    
    public Mahasiswa(String nama, String nim, String prodi) {
    this.nama = nama;
    this.nim = nim;
    this.prodi = prodi;
    this.matakuliah = new Arraylist<>();
    
}
    public void tambahMataKuliah(MataKuliah newMataKuliah) {
    this.mataKuliah.add(newMataKuliah);
}
    public void infoMahasiswa() {
    System.out.println("Nama : " + this.nama);
     System.out.println("Nim  :" + this.nim);
      System.out.println("prodi :" + this.prodi);

  System.out.println("==== MATA KULIAH =====");
    for (MataKuliah mataKuliah : this.mataKuliah) {
    System.out.println(mataKuliah.mataKuliah +" (" + mataKuliah.sks + " SKS " );
}
}
    
    public static class Matakuliah{
  private String namaMatakuliah;
    private int sks;

public MataKuliah (String namaMataKuliah, int sks) {
   this.namaMatakuliah = namaMataKuliah;
    this.sks = sks;
    
}


