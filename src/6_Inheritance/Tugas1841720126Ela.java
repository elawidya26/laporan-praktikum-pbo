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
public class Tugas1841720126Ela {
    public static void main(String[] args){
        PC1841720126Ela pc = new PC1841720126Ela();
        pc.merk = "Tosiba";
        pc.kecProsesor = 350;
        pc.sizeMemory = 500;
        pc.jnsProsesor = "Intel";
        pc.ukuranMonitor = 32;
        pc.tampilDataEla();
        System.out.println();
        
        Windows1841720126Ela wd = new Windows1841720126Ela();
        wd.merk = "Windows 10";
        wd.kecProsesor = 200;
        wd.sizeMemory = 500;
        wd.jnsProsesor = "Intel";
        wd.jnsBatrei = "Tanam";
        wd.fitur = "Keynote";
        wd.tampilDataWindowsEla();
        System.out.println();
        
        Mac1841720126Ela mc = new Mac1841720126Ela();
        mc.merk = "Guafa";
        mc.kecProsesor = 300;
        mc.sizeMemory = 500;
        mc.jnsProsesor = "Intel";
        mc.jnsBatrei = "Tanam";
        mc.security = "Pasword";
        mc.tampilDataMacEla();
        
                
    }
}
