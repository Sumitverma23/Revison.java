package org.example.MultiThreading;

public class Storage {
    private int value;
    private boolean available = false;

    public synchronized void setValue(int value) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        this.value = value;
        available = true;
        notify();
    }

    public synchronized int getValue() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        available = false;
        notify();
        return value;
    }
}
