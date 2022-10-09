package org.tns.inheritence;

//this is Parent Class
class iceCream{
	protected String icecream_name;
	//this method can be accessed by object of any child class
	public void printParentClassMethod() {
		System.out.println("This is the IceCream class(Parent)");		
	}
}
//this is Child Class 1
class Vanilla extends iceCream{
	protected String vanilla;
	//this method is defined by the exact same name across all child classes
	public void printV() {
		System.out.println(vanilla);
	}
}
//Child Class 2
class Pista extends iceCream{
	protected String pista;
	public void printV() {
		System.out.println(pista);
	}
}
public class hierarchicalInheritence {

	public static void main(String[] args) {
		
		//Object of child class Vanilla
		Vanilla V1=new Vanilla();
		V1.vanilla="vanilla";
		V1.printV();
		
		//Accessing/Calling the parent class method
		V1.printParentClassMethod();
			
		Pista P1=new Pista();
		P1.pista="pista";
		P1.printV();
		
		P1.printParentClassMethod();
	}

}
