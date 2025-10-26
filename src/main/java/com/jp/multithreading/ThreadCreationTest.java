package com.jp.multithreading;

public class ThreadCreationTest {
    public static void main(String[] args) {

         Employee e1 = new Employee("Employee-Thread");
         e1.start();
         Manager m1 = new Manager("Manager-Thread");
         m1.start();

        System.out.println("Current active thread--"+ Thread.activeCount());
    }
}
class Employee extends Thread {
    public Employee(String tName)
    {
        super(tName);
    }
    @Override
    public void run()
    {
        System.out.println("Employee   "+ Thread.currentThread().getName() +">> "+ Thread.currentThread().getId());
    }
}

class Manager extends Thread {
    public Manager(String tName)
    {
        super(tName);
    }

    @Override
    public void run()
    {
        System.out.println("Manager   "+Thread.currentThread().getName()+ ">> "+Thread.currentThread().getId());
    }
}