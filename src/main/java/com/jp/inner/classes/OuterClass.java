package com.jp.inner.classes;
//Local classes
public class OuterClass {

    private static int id = 100;

    public static void main(String[] args)
    {
         int salary = 5000;
         class A
         {
             public void print()
             {
                 System.out.println("The salary is--"+ salary);
                 System.out.println("outer class variable---"+id);
             }
         }
         A a = new A();
         a.print();

    }

    public void show()
    {
        //new OuterClass().main(null).A
        System.out.println("Show method called");
    }
}
