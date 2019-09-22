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
public class Pasien1841720126Ela {
    private int mId;
    private String mNama;

    public Pasien1841720126Ela() {
    }
    

    public Pasien1841720126Ela(int mId, String mNama) {
        this.mId = mId;
        this.mNama = mNama;
    }

    public void setmIdEla(int mId) {
        this.mId = mId;
    }

    public void setmNamaEla(String mNama) {
        this.mNama = mNama;
    }

    public int getmIdEla() {
        return mId;
    }

    public String getmNamaEla() {
        return mNama;
    }
    
    public void infoEla(){
        System.out.println("Id Pasien : "+ mId);
        System.out.println("Nama Pasien : "+ mNama);
    }
}
