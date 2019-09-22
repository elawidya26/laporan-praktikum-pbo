/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.tugas_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class MainTugas1841720126Ela {
    public static void main(String[] args){
        
        Pasien1841720126Ela p = new Pasien1841720126Ela();
        p.setmIdEla(123);
        p.setmNamaEla("ELA");
        p.infoEla();
        
        Dokter1841720126Ela d = new Dokter1841720126Ela();
        d.setmIdEla(456);
        d.setmNamaEla("WIDYA");
        d.setmNipEla(90);
        d.infoEla();
        
        Suster1841720126Ela s = new Suster1841720126Ela();
        s.setmIdEla(789);
        s.setmNamaEla("LESTARI");
        s.setmNipEla(80);
        s.infoEla();
        
        System.out.println();
        Riwayat1841720126Ela r = new Riwayat1841720126Ela();
        r.setmRiwayatEla("Pernah Rawat Inap pada Tahun 2018");
        r.infoEla();
        
    }
}
