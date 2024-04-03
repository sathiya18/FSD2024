package ptu.cse.sathya;

public class StringImmutability1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Hello";
		System.out.println(greeting == "Hello"); 
		greeting = greeting + ", world!";  // Doesn't modify "Hello", creates a new string
		System.out.println(greeting);        // Prints "Hello, world!"
		System.out.println(greeting == "Hello"); 

	}

}
