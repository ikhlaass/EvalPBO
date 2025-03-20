public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        TransaksiGiro TG = new TransaksiGiro(128000000);
        TG.setor(2000000);
        TG.tarik(4000000);

        System.out.println("\n");

        TransaksiTabungan TT = new TransaksiTabungan(150000000);
        TT.setor(3000000);
        TT.tarik(2500000);
    }
}
