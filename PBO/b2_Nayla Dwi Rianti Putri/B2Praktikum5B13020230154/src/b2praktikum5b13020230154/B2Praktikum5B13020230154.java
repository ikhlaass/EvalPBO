/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2praktikum5b13020230154;

/**
 *
 * Nama: Nayla Dwi Rianti Putri
 * Nim : 13020230154
 * Kelas: B2 
 */
public class B2Praktikum5B13020230154 {

   
    public static void main(String[] args) {
        Buku buku = new Buku();
        
        buku.setJudul("Pemrograman Berorientasi Objek");
        buku.setPenulis("Budi Raharjo");
        buku.setHarga(60000);
        buku.setTahunRilis(2019);
        
        String judul = buku.getJudul();
         String penulis = buku.getPenulis();
         double harga = buku.getHarga();
         int tahunRilis = buku.getTahunRilis();
         
         System.out.println("Judul Buku: " + judul);
         System.out.println("Penulis Buku" + penulis);
         System.out.println("Harga Buku: " + harga);
         System.out.println("Tahun Rilis Buku:" + tahunRilis);
    }
    
}
