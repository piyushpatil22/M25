package org.tns.thisKeyword;

class Rule{
	Rule() {
		this(10);
		System.out.println("Default");
	}
	Rule(int a){
		System.out.println("Parameterized "+a);
	}
}


public class egInvokeConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Rule R1=new Rule();
	}
}
