package org.tns.finalKeyword;


class varClass{
	protected String name="Rufus from varClass";
}

//below final class cannot be inherited by any other class
final class classFinal{
	protected String name="Rufus from classFinal";
	
}
//since cannot inherit final class; 
//inheriting from non-final class
class childClass extends varClass{
	void print() {
		System.out.println(name);
	}
}
public class egFinalKeyword {

	public static void main(String[] args) {
		childClass C1=new childClass();
		System.out.println(C1.name);

	}

}
