package org.example.MultiThreading;

public class Printer extends Thread{
    private Storage storage;

    Printer(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        while (true) {
            int value = storage.getValue();
            System.out.println("Printed: " + value);
        }
    }
}
