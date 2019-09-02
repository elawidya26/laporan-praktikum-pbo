/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo2;

/**
 *
 * @author Windows 10
 */
public class SepedaDemo1841720126Ela {
    public static void main(String[] args){
        Sepeda1841720126Ela spd1 = new Sepeda1841720126Ela();
        Sepeda1841720126Ela spd2 = new Sepeda1841720126Ela();
        SepedaGunung1841720126Ela spd3 = new SepedaGunung1841720126Ela();
       
        spd1.setMerekEla("Polygone");
        spd1.tambahKecepatanEla(10);
        spd1.gantiGearEla(2);
        spd1.tambahWarnaEla("Biru");
        spd1.cetakStatusEla();
        
        spd2.setMerekEla("Wiim Cycle");
        spd2.tambahKecepatanEla(10);
        spd2.gantiGearEla(2);
        spd2.tambahKecepatanEla(10);
        spd2.gantiGearEla(3);
        spd2.tambahWarnaEla("Hijau");
        spd2.cetakStatusEla();
        
        spd3.setMerekEla("Klinee");
        spd3.tambahKecepatanEla(10);
        spd3.gantiGearEla(7);
        spd3.setTipeSuspensiEla("Gas  Suspension");
        spd3.tambahWarnaEla("Pink");
        spd3.cetakStatusEla();
    }
}
