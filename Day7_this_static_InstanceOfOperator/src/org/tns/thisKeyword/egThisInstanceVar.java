package org.tns.thisKeyword;

class input{
	String str;
	int a;
	void accept(int a, String str) {
		this.a=a;
		this.str=str;
	}
	void print() {
		System.out.println(a);
		System.out.println(str);
	}
}

public class egThisInstanceVar {

	public static void main(String[] args) {
		input I1=new input();
		I1.accept(23, "Faker");
		I1.print();

	}

}
