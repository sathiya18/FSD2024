package ptu.cse.sathya;

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that share the same Counter instance
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final count value
        System.out.println("Final count: " + counter.getCount());
    }
}

