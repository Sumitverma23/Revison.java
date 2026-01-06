package org.example.MultiThreading;

public class Producer implements Runnable{
    private Storage2 storage2;

    Producer(Storage2 storage) {
        this.storage2 = storage;
    }

    public void run() {
        int count = 1;
        while (true) {
            storage2.produce(count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}
