/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan3_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class MainPercobaan3_1841720126Ela {
    public static void main(String[] args){
        Pegawai1841720126Ela masinis = new Pegawai1841720126Ela("1234","spongebob Squarepants");
        Pegawai1841720126Ela asisten = new Pegawai1841720126Ela("4567","Pattrick Star");
        KeretaApi1841720126Ela keretaapi = new KeretaApi1841720126Ela("Gaya Baru","Bisnis",masinis, asisten);
        System.out.println(keretaapi.infoEla());
    }
}
