/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class KoperasiDemo1841720126Ela {
    public static void main(String[] args){
        //menamambah program ini pada percobaan 4
        Anggota1841720126Ela anggota1 = new Anggota1841720126Ela("Iwan","Jalan Mawar");
        System.out.println("Simpanan "+anggota1.getNamaEla()+ " : Rp. "+anggota1.getSimpananEla());
        // sampai ini
        anggota1.setNamaEla("Iwan Setiawan");
        anggota1.setAlamatEla("Jalan Sukarno Hatta no.18");
        anggota1.setorEla(100000);
        System.out.println("Simpanan "+anggota1.getNamaEla()+" : Rp. "+anggota1.getSimpananEla());
        anggota1.pinjamEla(5000);
        System.out.println("Simpanan "+anggota1.getNamaEla()+" : Rp. "+anggota1.getSimpananEla());
    }
}
