package org.tns.thisKeyword;

class Round{
	public void Print(Round round) {
		System.out.println("Print function invoked");
	}
	public void display() {
		Print(this);
	}
}
	

public class egThisKeywordAsMethodCall {

	public static void main(String[] args) {
		Round R1=new Round();
		R1.display();

	}

}
