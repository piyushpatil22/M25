package defaultConstructor;


class Rating{
	
	//defining a var
	public int stars;
	
	//method
	void display() {
		
		System.out.println("The Rating of the movie is "+ stars);
	}
	
	Rating(){
		stars= 4;
	}
	
}

public class defaultConstructor {

	//this is main method
	public static void main(String[] args) {
		System.out.println("This is a default C");
		//Creating obj of class Rating
		Rating rate=new Rating();
		
		
		//Calling the method of Rating class
		rate.display();
	}

}
