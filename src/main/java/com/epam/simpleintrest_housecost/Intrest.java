package com.epam.simpleintrest_housecost;

import java.io.*;
public class Intrest {
	
	

	public void calculateIntrest(PrintStream myout,double principle, double rate, double time) {

		
		double simpleIntrest = (principle*rate*time)/100.0;
		double compoundIntrest = principle*(Math.pow((1+rate/100), time));
		myout.print("Simple Intrest : ");
		myout.print(simpleIntrest);
		myout.print("\n");
		myout.print("Compound Intrest : ");
		myout.print(compoundIntrest);
		myout.print("\n");
		
		
		
	}

}
