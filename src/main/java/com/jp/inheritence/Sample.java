package com.jp.inheritence;

import com.jp.accessmodifiers.Student;

public class Sample {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.rollNo);
        s.printRollNo();
    }
}
