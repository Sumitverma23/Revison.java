package org.example.Oops;

public class BusinessMan implements Richman{

    @Override
    public void donation() {
        System.out.println("Donation by the businessman ");
    }

    @Override
    public void party() {
        System.out.println("Businessman gives party");

    }
}
