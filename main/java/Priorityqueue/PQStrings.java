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
public class PQStrings {
      public static void main() 
      {        // Create a Priority Queue        
          PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();       
          // Add items to a Priority Queue (ENQUEUE)       
          namePriorityQueue.add("Lisa");       
          namePriorityQueue.add("Robert");       
          namePriorityQueue.add("John");      
          namePriorityQueue.add("Chris");       
          namePriorityQueue.add("Angelina");     
          namePriorityQueue.add("Joe");       
          // Remove items from the Priority Queue (DEQUEUE)       
          while (!namePriorityQueue.isEmpty()) 
          {          
              System.out.println(namePriorityQueue.remove());
          }       
      }
}
