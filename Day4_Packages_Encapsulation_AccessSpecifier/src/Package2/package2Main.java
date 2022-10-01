package Package2;

//importing the package in order to access its methods and members
import Package1.package1Main;

public class package2Main {

	public static void main(String[] args) {
		/*creating a obj of the class from which the 
		 	display method is to be used.	 
		*/
		package1Main p = new package1Main();
		
		//calling the obj to use the display()method
		p.display();
	}

}