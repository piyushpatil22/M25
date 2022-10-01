package Encapsulation;


//creating a class with a private var
class Car{
	//initialized the var by assigning a value
	private int model=10;

	//this is the getter method created to retrive the var
	public int getModel() {
		return model;
	}
	//this is the setter method created to "set" the value of the var
	public void setModel(int model) {
		this.model = model;
	}	
}

public class encapsulationExample {
	public static void main(String Args[]) {
		//obj of the car class
		Car c =new Car();
		
		/*
		 calling the getModel() to print out its value
		 and the private var can be accessed out the class Car even
		 if it is being specified as "Private"
		*/
		System.out.println(c.getModel());
		
	}

}
