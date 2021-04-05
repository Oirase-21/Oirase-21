/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundrobinproject;
import java.util.*;
/**
 *
 * @author brown
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void WaitingTime(int process[],int wttime[],int n ,int brusttime[],int quantum,int completiontime[],int arrivaltime[]){
   int remtime[] = new int[n];
    
   for(int i=0;i<wttime.length;i++){
       remtime[i]= brusttime[i];
   }
   int t=0;
   int arrival=0;
   while(true){

       boolean done =true;
       for(int i=0; i<n;i++)
       {
           if(remtime[i]>0){
               
               if(remtime[i]>quantum && arrivaltime[i]<=arrival){
                   t +=quantum;
                   remtime[i]-=quantum;
                   arrival++;
               }
               else{
               if(arrivaltime[i]<=arrival){
                   arrival++;
                   t+=remtime[i];
                   remtime[i]=0;
                   completiontime[i]=t; }
               }
            }
         }
        
       if(done==true)    
       { 
           break;
           }
   }    
   }
public static void TurnAroundTime(int process[] ,int wttime[],int n,int brusttime[],int tattime[],int completiontime[],int arrivaltime[]){
   for(int i=0;i<n;i++){
       tattime[i]= completiontime[i]-arrivaltime[i];
       wttime[i] = tattime[i]-brusttime[i];
        
        
   }
    
}

public static void AvgTime(int process[],int n,int brusttime[],int quantum,int arrivaltime[]){
 int wttime[] = new int[n];
 int tattime[] = new int[n];
 int completiontime[] = new int[n];
WaitingTime(process,wttime,n,brusttime,quantum,completiontime,arrivaltime);    
TurnAroundTime(process,wttime,n,brusttime,tattime,completiontime,arrivaltime);
 int totalwt = 0, totaltat = 0; 
  
 System.out.println("Processes " +" Arrival Time\t"+ "  Burst time " +" completion time"+ 
         " Turn Around Time " + " Waiting time");
 for (int i=0; i<n; i++) 
 { 
     totalwt = totalwt + wttime[i]; 
     totaltat = totaltat + tattime[i]; 
     System.out.println(" " + (i+1) + "\t\t"+ arrivaltime[i]+"\t\t"+ + brusttime[i] +"\t " +completiontime[i]+"\t\t"
                       +tattime[i] +"\t\t " + wttime[i]); 
 } 
 
 System.out.println("Average waiting time = " + 
                   (float)totalwt / (float)n); 
 System.out.println("Average turn around time = " + 
                    (float)totaltat / (float)n); 
}

public static void main(String []agrs){

Scanner scan = new Scanner(System.in);

int quantum = 2;
int arrivaltime[] = new int[]{0,1,2,3,4};
int process[] = new int[]{1,2,3,4,5};
int brusttime[] = new int[]{5,4,3,2,1};
int n  = process.length;

AvgTime(process,n,brusttime,quantum,arrivaltime);

scan.close();
    
}

}