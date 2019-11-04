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
public class PermanentEmployee1841720126Ela extends Employee1841720126Ela
    implements Payable1841720126Ela{
    private int salary;
    
    public PermanentEmployee1841720126Ela(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalaryEla() {
        return salary;
    }

    public void setSalaryEla(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmountEla(){
        return(int)(salary+0.05+salary);
    }
    
    @Override
    public String getEmployeeInfoEla(){
        String info=super.getEmployeeInfoEla()+"\n";
        info += "Registered as permanent employee with salary "+salary+"\n";
        return  info;
    } 
}
