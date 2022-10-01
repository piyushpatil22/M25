package com.cg.parameterizedConstructor;

import java.util.Scanner;

class ratingMovie{
	public int stars;
	
	
	
	//Defualt Constructor
	ratingMovie(){
		System.out.println("Default Constructor");
		stars=4;
		System.out.println("Rating of movie is "+ stars);
	}
	
	//Parameterized Constructor
	ratingMovie(int r){
		System.out.println("Parameterized Constructor");
		stars=r;
		System.out.println("The rating of movie is "+stars);
	}
}

//This code consists of both default as well as parameterized constructor
public class demoConstructor {
	public static void main(String args[]) {
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter rating");
		int rate=r.nextInt();
		
		ratingMovie r1=new ratingMovie();
		System.out.println("\n\n");
		ratingMovie r2=new ratingMovie(rate);
		
		r.close();
			
	}

}
