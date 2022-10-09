package org.tns.superKeyword;

class Sam{
	int var1=10;
}
class Larry extends Sam{
	int var1=101;
	void print() {
		System.out.println("Variable's value from child class "+ var1);
	}
	void superPrint() {
		System.out.println("Same named Variable's value from parent class "+super.var1);
	}
}
public class egSuperVariable {

	public static void main(String[] args) {
		Larry L1=new Larry();
		L1.print();
		L1.superPrint();

	}

}
