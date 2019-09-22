/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan4_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class MainPercobaan4_1841720126Ela {
    public static void main(String[] args){
        Penumpang1841720126Ela p = new Penumpang1841720126Ela("1234", "Mr.Krab");
        //pertanyaan percobaan 4 nomer 4 
        Penumpang1841720126Ela budi = new Penumpang1841720126Ela("1234", "Budi");
        // sampai ini
        Gerbong1841720126Ela gerbong = new Gerbong1841720126Ela("A", 10);
        gerbong.setPenumpangEla(p,1);
        //pertanyaan percobaan 4 nomer 4 
        gerbong.setPenumpangEla(budi,1);
        // sampai ini
        System.out.println(gerbong.infoEla());
    }
}
