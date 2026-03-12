/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123240067_ryanhaqqiprarista_kuispbo_i;

/**
 *
 * @author Lab Informatika
 */
public class KirimExpres extends PaketKiriman implements DiskonOngkir {
    public double diskon;
    public KirimExpres(double hargaPaket, double ongkirDasar) throws DataKirimTidakValidException {
        super("Kirim Expres", hargaPaket, ongkirDasar);
    }

    @Override
    public double hitungTotalHarga() {
        return (ongkirDasar - diskon) + 5000;
    }

    @Override
    public void cetakInfoDiskon(int hargaPaket) {
        if (hargaPaket >= 30000){
            if(ongkirDasar <= 40000){
                diskon = ongkirDasar;
            } else {
                diskon = 40000;
            }
        } else {
            diskon = 0;
            System.out.println("Tidak memenuhi syarat diskon");
        }
    }
    
}
