package org.example.Collection;

import java.util.Comparator;

public class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class SalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.salary, e1.salary);
    }
}




