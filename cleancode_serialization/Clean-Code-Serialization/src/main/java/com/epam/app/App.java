package com.epam.app;

import java.util.Scanner;

public class App extends Intrest_Calculator
{
	Scanner scan=new Scanner(System.in);
	void App()
	{
		System.out.println("Enter type of interest\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int type=scan.nextInt();
		if(type==1)
		{
			Simple_Interest();
		}
		else if(type==2)
		{
			Compound_Interest();
		}
		else {
			System.out.println("Choose a valid option.");
		}
	}
	void Simple_Interest()
	{
		System.out.println("Enter principal amount:");
		float principal_amount=scan.nextFloat();
		System.out.println("Enter number of years:");
		int years=scan.nextInt();
		System.out.println("Enter rate of Interest:");
		float rate_of_interest=scan.nextFloat();
		System.out.println("Simple interest is "+simple_interest(principal_amount,years,rate_of_interest));
	}
	void Compound_Interest()
	{
		System.out.println("Enter principal amount:");
		float principal_amount=scan.nextFloat();
		System.out.println("Enter number of times to be calculated:");
		int times_to_calculate=scan.nextInt();
		System.out.println("Enter number of years:");
		int years=scan.nextInt();
		System.out.println("Enter rate of interest:");
		float rate_of_interest=scan.nextFloat();
		System.out.println("Compound interest is "+compound_interest(principal_amount,times_to_calculate,years,rate_of_interest));
	}

    public static void main( String[] args )
    {
    	App object_1=new App();
		object_1.App();
    }
}
