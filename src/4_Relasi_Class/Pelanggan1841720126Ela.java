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
public class Pelanggan1841720126Ela {
    private String mNama;
    private Mobil1841720126Ela mMobil;
    private Sopir1841720126Ela mSopir;
    private int mHari;

    public Pelanggan1841720126Ela() {
    }

    public void setmNamaEla(String mNama) {
        this.mNama = mNama;
    }

    public void setmMobilEla(Mobil1841720126Ela mMobil) {
        this.mMobil = mMobil;
    }

    public void setmSopirEla(Sopir1841720126Ela mSopir) {
        this.mSopir = mSopir;
    }

    public void setmHariEla(int hari) {
        this.mHari = hari;
    }
    
    public int hitungBiayaTotalEla(){
        return mMobil.hitungBiayaMobilEla(mHari)+ mSopir.hitungBiayaSupirEla(mHari);
    }
    
}
