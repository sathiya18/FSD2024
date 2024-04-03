package ptu.cse.sathya;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> animals = new LinkedList<>();

        // Adding elements to the LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Elephant");

        System.out.println("Initial LinkedList: " + animals);

        // Adding an element to the beginning
        animals.addFirst("Lion");

        // Adding an element to the end
        animals.addLast("Tiger");

        // Adding an element at a specific position
        animals.add(2, "Monkey");

        System.out.println("LinkedList after additions: " + animals);

        // Removing specific elements
        animals.remove("Horse"); // Removes "Horse"
        animals.removeFirst(); // Removes the first element (Lion)
        animals.removeLast(); // Removes the last element (Tiger)

        System.out.println("LinkedList after removals: " + animals);

        // Iterating over LinkedList
        System.out.println("Iterating over LinkedList:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
