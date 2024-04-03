package ptu.cse.sathya;

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        // Increment the counter 1000 times
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
