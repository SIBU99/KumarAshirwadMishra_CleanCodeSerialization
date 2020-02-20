package com.epam.simpleintrest_housecost;
import java.io.*;
public class HouseCost {
	
	public void houseCost(PrintStream myout,char choice,double area) {
		
		double price=0;
		switch(choice)
		{
		case '1':
			price = 1200*area;
			break;
		case '2':
			price = 1500*area;
			break;	
		case '3':
			price = 1800*area;
			break;
		case '4':
			price = 2500*area;
			break;
		default:
			myout.print("Wrong Choice..!! \n");

		}
		myout.print("House Construction Cost based on your input is : ₹ ");
		myout.print(price);
		myout.print("\n");
		
	}

}
