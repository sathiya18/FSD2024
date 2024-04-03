package ptu.cse.sathya;

/*public class ThreadDemo1 extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
    	ThreadDemo1 thread = new ThreadDemo1();
        thread.start(); // Start the thread
    }
}*/

public class ThreadDemo1 implements Runnable {
    public void run() {
        System.out.println("Hello from a thread with Runnable!");
    }

    public static void main(String[] args) {
    	ThreadDemo1 myRunnable = new ThreadDemo1();
        Thread thread = new Thread(myRunnable);
        thread.start(); // Start the thread
    }
}
