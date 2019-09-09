/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author Windows 10
 */
public class BarangTugas1841720126Ela {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;
    
    int hitungHargaJualEla(){
        return(int)(hargaDasar-(diskon*hargaDasar)/100);
    }
    public void tampilDataEla(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("HargaDasar : "+hargaDasar);
        System.out.println("Diskon : "+diskon+"%");
    }
}
