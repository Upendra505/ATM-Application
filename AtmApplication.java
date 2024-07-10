package com.application;
import java.util.Scanner;

public abstract class AtmApplication 
{
	public static void main(String[] args)
	{    
		        
	         try
	         {        	 
	        	    int Amount = 50000;
		            Scanner sc = new Scanner(System.in);
		        	String name ="Goroju Upendra Chary";
		        	int pin= 1234;
		              	   
	          	
	 		        System.out.println("enter You are ATM pin:-");
	 		           int num = sc.nextInt(); 
	 		           if(pin==num)
	 		        	  
	 		           {
	 		        	    		        	   
	 		        	  System.out.println(name +" Welcome to Atm Center");
	 		        	  
						while(true) 	 		        		  
	 		        	  {   
	 		        		  System.out.println("Select you are Option:");
	 		        		  
	 		        		  System.out.println("1.WithDraw Money");	 		        		  
	 		        		  System.out.println("2.Diposite Money");
	 		        		  System.out.println("3.Check Bank Balance");
	 		        		  System.out.println("4. Exit");
	 		        		  System.out.println("please select you are choice:-");
	 		        		  
	 		        		  int choice = sc.nextInt(); 
	 		        		  
	 		        		  switch(choice)
	 		        		  {
	 		        		  case 1:
	 		        			  System.out.println("Enter How much Money With Draw:");
	 		        			      int Draw =sc.nextInt();
	 		        			      System.out.println(" Sucessfully Drawed Amount"+Draw);
	 		        			                Amount= Amount-Draw;
	 		        			       
	 		        			  break;
	 		        			  
	 		        		  case 2:
	 		        			  System.out.println("how much money Deposite:-");
	 		        			              int Deposite= sc.nextInt();
	 		        			            Amount = Amount+Deposite;
	 		        			  break;
	 		        			  
	 		        		 case 3:
	 		        			  System.out.println("Check Bank Balance");
	 		        			       System.out.println("You are Acount Balance is:"+Amount);
	 		        			  break; 	
	 		        			  
		 		        		case 4:
		 		        			 System.out.println("Thank You Viste Agin:"+name);
		 		        			  break; 	
		 		        			  
	 		        			  
	 		        		  default:
	 		        			  System.out.println("in correct Option");
	 		        		 }
	 		        		
	 		        		  
	 		        		  
	 		        	   }
	 		             }
	 		           else 
	 		           {
	 		        	   System.out.println("You are pin is worng");
	 		           }
	 		          
	        	 
	               }
               catch(Exception e)
	         {
            	  System.out.println(e);
	         }
	    }

}
