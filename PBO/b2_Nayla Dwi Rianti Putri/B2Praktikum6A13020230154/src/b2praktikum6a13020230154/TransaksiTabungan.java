/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2praktikum6a13020230154;

/**
 *
 * @author LAB CV-00
 */
public class TransaksiTabungan implements Transaksi{
     int saldo;
    
    public TransaksiTabungan(int saldo) {
        this.saldo = saldo;
    }
    @Override
    public void tarik(int nominal) {
        if (nominal > saldo ){
            System.out.println("Maaf, saldo tabungan anda tidak mencukupi");
        }else {
             saldo = saldo - nominal;
            System.out.println("Penerimaan berhasil, saldo giro saat ini :" + saldo);
        }
    }
    @Override
    public void setor (int nominal) {
        saldo = saldo + nominal;
        System.out.println("Setoran berhasil, saldo giro saat ini : " + saldo);    
    }
    
}
