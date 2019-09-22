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
public class Processor1841720126Ela {
    private String mMerk;
    private double mCache;

    public Processor1841720126Ela() {
    }

    public Processor1841720126Ela(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }

    public void setmMerkEla(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setmCacheEla(double cCache) {
        this.mCache = cCache;
    }

    public String getmMerkEla() {
        return mMerk;
    }

    public double getmCacheEla() {
        return mCache;
    }
    
    public void infoEla(){
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    } 
}
