package org.example.Generics;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {


        /*

        Q.1 write a program to implements LRU cache using generics ?

        LRU<Integer, String> lru = new LRU<>(3);

        lru.put(1, "A");
        lru.put(2, "B");
        lru.put(3, "C");
        lru.display();

        lru.get(1); // access

        lru.put(4, "D"); // removes least recently used
        lru.display();

         */

/*
Q.2 write a generic method to exchange the position of two different elements in
 an array of different type .

        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"A", "B", "C", "D"};

        Swap.swap(numbers, 1, 3); // swap elements in Integer array
        Swap.swap(names, 0, 2);   // swap elements in String array

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

 */

       /*
       Q.3 write a generic method to find and return the maximum element in
        the range [begin,end]of a list.

 List<Integer> numbers = Arrays.asList(10, 50, 20, 40, 30);

        Integer result = MaxElement.maxInRange(numbers, 1, 3);

        System.out.println("Max element: " + result);
        */
    }

}



/*
what is generics in java ?and its advantages?
Generics in Java is a feature that allows us to write type-safe and reusable code by using parameterized types.
It means we can define classes, methods, and interfaces that work with any data type, while ensuring compile-time type checking.

✅ Advantages of Generics in Java
1️⃣ Type Safety
Errors are detected at compile time, not at runtime.
Prevents ClassCastException.
✔ Example:
List<Integer> list = new ArrayList<>();
// list.add("A"); // compile-time error

2️⃣ No Need for Type Casting
Without generics, we need explicit casting.
With generics, casting is not required.
✔ Example:
Integer x = list.get(0); // no casting needed

3️⃣ Code Reusability
One generic class/method works for multiple data types.
✔ Example:
class Box<T> {
    T value;
}
Same class works for Integer, String, Double, etc.

4️⃣ Improves Code Readability
Code becomes clean, clear, and easy to understand.
Other developers know what type the collection holds.

5️⃣ Compile-Time Error Checking
Many runtime errors are avoided before execution.


what is wildcard generics ?

Here is a clean, interview-ready explanation in simple English 👇

Q.2 ✅ What is Wildcard Generics in Java? and its types?
Wildcard Generics in Java are used to make generic code more flexible by allowing unknown types.
It is represented by the question mark (?).
🔹 Why do we need Wildcards?
Without wildcards:
void printList(List<Object> list) { }
❌ This will NOT accept List<String> or List<Integer>.

With wildcards:
void printList(List<?> list) { }
✅ Accepts List<String>, List<Integer>, List<Double>, etc.

✅ Types of Wildcards in Java
1️⃣ Unbounded Wildcard (<?>)
Used when type does not matter.
void print(List<?> list) {
    for (Object o : list) {
        System.out.println(o);
    }
}
✔ Can read data
❌ Cannot add data (except null)

2️⃣ Upper Bounded Wildcard (<? extends T>)
Used when we want to accept T or its subclasses.
void sum(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}
✔ Accepts Integer, Double, Float
✔ Safe for reading
❌ Not safe for adding

3️⃣ Lower Bounded Wildcard (<? super T>)
Used when we want to accept T or its superclasses.
void addNumbers(List<? super Integer> list) {
    list.add(10);
    list.add(20);
}


can we use generics with arrays?
Java does not allow generic array creation because generics use type erasure while arrays retain type information at runtime, which can cause type safety issues.
 */
