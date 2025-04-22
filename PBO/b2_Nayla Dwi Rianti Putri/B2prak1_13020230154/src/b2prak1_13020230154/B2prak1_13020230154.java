/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2prak1_13020230154;

import java.util.ArrayList;
import java.util.Scanner;

public class B2prak1_13020230154 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       ArrayList<String> mahasiswa = new ArrayList<>();
       
       double total = 0;
       int pilihan;
       
       do{
           System.out.println("DAFTAR MAHASISWA");
           System.out.println("1. Tambah daftar Mahasiswa");
           System.out.println("2. tampilkan daftar mahasiswa ");
           System.out.println("3. keluar dari program");
           
           System.out.print("pilih menu : ");
           pilihan = input.nextInt();
           input.nextLine();
           
           switch (pilihan){
               case 1:
                   System.out.print("Masukkan Nama Mahasiswa :");
                   String mhs = input.nextLine();
                   
                   mahasiswa.add(mhs);
                   
                   System.out.println("mAHASISWA TELAH DITAMBAHKAN");
                   break;
                 
               case 2:
                   System.out.println("Daftar seluruh mahasiswa ");
                   for (var value : mahasiswa){
                       System.out.println("Nama : " + value );
                   }
                   break;
               case 0 :
                   break;
               default :
                   System.out.println("MENU TIDAK TERSEDIA");
                   break;
           }
           System.out.println();
       }while (pilihan !=0);
       
      
    }
    
}
