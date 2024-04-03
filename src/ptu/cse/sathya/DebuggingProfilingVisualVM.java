package ptu.cse.sathya;


public class DebuggingProfilingVisualVM {

	    public static void main(String[] args) {
	        int n = 30; // Example input
	        long fibValue = fibonacci(n);
	        System.out.println("Fibonacci number at position " + n + " is: " + fibValue);
	    }

	    public static long fibonacci(int n) {
	        if (n <= 1) return n;
	        else return fibonacci(n-1) + fibonacci(n-2);
	    }
	}

