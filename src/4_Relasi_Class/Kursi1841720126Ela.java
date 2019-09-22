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
public class Kursi1841720126Ela {
    private String mNomor;
    private Penumpang1841720126Ela mPenumpang;

    public Kursi1841720126Ela(String mNomor) {
        this.mNomor = mNomor;
    }

    public void setmNomorEla(String mNomor) {
        this.mNomor = mNomor;
    }

    public void setmPenumpangEla(Penumpang1841720126Ela mPenumpang) {
        this.mPenumpang = mPenumpang;
    }

    public String getmNomorEla() {
        return mNomor;
    }

    public Penumpang1841720126Ela getmPenumpang() {
        return mPenumpang;
    }
     
    public String infoEla(){
        String infoEla = "";
        infoEla += "Nomor : " + mNomor + "\n";
        if(this.mPenumpang != null){
            infoEla += "Penumpang : \n"+mPenumpang.infoEla()+ "\n";
        }
        return infoEla;
    }
}
