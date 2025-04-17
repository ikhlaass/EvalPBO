import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputNilai = JOptionPane.showInputDialog((""));

        try {
            int nilai = Integer.valueOf(inputNilai);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Yang Anda Input Bukan Angka");
        }

        System.out.println("=====DAFTAR NAHASISWA=====");
        System.out.print("Input Nama : ");
        String nama = input.nextLine();
        System.out.print("Input NIM : ");
        String nim = input.nextLine();
        System.out.print("Input Prodi : ");
        String prodi = input.nextLine();


        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, prodi);

        String pilih;
        
        do {
        System.out.println("");
        System.out.println("1. Pemrograman Berorientasi Objek");
        System.out.println("2. Algoritma Dan Pemrograman 2");
        System.out.println("3. Jaringan Komputer");
        System.out.println("4. Selesai");
        System.out.print("Pilih Matakuliah : ");
        pilih = input.nextLine();

        switch (pilih) {
            case "1":
                Matakuliah pbo = new Matakuliah("Pemrograman Berorientasi Objek" , 3);
                mahasiswa.tambahMatakuliah(pbo); 
                System.out.println("Berhasil menambahkan matakuliah");  
            break;
            case "2" :
                Matakuliah alpro = new Matakuliah("Algoritma Dan Pemrograman 2" , 3);
                mahasiswa.tambahMatakuliah(alpro); 
                System.out.println("Berhasil menambahkan matakuliah");
            break;
            case "3" :
                Matakuliah jarkom = new Matakuliah("Jaringan Komputer" , 3);
                mahasiswa.tambahMatakuliah(jarkom); 
                System.out.println("Berhasil menambahkan matakuliah");
            default:
                System.out.println("Menu Tidak Di Temukan");
            break;
        } 
    }while(!pilih.equals("4"));
      System.out.println("\n");
      mahasiswa.infoMahasiswa();
    }
}

   
