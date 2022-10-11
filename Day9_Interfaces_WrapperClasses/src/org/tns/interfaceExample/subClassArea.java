package org.tns.interfaceExample;

import java.util.Scanner;

public class subClassArea implements Area {

	@Override
	public void Circle() {
		Scanner s=new Scanner(System.in);
		double r=s.nextDouble();
		System.out.println(3.142*r*r);
		s.close();
	}

	@Override
	public void Square() {
		Scanner s=new Scanner(System.in);
		double side=s.nextDouble();
		System.out.println(side*side);
		s.close();
	}
	
}
