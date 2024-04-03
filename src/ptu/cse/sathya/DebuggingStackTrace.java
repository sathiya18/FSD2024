package ptu.cse.sathya;

	public class DebuggingStackTrace {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3};
	        int number = getNumberAtIndex(numbers, 5); // This will cause an exception
	        System.out.println("Number: " + number);
	    }

	    public static int getNumberAtIndex(int[] array, int index) {
	        return array[index]; // Accessing invalid index
	    }
	}
