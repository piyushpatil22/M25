package com.cg.intro.userinput;

//importing Scanner function to take user input
import java.util.Scanner;

//Printing out the string taken as a input from the user.
//String a collection of characters, basically a normal english sentence
public class Input_String {

	public static void main(String[] args) {
		
		//asking user to input a string
				System.out.println("Enter a string");
				
				//creating a obj of scanner class
				Scanner input=new Scanner(System.in);
				
				//Using nextLine will print out the complete sentence given as a input by the user
				String a=input.nextLine();
				
				// Printing out the entire string
				System.out.print(a);
				input.close();
		
		

	}

}
