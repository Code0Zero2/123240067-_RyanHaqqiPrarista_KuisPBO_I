/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123240067_ryanhaqqiprarista_kuispbo_i;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Pengirim> daftarPengirim = new ArrayList<>();
        List<PaketKiriman> daftarPaket = new ArrayList<>();
        
        while(true){
            System.out.println("\n=== SISTEM PENGIRIMAN PAKET - JasaKirimKita ===");
            System.out.println("1. Tambah Pengirim");
            System.out.println("2. Keluar");
            System.out.print("Pilih : ");
            try{
                int pilihan = input.nextInt();
                input.nextLine();
                if (pilihan == 1){
                    try {
                        System.out.println("\n--- Data Pengirim ---");
                        System.out.print("Nama : ");
                        String nama = input.nextLine();
                        
                        System.out.println("\n--- Data Paket ---");
                        System.out.print("Harga paket/barang\t: ");
                        double hargaPaket = input.nextDouble();
                        if (hargaPaket <= 0){
                            System.out.println("Error!! harga paket tidak boleh kurang atau samadengan 0");
                            continue;
                        }
                        System.out.print("Ongkos Kirim Dasar\t: ");
                        double ongkosDasar = input.nextDouble();
                        System.out.print("Jenis Pengiriman (1. Reguler / 2. Expres / 3.SameDay) : ");
                        int jenis = input.nextInt();
                        
                        Pengirim pengirim = new Pengirim(nama);
                        PaketKiriman paket;
                        
                        if (jenis == 1){
                            paket = new KirimReguler(hargaPaket, ongkosDasar);
                        } else if (jenis == 2){
                            paket = new KirimExpres(hargaPaket, ongkosDasar);
                        } else if (jenis == 3){
                            paket = new KirimSameDay(hargaPaket, ongkosDasar);
                        } else {
                            System.out.println("Error!! pilihan tidak valid");
                            continue;
                        }
                        
                        daftarPengirim.add(pengirim);
                        daftarPaket.add(paket);
                        
                        System.out.println("OK Pengiriman berhasil ditambahkan");
                        
                    } catch (DataKirimTidakValidException e){
                        System.out.println("Error!! " + e.getMessage());
                    }
                } else if (pilihan == 2){
                    break;
                } else {
                    System.out.println("Error!! Menu tidak tersedia");
                }
            } catch (Exception e){
                System.out.println("Input tidak valid");
                input.nextLine();
            }
        }
        
        System.out.println("\n====== REKAP PENGIRIMAN ======");
        for (int i = 0; i < daftarPaket.size(); i++){
            Pengirim p = daftarPengirim.get(i);
            PaketKiriman k = daftarPaket.get(i);
            
            System.out.println("Pengirim\t: " + p.getNama());
            System.out.println("Paket\t\t: " + k.getNamaPaket());
            System.out.println("Total Ongkir : " + k.hitungTotalHarga());
            System.out.println("Diskon Ongkir : gtw gmn " );
            
        }
    }
    
}
