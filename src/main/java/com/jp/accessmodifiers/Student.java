package com.jp.accessmodifiers;

public class Student {

   public  int rollNo = 101;

     public Student()
    {
        rollNo = 102;
    }

   public void printRollNo()
    {
        System.out.println(rollNo);
    }

    private void test()
    {
        System.out.println(rollNo);
        printRollNo();
    }

}
