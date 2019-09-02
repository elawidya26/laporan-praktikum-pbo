/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo2;

/**
 *
 * @author Windows 10
 */
public class Sepeda1841720126Ela {
    private String mMerek, mWarna;
    private int mKecepatan;
    private int mGear;
    
    public void setMerekEla(String newValue){
        mMerek = newValue;
    }
    
    public void gantiGearEla(int newValue){
        mGear = newValue;
    }
    
    public void tambahKecepatanEla(int increment){
        mKecepatan = mKecepatan + increment;
    }
    
    public void remEla(int decrement){
        mKecepatan = mKecepatan - decrement;
    }
    
    public void tambahWarnaEla(String newValue){
        mWarna = newValue;
    }
    public void cetakStatusEla(){
        System.out.println("Merek : "+mMerek);
        System.out.println("Kecepatan : "+mKecepatan);
        System.out.println("Gear : "+mGear);
        System.out.println("Warna : "+mWarna);
    }
}
