package org.example.MultiThreading;

public class Philosopher implements Runnable {
    private Fork leftFork;
    private Fork rightFork;
    private int id;

    Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking");
        Thread.sleep(500);
    }
    private void eat() throws InterruptedException {
        System.out.println("Philosopher " + id + " is eating");
        Thread.sleep(500);
    }
    public void run() {
        try {
            while (true) {
                think();

                synchronized (leftFork) {
                    System.out.println("Philosopher " + id + " picked left fork");

                    synchronized (rightFork) {
                        System.out.println("Philosopher " + id + " picked right fork");
                        eat();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
