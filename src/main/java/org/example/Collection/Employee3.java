package org.example.Collection;

import java.util.Objects;

public class Employee3 {
    int id;
    String name;
    double salary;

    Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Employee3 other = (Employee3) obj;

        return this.id == other.id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
