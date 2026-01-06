package org.example.MultiThreading;

public class Consumer implements Runnable{
    private Storage2 storage2;

    Consumer(Storage2 storage) {
        this.storage2 = storage;
    }

    public void run() {
        while (true) {
            int value = storage2.consume();
            System.out.println("Consumed: " + value);
        }
    }
}
