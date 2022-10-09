package org.tns.superKeyword;

public class subBase extends Base{
	subBase() {
		System.out.println("Child class's default constructor");
	}
	subBase(int i){
		super(i);
		System.out.println("Child class's parameterized constructor");
	}

}
