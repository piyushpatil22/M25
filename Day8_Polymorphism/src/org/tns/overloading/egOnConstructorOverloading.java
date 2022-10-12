package org.tns.overloading;

class Car{
	
	protected String fuelType;
	
	public Car(String fuelType) {
		this.fuelType=fuelType;
	}
	Car(){
		System.out.println("this is defualt constructor");
	}
	public void display() {
		System.out.println("this is the fuel type of the car "+fuelType);
	}
}


public class egOnConstructorOverloading {

	public static void main(String[] args) {
		Car C1=new Car("Diesel");
		@SuppressWarnings("unused")
		Car C2 =new Car();
		C1.display();
	}

}
