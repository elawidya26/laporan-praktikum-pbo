/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7_1841720126Ela;

/**
 *
 * @author User
 */
public class Utama1841720126Ela {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720126Ela man[] = new Manager1841720126Ela[2];
        Staff1841720126Ela staff1[] = new Staff1841720126Ela[2];
        Staff1841720126Ela staff2[] = new Staff1841720126Ela[3];
        
        System.out.println();
        man[0] = new Manager1841720126Ela();
        man[0].setmNamaEla("Tedjo");
        man[0].setmNipEla("101");
        man[0].setmGolonganEla("1");
        man[0].setmTunjanganEla(5000000);
        man[0].setmBagianEla("Administrasi");
        
        System.out.println();
        man[1] = new Manager1841720126Ela();
        man[1].setmNamaEla("Atika");
        man[1].setmNipEla("102");
        man[1].setmGolonganEla("1");
        man[1].setmTunjanganEla(2500000);
        man[1].setmBagianEla("Pemasran");
        
        System.out.println();
        staff1[0] = new Staff1841720126Ela();
        staff1[0].setmNamaEla("Usman");
        staff1[0].setmNipEla("0003");
        staff1[0].setmGolonganEla("2");
        staff1[0].setmLemburEla(10);
        staff1[0].setmGajiLemburEla(10000);
        
        System.out.println();
        staff1[1] = new Staff1841720126Ela();
        staff1[1].setmNamaEla("Anugrah");
        staff1[1].setmNipEla("0005");
        staff1[1].setmGolonganEla("2");
        staff1[1].setmLemburEla(10);
        staff1[1].setmGajiLemburEla(55000);
        man[0].setStEla(staff1);
        
        System.out.println();
        staff2[0] = new Staff1841720126Ela();
        staff2[0].setmNamaEla("Hendra");
        staff2[0].setmNipEla("0004");
        staff2[0].setmGolonganEla("3");
        staff2[0].setmLemburEla(15);
        staff2[0].setmGajiLemburEla(5500);
        
        System.out.println();
        staff2[1] = new Staff1841720126Ela();
        staff2[1].setmNamaEla("Arie");
        staff2[1].setmNipEla("0006");
        staff2[1].setmGolonganEla("4");
        staff2[1].setmLemburEla(5);
        staff2[1].setmGajiLemburEla(100000);
        
        System.out.println();
        staff2[2] = new Staff1841720126Ela();
        staff2[2].setmNamaEla("Mentari");
        staff2[2].setmNipEla("0007");
        staff2[2].setmGolonganEla("3");
        staff2[2].setmLemburEla(6);
        staff2[2].setmGajiLemburEla(20000);
        man[1].setStEla(staff2);
        
        System.out.println();
        man[0].lihatInfoEla();
        man[1].lihatInfoEla();

    }
}
