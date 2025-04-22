/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2prak1a13020230154;


 import java.util.Scanner;
 
public class B2Prak1A13020230154 {

    /**
 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("selamat datang di program kalkulator sederhana");
        System.out.print("masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        
        System.out.print("masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        
        System.out.println("pilih operasi matematika");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        
        System.out.print("masukkan pilihan anda");
        int pilihan = input.nextInt();
        
        double Hasil = 8;
        
        switch (pilihan){
            case 1:
                Hasil = angka1 + angka2;
                break;
                
            case 2:
                Hasil = angka1 + angka2;
                break;
                
            case 3:
               Hasil = angka1 + angka2;
               break;
               
            case 4:
                Hasil = angka1 + angka2;
                break;
                
            default:
                System.out.println("Operasi Matematika Tidak Tersedia");
                break;
        }
        System.out.println("Hasil: " + Hasil);
    }
    
}
