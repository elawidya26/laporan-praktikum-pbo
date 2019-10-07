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
public class Tabung1841720126Ela extends Bangun1841720126Ela {
    protected int t;
    
    public void setSuperPhiEla(double phi){
        super.phi = phi;
    }
    
    public void setSuperREla(int r){
        super.r = r;
    }
    
    public void setTEla(int t){
        this.t = t;
    }
    
    public void volumeEla(){
        System.out.println("Volume tabungadalah "+(super.phi*super.r*super.r*this.t));
    }
}
