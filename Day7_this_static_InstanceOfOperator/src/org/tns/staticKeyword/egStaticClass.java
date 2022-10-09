package org.tns.staticKeyword;

class Euler{
	static String str="E=MC2";
	static class Plank{
		public static void print() {
			System.out.println(str);
		}
	}
}

public class egStaticClass {

	public static void main(String[] args) {
		Euler.Plank.print();
		//no need of abject creation

	}

}
