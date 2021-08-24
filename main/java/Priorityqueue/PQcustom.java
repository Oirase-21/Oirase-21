/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Priorityqueue;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 *
 * @author brown
 */
public class PQcustom 
{
   public static void main() 
   {        // A custom comparator that compares two Strings by their length.        
       Comparator<String> stringLengthComparator = new Comparator<String>() 
       {      @Override           
       public int compare(String s1, String s2) 
       {               
           return s1.length() - s2.length();
       }           
               };        // Create a Priority Queue with a custom Comparator
   PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);       
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

