package org.tns.finalKeyword;

//Parent class
class finalMethodClass{
	final void finalMethod() {
		System.out.println("This is finalMethod which cannot be over-ridden");
	}
}
//Child class
class subClass extends finalMethodClass{
	void cannotFinalMethod() {
		//inherited final method but cannot be over-ridden
		finalMethod();
		System.out.println("This is a method inside child class and cannot be named as same as parent class since final methods cannot be over-ridden :)");
	}
}
public class egFinalMethod {

	public static void main(String[] args) {
		subClass C1=new subClass();
		//this method cannot be named as the parent class's final method
		C1.cannotFinalMethod();
		

	}

}
