/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan1_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class MainPercobaan1_1841720126Ela {
    
    public static void main(String[] args) {
        Processor1841720126Ela P = new Processor1841720126Ela("Intel i5",3);
        Laptop1841720126Ela L = new Laptop1841720126Ela("Thinkpad",P);

        L.infoEla();
        Processor1841720126Ela p1 = new Processor1841720126Ela();
        p1.setmMerkEla("Intel i5");
        p1.setmCacheEla(4);
        
        Laptop1841720126Ela l1 = new Laptop1841720126Ela();
        l1.setmMerkEla("Thinkpad");
        l1.setmProcEla(p1);
        l1.infoEla();  
    }
}
