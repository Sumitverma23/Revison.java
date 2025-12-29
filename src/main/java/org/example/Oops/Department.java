package org.example.Oops;

public class Department implements Cloneable{
    private String deptName;
    private Employee[] employees;

    public Department(String deptName, Employee[] employees) {
        this.deptName = deptName;
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department deptClone = (Department) super.clone();


        Employee[] empCloneArray = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            empCloneArray[i] = (Employee) employees[i].clone();
        }

        deptClone.employees = empCloneArray;

        return deptClone;
    }
}
