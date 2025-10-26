package com.jp.multithreading;

public class RunnableInterfaceTest {
    public static void main(String[] args) throws InterruptedException {

        /*
         Anonmous class
         */
        /*Runnable r1 = new Runnable(){
            @Override
            public void run()
            {
                System.out.println("Employee1 --- "+ Thread.currentThread().getName()+">> "+Thread.currentThread().getId());
            }

        };

        Thread t1 = new Thread(r1, "employee-thread");
        t1.start();

         Runnable r2 = new Runnable()
         {
             @Override
           public void run()
           {
               System.out.println("Manager1 --- "+ Thread.currentThread().getName()+">> "+Thread.currentThread().getId());
           }
         };

        Thread t2 = new Thread(r2, "manager-thread");
        t2.start();*/
        Runnable r1 = () -> {
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Employee1 --- "+ Thread.currentThread().getName()+">> "+Thread.currentThread().getId());
            }

        };

        Thread t1 = new Thread(r1,"employee-thread");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t1.sleep(10000);

        Runnable r2 = () -> {
            for(int i = 0; i < 20; i++)
            {
                System.out.println("Manager1 --- "+ Thread.currentThread().getName()+">> "+Thread.currentThread().getId());
            }

        };

        Thread t2 = new Thread(r2,"manager-thread");
        t2.start();
        System.out.println(t1.getState());
        t1.start();
        //System.out.println("current thread--"+Thread.activeCount());
    }
}
