package ptu.cse.sathya;

class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety when incrementing count
    public synchronized void increment() {
        count++; // increments the count by 1
    }

    public int getCount() {
        return count;
    }
}

