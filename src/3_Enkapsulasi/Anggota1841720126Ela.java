/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter1841720126Ela;

/**
 *
 * @author Windows 10
 */
public class Anggota1841720126Ela {
    private String mNama;
    private String mAlamat;
    private float mSimpanan;
    
    //menambhakan ini pada percobaan 4 
    Anggota1841720126Ela(String nama, String alamat){
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mSimpanan = 0;
    }
    // sampai ini 
    
    public void setNamaEla(String nama){
        this.mNama = nama;
    }
    public void setAlamatEla(String alamat){
        this.mAlamat = alamat;
    }
    public String getNamaEla(){
        return mNama;
    }
    public String getAlamatEla(){
        return mAlamat;
    }
    public float getSimpananEla(){
        return mSimpanan;
    }
    public void setorEla(float uang){
        mSimpanan += uang;
    }
    public void pinjamEla(float uang){
        mSimpanan -= uang;
    }
}
