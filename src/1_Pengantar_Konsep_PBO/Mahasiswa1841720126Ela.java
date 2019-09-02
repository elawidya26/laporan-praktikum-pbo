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
public class Mahasiswa1841720126Ela {
     private String nama;
    private String nim;
    private String jurusan;
    
    public void setNamaEla(String nama){
        this.nama=nama;
    }
    public void setNimEla(String nim){
        this.nim=nim;
    }
    public void setJurusanEla(String jurusan){
        this.jurusan=jurusan;
    }
    public void tampilkanEla(){
        System.out.println("MAHASISWA BARU");
        System.out.println("nama : "+nama);
        System.out.println("nim : "+nim);
        System.out.println("jurusan : "+jurusan);
    }
}
