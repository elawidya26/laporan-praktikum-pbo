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
public class Main1841720126Ela {
    public static void main(String[] args) {
        WalkingZombie1841720126Ela wz = new WalkingZombie1841720126Ela(100,1);
        JumpingZombie1841720126Ela jz = new JumpingZombie1841720126Ela(100,2);
        Barrier1841720126Ela b = new Barrier1841720126Ela (100);
        Plant1841720126Ela p = new Plant1841720126Ela();
        System.out.println(""+wz.getZombieInfoEla());
        System.out.println(""+jz.getZombieInfoEla());
        System.out.println(""+b.getBarrierInfoEla());
        System.out.println("---------------------");
        for (int i = 0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoEla());
        System.out.println(""+jz.getZombieInfoEla());
        System.out.println(""+b.getBarrierInfoEla());
    } 
}
