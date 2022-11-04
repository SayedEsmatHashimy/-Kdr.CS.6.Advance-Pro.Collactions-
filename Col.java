/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author himmat
 */
import java.util.*;
public class Col {
    public static void main(String args[]){  
        Stack<String> stack = new Stack<>();  
        stack.push("Balkh");  
        stack.push("Kabul");  
        stack.push("Kandaher");  
        stack.push("Herat");   
        stack.pop();  
        Iterator<String> itr=stack.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
}  
}
    
}
