package ptu.cse.sathya;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Initial Stack: " + stack);

        // Popping elements from the stack
        String topElement = stack.pop();
        System.out.println("Popped Element: " + topElement);
        System.out.println("Stack after pop: " + stack);

        // Peeking at the top element of the stack without removing it
        topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
    }
}

