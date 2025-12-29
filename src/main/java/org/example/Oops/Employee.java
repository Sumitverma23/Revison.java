package org.example.Oops;

public class Employee implements Cloneable{
    private int id;
    private String name;
    private Address permanentAddress;
    private Address localAddress;

    public Employee(int id, String name, Address pAddr, Address lAddr) {
        this.id = id;
        this.name = name;
        this.permanentAddress = pAddr;
        this.localAddress = lAddr;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public Address getLocalAddress() {
        return localAddress;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee empClone = (Employee) super.clone();


        empClone.permanentAddress = (Address) permanentAddress.clone();
        empClone.localAddress = (Address) localAddress.clone();

        return empClone;
    }
}
