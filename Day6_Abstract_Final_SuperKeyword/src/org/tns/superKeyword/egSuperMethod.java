package org.tns.superKeyword;

class Roxy{
	void print() {
		System.out.println("Parent class's method called using super keyword");
	}
}
class Raul extends Roxy{
	void print() {
		System.out.println("Child class's method");
	}
	void superPrint() {
		super.print();
	}
}

public class egSuperMethod {

	public static void main(String[] args) {
		Raul R1=new Raul();
		R1.print();
		R1.superPrint();
	}

}
