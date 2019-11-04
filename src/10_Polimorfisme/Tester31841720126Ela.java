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
public class Tester31841720126Ela {
    public static void main(String[] args) {
        PermanentEmployee1841720126Ela pEmp =new PermanentEmployee1841720126Ela("Dedik", 500);
        InternshipEmployee1841720126Ela iEmp = new InternshipEmployee1841720126Ela("Sunarto", 5);
        ElectricityBill1841720126Ela eBill = new ElectricityBill1841720126Ela(5, "A-1");
        Employee1841720126Ela e[] = {pEmp,iEmp};
        Payable1841720126Ela p[] = {pEmp,eBill};
        Employee1841720126Ela e2[] = {pEmp, iEmp};
    }
}
