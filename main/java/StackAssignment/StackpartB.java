/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAssignment;
import java.util.*;
/**
 *
 * @author brown
 */
public class StackpartB 
{
    public static void main()
{
    Stack st = new Stack();
    st.push("FORD");
    st.push("CHEVY");
    st.push("HONDA");
// checking the top object
    System.out.println("Top object is: "+st.peek());
    System.out.println("Elements after peek: "+st);
}
}    

