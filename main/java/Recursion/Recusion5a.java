/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author brown
 */
public class Recusion5a {

    public static int x = 0;
        static void p()
            {
                System.out.println("The next number is: " + x);
                x=x+1;
                p();
            }
    public static void main() {
        p();
    }
} 
