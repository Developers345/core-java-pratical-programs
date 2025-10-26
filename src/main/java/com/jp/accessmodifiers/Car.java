package com.jp.accessmodifiers;

public class Car {

    public static void main(String[] args) {
       new Car().test();
    }
    public void test()
    {
        Student student = new Student();
        System.out.println(student.rollNo);
        student.printRollNo();

    }
}
