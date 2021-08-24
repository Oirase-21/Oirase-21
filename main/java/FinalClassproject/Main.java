/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalClassproject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Desario Brown
 */
public class Main 
{


    /**
     * @param args the command line arguments
     */  
    
    public static void main(String[] args ) 
	    {  
	        Stack<String> RConditions = new Stack<String>();
	        Scanner  RD = new Scanner(System.in);
	        
                System.out.println("Is there road work going on currently? Y or N");
	        String condition= RD.nextLine();
	        
                
	       
	       if(condition.equals("Y")||condition.equals("y"))
	        {
	             System.out.println("There is road work being done");
	              System.out.println("Limit 40");       
	        }
	       else
	       {
	        RDCON(56);
	        Speed();
                weather();
                tim(0,0,0,0,0);
               
            
	       }

           
	       
	// TODO code application logic here
	      
	    }
	    
	   static void RDCON(double spd1)
	    {
	        LinkedList<String> RDlist = new LinkedList<>();
	        Scanner  RDSTATE = new Scanner(System.in);
	        
                
	        System.out.println("Enter the three different conditions of your road");
	        for (int i=0; i<3; i++)
	        {
	         String rds =RDSTATE.nextLine(); 
	         RDlist.add(rds);
	        }
	        System.out.println("Enter the current of the three conditions" + RDlist);
	        String crds=RDSTATE.nextLine();
	        
	         if(crds.equals("newpaved"))
	         {
	             spd1=40;
                     scal(spd1);
	         }
	         else if(crds.equals("paved"))
	         {
	             spd1=20;
                     scal(spd1);
	         }
	         else if(crds.equals("potholes"))
	         {
	             spd1=0;
                     scal(spd1);
	         }
	        
                 
	                 
	                 
	    }
	    
	    static void Speed()
	{
            double ARCSRH=0;
            double ARCSCD=0;
            double ARCSED=0;
	    Scanner  RS = new Scanner(System.in); //road speed scanner
            Scanner  RDA = new Scanner(System.in); //time of day scanner 
	    ArrayList<Integer> RHS = new ArrayList<Integer>();
	    ArrayList<Integer> CDS = new ArrayList<Integer>();
	    ArrayList<Integer> EDS = new ArrayList<Integer>();
	    
	    
                System.out.println("input five different speeds during rush hour?");
                for (int i=0; i<5; i++)
                {
                RHS.add(RS.nextInt());    //puts speeds entered into an array
                int sum =0;
                
                    for (int value : RHS) 
                    {
                    sum += value;
                    }
                     double average1 = sum / RHS.size();     //gets the mean of the speeds 
                     ARCSRH=average1;      //average speed 
                                    
                }
            
            
            
                System.out.println("input five different speeds during a causal day?");
                for (int i=0; i<5; i++)
                {
                CDS.add(RS.nextInt());
                int sum =0;
                
                    for (int value : CDS) 
                    {
                    sum += value;
                    }
    
                     double average2 = sum / CDS.size();
                     ARCSCD=average2;
                      
                }
            
            
              System.out.println("input five different speeds during an empty day?");
                for (int i=0; i<5; i++)
                {
                EDS.add(RS.nextInt());
	     int sum =0;
                
                    for (int value : EDS) 
                    {
                    sum += value;
                    }
                     double average3 = sum / EDS.size();
                     ARCSED=average3;
                      
                }
                calc(ARCSRH,ARCSCD,ARCSED);
            }
            
            static void weather()
            {
               Stack WC1= new Stack();
		Stack WC2= new Stack();
		Stack WC3= new Stack();
		double WC;
		Scanner WE= new Scanner(System.in);
		Scanner W2= new Scanner(System.in);
		
		System.out.println("Enter three speeds for rainy weather conditions ");
		for(int i=0; i<3; i++)
		{
		WC1.push(WE.nextDouble ());
		}
		
		System.out.println("Enter three speeds for sunny weather conditions ");
		for(int i=0; i<3; i++)
		{
		WC2.push(WE.nextDouble ());
		}
			
		System.out.println("Enter three speeds for snowy weather conditions ");
		for(int i=0; i<3; i++)
		{
		WC3.push(WE.nextDouble());
		}
		
		System.out.println("Enter current weather condition ");
		String W=W2.nextLine();
		if(W.equals("Rainy")||W.equals("rainy"))
		{
			System.out.println("These are the speeds for rainy weather"+WC1);
			WC=-10;
			finl(WC);
		}
		else if(W.equals("Sunny")||W.equals("sunny"))
		{
			System.out.println("These are the speeds for sunny weather"+WC2);
			 WC=30;
                         finl(WC);
		}
		else if(W.equals("Snowy")||W.equals("snowy"))
		{
			System.out.println("These are the speeds for snowy weather"+WC3);
			 WC=-19;
                         finl(WC);
		}
			 //make callable in the next class
	}
	
             static void calc(double ARCSRH,double ARCSCD,double ARCSED) 
            {
                //put calculations here and call from other classes.
            
                ARCSRH=ARCSRH;
                ARCSCD=ARCSCD;
                ARCSED=ARCSED;
                
                  System.out.println("This is your average rush hour speed  "+ARCSRH);
                  System.out.println("This is your average casual day speed  "+ARCSCD);
                  System.out.println("This is your average empty day speed  "+ARCSED);
            }
            
           static void finl(double WC)
           {
               WC=WC;
               System.out.println("This is your weather condition speed  "+WC);
           }

           static void scal(double spd1)
           {
               spd1=spd1;
               System.out.println("This is your road condition speed  "+spd1);
           }
            
            
           public static void tim (double ARCSRH, double ARCSCD, double ARCSED, double WC, double spd1)
            {
                Main myspeed=new Main();
            
                myspeed.finl(WC);
                myspeed.calc(ARCSRH, ARCSCD,ARCSED);
                myspeed.scal(spd1);
                
                
                double Finally1=WC+ARCSRH+spd1;
                double Finally2=WC+ARCSCD+spd1;
                double Finally3=WC+ARCSED+spd1;
                
                System.out.println("This is your final speed limit in rush hour "+Finally1);
                System.out.println("This is your final speed limit on a causal day "+Finally2);
                System.out.println("This is your final speed limit on an empty day "+Finally3);
            }
           
    
}
	
	


