/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123240067_ryanhaqqiprarista_kuispbo_i;

/**
 *
 * @author Lab Informatika
 */
public class Pengirim {
    private static int counter = 1;
    private String idPengirim;
    private String nama;

    public Pengirim(String nama) {
        this.idPengirim = String.format("P%03", counter++);
        this.nama = nama;
    }

    public String getIdPengirim() {
        return idPengirim;
    }

    public String getNama() {
        return nama;
    }
}
