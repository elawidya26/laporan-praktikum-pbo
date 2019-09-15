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
public class AnggotaTugas1841720126Ela {
    private String mNama, mNomorKtp;
    private int mLimitPinjaman, mJumlahPinjaman;
    
    public AnggotaTugas1841720126Ela(String nomorKtp, String nama, int limitPinjaman){
        this.mNama = nama;
        this.mNomorKtp = nomorKtp;
        this.mLimitPinjaman = limitPinjaman;
    }
    public String getNamaEla(){
        return mNama;
    }
    public int getLimitPinjamanEla(){
        return mLimitPinjaman;
    }
    public int getJumlahPinjamanEla(){
        return mJumlahPinjaman;
    }
    public void pinjamEla(int pinjam){
        if(pinjam>mLimitPinjaman){
            System.out.println("Maaf Jumlah Pinjaman Melebihi Limit");
        }
        else{
            mJumlahPinjaman += pinjam;
        }
    }
    public void angsurEla(int angsur){
        if(angsur<(mJumlahPinjaman*0.1)){
            System.out.println("Maaf Angsuran harus 10% dari jumlah pinjaman");
        }else{
            mJumlahPinjaman-= angsur;
        }
    }
}
