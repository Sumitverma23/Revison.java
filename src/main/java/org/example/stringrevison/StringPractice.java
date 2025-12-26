package org.example.stringrevison;

public class StringPractice {
    public static void main(String[] args) {

       // write a progarm to concatenate strings "sumit" and "verma" and print.
        String s1 = "Sumit";
        String s2 = "verma";

        String result = s1 +" " + s2;
        System.out.println(result);


       // write a progarm to extract last name from "sumit verma" String
        String name = "sumit verma";
        String lastName = name.substring(name.indexOf(" ") + 1);
        System.out.println(lastName);
    }
}