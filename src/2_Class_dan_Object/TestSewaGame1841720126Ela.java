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
public class TestSewaGame1841720126Ela {
    public static void main(String[] args){
        SewaGame1841720126Ela sw1 = new SewaGame1841720126Ela();
        
        sw1.id = 123;
        sw1.namaMember = "ELA WIDYA";
        sw1.namaGame = "GTA";
        sw1.harga = 5000;
        sw1.dataPeminjamanEla();
        System.out.println("lama sewa : 2");
        System.out.println("Harga yang harus dibayar : "+sw1.totalHargaEla(2));
    }
}
