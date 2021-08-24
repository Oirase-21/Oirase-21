/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAssignment;
import java.util.*;
/**
 *
 * @author Desario Brown
 */
public class Stackchall 
{
 public static void chall()
 {
     Stack st = new Stack();
     Scanner  Stackit = new Scanner(System.in);
    
    System.out.println("Enter amount to contirbute:");
    int Contribution = Stackit.nextInt();
    System.out.println("\n Enter amount of interest:");
    double interest = Stackit.nextDouble();
    double Total =0; 
    double calc;
    
    for (int i=0; i<29; i++)
    {
        calc = Contribution * interest;
        Total = calc + Total;
        st.push(Total);    
    }
        System.out.println("These are the stack values:" +st);
        System.out.println("Total value: " + st.peek());

 }
}
