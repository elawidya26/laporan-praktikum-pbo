/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan3_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class Pegawai1841720126Ela {
    private String mNip;
    private String mNama;

    public Pegawai1841720126Ela(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public void setmNipEla(String mNip) {
        this.mNip = mNip;
    }

    public void setmNamaEla(String mNama) {
        this.mNama = mNama;
    }

    public String getmNipEla() {
        return mNip;
    }

    public String getmNamaEla() {
        return mNama;
    }
    public String infoEla(){
        String infoEla = "";
        infoEla += "Nip : "+this.mNip +"\n";
        infoEla += "Nama : "+this.mNama+"\n";
        return infoEla;
    }
}
