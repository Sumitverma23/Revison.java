package org.example.MultiThreading;

public class Practice {
    public static void main(String[] args) {
//Q.1create 3 classes Storage ,counter,and Printer .storage class should store integer .thread counter class will increase a counter and save into storage class .
// thread printer class will keep on reading the value from the storage class and keep printing it
        /*
        Storage storage = new Storage();

        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);


        counter.start();
        printer.start();

         */


       //Q.2 write a program for thread using runnable interface for producer
        // consumer relationship?
/*
        Storage2 storage2 = new Storage2();

        Thread producerThread = new Thread(new Producer(storage2));
        Thread consumerThread = new Thread(new Consumer(storage2));

        producerThread.start();
        consumerThread.start();
 */

     // Q.3 write a program to solve the dining philosopher problem?
/*
        int N = 5;
        Fork[] forks = new Fork[N];

        for (int i = 0; i < N; i++) {
            forks[i] = new Fork();
        }

        Philosopher[] philosophers = new Philosopher[N];
        Thread[] threads = new Thread[N];

        for (int i = 0; i < N; i++) {

            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % N];

            if (i == N - 1) {
                philosophers[i] = new Philosopher(i, rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(i, leftFork, rightFork);
            }

            threads[i] = new Thread(philosophers[i]);
            threads[i].start();
        }
 */


    }
}



/*




 */
