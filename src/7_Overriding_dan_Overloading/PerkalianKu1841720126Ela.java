/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7_1841720126Ela;

/**
 *
 * @author User
 */
public class PerkalianKu1841720126Ela {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    
    void perkalian (double a, double b){
        System.out.println( a * b );
    }
    
    public static void main(String[] args) {
        PerkalianKu1841720126Ela objek = new PerkalianKu1841720126Ela();
        
        objek.perkalian(25, 43);
        objek.perkalian(34.56 , 23.7);
    }
}
