package com.jp.optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest {

    public static void main(String[] args) {
        List<Student> studentList = List.of(
          new Student(101,"Suresh", "Bajara Hills"),
                new Student(102,"Ramesh", null),
                new Student(103,"Ganesh", "Hitech City"),
                new Student(104,"Shiva", ""),
                new Student(105,"Gowtham", "Madharpur")

        );

        Student s1 = studentList.get(3);
        //String address = s1.getAddress();
        Optional<String> address = s1.getAddress();
          /*
          Here developer cannot know address will same null or value
        java.lang.NullPointerException: Cannot invoke "String.length()" because "address" is null
        Usually we handle NullPointerException using if else statement (if(address != null))
        To Handle the NullPointerException in java 1.8 Optional Class introduced
         */
        /*
          we can simplify the below if-else condition

        if(address.isPresent())
        {
            System.out.println(address.get().length());
        }else
        {
            System.out.println("NA");
        }*/

        /*
          ifPresent accepts the Consumer as parameter.
          ifPresentOrElse accepts 2 parameters (Consumer,Runnable)
         */
       // address.ifPresent((a) -> System.out.println(a.length()));
        address.ifPresentOrElse((a) -> System.out.println(a.length()),()-> System.out.println("NA"));




        String name = s1.getName();
        System.out.println(name);

        int rollNo = s1.getRollNo();
        System.out.println(rollNo);

    }

}
