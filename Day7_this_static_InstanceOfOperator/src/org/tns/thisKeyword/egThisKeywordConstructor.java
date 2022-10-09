package org.tns.thisKeyword;

class Euler{
	public int x;
	public String str;
	
	public Euler(String str, int x) {
		this.x=x;
		this.str=str;
	}
	public void print() {
		System.out.println(str);
		System.out.println(x);
	}
}

public class egThisKeywordConstructor {

	public static void main(String[] args) {
		Euler E1=new Euler("Lama", 43);
		E1.print();

	}

}
