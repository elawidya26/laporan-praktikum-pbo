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
public class Gerbong1841720126Ela {
    private String mKode;
    private Kursi1841720126Ela[] mArrayKursi;

    public Gerbong1841720126Ela(String mKode, int jumlah) {
        this.mKode = mKode;
        this. mArrayKursi = new Kursi1841720126Ela[jumlah];
        this.initKursiEla();
    }

    public void setmKodeEla(String mKode) {
        this.mKode = mKode;
    }

    public void setmArrayKursiEla(Kursi1841720126Ela[] mArrayKursi) {
        this.mArrayKursi = mArrayKursi;
    }

    public String getmKodeEla() {
        return mKode;
    }

    public Kursi1841720126Ela[] getmArrayKursiEla() {
        return mArrayKursi;
    }
    
    private void initKursiEla(){
        for(int i=0; i<mArrayKursi.length; i++){
            this.mArrayKursi[i] = new Kursi1841720126Ela(String.valueOf(i+1));
        }
    }
    
    public String infoEla(){
        String infoEla ="";
        infoEla += "Kode ; " + mKode + "\n";
        for(Kursi1841720126Ela kursi : mArrayKursi){
            infoEla += kursi.infoEla();
        }
        return infoEla;
    }
    
    public void setPenumpangEla(Penumpang1841720126Ela penumpang, int nomor){
        //pertanyaan percobaan 4 nomer 5 
        if(mArrayKursi[nomor-1].getmPenumpang()==null){
            this.mArrayKursi[nomor-1].setmPenumpangEla(penumpang);
        }else{
            System.out.println("Tempat Terpenuhi : ");
            System.out.println(penumpang.infoEla());
            System.out.println("Nomor : "+nomor);
        }
        
    }
}
