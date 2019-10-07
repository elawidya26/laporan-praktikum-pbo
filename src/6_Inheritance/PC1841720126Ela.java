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
public class PC1841720126Ela extends Komputer1841720126Ela {
    public int ukuranMonitor;

    public PC1841720126Ela() {
    }

    public PC1841720126Ela(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilDataPCEla(){
        super.tampilDataEla();
        System.out.println("Ukuran Monitor : "+ukuranMonitor);
    }
}
