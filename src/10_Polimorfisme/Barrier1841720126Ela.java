/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author User
 */
public class Barrier1841720126Ela implements Destroyable1841720126Ela {
    private int strength;
    
    public Barrier1841720126Ela (int strength){
        this.strength = strength;
    }
    public void setStrengthEla (int strength){
        this.strength = strength;
    }
    public int getStrengthEla (){
        return strength;
    } 
    public void destroyEla(){
        strength -= strength*0.1;
    }  
    public void destroyedEla(){
        destroyEla();
    }
    public String getBarrierInfoEla(){
        return "Barrier Strength = "+strength+"\n";
    }
    
}
