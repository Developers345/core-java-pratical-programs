package com.jp.lambda.expressions.methodreference;

import com.jp.thisexample.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferencePratice {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rama", "Ganesh", "Suresh", "Banny");
        //System.out.println(greet("Rama")); method call will not possible
        //Lambda expression
     //names.forEach(name->greet(name));

        //Reference to static methods
        names.forEach(MethodReferencePratice::greet);
        System.out.println("=============================");
        //Reference to instance method of particular object
        MethodReferencePratice  methodReferencePratice = new MethodReferencePratice();
        names.forEach(methodReferencePratice::print);
        System.out.println("============================");
        //here out is instance of PrintStream
        names.forEach(System.out::println);

        System.out.println("=============================");
        //Collections.sort(names,(s1,s2)-> s1.compareTo(s2));
        //Reference to an instance method of an arbitary object of particular type.
        Collections.sort(names,String::compareTo);
        names.forEach(System.out::println);

        //Reference to a Constructor.
        names.forEach(Employeee::new);
    }
    public static void greet(String name)
    {
        System.out.println("Hey,Hello! my name is "+name);
    }
    public void print(String name)
    {
        System.out.println("My name is "+ name + "Good Morning!");
    }
}

class Employeee
{
    String name;
    public Employeee(String name)
    {
        this.name = name;
    }
}
