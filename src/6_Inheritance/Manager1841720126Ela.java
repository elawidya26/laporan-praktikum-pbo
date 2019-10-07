/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6_1841720126Ela;

/**
 *
 * @author User
 */
public class Manager1841720126Ela extends Karyawan1841720126Ela {
    public int tunjangan;

    public Manager1841720126Ela() {
    }
    
    public void tampilDataManagerEla(){
        super.tampilDataKaryawanEla();
        System.out.println("Tunjangan : "+tunjangan);
        System.out.println("Total Gaji : "+(super.gaji+tunjangan));
       
    }
}
