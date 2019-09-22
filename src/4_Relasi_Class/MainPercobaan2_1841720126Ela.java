/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan2_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class MainPercobaan2_1841720126Ela {
    public static void main(String[] args){
        Mobil1841720126Ela m = new Mobil1841720126Ela();
        m.setmMerkEla("Avanza");
        m.setmBiayaEla(350000);
        
        Sopir1841720126Ela s = new Sopir1841720126Ela();
        s.setmNamaEla("John Doe");
        s.setmBiayaEla(200000);
        
        Pelanggan1841720126Ela p = new Pelanggan1841720126Ela();
        p.setmNamaEla("Jane Doe");
        p.setmMobilEla(m);
        p.setmSopirEla(s);
        p.setmHariEla(2);
        System.out.println("Biaya Total = "+p.hitungBiayaTotalEla());
        
    }
}
