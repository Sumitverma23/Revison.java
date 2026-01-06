package org.example.MultiThreading;

public class Counter extends Thread {
    private Storage storage;

    Counter(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        int count = 1;
        while (true) {
            storage.setValue(count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}
