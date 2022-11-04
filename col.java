/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashset;

/**
 *
 * @author himmat
 */
import java.util.*; 
public class col {
   
public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<>();  
set.add("Balkh");  
set.add("Kabul");  
set.add("Kandaher");  
set.add("Herat");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
 
}
