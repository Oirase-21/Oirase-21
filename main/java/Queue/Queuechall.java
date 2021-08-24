/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author brown
 */
public class Queuechall 
{
    public static void main() 
    {
	       Queue<String> QL = new LinkedList<String>();    
	        Scanner  q = new Scanner(System.in);
		            
                System.out.println("Enter the data for scene arrival: ");
	                   
                     for (int i=0; i<10; i++ )
	               {    
	                String data = q.nextLine();
	                QL.add(data);
                       }	            
	          System.out.println("\n The data for scene arrival: " +QL);

	    
	    }
	}

