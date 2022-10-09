package org.tns.finalKeyword;

class finalVariable{
	// this final variable cannot be changed anywhere in the package at all!
	final int rufus=50;  
	/*
	void print() {
		System.out.println(rufus);
		rufus=10;
	}
*/	
}

class subClassVariable extends finalVariable{
	private int var1=102;
	/*
		void print() {
			System.out.println(rufus);
			rufus=10;
		}
	*/
	
	//getter
	public int getVar1() {
		return var1;
	}
	//setter
	public void print(int newVar1) {
		var1=newVar1;
	}
}


public class egFinalVariable {

	public static void main(String[] args) {
		subClassVariable S1=new subClassVariable();
		System.out.println(S1.rufus);
		S1.print(777);
		System.out.println(S1.getVar1());

	}

}
