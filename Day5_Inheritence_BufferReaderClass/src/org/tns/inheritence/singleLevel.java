package org.tns.inheritence;

import java.util.Scanner;

//parent class 
class Car
{
	protected String name;
	public void display() {
		System.out.println("This is Parent Class");
		System.out.println("The name of car is "+name);
	}
	
}
//child class that inherits members and methods from parent class
class brand extends Car
{
	protected String model;
	//child class method
	public void showModel() {
		//this method is defined in parent class
		display();
		System.out.println("The model of "+name+" is "+model);
	}
}

public class singleLevel {

	public static void main(String[] args) {
		//input from user
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a car Brand");
		String inputName=s.nextLine();
		System.out.println("Enter its model");
		String inputModel=s.nextLine();
		s.close();
		
		//object of child class
		brand obj1=new brand();
		obj1.name=inputName;
		obj1.model=inputModel;
		//parent class method can also be called by using object of child class
		obj1.display();
		obj1.showModel();

	}

}
