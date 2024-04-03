package ptu.cse.sathya;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("TreeSet: " + numbers);

        // Iterating over TreeSet elements
        System.out.println("Iterating over elements:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
