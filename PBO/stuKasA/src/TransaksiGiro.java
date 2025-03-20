public class TransaksiGiro implements Transaksi {
    
    int saldo;

    public TransaksiGiro(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void tarik(int nominal) {
        if (nominal > saldo) {
            System.out.println("Maaf, saldo tabungan anda tidak mencukupi");
        } else {
            saldo = saldo - nominal;
            System.out.println("Penarikan berhasil, saldo giro saat ini : " + saldo);
        }
    }

    @Override
    public void setor(int nominal) {
        saldo = saldo - nominal;
        System.out.println("Setoran Berhasil, saldo giro saat ini : " + saldo);

    }
}
