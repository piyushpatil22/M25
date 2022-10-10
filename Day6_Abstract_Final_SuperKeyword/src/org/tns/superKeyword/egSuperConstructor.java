package org.tns.superKeyword;

class Ruby{
	Ruby() {
		System.out.println("This is Ruby class's default constructor called using super keyword");
	}
}
class Diamonds extends Ruby{
	Diamonds() {
		super();
		System.out.println("This is child class's default constructor");
	}
}
public class egSuperConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		//Object creation
		Diamonds D1=new Diamonds();
	}

}
