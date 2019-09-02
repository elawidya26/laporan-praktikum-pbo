/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo2;

/**
 *
 * @author Windows 10
 */
public class SepedaGunung1841720126Ela extends Sepeda1841720126Ela{
    private String tipeSuspensiEla;
    public void setTipeSuspensiEla(String newValue){
        tipeSuspensiEla = newValue;
    }
    public void cetakStatusEla(){
        super.cetakStatusEla();
        System.out.println("Tipe Suspens ; "+tipeSuspensiEla);
    }
}
