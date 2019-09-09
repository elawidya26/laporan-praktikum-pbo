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
public class TestBarangTugas1841720126Ela {
    public static void main(String[] args){
        BarangTugas1841720126Ela brg7 = new BarangTugas1841720126Ela();
        brg7.kode = "TOP";
        brg7.namaBarang = "TOPI";
        brg7.hargaDasar = 7000;
        brg7.diskon = 10;
        brg7.tampilDataEla();
        System.out.println("Harga Jual Barang : "+brg7.hitungHargaJualEla());
        
    }
}
