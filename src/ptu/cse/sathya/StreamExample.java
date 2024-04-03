package ptu.cse.sathya;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Sarah");

        List<String> filteredNames = names.stream() // Convert list to stream
                .filter(name -> name.startsWith("J")) // Filter names that start with "J"
                .map(String::toUpperCase) // Convert each name to uppercase
                .collect(Collectors.toList()); // Collect results into a new list

        System.out.println(filteredNames); // Output: [JOHN, JANE]
    }
}