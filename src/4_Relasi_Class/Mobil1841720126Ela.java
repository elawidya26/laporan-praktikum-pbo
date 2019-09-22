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
public class Mobil1841720126Ela {
    private String mMerk;
    private int mBiaya;

    public Mobil1841720126Ela() {
    }

    public void setmMerkEla(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setmBiayaEla(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public String getmMerkEla() {
        return mMerk;
    }

    public int getmBiayaEla() {
        return mBiaya;
    }
    
    public int hitungBiayaMobilEla(int hari){
        return mBiaya*hari;
    } 
}
