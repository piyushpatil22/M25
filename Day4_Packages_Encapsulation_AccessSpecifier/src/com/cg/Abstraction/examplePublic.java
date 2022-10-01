package com.cg.Abstraction;


//create a class with a public variable 
class tickets{
	
	//initialized the variable by assigning it a value
	public int var=1010;
	}

public class examplePublic {

	public static void main(String[] args) {
		//created a obj of the class to access the var
		tickets t=new tickets();
		/*
		 Because the variable is public there is no need of a creating
		 getter we can directly access the 
		 "public access specifier member"
		*/
		System.out.println(t.var);
	}

}
