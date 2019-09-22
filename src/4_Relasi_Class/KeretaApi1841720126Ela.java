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
public class KeretaApi1841720126Ela {
    private String mNama;
    private String mKelas;
    private Pegawai1841720126Ela mMasinis;
    private Pegawai1841720126Ela mAsisten;

    public KeretaApi1841720126Ela() {
    }
    
    public KeretaApi1841720126Ela(String mNama, String mKelas, Pegawai1841720126Ela mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720126Ela(String mNama, String mKelas, Pegawai1841720126Ela mMasinis, Pegawai1841720126Ela mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    KeretaApi1841720126Ela(String gaya_Baru_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public void setmKelas(String mKelas) {
        this.mKelas = mKelas;
    }

    public void setmMasinis(Pegawai1841720126Ela mMasinis) {
        this.mMasinis = mMasinis;
    }

    public void setmAsisten(Pegawai1841720126Ela mAsisten) {
        this.mAsisten = mAsisten;
    }

    public String getmNama() {
        return mNama;
    }

    public String getmKelas() {
        return mKelas;
    }

    public Pegawai1841720126Ela getmMasinis() {
        return mMasinis;
    }

    public Pegawai1841720126Ela getmAsisten() {
        return mAsisten;
    }
    
    public String infoEla(){
        String infoEla = "";
        infoEla += "Nama : "+this.mNama+"\n";
        infoEla += "Kelas : "+this.mKelas+"\n\n";
        infoEla += "Masinis :\n"+this.mMasinis.infoEla()+"\n";
        infoEla += "Asisten :\n"+this.mAsisten.infoEla()+"\n";
        return infoEla;
    }
}
