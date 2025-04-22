/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2praktikum5b13020230154;

/**
 *
 * @author LAB CV-00
 */
public class Buku {
    private String judul;
    private String penulis;
    private int tahunRilis;
    private int harga; 


  public String getJudul() {
    return judul;
}

public void setJudul(String judul) {
  this.judul = judul;
}

public String getPenulis() {
   return this.penulis;
}

public void setPenulis(String penulis){
    this.penulis = penulis;
}

public int getTahunRilis() {
  return this.tahunRilis;
}

public void setTahunRilis(int tahunRilis){
    this.tahunRilis = tahunRilis;
}

public int getHarga() {
    return this.harga;
}

public void setHarga(int harga){
    this.harga = harga;
}

}
