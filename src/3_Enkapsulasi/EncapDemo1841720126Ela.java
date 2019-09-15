/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class EncapDemo1841720126Ela {
    private String mNama;
    private int mAge;
    
    public String getNamaEla(){
        return mNama;
    }
    public void setNamaEla(String newName){
        mNama = newName;
    }
    public int getAgeEla(){
        return mAge;
    }
    //di edit tugas 3 
    public void setAgeEla(int newAge){
        if(newAge > 18 && newAge < 30){
            mAge = newAge;
        }
        else{
            System.out.println("Umur kurang dari 18 atatu lebih dari 30");
        }
    }
}
