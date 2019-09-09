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
public class TeskBarang1841720126Ela {
    public static void main(String[] args){
        Barang1841720126Ela brg1 = new Barang1841720126Ela();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        System.out.println("Stok Baru Adalah"+brg1.tambahStok(20));
    }
}
