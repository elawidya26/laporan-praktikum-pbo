/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6_1841720126Ela;

/**
 *
 * @author User
 */
public class Komputer1841720126Ela {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer1841720126Ela() {
    }

    public Komputer1841720126Ela(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilDataEla(){
        System.out.println("Merk : " +merk);
        System.out.println("Kecepatan Prosesor : "+kecProsesor);
        System.out.println("Size Memory : "+sizeMemory);
        System.out.println("Jenis Prosesor : "+jnsProsesor);
    }
}
