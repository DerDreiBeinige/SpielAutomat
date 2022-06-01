package Syntax;

import java.util.Scanner;

public class GeldZähler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    double gewinn =  0;
		double verlust = 0;
		double konto =1000;
		
		System.out.println("gewinn:");
		Scanner eingabe =new Scanner(System.in);
		
		test test = new test();
		
		
		gewinn = eingabe.nextInt();
		
		
		System.out.println("Verlust:");
		verlust = eingabe.nextInt();
		
		konto += gewinn;
		konto -= verlust;
		
		if (konto < 1) 
		{
			System.out.println("Sie haben kein Geld mehr!");
			System.out.println("Ihr Konto beträgt:" + konto);
		}	
		else
		{
			System.out.println("Ihr Konto beträgt nun: " + konto + " Euro" );
		
		 
		
		}
		
		eingabe.close();
		

	}

}
