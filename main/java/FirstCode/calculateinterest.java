/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstCode;

/**
 *
 * @author brown
 */
public class calculateinterest {
      public static double interestcalc(){
     double principle = 188900, rate = 10.58, time = 9;
     /* Calculate compound interest */
     double CI = principle *(Math.pow((1 + rate / 100), time));
 System.out.println("Compound Interest is "+ CI);
 return CI;
     }
 }
