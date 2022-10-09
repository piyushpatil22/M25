package org.tns.inheritence;

//Main parent class
class carType{
		protected String car_type;
		public void printCarType(){
			System.out.println("The car type is "+car_type);
		}
}
//Child Class 1
class carModel extends carType{
		protected String car_model;
		public void printCarModel() {
			System.out.println(car_type+" Type car's model is "+car_model);
		}
		
}
//Child Class 2
class carColor extends carModel{
		protected String car_color;
		public void printCarColor() {
			System.out.println("The car's color is "+ car_color);
			
		}
}
public class multiLevel {

	public static void main(String[] args) {
		System.out.println("The car's details like type, model and color are mentioned below");
		carColor carObj=new carColor();
		carObj.car_type="Diesel";
		carObj.car_model="Automatic";
		carObj.car_color="Magenta";
		carObj.printCarType();
		carObj.printCarModel();
		carObj.printCarColor();
	}

}
