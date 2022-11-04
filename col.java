/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Treeset;

/**
 *
 * @author himmat
 */
import java.util.*;
public class col {
    public static void main(String args[]){  
        //Creating and adding elements  
        TreeSet<String> set=new TreeSet<>();  
        set.add("Balkh");  
        set.add("Kabul");  
        set.add("Kandaher");  
        set.add("Herat");  
        //traversing elements  
        Iterator<String> itr=set.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
}  
} 
}
