/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotorEncapsulation1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class Motor1841720126Ela {
    private int mKecepatan = 95;
    private boolean mKontakOn = false;
    
    public void nyalakanMesinEla(){
        mKontakOn = true;
    }
    public void matikanMesinEla(){
        mKontakOn = false;
        mKecepatan = 0;
    }
    public void tambahKecepatanEla(){
        if(mKontakOn == true){
            if(mKecepatan < 100){
                mKecepatan +=5;
            }
            else{
                System.out.println("Kecepatan Maksimal");
            }
        }
        else{
            System.out.println("Kecepatan Tidak Bisa Bertahan Karena Mesin Off! \n");
        }
    }
    public void kurangKecepatan(){
        if(mKontakOn == true){
            mKecepatan += 5;
        }
        else{
            System.out.println("Kecepatan Tidak Bisa Berkurang Karena Mesin Off! \n");
        }
    }
    
    public void printStatusEla(){
        if(mKontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+mKecepatan+"\n");
    }
}
