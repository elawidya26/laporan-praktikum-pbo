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
public class Staff1841720126Ela extends Karyawan1841720126Ela {
     private int mLembur;
    private double mGajiLembur;

    public void setmLemburEla(int mLembur) {
        this.mLembur = mLembur;
    }

    public int getmLemburEla() {
        return mLembur;
    }

    public void setmGajiLemburEla(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public double getmGajiLemburEla() {
        return mGajiLembur;
    }

    double getmGajiEla(int lembur, double gajiLembur) {
        return super.getmGajiEla() + lembur * gajiLembur;
    }

    @Override
    public double getmGajiEla() {
        return super.getmGajiEla() + mLembur * mGajiLembur;
    }

    void lihatInfoEla() {
        System.out.println("NIP : "+this.getmNipEla());
        System.out.println("Nama : "+this.getmNamaEla());
        System.out.println("Golongan : "+this.getmGolonganEla());
        System.out.println("Jml Lembur : "+this.getmLemburEla());
        System.out.printf("Gaji Lembur :%.0f\n",this.getmGajiLemburEla());
        System.out.printf("Gaji :%.0f\n",this.getmGajiEla());
    }

}
