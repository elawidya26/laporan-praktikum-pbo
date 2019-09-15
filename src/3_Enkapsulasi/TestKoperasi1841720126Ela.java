/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class TestKoperasi1841720126Ela {
    public static void main(String[] args){
        AnggotaTugas1841720126Ela ela = new AnggotaTugas1841720126Ela("1841720126","Ela",5000000);
        System.out.println("Nama Anggota : "+ela.getNamaEla());
        System.out.println("Limit Pinjaman : "+ela.getLimitPinjamanEla());
        
        System.out.println("\n Meminjam uang 10.000.000...");
        ela.pinjamEla(10000000);
        System.out.println("\n Meminjam uang 4.000.000...");
        ela.pinjamEla(4000000);
        
        System.out.println("Jumlah Pinjaman saat ini : "+ela.getJumlahPinjamanEla());
        System.out.println("\n Membayar angsuran 100.000");
        ela.angsurEla(100000);
        System.out.println("Jumlah Pinjaman saat ini : "+ela.getJumlahPinjamanEla());
        
        System.out.println("\n Mmebayar angsuran 3.000.000");
        ela.angsurEla(3000000);
        System.out.println("Jumlah Pinjaman saat ini : "+ela.getJumlahPinjamanEla());
        
    }
}
