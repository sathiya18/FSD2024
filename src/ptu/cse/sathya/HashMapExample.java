package ptu.cse.sathya;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> userAges = new HashMap<>();

        // Adding key-value pairs to the HashMap
        userAges.put("Alice", 30);
        userAges.put("Bob", 25);
        userAges.put("Charlie", 35);

        System.out.println("User Ages: " + userAges);

        // Accessing a value
        int ageOfAlice = userAges.get("Alice");
        System.out.println("Age of Alice: " + ageOfAlice);

        // Removing a key-value pair
        userAges.remove("Charlie");
        System.out.println("After removing Charlie: " + userAges);

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : userAges.entrySet()) {
            String user = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(user + ": " + age);
        }

        // Checking if a key exists
        boolean hasBob = userAges.containsKey("Bob");
        System.out.println("Contains key 'Bob': " + hasBob);

        // Checking if a value exists
        boolean hasAge30 = userAges.containsValue(30);
        System.out.println("Contains value 30: " + hasAge30);

        // Replacing a value associated with a key
        userAges.replace("Bob", 26);
        System.out.println("After replacing Bob's age: " + userAges.get("Bob"));
    }
}

