package com.cg.intro.userinput;

//importing Scanner function to take user input
import java.util.Scanner;


//taking input from user to accept a integer datatype
public class Input_Integer {
	public static void main(String []args) {
		
		//asking user to input/enter a integer
		System.out.println("Enter a integer");
		
		//creating a obj of scanner class
		Scanner input=new Scanner(System.in);
		
		//storing value of the integer in variable 'x'
		int x=input.nextInt();
		
		//printing out the entered integer
		System.out.println("Integer is: ");
		System.out.print(x);
		input.close();
		
	}
}
