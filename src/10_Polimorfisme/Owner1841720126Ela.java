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
public class Owner1841720126Ela {
    public void payEla(Payable1841720126Ela p) {
        System.out.println("Total payment = "+p.getPaymentAmountEla());
        if(p instanceof ElectricityBill1841720126Ela){
            ElectricityBill1841720126Ela eb = (ElectricityBill1841720126Ela)p;
            System.out.println(""+eb.getBillInfoEla());
        }else if(p instanceof PermanentEmployee1841720126Ela){
            PermanentEmployee1841720126Ela pe = (PermanentEmployee1841720126Ela) p;
            pe.getEmployeeInfoEla();
            System.out.println(""+pe.getEmployeeInfoEla());
        }
    }
    
    public void showMyEmployeeEla(Employee1841720126Ela e){
        System.out.println(""+e.getEmployeeInfoEla());
        if (e instanceof PermanentEmployee1841720126Ela) 
            System.out.println("You Have to pay her/him monthly!!!");
        else 
            System.out.println("No need to pay him/her :)");
    }
}
