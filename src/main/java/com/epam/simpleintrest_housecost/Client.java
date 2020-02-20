package com.epam.simpleintrest_housecost;

import java.io.*;
import java.util.*;


public class Client 
{
    public static void main( String[] args )
    {
        char choice=0;
        char choice1=0; //choices for the types of homes
        double principle,time,rate;
        double area;
        Scanner sc = new Scanner(System.in);
        PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
        do
		{
     	
        	myout.print("\n\nMain Menu : \n1.Calculate Simple Intrest and Compund Intrest \n2.Calculate House Construction Cost\n3.Exit\n");
        	choice=sc.next().charAt(0);
			switch(choice)
			{
			case '1':
				myout.print("Enter the Principal: \n");
				principle = sc.nextDouble();
				myout.print("Enter the rate of intrest: \n");
				rate = sc.nextDouble();
				myout.print("Enter the Time Period:  \n");
				time = sc.nextDouble();
				Intrest in = new Intrest();
				in.calculateIntrest( myout,principle,  rate,  time);
				break;
				
			case '2':
				myout.print("\nChoose from 1 to 4 which type of materials you want : \n 1.Standard Materials \n 2.Above Standard Materials \n 3.High Standard Materials \n 4.High Standard Materials with fully automated home \n");
				choice1=sc.next().charAt(0);
				myout.print("Enter the total area of the house \n");
				area = sc.nextDouble();
				HouseCost hc = new HouseCost();
				hc.houseCost(myout,choice1,area);
				break;
			 case '3':
				 System.exit(0);
				 break;
			 default : 
				 System.out.print("Wrong Choice.....\n");
				
			}
			
			
		}
		// loop works till the number 5 not selected.
	  while(choice!=3);
		sc.close();
		myout.close();
    }
}
