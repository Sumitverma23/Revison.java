package org.example.ExceptionalHandling;

public class Questions {


    public static void main(String[] args) {

       //Q.1 what is compilation error will get from the following code
//        try{}
//        catch{RuntimeException e){}
//        catch(ArithmeticException a){}

/*
        try{
            int a=10/0;
        }
        catch (RuntimeException e){
            System.out.println("Runtime Exception ");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }

        java: exception java.lang.ArithmeticException has already been caught

 */

/*
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }

 */

    //  Q.2  how will jvm will react for the unhandler exception?
       /*         int a = 10 / 0;   // Unhandled exception
                System.out.println("End of program");
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at org.example.ExceptionalHandling.Questions.main(Questions.java:44)

        */
     //Q.3   write a progarm to demonstrate Indexoutofboundexception ,
        //   nullpointerexception,Stringindexoutofboundexception?


        /*
                // 1. IndexOutOfBoundsException
                try {
                    int arr[] = {10, 20, 30};
                    System.out.println(arr[5]);
                }
                catch (IndexOutOfBoundsException e) {
                    System.out.println("IndexOutOfBoundsException occurred");
                }

                // 2. NullPointerException
                try {
                    String s = null;
                    System.out.println(s.length());
                }
                catch (NullPointerException e) {
                    System.out.println("NullPointerException occurred");
                }

                // 3. StringIndexOutOfBoundsException
                try {
                    String str = "Java";
                    System.out.println(str.charAt(10));
                }
                catch (StringIndexOutOfBoundsException e) {
                    System.out.println("StringIndexOutOfBoundsException occurred");
                }
         */

    //  Q.4 create TestPropagation class that has two methods first() second().
        //  method first() will call second ()  and catch its propagation exception.
        //  method second() will throw a custom exception defined by you that will cought by method first().
        //  method first ()will catch and wrap caught exception into another exception object and rethrow .
        //  test your code in main() method ? catch and wrap caught exception into another exception object and rethrow .test your code in main() method ?
        /*
        TestPropagation obj = new TestPropagation();
        try {
            obj.first();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

         */

    }
}
/*

1.what is the difference between exception and error classes?
Exceptions represent conditions that an application can anticipate and recover from.
They are generally caused by application-level issues such as invalid input, file not found, or database errors.
Exceptions can be handled using try–catch blocks or declared using throws.

Errors, on the other hand, represent serious system-level problems that occur due to JVM or system failure.
They are not meant to be handled by the application code.
Errors usually indicate conditions from which recovery is not possible.

2.what is the difference between checked and unchecked exception?
The main difference between checked and unchecked exceptions is when they are checked and whether handling is mandatory.

Checked exceptions are checked at compile time, and the compiler forces the programmer to handle them using try–catch or declare them using throws.
They usually represent recoverable conditions such as file handling or database access issues.

Unchecked exceptions are checked at runtime and the compiler does not force handling.
They usually occur due to programming mistakes like null access or invalid indexing.


3.what is the difference between throw and throws keywords?
The throw and throws keywords are both used in exception handling, but they serve different purposes.
The throw keyword is used to explicitly create and throw an exception object inside a method or block.
It is used when we want to manually raise an exception.

The throws keyword is used in the method declaration to declare that a method may pass one or more exceptions to the caller instead of handling them.

4.how we you exit from try catch block without executing the finally block?
 Normally, the finally block always executes, whether an exception occurs or not.
However, the only reliable way to exit from a try–catch block without executing the finally block is by calling System.exit().

When System.exit() is invoked, the JVM terminates immediately, and as a result, the finally block does not get executed.


class Test {
    public static void main(String[] args) {

        try {
            System.out.println("Inside try");
            System.exit(0);
        }
        catch (Exception e) {
            System.out.println("Inside catch");
        }
        finally {
            System.out.println("Inside finally");
        }
    }
}


6 what is exception propagation ? how do you propagate checked and unchecked
exceptions?

Exception propagation is the process by which an exception moves from one method to its calling method when it is not handled in the current method.
When an exception occurs, the JVM looks for a matching catch block.
If it is not found, the exception is propagated up the call stack until it is handled or the program terminates.


7 what is difference between final , finally and finalize?

final is a keyword used to restrict modification.
finally is a block used in exception handling to execute important cleanup code.
finalize() is a method used by the Garbage Collector before destroying an object.


 */
