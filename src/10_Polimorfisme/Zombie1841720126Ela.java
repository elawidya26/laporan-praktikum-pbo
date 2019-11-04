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
public abstract class Zombie1841720126Ela implements Destroyable1841720126Ela { 
    protected int health;    
    protected int level;     
    
    public String getZombieInfoEla(){  
        return "\nHealth = "+health+"\nLevel = "+level;
    }         
    public abstract void healEla();    
    @Override    
    public abstract void destroyedEla(); 
    
}
