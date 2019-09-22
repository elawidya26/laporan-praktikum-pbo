/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.tugas_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class Riwayat1841720126Ela {
    private String mRiwayat;

    public Riwayat1841720126Ela() {
    }

    
    public Riwayat1841720126Ela(String mRiwayat) {
        this.mRiwayat = mRiwayat;
    }

    public String getmRiwayatEla() {
        return mRiwayat;
    }

    public void setmRiwayatEla(String mRiwayat) {
        this.mRiwayat = mRiwayat;
    }
    
    public void infoEla(){
        System.out.println("Riwayat Pasien : "+mRiwayat);
    }
}
