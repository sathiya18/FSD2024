package ptu.cse.sathya;

public class LambdaDemoWithoutLambda {

    // Define a functional interface
    interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        // Using anonymous classes to define operations
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        MathOperation subtraction = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };

        MathOperation multiplication = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a * b;
            }
        };

        MathOperation division = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                if (b == 0) throw new IllegalArgumentException("Divider cannot be 0");
                return a / b;
            }
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
