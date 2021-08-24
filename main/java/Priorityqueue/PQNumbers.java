/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Priorityqueue;
import java.util.PriorityQueue;
/**
 *
 * @author brown
 */
public class PQNumbers {
     public static void main() {
     // Create a Priority Queue        
    PriorityQueue<Integer> numbers = new PriorityQueue<>();        
// Add items to a Priority Queue (ENQUEUE)       
    numbers.add(750);        
    numbers.add(500);       
    numbers.add(900);        
    numbers.add(100);        
// Remove items from the Priority Queue (DEQUEUE)        
while (!numbers.isEmpty()) 
{               
    System.out.println(numbers.remove());        
}
}
}
