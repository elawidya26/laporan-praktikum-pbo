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
public class ElectricityBill1841720126Ela implements Payable1841720126Ela{
    private int kwh;
    private String category;

    public ElectricityBill1841720126Ela(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhEla() {
        return kwh;
    }

    public void setKwhEla(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryEla() {
        return category;
    }

    public void setCategoryEla(String category) {
        this.category = category;
    }
    
    @Override
    public int getPaymentAmountEla(){
    return kwh*getBasePriceEla();
    }
    public int getBasePriceEla(){
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    public String getBillInfoEla(){
        return "kWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePriceEla()+" per kWH)\n";
    } 
}
