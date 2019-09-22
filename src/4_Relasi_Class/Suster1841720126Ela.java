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
public class Suster1841720126Ela {
    private int mId, mNip;
    private String mNama;

    public Suster1841720126Ela() {
    }

    public Suster1841720126Ela(int mId, int mNip, String mNama) {
        this.mId = mId;
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public int getmIdEla() {
        return mId;
    }

    public void setmIdEla(int mId) {
        this.mId = mId;
    }

    public int getmNipEla() {
        return mNip;
    }

    public void setmNipEla(int mNip) {
        this.mNip = mNip;
    }

    public String getmNamaEla() {
        return mNama;
    }

    public void setmNamaEla(String mNama) {
        this.mNama = mNama;
    }
    
    public void infoEla(){
        System.out.println("Id Suster : " +mId);
        System.out.println("Nama Suster : "+mNama);
        System.out.println("NIP Suster : "+mNip);
    }
}
