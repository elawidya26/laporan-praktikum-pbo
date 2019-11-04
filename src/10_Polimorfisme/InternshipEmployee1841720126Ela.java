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
public class InternshipEmployee1841720126Ela extends Employee1841720126Ela{
    private int length;

    public InternshipEmployee1841720126Ela(String name,int length) {
        this.length = length;
        this.name = name;
    }

    public int getLengthEla() {
        return length;
    }

    public void setLengthEla(int length) {
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfoEla(){
        String info=super.getEmployeeInfoEla()+"\n";
        info += "Registerd as internship employee for "+length+" month/s\n";
        return info;
    }   
}
