public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Dosen D = new Dosen(1, "Ikhlas", 5000000, 500000);
        D.setJabatan("Dosen Tetap");
        D.detailKaryawan();
        System.out.println("Jabatan : " + D.getJabatan());
        D.totalGaji();

        System.out.println("\n");

        Staff S = new Staff(2, "Mallomo", 2500000, 200000);
        S.detailKaryawan();
        S.updateBonus(300000);
        S.totalGaji();
    }
    
}
