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
public class Plant1841720126Ela {
    public void doDestroy (Destroyable1841720126Ela d){
        if (d instanceof WalkingZombie1841720126Ela){
            WalkingZombie1841720126Ela wz = (WalkingZombie1841720126Ela) d;
            wz.destroyedEla();
        }else if (d instanceof JumpingZombie1841720126Ela){
            JumpingZombie1841720126Ela jz = (JumpingZombie1841720126Ela) d;
            jz.destroyedEla();
        }else if (d instanceof Barrier1841720126Ela){
            Barrier1841720126Ela b = (Barrier1841720126Ela) d;
            b.destroyedEla();
        }
    }
}
