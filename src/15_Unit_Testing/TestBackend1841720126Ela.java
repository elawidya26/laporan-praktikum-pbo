/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

/**
 *
 * @author Ela Widya
 */
public class TestBackend1841720126Ela {

    public static void main(String[] args) {
        Kategori1841720126Ela kat1 = new Kategori1841720126Ela("Novel", "Collection of paperback books");
        Kategori1841720126Ela kat2 = new Kategori1841720126Ela("Reference", "Scholarly reference book");
        Kategori1841720126Ela kat3 = new Kategori1841720126Ela("Comic", "Comic Children");
        
        kat1.save();
        kat2.save();
        kat3.save();
        kat2.setKeterangan("Collection of scientific reference books");
        kat2.save();
        
        kat3.delete();
        for(Kategori1841720126Ela kategori : new Kategori1841720126Ela ().getAll()){
            System.out.println("name : " + kategori.getNama() + ", Ket: " + kategori.getKeterangan());
        }
        for(Kategori1841720126Ela kategori : new Kategori1841720126Ela ().search("scientific")){
            System.out.println("name : " + kategori.getNama() + ", Ket: " + kategori.getKeterangan());
        }
    }
}
