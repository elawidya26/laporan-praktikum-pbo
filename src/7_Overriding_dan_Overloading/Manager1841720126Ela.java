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
public class Manager1841720126Ela extends Karyawan1841720126Ela {
    
    private double mTunjangan;
    private String mBagian;
    private Staff1841720126Ela st[];

    public void setmTunjanganEla(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public double getmTunjanganEla() {
        return mTunjangan;
    }

    public void setmBagianEla(String mBagian) {
        this.mBagian = mBagian;
    }

    public String getmBagianEla() {
        return mBagian;
    }

    public void setStEla(Staff1841720126Ela[] st) {
        this.st = st;
    }

    void viewStaff1841720126Ela() {
        int i;
        System.out.println("------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoEla();
        }
        System.out.println("------------");
    }

    void lihatInfoEla() {
        System.out.println("Manager : " + this.getmBagianEla());
        System.out.println("NIP : " + this.getmNipEla());
        System.out.println("Nama : " + this.getmNamaEla());
        System.out.println("Golongan : " + this.getmGolonganEla());
        System.out.printf("Tunjangan :%.0f\n", this.getmTunjanganEla());
        System.out.printf("Gaji : %.0f\n", this.getmGajiEla());
        System.out.println("Bagian : " + this.getmBagianEla());
        this.viewStaff1841720126Ela();
    }

    double getGajiEla() {
        return super.getmGajiEla() + mTunjangan;
    }
}
