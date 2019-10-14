/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1841720126Ela;

/**
 *
 * @author User
 */
public class MainOverriding1841720126Ela {
     public static void main(String[] args) {
        Manusia1841720126Ela m = new Manusia1841720126Ela();
        Dosen1841720126Ela d   = new Dosen1841720126Ela();
        Mahasiswa1841720126Ela mhs = new Mahasiswa1841720126Ela();
        
        m.makanEla();
        m.bernafasEla();
        d.makanEla();
        d.lemburEla();
        mhs.makanEla();
        mhs.tidurEla();
    }
}
