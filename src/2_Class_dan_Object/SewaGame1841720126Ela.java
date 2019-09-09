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
public class SewaGame1841720126Ela {
    public int id, harga;
    public String namaMember, namaGame;
    
    public void dataPeminjamanEla(){
        System.out.println("Id : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Harga : "+harga);
    }
    
    public int totalHargaEla(int lamaSewa){
        int bayar = harga*lamaSewa;
        return bayar;
    } 
}
