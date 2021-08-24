/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author brown
 */
public class Recursionchall 
{
 public static int x=0;
	    static void p(int y)
	        {
	             for  (int i=0; i<5; i++)
	            {
	                System.out.println("The next number is: " + x);
	                x=x+y;
	                p(y);
	            }
	            
	        }
	        public static void main() 
	        { 
	            Scanner  SS = new Scanner(System.in);
	            System.out.println("Enter the starting number: ");
	              x= SS.nextInt();
	                
	              
	              p(10);
	            }
	        }
    

