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
public class Mac1841720126Ela extends Laptop1841720126Ela{
    public String security;

    public Mac1841720126Ela() {
    }

    public Mac1841720126Ela(String security, String jnsBatrei, String merk, String jnsProsesor, 
            int kecProsesor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.security = security;
    }
    
    public void tampilDataMacEla(){
        super.tampilDataLaptopEla();
        System.out.println("Security : "+security);
    }
}
