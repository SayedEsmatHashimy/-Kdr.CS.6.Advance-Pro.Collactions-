/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author himmat
 */
import java.util.*;
public class Col {
    public static void main(String args[]){  
        LinkedList<String> al=new LinkedList<>();  
        al.add("Balkh");  
        al.add("Kabul");  
        al.add("Kandaher");  
        al.add("Herat");  
        Iterator<String> itr=al.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
}  
}
    
}
