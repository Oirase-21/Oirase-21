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
public class Stackintro 
{
 public static void main() {
    Stack CSC260st = new Stack();
    
    CSC260st.push("NYC");
    CSC260st.push("OLD WESTBURY");
    CSC260st.push("VANCOUVER");
    CSC260st.push("NANJING");
    CSC260st.push("CENTRAL ISLIP");
    CSC260st.push("ABU DHABI");
    CSC260st.push("JONESBORO");
    
    System.out.println("Removed object is: "+CSC260st.pop());
    
    System.out.println("Elements after remove: "+CSC260st);
}
}
    

