package ptu.cse.sathya;

public class DebuggingExample1 {
    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int calculateFactorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i; // Suspected bug here
        }
        return result;
    }
}

