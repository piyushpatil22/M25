package com.cg.intro.userinput;

//importing Scanner function to take user input
import java.util.Scanner;

//taking character input from the user and printing it out using chatAt
public class Input_Char {
	public static void main(String[]args) {
		
		//asking user to input/enter a float
		System.out.println("Enter the value");
		
		//creating a obj of scanner class
		Scanner input=new Scanner(System.in);
		
		
		//By using charAR we can retrive characters from any index by passing the value of index as a argument
		char a=input.next().charAt(5);
		
		// Printing out the char at specified index
		System.out.print(a);
		input.close();
	}
}
