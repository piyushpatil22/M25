package org.tns.abstractKeyword;

//parent abstract class
abstract class C{
	/*non abstract method can be defined here in abstract class 
	 itself and directly be accessed/called using child class's
	 object	  
	*/
	void print() {
		System.out.println("Non abstract method");
	}
	//this is a abstract method and has to be defined in child class
	abstract void method1();
	abstract void method2();
	
}
class D extends C{
	//defining abstract class's method here in child class
	void method1() {
		System.out.println("Abstract method defined in child class");
	}
	void method2() {
		System.out.println("This is also a abstract method ");
	}
}
public class abstractKeywordExample {
	public static void main(String[] args) {
		C objC=new D();
		//calling abstract class's non-abstract method object
		objC.print();
		//calling abstract class's object
		objC.method1();
		objC.method2();
		}
}
