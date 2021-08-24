 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListAssignment;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Desario Brown
 */
public class LinkedListchall 
{
    public static void work()
    {
        LinkedList<String> linkedchall = new LinkedList<>();
    Scanner  listch = new Scanner(System.in);
    
    System.out.println("Enter name of your car:");
    String name = listch.nextLine();
    System.out.println("\n Enter how many passengers are in the car:" );
    String number =listch.nextLine();
    System.out.println("\n Enter how many seats are in the car:");
    String number2 =listch.nextLine();

    linkedchall.add(name);
    linkedchall.add(number);
    linkedchall.add(number2);
    
    System.out.println("The name of your car is : " +name);
    System.out.println("The number of passengers are: " +number);
    System.out.println("The number of passengers are: " +number2);
    
   System.out.println("The contents of the list are: " +linkedchall);
   System.out.println("What do you want to remove from the list : ");
   String remove  = listch.nextLine();
    linkedchall.remove(remove);
   
    System.out.println("The contents of the list are: " +linkedchall); 
} 
    
}
