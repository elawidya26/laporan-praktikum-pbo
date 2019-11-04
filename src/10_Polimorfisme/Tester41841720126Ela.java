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
public class Tester41841720126Ela {
    public static void main(String[] args) {
        Owner1841720126Ela ow =new Owner1841720126Ela();
        ElectricityBill1841720126Ela eBill = new ElectricityBill1841720126Ela(5, "R-1");
        ow.payEla(eBill);
        System.out.println("-----------------------------");
        
        PermanentEmployee1841720126Ela pEmp =new PermanentEmployee1841720126Ela("Dedik", 500);
        ow.payEla(pEmp);
        System.out.println("-----------------------------");
        
        InternshipEmployee1841720126Ela iEmp = new InternshipEmployee1841720126Ela("Sunarto", 5);
        ow.showMyEmployeeEla(pEmp);
        System.out.println("---------------------------------------");
        ow.showMyEmployeeEla(iEmp);
    }
}
