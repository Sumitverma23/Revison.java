package org.example.MultiThreading;

public class Storage2 {
    private int value;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        this.value = value;
        available = true;
        notify();
    }

    public synchronized int consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        available = false;
        notify();
        return value;
    }
}
