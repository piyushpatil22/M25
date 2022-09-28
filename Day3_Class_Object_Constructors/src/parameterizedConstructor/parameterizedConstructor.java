package parameterizedConstructor;

//Scanner class to take input from user
import java.util.Scanner;
//This is a class, a class consists of variables and methods that can be used as many times in the same code by constructing objects of the class
class Rating{
	
	//defining a var
	public int stars;
	
	
	//Creating a constructor of the class
	//Constructor is used to initialize the vars of the class
	Rating(int r){
		stars= r;
		System.out.println("The rating of movie is "+ stars);
	}
	
}

public class parameterizedConstructor {
	
	//main method
	public static void main(String[] args) {
		System.out.println("This is a parameterized Constructor");
		
		//Input from user
		Scanner r=new Scanner(System.in);
		System.out.println("Enter rating");
		int stars=r.nextInt();
		
		//creating a obj of the class Rating
		Rating rate=new Rating(stars);
		
		r.close();

	}

}
