/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan1_1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class Laptop1841720126Ela {
    private String mMerk;
    private Processor1841720126Ela mProc;

    public Laptop1841720126Ela() {
    }

    public Laptop1841720126Ela(String mMerk, Processor1841720126Ela mProc) {
        this.mMerk = mMerk;
        this.mProc = mProc;
    }

    public void setmMerkEla(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setmProcEla(Processor1841720126Ela mProc) {
        this.mProc = mProc;
    }

    public String getmMerkEla() {
        return mMerk;
    }

    public Processor1841720126Ela getmProcEla() {
        return mProc;
    }
    
    public void infoEla(){
        System.out.println("Merk Laptop = "+mMerk);
        mProc.infoEla();
    }
}
