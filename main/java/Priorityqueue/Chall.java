/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Priorityqueue;

import java.util.PriorityQueue;
import java.util.Scanner;


/**
 *
 * @author brown
 */
public class Chall 
{
 public static void main() 
      {  //create scanner 
          Scanner  PQ = new Scanner(System.in);
          // Create a Priority Queue        
          PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();       
          // Add items to a Priority Queue (ENQUEUE)       
          System.out.println("Enter 7 names for the Queue");
          for (int i=0; i<7; i++)
          {
             namePriorityQueue.add(PQ.nextLine());       
          }
          // Remove items from the Priority Queue (DEQUEUE)       
          while (!namePriorityQueue.isEmpty()) 
          {          
              System.out.println(namePriorityQueue.remove());
          }       
      }   
}
