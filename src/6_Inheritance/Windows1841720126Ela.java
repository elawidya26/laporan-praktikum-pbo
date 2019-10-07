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
public class Windows1841720126Ela extends Laptop1841720126Ela{
    public String fitur;

    public Windows1841720126Ela() {
    }

    public Windows1841720126Ela(String fitur, String jnsBatrei, String merk, String jnsProsesor, 
            int kecProsesor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilDataWindowsEla(){
        super.tampilDataLaptopEla();
        System.out.println("Fitur : "+fitur);
    }
}
