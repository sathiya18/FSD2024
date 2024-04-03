package ptu.cse.sathya;

public class LambdaDemo {

    // Define a functional interface
    interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        // Using lambda expressions to define operations
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> {
            if (b == 0) throw new IllegalArgumentException("Divider cannot be 0");
            return a / b;
        };

        // Applying the operations
        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));
    }

    // A method to apply a given math operation on two integers and return the result
    private static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
