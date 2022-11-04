/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreyDeQue;

/**
 *
 * @author himmat
 */
import java.util.*;
public class col {
  

public static void main(String[] args) {  
//Creating Deque and adding elements  
Deque<String> deque = new ArrayDeque<>();  
deque.add("Balkh");  
deque.add("Kabul");  
deque.add("Kandaher");  
deque.add("Herat"); 
//Traversing elements
deque.forEach((str) -> {
    System.out.println(str);
    });  
 
}
}
