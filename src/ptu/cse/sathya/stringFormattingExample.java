package ptu.cse.sathya;

public class stringFormattingExample {
    public static void main(String[] args) {
        // Basic formatting
        String name = "Sathiya";
        double pi = 3.14159;
        int items = 15;

        System.out.println("Hello, " + name + "!");
        System.out.println(String.format("Pi (approx): %.2f", pi));  // Limit to 2 decimal places
        System.out.println(String.format("You have %d items in your cart.", items));

        // Argument index and width
        double totalPrice = pi * items;
        System.out.println(String.format("%2$s purchased %1$d items for Rs.%3$.2f", items, name, totalPrice));

        // Alignment and padding
        System.out.println("\n--- Invoice ---");
        System.out.format("%-15s %-10s %10s\n", "Item", "Quantity", "Price");  // Left-align headers
        System.out.format("%-15s %-10d %10.2f\n", "Widget", 5, 12.99); 
        System.out.format("%-15s %-10d %10.2f\n", "Gadget", 2, 25.50);
    }
}
