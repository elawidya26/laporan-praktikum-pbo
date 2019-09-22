/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan4_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class Penumpang1841720126Ela {
    private String mKtp, mNama;

    public Penumpang1841720126Ela(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public void setmKtpEla(String mKtp) {
        this.mKtp = mKtp;
    }

    public void setmNamaEla(String mNama) {
        this.mNama = mNama;
    }

    public String getmKtpEla() {
        return mKtp;
    }

    public String getmNamaEla() {
        return mNama;
    }
    
    public String infoEla(){
        String infoEla = " ";
        infoEla += "KTP : " +mKtp+ "\n";
        infoEla += "Nama : " +mNama+ "\n";
        return infoEla;
    }
}
