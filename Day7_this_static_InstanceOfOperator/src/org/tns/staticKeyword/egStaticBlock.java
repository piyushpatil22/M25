package org.tns.staticKeyword;

public class egStaticBlock {

	static int x=101;
	
	static int y;
	
	static {
		
		y=x+10;
	}
	public static void main(String[] args) {
		System.out.println("X is: "+x);
		System.out.println("Y is: "+y);
	}

}
