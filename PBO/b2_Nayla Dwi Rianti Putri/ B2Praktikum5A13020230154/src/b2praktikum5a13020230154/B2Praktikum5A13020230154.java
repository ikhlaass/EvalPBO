/*
 * nse Nama: Nayla Dwi Rianti Putri
 * Nim : 13020230154
 * Kelas: B2 

 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2praktikum5a13020230154;


public class B2Praktikum5A13020230154 {

    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        Dosen dosen = new Dosen();
        Staff staff = new Staff();
        
        dosen.nama = "Dra. Anisah";
        staff.nama = "Indri Ihsanty";
        
            System.out.println("Nama Dosen : " + staff.nama);
            System.out.print("Fakultas Dosen : ");
            dosen.tampilkanFakultas();
            
            System.out.println("\nNama Staff : " + staff.nama);
            System.out.print("Fakultas Staff");
            staff.tampilkanFakultas();
    }
    
}
