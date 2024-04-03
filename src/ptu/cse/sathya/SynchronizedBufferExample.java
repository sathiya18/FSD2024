package ptu.cse.sathya;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SynchronizedBufferExample {

    private final StringBuilder buffer = new StringBuilder();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final String logFilePath = "D:\\ACADEMICS-2024\\FSD\\IOexample1\\src\\ptu\\cse\\sathya\\input.txt";

    public void log(String message) {
        lock.writeLock().lock();  // Acquire write lock
        try {
            buffer.append(message).append("\n");
        } finally {
            lock.writeLock().unlock(); // Release write lock
        }
    }

    public void flushToFile() {
        lock.readLock().lock(); 
        try (FileWriter writer = new FileWriter(logFilePath, true)) { 
            writer.write(buffer.toString());
            buffer.setLength(0); 
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        } finally {
            lock.readLock().unlock(); 
            System.out.println(timestamp() + " Log flushed to file."); // Console output
        }
    }

    // Helper for timestamp
    private String timestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public static void main(String[] args) {
        SynchronizedBufferExample sharedLog = new SynchronizedBufferExample();

        // ... Start multiple threads calling sharedLog.log(...)

        // ... Separate thread periodically calling sharedLog.flushToFile() 
        
     // Start 3 logging threads
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    sharedLog.log("Thread " + Thread.currentThread().getId() + ": Message " + j);
                    try {
                        Thread.sleep((long) (Math.random() * 500)); // Random delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        // Separate thread to flush the log file every 5 seconds
        new Thread(() -> {
            while (true) { 
                sharedLog.flushToFile();
                try {
                    Thread.sleep(5000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
