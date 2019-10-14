/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1841720126Ela;

/**
 *
 * @author User
 */
public class Segitiga1841720126Ela {
    private int sudut;
    
    public int totalSudutEla(int sudutA){
        sudut = 180-sudutA;
        System.out.println("Total Sudut : "+sudut);
        return sudut;
    }
    
    public int totalSudutEla(int sudutA, int sudutB){
        System.out.println("Total Sudut : "+sudut);
        return sudut;
    }
    
    public int kelilingEla(int sisiA, int sisiB, int sisiC){
        int kel =  sisiA+sisiB+sisiC;
        System.out.println("Keliling Segitiga : "+kel);
        return kel;
    }
    
    public double kelilingEla(int sisiA, int sisiB){
        double c = Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
        System.out.println("Sudut C : "+ c);
        return c;
    }
}
