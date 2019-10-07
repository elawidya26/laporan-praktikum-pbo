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
public class StaffTetap1841720126Ela extends Staff1841720126Ela {
    public String golongan;
    public int asuransi;

    public StaffTetap1841720126Ela() {
    }

    public StaffTetap1841720126Ela (String nama,String alamat, String jk, int umur,int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan=golongan;
        this.asuransi=asuransi;
    }

    
    public void tampilStaffTetapEla(){
        System.out.println("================Data Staff Tetap============");
        super.tampilDataStaffEla();
        System.out.println("Golongan             : "+golongan);
        System.out.println("JumlahAngsuransi   : "+asuransi);
        System.out.println("GajiBersih         : "+(gaji+lembur-potongan-asuransi));
    }
}
