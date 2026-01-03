package org.example.Collection;

import java.util.*;

public class Practice {



    public static void main(String[] args) {

//Q.1 write a progarm to iterate and print elements of an ArrayList.
        /*
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");
        list.add("Microservices");


        for(String element:list){
            System.out.println(element);
        }

         */

        // Q.2 write a program to sort Employees objects based on highest
        // salary using Comparator .
       /*
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Rahul", 60000));
        list.add(new Employee(102, "Amit", 85000));
        list.add(new Employee(103, "Neha", 75000));

        Collections.sort(list, new SalaryComparator());

        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }

        */
//Q.3 write a program to sort Employees objects based on  last name and first name using comparator.
// if last name is equal then employees should be sorted first name .
      /*
  List<Employee2> list=new ArrayList<>();
  list.add(new Employee2(1,"Sumit","Verma"));
  list.add(new Employee2(2,"Amit","Sharma"));
  list.add(new Employee2(3,"Kiran","Verma"));
  list.add(new Employee2(4,"Rahul","Sharma"));

  Collections.sort(list,new SurnameComparator());


  for (Employee2 s:list){
      System.out.println(s.firstName + " " + s.lastName);
  }

       */

    //Q.4  Override hashcode() and equals() methods of employee3 so that it
      // can be uniquely identified in a hash collection.
/*
      Set<Employee3> set = new HashSet<>();
      set.add(new Employee3(1, "Rahul", 50000));
      set.add(new Employee3(1, "Rahul", 60000)); // same id
      set.add(new Employee3(2, "Amit", 70000));

      System.out.println(set.size());


 */


     //Q.5 create an arraylist of 100000 integer .convert it into Hashset
      // .create 50 integer using random numbers.compare the time required to search them in the above two data structure.
/*
      List<Integer> list=new ArrayList<>();
      for(int i=0;i<100000;i++){
        list.add(i);
      }


      Set<Integer> set=new HashSet<>(list);


      Random random=new Random();
      int[] searchNumbers=new int[50];
      for (int i=0;i<50;i++){
        searchNumbers[i]= random.nextInt(10000);
      }

      long startList=System.nanoTime();
      for (int num:searchNumbers){
        list.contains(num);
      }

      long endList=System.nanoTime();
      long listTime=endList-startList;


      long startSet=System.nanoTime();
      for (int num:searchNumbers){
        set.contains(num);
      }

      long endSet=System.nanoTime();
      long setTime=endSet-startSet;


      System.out.println("ArrayList search time "+ listTime);
      System.out.println("HashSet search time "+ setTime);
 */

    // Q.6 create a list of 10 elements using HashSet, Tree set, and
      // LinkedHashSet separtely.print all three list element using iteartor
      // and differentiate the printed order of elements.
/*
      Set<Integer> hashSet=new HashSet<>();
      hashSet.add(50);
      hashSet.add(20);
      hashSet.add(10);
      hashSet.add(40);
      hashSet.add(30);
      hashSet.add(90);
      hashSet.add(70);
      hashSet.add(60);
      hashSet.add(80);
      hashSet.add(100);

      Set<Integer> linkedHashSet=new LinkedHashSet<>();
      linkedHashSet.add(50);
      linkedHashSet.add(20);
      linkedHashSet.add(10);
      linkedHashSet.add(40);
      linkedHashSet.add(30);
      linkedHashSet.add(90);
      linkedHashSet.add(70);
      linkedHashSet.add(60);
      linkedHashSet.add(80);
      linkedHashSet.add(100);



      Set<Integer> treeSet=new TreeSet<>();
      treeSet.add(50);
      treeSet.add(20);
      treeSet.add(10);
      treeSet.add(40);
      treeSet.add(30);
      treeSet.add(90);
      treeSet.add(70);
      treeSet.add(60);
      treeSet.add(80);
      treeSet.add(100);


      System.out.println("Hashset element");
      Iterator<Integer> it1 = hashSet.iterator();
      while (it1.hasNext()) {
        System.out.print(it1.next() + " ");
      }
      System.out.println();


      System.out.println("LinkedHashSet elements:");
      Iterator<Integer> it2 = linkedHashSet.iterator();
      while (it2.hasNext()) {
        System.out.print(it2.next() + " ");
      }
      System.out.println();


      System.out.println("TreeSet elements:");
      Iterator<Integer> it3 = treeSet.iterator();
      while (it3.hasNext()) {
        System.out.print(it3.next() + " ");
      }
      System.out.println();


 */

     //Q.7 create a java program to find middle node of linked list in one pass.
/*
      LinkedList list = new LinkedList();

      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);

      list.findMiddle();

 */
      //Q.8 write a program to print odd numbers from the list using stream api.
/*
      List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
     numbers.stream()
             .filter(n-> n%2!=0)
             .forEach(System.out::println);
 */
    }
}
/*


1 what is collections framework?
The Java Collections Framework is a set of interfaces, classes, and algorithms that is used to store, manipulate, and process a group of objects efficiently.
It provides ready-made data structures like List, Set, Queue, and Map to handle data dynamically.
The framework also provides utility classes like Collections for sorting, searching, and synchronizing data.
It reduces programming effort, increases performance, and provides standard, reusable, and type-safe solutions for data handling.

 2 what is the difference between the set and list?
 List and Set are both interfaces in the Java Collections Framework, but they
  differ in how they store elements. A List allows duplicate elements and maintains the insertion order, which means elements can be accessed using an index position.
  Implementations like ArrayList and LinkedList are commonly used when order and duplicates are important.

  In contrast, a Set does not allow duplicate elements and stores only unique values.
   It does not support index-based access, and the ordering of elements depends on the implementation—for example, HashSet does not maintain order, LinkedHashSet maintains insertion order, and TreeSet stores elements in sorted order.



3 what is the difference between the hashtable and hashmap?

HashMap and Hashtable are both used to store data in key–value pairs, but they differ mainly in synchronization, performance, and null handling.
 HashMap is not synchronized, which means it is not thread-safe but offers better performance in single-threaded or non-concurrent environments,
  whereas Hashtable is synchronized, making it thread-safe but slower due to synchronization overhead. HashMap allows one null key and multiple null values, while Hashtable does not allow any null key or null value.
   Additionally, HashMap is part of the modern Java Collections Framework and is generally preferred in new applications, whereas Hashtable is considered a legacy class and is rarely used today.

4 what is the difference between the vector and array list?
ArrayList is a non-synchronized collection, which means it is not thread-safe by default and is faster in single-threaded environments because there is no synchronization overhead.
 It allows duplicate elements, maintains insertion order, and permits multiple null values. ArrayList is part of the modern Java Collections Framework and is commonly used in applications where concurrency is not required and performance is important.

Vector is a synchronized collection, which means it is thread-safe as all its methods are synchronized.
Because of this synchronization, Vector is slower compared to ArrayList in non-concurrent scenarios. Like ArrayList, it allows duplicate elements, maintains insertion order, and supports null values. Vector is considered a legacy class, and in modern Java applications, it is generally avoided in favor of ArrayList or concurrent collections.

5.what is the difference between the linkedlist and array list?
ArrayList stores elements in a dynamic array, which allows fast random access because elements can be accessed directly using an index.
 However, insertion and deletion operations in the middle of the list are slower because elements need to be shifted. ArrayList maintains insertion order, allows duplicate elements and null values, and is best suited when the application requires frequent read operations.

LinkedList stores elements in a doubly linked list structure, where each element contains references to the previous and next nodes. Because of this structure, insertion and deletion operations are faster, especially in the middle of the list, but accessing elements is slower since traversal is required.
LinkedList also maintains insertion order, allows duplicate elements and null values, and is preferred when the application involves frequent insertions and deletions.


6.what is the difference between the enumeration and iterator?
Enumeration is a legacy interface used mainly with old collection classes like Vector and Hashtable. It allows only forward traversal of elements and supports only two methods: hasMoreElements() and nextElement().
 Enumeration is not fail-fast, meaning it does not throw ConcurrentModificationException if the collection is modified during iteration, but it also does not provide any method to remove elements while iterating.

Iterator is a modern interface used with all collection classes in the Java Collections Framework. It supports forward traversal and provides methods like hasNext(), next(), and remove().
Iterator is fail-fast, so it throws ConcurrentModificationException if the collection is structurally modified during iteration (except through remove()), making it safer and more reliable for iteration in modern Java applications.

7.what is fail fast ? and where it is applicable ?
Fail-fast is a behavior of Java iterators where an exception is thrown immediately if a collection is structurally modified while it is being iterated, except through the iterator’s own remove() method.
 This mechanism helps to detect concurrent modification errors early rather than allowing unpredictable results. Fail-fast behavior is applicable to most non-concurrent collections in the Java Collections Framework, such as ArrayList, HashMap, HashSet, and LinkedList,
 where iterators throw a ConcurrentModificationException when an illegal modification is detected.

8.which design pattern is followed by the iterator interface?
The Iterator interface follows the Iterator Design Pattern.
This pattern provides a way to access elements of a collection sequentially without exposing its internal structure.
It separates the iteration logic from the collection itself, allowing different types of collections to be traversed in a uniform way, which improves encapsulation and makes the code more flexible and maintainable.

9.what is the imporatnce of equals() and hashcode() method in collection classes ?why do we override  both?
The equals() and hashCode() methods are very important in Java collection classes, especially in hash-based collections like HashMap, HashSet, and Hashtable, because they are used to identify and manage duplicate objects.
When an object is added to a hash-based collection, the hashCode() method is called first to determine the bucket location, and then equals() is used to compare objects within that bucket to check whether two objects are logically equal.

We override both equals() and hashCode() together to maintain their contract, which states that if two objects are equal according to equals(), they must return the same hash code.
If only one method is overridden, collections may behave incorrectly, such as allowing duplicate objects or failing to retrieve stored elements. Overriding both ensures correct behavior, proper duplicate handling, and efficient performance in collections.


10.what is the difference between comparable and comparator interface? and which type of object are compared by them?

Comparable and Comparator are interfaces used for object comparison and sorting in Java, but they differ in purpose and usage.
The Comparable interface is used to define the natural ordering of objects by implementing the compareTo() method inside the same class whose objects are being compared.
It is suitable when there is only one logical way to sort objects, such as sorting employees by ID or names alphabetically. Comparable compares objects of the same class, and the sorting logic becomes a part of the class itself.

The Comparator interface, on the other hand, is used to define custom or multiple sorting logics by implementing the compare() method in a separate class.
It is useful when we want to sort objects based on different attributes, such as salary, name, or age, without modifying the original class. Comparator also compares objects of the same type, but the comparison logic is external, making it more flexible and reusable.


 11.how many comparable and compartor can you create for a class ?which type of atrributes will you select in comparable to sort a collection?
For a class, we can create only one Comparable implementation because Comparable defines the natural ordering of objects and the class itself implements it using a single compareTo() method.
 In contrast, we can create multiple Comparator implementations for the same class, because each Comparator represents a different sorting logic, such as sorting by name, salary, age, or any other attribute.

In Comparable, we usually select an attribute that represents the most natural, primary, and commonly used order for the object, such as an ID, roll number, or unique name, because natural ordering should be default, consistent, and meaningful across the application.


 12. class employee contained multiple attributes to sort .How many comparator can you create for a employee class? how will you decide that how many comparators you have to create for a class?
For an Employee class with multiple attributes, you can create as many Comparator implementations as you need, because each Comparator defines a different sorting logic. For example, you can create separate Comparators to sort employees by salary, first name, last name, joining date, or even department.

You decide how many Comparators to create based on the sorting requirements of your application.
 If users or features need to view or process employees in different orders, you create a separate Comparator for each unique sorting criterion. Essentially, one Comparator per distinct sorting logic is sufficient, and you don’t need a Comparator for attributes that are already handled by the class’s natural ordering via Comparable.

 13.can you create a single comparator that can sort object on two attributes
  like last name and first name ?

Yes, we can create a single Comparator that sorts objects on two attributes, such as last name and first name.
In this case, the Comparator first compares the primary attribute (last name). If two objects have the same last name, it then compares the secondary attribute (first name). This approach is called multi-level or chained comparison.
For example, for an Employee class:
Comparator<Employee> nameComparator = new Comparator<Employee>() {
    @Override
    public int compare(Employee e1, Employee e2) {
        int lastNameCompare = e1.getLastName().compareTo(e2.getLastName());
        if (lastNameCompare == 0) {
            return e1.getFirstName().compareTo(e2.getFirstName());
        }
        return lastNameCompare;
    }
};


This single Comparator handles sorting by last name first, and if last names are equal, by first name, making it flexible for multi-attribute sorting.
In modern Java, the same can be done more concisely using lambda and thenComparing():
Comparator<Employee> nameComparator = Comparator
        .comparing(Employee::getLastName)
        .thenComparing(Employee::getFirstName);



 14  how will we can reverse an arraylist ? and how we can sort collections?
To reverse an ArrayList, we can use the Collections.reverse() method, which reverses the order of elements in place.
To sort a collection, we use Collections.sort(), which sorts elements in natural order (if objects implement Comparable) or custom order (if a Comparator is provided).

To sort a collection, we can use the Collections.sort() method. By default, it sorts elements in natural order (for numbers or strings) or according to the Comparable implementation if the objects are custom. If we need a custom order, we can pass a Comparator to Collections.sort() to define how elements should be compared.

15.how we can synchronize a set ,list and map?
To synchronize a List, Set, or Map in Java, we can use the utility methods provided by the Collections class, which wrap the collection in a thread-safe (synchronized) version.
This is important when multiple threads access the same collection concurrently to prevent data inconsistency.

For a List:
List<String> list = Collections.synchronizedList(new ArrayList<>());


For a Set:
Set<String> set = Collections.synchronizedSet(new HashSet<>());


For a Map:
Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());

 */
