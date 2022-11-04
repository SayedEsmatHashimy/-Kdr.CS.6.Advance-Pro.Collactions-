/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author himmat
 */
import java.util.*;
public class Coll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();//Creating arraylist  
        list.add("Balkh");//Adding object in arraylist  
        list.add("Kabul");  
        list.add("Kandaher");  
        list.add("Herat");  
        //Traversing list through Iterator  
        Iterator itr=list.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
}
    }
    
}
