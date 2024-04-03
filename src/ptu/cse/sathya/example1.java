package ptu.cse.sathya;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println(new java.io.File(".").getAbsolutePath());

        scanner.close(); 
    }
}