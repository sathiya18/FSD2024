package ptu.cse.sathya;

public class strIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Mark";  // Interned into the pool
		String name2 = "Mark";  // Uses the existing object from the pool
		String name3 = new String("Mark"); // May or may not be interned automatically
		String name4 = name3.intern(); //  Ensures name4 is in the pool 

		System.out.println(name1 == name2); // true (same object reference)
		System.out.println(name1 == name3); // May or may not be true 
		System.out.println(name1 == name4); // true (after interning) 
		System.out.println(name4);
	}

}
