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
public class Staff1841720126Ela extends Karyawan1841720126Ela {
    public int lembur, potongan;

    public Staff1841720126Ela() {
    }

    public Staff1841720126Ela(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaffEla(){
        super.tampilDataKaryawanEla();
        System.out.println("Lembur : "+lembur);
        System.out.println("Potongan : "+potongan);
        System.out.println("Total Gaji : "+(gaji+lembur-potongan));
    }
}
