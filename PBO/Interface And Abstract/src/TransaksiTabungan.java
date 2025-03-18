/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB CV-00
 */
public class TransaksiTabungan implements Transaksi {
    int saldo;

    public TransaksiTabungan(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void tarik(int nominal) {
        if (nominal > saldo) {
            System.out.println("Maaf, saldo tabungan anda tidak mencukupi");
        } else {
            saldo = saldo - nominal;
            System.out.println("Penarikan berhasil, saldo tabungan saat ini : " + saldo);
        }
    }

    @Override
    public void setor(int nominal) {
        saldo = saldo - nominal;
        System.out.println("Setoran Berhasil, saldo tabungan saat ini : " + saldo);

    }
}
