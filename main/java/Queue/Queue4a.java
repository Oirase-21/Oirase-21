/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author brown
 */
public class Queue4a 
{
public static void main() 
{
    Queue<String> q1 = new LinkedList<String>();
        q1.add("I");
        q1.add("Love");
        q1.add("Rock");
        q1.add("And");
        q1.add("Roll");

        System.out.println("Elements in Queue:"+q1);
        System.out.println("Removed element: "+q1.remove());
        System.out.println("Head: "+q1.element());
        System.out.println("poll(): "+q1.poll());
        System.out.println("peek(): "+q1.peek());
        System.out.println("Elements in Queue:"+q1);
}    
}
