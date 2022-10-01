package com.cg.defaultConstructor;


class Rating{
	
	//defining a var
	public int stars;
	
	//Constructor to initialize the variable stars
	Rating(){
		stars= 4;
		System.out.println("The Rating of the movie is "+ stars);
	}
	
}

public class defaultConstructor {

	//this is main method
	public static void main(String[] args) {
		System.out.println("This is a default Constructor");
		//Creating obj of class Rating
		Rating rate=new Rating();
		
	}

}
