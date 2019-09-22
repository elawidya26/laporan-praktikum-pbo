/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan2_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class Sopir1841720126Ela {
    private String mNama;
    private int mBiaya;

    public Sopir1841720126Ela() {
    }

    public void setmNamaEla(String mNama) {
        this.mNama = mNama;
    }

    public void setmBiayaEla(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public String getmNamaEla() {
        return mNama;
    }

    public int getmBiayaEla() {
        return mBiaya;
    }
    
    public int hitungBiayaSupirEla(int hari){
        return mBiaya*hari;
    }
    
}
