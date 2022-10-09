package org.tns.staticKeyword;

class staticMethod{
	protected static int x=10;
	//static method can be called w/o creating a obj of the class
	public static void print() {
		System.out.println("Value of x is "+x);
	}
}

public class egStaticMethod {

	public static void main(String[] args) {
		staticMethod.print();

	}

}
