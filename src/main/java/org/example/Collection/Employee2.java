package org.example.Collection;

import java.util.Comparator;

public class Employee2 {
    int id;
    String firstName;
    String lastName;

    public Employee2(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}


    class SurnameComparator implements Comparator<Employee2>{
        @Override
        public int compare(Employee2 e1,Employee2 e2){
            int lastNameResult =e1.lastName.compareTo(e2.lastName);
            if(lastNameResult==0){
                return e1.firstName.compareTo(e2.firstName);
            }
            return lastNameResult;
        }
    }

