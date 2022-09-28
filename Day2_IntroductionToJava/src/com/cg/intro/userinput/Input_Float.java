package com.cg.intro.userinput;

//importing Scanner function to take user input
import java.util.Scanner;

//taking input from user to accept a float datatype
//Float is similar to Double but has precision of upto 6 decimal digits
public class Input_Float {

	public static void main(String[] args) {
		//asking user to input/enter a float
				System.out.println("Enter a Double value");
				
				//creating a obj of scanner class
				Scanner input=new Scanner(System.in);
				
				//storing value of the float in variable 'x'
				double x=input.nextDouble();
				
				//printing out the entered float datatype
				System.out.println("Integer is: ");
				System.out.print(x);
				input.close();

	}

}
