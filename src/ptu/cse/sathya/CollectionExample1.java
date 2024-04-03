package ptu.cse.sathya;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample1 {
    public static void main(String[] args) {
        // Creating a list
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Sorting the list
        Collections.sort(fruits);

        // Iterating over the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

