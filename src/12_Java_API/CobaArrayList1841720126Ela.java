/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Ela Widya
 */
public class CobaArrayList1841720126Ela {
    public static void main(String[] args){
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        
        //pertanyaan nomer2
        //System.out.println("Country List");
        //Iterator mIterator = mListCountry.iterator();
        //while(mIterator.hasNext()) {
            //Object element = mIterator.next();
            //System.out.format(" %s ", element);
        //}
        
        System.out.println(mListCountry);
        System.out.format("List Index 0 = %s\n",mListCountry.get(0));
        System.out.format("List Index 2 = %s\n",mListCountry.get(2));
    }
}
