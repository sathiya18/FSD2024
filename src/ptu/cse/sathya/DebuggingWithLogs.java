package ptu.cse.sathya;

import java.util.Scanner;
import java.util.logging.Logger;

public class DebuggingWithLogs {
    private static final Logger logger = Logger.getLogger(DebuggingWithLogs.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /):");
        String operation = scanner.next();

        try {
            double result = performOperation(firstNumber, secondNumber, operation);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            logger.severe("An error occurred during the calculation: " + e.getMessage());
        }
    }

    private static double performOperation(double firstNumber, double secondNumber, String operation) {
        switch (operation) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
