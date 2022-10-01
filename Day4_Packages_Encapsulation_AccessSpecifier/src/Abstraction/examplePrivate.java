package Abstraction;

class books{
	//creating a private variable
	private int book_Number=007;
	
	/*creating a getter for the private member so it can be accessible
		outside of the class as well
	*/
	public void printIt() {
		System.out.println("The private variable is "+book_Number);
	}
}
public class examplePrivate {

	public static void main(String[] args) {
		//object of the class to access the private member
		books b = new books();
		
		//calling the obj along with the printIt method
		b.printIt();

	}

}
