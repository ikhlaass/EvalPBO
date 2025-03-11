
public class Mahasiswa {
 nilai yy = new nilai();
 
 void tampil() {
     System.out.println(yy.nama);
     System.out.println(yy.kelas);
     System.out.println(yy.nim);
        
     for(int i=0; i<3; i++) {    
     System.out.print("Nama Matkul : " + yy.Matkul[i] + " Nilai : " + yy.nilai[i]);
     
            if(yy.nilai[i] > 80) {
                System.out.println(" Lulus");
            }else {
                System.out.println(" Tidak Lulus");
            }
        }
    }
}
 
