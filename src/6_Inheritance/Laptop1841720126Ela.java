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
public class Laptop1841720126Ela extends Komputer1841720126Ela {
    public String jnsBatrei;

    public Laptop1841720126Ela() {
    }

    public Laptop1841720126Ela(String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilDataLaptopEla(){
        super.tampilDataEla();
        System.out.println("Jenis Baterai : "+jnsBatrei);
    }
}
