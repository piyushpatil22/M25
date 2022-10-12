package org.tns.overloading;


class AdditionOperator{
	
	public void add(int a, int b) {
		System.out.println("This is addition of 2 integer vars "+(a+b));
	}
	public void add(float a, float b) {
		System.out.println("This is addition of 2 float vars "+(a+b));
	}
	
}



public class egOnMethodOverloading {
	public static void main(String[] args) {
		AdditionOperator A1=new AdditionOperator();
		A1.add(32, 45);
		A1.add(45.3f, 432.4f);
	}
}
