package Abstraction;

class Gold{
	//this is a default defined var
	int goldPrice=60000;
}

public class exampleDefault {
	public static void main(String[] args) {
		//obj of the class
		Gold gold =new Gold();
		
		/*
		 Similar to public Default access specifier can also 
		 be accessed without any restrictions 
		*/
		System.out.println(gold.goldPrice);
	}
}
