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
public class Karyawan1841720126Ela {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setmNamaEla(String mNama) {
        this.mNama = mNama;
    }

    public void setmNipEla(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolonganEla(String mGolongan) {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }

    public void setmGajiEla(double mGaji) {
        this.mGaji = mGaji;
    }

    public String getmNamaEla() {
        return mNama;
    }

    public String getmNipEla() {
        return mNip;
    }

    public String getmGolonganEla() {
        return mGolongan;
    }

    public double getmGajiEla() {
        return mGaji;
    }
    
    
}
