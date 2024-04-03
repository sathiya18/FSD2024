package ptu.cse.sathya;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println("Initial Queue: " + queue);

        // Removing the head of the queue
        String headElement = queue.poll();
        System.out.println("Removed Element: " + headElement);
        System.out.println("Queue after poll: " + queue);

        // Peeking at the head of the queue without removing it
        headElement = queue.peek();
        System.out.println("Head Element: " + headElement);
    }
}
