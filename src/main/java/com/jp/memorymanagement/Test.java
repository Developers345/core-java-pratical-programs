package com.jp.memorymanagement;

public class Test {

    public static void main(String[] args) {
       new Test().add(1);
    }

    public void add(int i)
    {
        System.out.println(i);
        i++;
        add(i);
    }

    //19478
    // 106722 - increase to 5mb
    //Xss5m - setting VM option for Stack Area
   // java.lang.StackOverflowError - When Stack area full got the StackOverflow Error
}
