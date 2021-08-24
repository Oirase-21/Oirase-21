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
public class menuclass {
      public static void runmenu(int day)
 {//1. add user
     String dayString;
// switch statement with int data type
switch (day) 
     {
     case 1://addusermethod();
     dayString = "Monday";
     break;
     case 2:dayString = "Tuesday";
     break;
     case 3:dayString = "Wednesday";
     break;
     case 4:dayString = "Thursday";
     break;
     case 5:dayString = "Friday";
     break;
     case 6:dayString = "Saturday";
     break; 
     case 7:dayString = "Sunday";
     break;
     default:
        dayString = "Invalid day";
     break;
 }
 System.out.println(dayString);
 }
}
