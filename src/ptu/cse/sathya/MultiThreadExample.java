package ptu.cse.sathya;

public class MultiThreadExample {
    public static void main(String[] args) {
        // Task for printing even numbers
        Runnable printEvens = new Runnable() {
            public void run() {
                for (int i = 0; i <= 10; i += 2) {
                    System.out.println("Even: " + i);
                    try {
                        Thread.sleep(500); // Pause for half a second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // Task for printing odd numbers
        Runnable printOdds = new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("Odd: " + i);
                    try {
                        Thread.sleep(500); // Pause for half a second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // Create threads for each task and start them
        Thread thread1 = new Thread(printEvens);
        Thread thread2 = new Thread(printOdds);

        thread1.start();
        thread2.start();
    }
}

