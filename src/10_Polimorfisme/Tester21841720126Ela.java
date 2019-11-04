/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author User
 */
public class Tester21841720126Ela {
     public static void main(String[] args) {
        PermanentEmployee1841720126Ela pEmp =new PermanentEmployee1841720126Ela("Dedik", 500);
        Employee1841720126Ela e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoEla());
        System.out.println("------------------------");
        System.out.println(""+pEmp.getEmployeeInfoEla());
    }
}
