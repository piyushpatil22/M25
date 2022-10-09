package org.tns.abstractKeyword;

//abstract class
abstract class A{
	//abstract method has to be defined in a child class
	abstract void print();
	
}
class B extends A{
	//defining the abstract method
	@Override
	void print() {
		int balance=700;
		System.out.println("Balance is "+balance+"Rs");
	}
}

public class balanceCheck {

	public static void main(String[] args) {
		//cannot create object for abstract class
		//has to be created with its abstract method's implemented class
		//using coupling constructor
		A objA=new B();
		//calling object of parent class coupled with child class
		objA.print();
	}

}
