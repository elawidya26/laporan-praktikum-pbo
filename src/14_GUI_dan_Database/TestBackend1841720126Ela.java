/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend1841720126Ela;

import backend1841720126Ela.*;

/**
 *
 * @author Ela Widya
 */
public class TestBackend1841720126Ela {
    public static void main(String[] args) {
        Kategori1841720126Ela kat1 = new Kategori1841720126Ela("Novel", "Koleksi buku novel");
        Kategori1841720126Ela kat2 = new Kategori1841720126Ela("Referensi", "Buku referensi ilmiah");
        Kategori1841720126Ela kat3 = new Kategori1841720126Ela("Komik", "Komik anak-anak");
        
        //test insert
        kat1.saveEla();
        kat2.saveEla();
        kat3.saveEla();
        
        //test update
        kat2.setKeteranganEla("Koleksi buku referensi ilmiah");
        kat2.saveEla();
        
        //test delete
        kat3.deleteEla();
        
        //tes select all
        for(Kategori1841720126Ela k : new Kategori1841720126Ela().getAll()){
            System.out.println("Nama: " + k.getNamaEla() + ", Ket: " + k.getKeteranganEla());
        }
        
        //test search
        for(Kategori1841720126Ela k : new Kategori1841720126Ela().search("ilmiah")){
            System.out.println("Nama: " + k.getNamaEla() + ", Ket: " + k.getKeteranganEla());
        }
    }
}
