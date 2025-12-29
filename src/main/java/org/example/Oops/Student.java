package org.example.Oops;

public class Student implements Richman{

    @Override
    public void donation() {
        System.out.println("Student donates Books and copy ");
    }

    @Override
    public void party() {
        System.out.println("Birthparty given to classmate ");

    }
}
