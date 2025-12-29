package org.example.Oops;

public class OopsPractice {
    public static void main(String[] args)throws Exception {


        // Q.1 create shape class that has area () abstract method .
        // its child classes circle ,triangle and rectangle will implement area() method .
        // classes have all attributes private and their setter and getter method .
        // write a method that will calculate total area of a shape array.?

        /*
        Circle c = new Circle();
        c.setRadius(5);


        Rectangle r = new Rectangle();
        r.setLength(4);
        r.setWidth(6);

        Triangle t = new Triangle();
        t.setBase(3);
        t.setHeight(8);

        Shape[] shapes = {c, r, t};


        double totalArea = ShapeUtil.calculateTotalArea(shapes);
        System.out.println("Total Area=" + totalArea);


         */



      // Q.2 create three classes department, employees, and address.
        // department contains multiple employees ,an employees contains two address 1 permanent 2 local address .
        // write a program to deep clone department object? same way giev answer as previous one?

/*
        Address p1 = new Address("Indore", "MP");
        Address l1 = new Address("Pune", "MH");


        Employee e1 = new Employee(1, "Sumit", p1, l1);


        Employee[] empArr = { e1 };

        Department d1 = new Department("IT", empArr);

        Department d2 = (Department) d1.clone();

        System.out.println(d1.getEmployees()[0].getPermanentAddress().getCity());
        System.out.println(d2.getEmployees()[0].getPermanentAddress().getCity());

 */


        //Q.3 write a class person with firstname and lastname attributes.
        // override the tostring () method to return the full name of the person .
        // define constructor to take appropriate parameters.this class does not have a default constructor .
        // create the instance of a person and print it at console?

        /*
        Person p = new Person("Sumit", "Verma");
        System.out.println(p);

         */

     //Q.4 create an interface richman that has two absract method donation()and  party()
        // create its two implementation classes businessman and student
        // both will implement two abstract method .
        // write main() method to see data abstraction and dynamic polymorphism behaviour of the class .
/*

        Richman r;
        r=new BusinessMan();
        r.donation();
        r.party();


        r=new Student();
        r.donation();
        r.party();

 */

        // Q.5write a code to create an immutable class ?
        /*
          Ram r=new Ram("sumit","verma");
        System.out.println(r.getFirstName());
        System.out.println(r.getLastName());

         */

        // Q.6 write a code to achieve static polymorphism ?
        /*
        Calculate c = new Calculate();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(10.5, 20.5));


         */


        //Q.7 write a parent and a child class. parent class will have a
        // static method that is overridden by child class.write a code to test it.

        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child(); // Parent reference, Child object

        p.display();   // Parent ka method
        c.display();   // Child ka method
        pc.display();  // Parent ka method → method hiding

    }
}

/*
what is encapsulation ?
Encapsulation is the concept of wrapping data (variables) and code (methods) together in a single unit called class.
The variables are kept private and can be accessed only through public methods.
This provides data hiding, better control, and improves security of the data.
Example: Bank account class where balance is private and accessed via deposit/withdraw methods.

where have you used encapsulation in your application ?
 In my project, I created an Employee class with private attributes like name, id, and salary.
These fields were accessed and updated only through getter and setter methods.
For example, setSalary() had validation to ensure the salary was not negative.
This is how I used encapsulation to protect sensitive data and maintain control over object state.


why we need inheritance ?
Inheritance allows one class to acquire properties and behavior of another class.
It promotes code reuse, establishes a parent-child relationship, and supports polymorphism.
It makes the code easier to maintain, extend, and model real-world relationships.



can one class inherit multiple class and also can can one interface inherit multiple interface ?
In Java, a class cannot inherit multiple classes because it may lead to ambiguity (diamond problem).
Java supports single inheritance for classes.
However, an interface can inherit multiple interfaces since they contain only abstract methods without implementation, avoiding conflicts.


what is the difference between data abstraction and data hiding ?how we can achieve data abstraction?
Data abstraction shows only the essential features to the user and hides the implementation details.
Data hiding protects the internal state of an object from direct access and provides controlled access via methods.
In Java, data abstraction is achieved using abstract classes and interfaces, while data hiding is achieved using private variables and getter/setter methods.


what is the difference between data abstraction and data hiding ?how we can achieve data abstraction?
Polymorphism is the ability of an object or method to take many forms.
Static polymorphism (compile-time) is achieved using method overloading where method call is resolved at compile time.
Dynamic polymorphism (runtime) is achieved using method overriding where method call is resolved at runtime based on object type.


what is the difference between the interface and the abstarct class?
An abstract class can have both abstract and concrete methods and is used when classes share common behavior.
An interface provides complete abstraction and defines a contract that implementing classes must follow.
A class can extend only one abstract class but can implement multiple interfaces.
Abstract classes support code reuse, while interfaces support multiple inheritance.




 */
