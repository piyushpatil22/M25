package com.cg.intro.userinput;

//importing Scanner function to take user input
import java.util.Scanner;


//taking input from user to accept a double datatype
//Double a decimal value datatype that has precision of upto 15 decimal digits
public class Input_Double {
	public static void main(String []args) {
		
		//asking user to input/enter a double
		System.out.println("Enter a Double value");
		
		//creating a obj of scanner class
		Scanner input=new Scanner(System.in);
		
		//storing value of the double in variable 'x'
		double x=input.nextDouble();
		
		//printing out the entered double datatype
		System.out.println("Integer is: ");
		System.out.print(x);
		input.close();
		
	}
}
