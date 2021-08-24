/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListAssignment;
import java.util.*;
/**
 *
 * @author Desario Brown
 */
public class LinkedList1b 
{
  public static void ll()
  {
      LinkedList<String> lList = new LinkedList<>();
            lList.add("1");
            lList.add("2");
            lList.add("3");
            lList.add("4");
            lList.add("5");
            System.out.println("LinkedList contains : " + lList);

            Object object = lList.removeFirst();
            System.out.println(object + " has been removed from the first index of LinkedList");
             System.out.println("LinkedList now contains : " + lList);

            object = lList.removeLast();
            System.out.println(object + " has been removed from the last index of LinkedList");
            System.out.println("LinkedList now contains : " + lList);    
    }
}
