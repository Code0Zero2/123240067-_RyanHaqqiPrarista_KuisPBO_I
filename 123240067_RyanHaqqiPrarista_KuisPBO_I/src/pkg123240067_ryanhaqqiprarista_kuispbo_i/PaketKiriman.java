/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123240067_ryanhaqqiprarista_kuispbo_i;

/**
 *
 * @author Lab Informatika
 */
public abstract class PaketKiriman {
    protected String namaPaket;
    protected double hargaPaket;
    protected double ongkirDasar;

    public PaketKiriman(String namaPaket, double hargaPaket, double ongkirDasar) throws DataKirimTidakValidException {
        if (ongkirDasar <= 0) {
            throw new DataKirimTidakValidException (
                "Error! ongkir dasar tidak boleh 0 atau negatif"
            );
        }
        this.namaPaket = namaPaket;
        this.hargaPaket = hargaPaket;
        this.ongkirDasar = ongkirDasar;
    }

    public abstract double hitungTotalHarga();
    
    public String getNamaPaket() {
        return namaPaket;
    }
    
    
}
