public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Transportasi Ts = new Transportasi("Kendaraan Laut");
        Ts.jenisTransportasi();

        Ts = new Mobil("Kendaraan Darat");
        Ts.jenisTransportasi();

        Ts = new Pesawat("Kendaraan Udara");
        Ts.jenisTransportasi();
    }
    
}


