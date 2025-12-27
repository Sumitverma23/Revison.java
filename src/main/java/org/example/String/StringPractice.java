package org.example.String;

public class StringPractice {
    public static void main(String[] args) {

       // write a progarm to concatenate strings "sumit" and "verma" and print.

       /*
        String s1 = "Sumit";
        String s2 = "verma";

        String result = s1 +" " + s2;
        System.out.println(result);

        */


       // write a progarm to extract last name from "sumit verma" String
        /*
        String name = "sumit verma";
        String lastName = name.substring(name.indexOf(" ") + 1);
        System.out.println(lastName);

         */


        //  write a program to count occurrence of a character in a given string

/*
        String str="hello world";
        char ch ='l';
        int count=0;

        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }

        System.out.println("occurrence of '" + ch +"' is:" + count);


 */

      //  write a program that contain two statement ,first statement will store a string in string literal pool and second statement  will fetch a string from literal pool?

        /*
        String str="mohit";

        String str2="mohit";
        System.out.println(str==str2);


         */

    }
}

/*
Q.1 why is string is immutable ?
String in Java is immutable to improve security, performance, and memory efficiency.
Since a String object cannot be changed once it is created, it becomes safe to use in sensitive areas like passwords, database URLs, and network connections.
Immutability also allows Java to reuse String objects from the String Literal Pool, which saves memory.
Additionally, immutable Strings are thread-safe by default, so multiple threads can use the same String without synchronization.


Q.2 how do you create a immutable class?
To create an immutable class in Java, we must ensure that the object’s state cannot be changed after creation.
This is done by making the class final, fields private and final, initializing them using a constructor, and not providing any setter methods.
If the class has mutable fields, we return a defensive copy instead of the original object.


Q.3 can we inherit the a string class
No, we cannot inherit the String class in Java because it is declared as final.


Q.4 what is the difference between "==" operator and equals () method ?
The == operator compares references (memory addresses), whereas the equals() method compares the actual content of objects.

 Q.5 what is the diffrenece between string, stringbuffer and string builder
String, StringBuffer, and StringBuilder are used to handle text in Java, but they differ in mutability, thread-safety, and performance.

🔍 Explanation with Example
🔹 String (Immutable)
String s = "Sumit";
s.concat(" Verma");   // new object created
System.out.println(s); // Sumit
👉 Original string change nahi hoti


🔹 StringBuffer (Mutable & Thread-safe)
StringBuffer sb = new StringBuffer("Sumit");
sb.append(" Verma");
System.out.println(sb); // Sumit Verma
👉 Same object modify hota hai
👉 Thread-safe (synchronized)


🔹 StringBuilder (Mutable & Fast)
StringBuilder sb = new StringBuilder("Sumit");
sb.append(" Verma");
System.out.println(sb); // Sumit Verma
👉 Fastest
👉 Not thread-safe

 */