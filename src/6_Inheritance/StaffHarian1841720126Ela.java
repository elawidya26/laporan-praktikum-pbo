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
public class StaffHarian1841720126Ela extends Staff1841720126Ela {
    public int jmlJamKerja;

    public StaffHarian1841720126Ela() {
    }

    public StaffHarian1841720126Ela( String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan,int jmlJamKerja) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }
    public void tampilStaffHarianEla(){
        System.out.println("====================Data Staff Harian============");
        super.tampilDataStaffEla();
        System.out.println("Jumlah Jam Kerja        : "+jmlJamKerja);
        System.out.println("GajiBersih             :"+(gaji*jmlJamKerja+lembur-potongan));
        }    
}
