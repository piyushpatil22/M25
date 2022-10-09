package org.tns.staticKeyword;

class Newton{
	static int a=1212;
}
public class egStaticVariable {

	public static void main(String[] args) {
		/*
			Can access the variable declared outside the main class 
			without creating a object of the particular class
			by just using the keyword static
		*/
		System.out.println(Newton.a);

	}

}
