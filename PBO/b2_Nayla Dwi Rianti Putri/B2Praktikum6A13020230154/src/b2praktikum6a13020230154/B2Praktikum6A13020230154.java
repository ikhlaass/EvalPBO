/*
 * Click  Nama: Nayla Dwi Rianti Putri
 * Nim : 13020230154
 * Kelas: B2 
 */

package b2praktikum6a13020230154;
public class B2Praktikum6A13020230154 {

    
    public static void main(String[] args) {
        
        TransaksiGiro transaksiGiro = new TransaksiGiro(5000000);
        transaksiGiro.setor(2000000);
        transaksiGiro.tarik(4000000);
        
        System.out.println("\n");
        
        TransaksiTabungan transaksiTabungan = new TransaksiTabungan(2000000);
        transaksiTabungan.setor(3000000);
        transaksiTabungan.tarik(250000);
    }
    
}
