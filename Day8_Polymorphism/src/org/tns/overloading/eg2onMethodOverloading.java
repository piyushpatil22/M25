package org.tns.overloading;

class Area{
	
	public void findArea() {
		System.out.println("this is a default method findArea");
	}
	public void findArea(double r) {
		System.out.println("Area of circle");
		double area=r*r*3.142;
		System.out.println(area);
	}
	public void findArea(double x, double y) {
		System.out.println("Area of rectangle");
		double area=x*y;
		System.out.println(area);
	}
}



public class eg2onMethodOverloading {

	public static void main(String[] args) {
		Area A1 =new Area();
		A1.findArea();
		A1.findArea(3);
		A1.findArea(2, 4);

	}

}
