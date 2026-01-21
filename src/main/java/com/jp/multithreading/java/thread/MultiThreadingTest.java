package com.jp.multithreading.java.thread;

class myThread1 extends Thread
{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("i :"+i);
            try
            {
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class myThread2 implements Runnable
{

    @Override
    public void run() {
        for (int j = 1; j <= 10; j++)
        {
            System.out.println("j :"+ j);
            try
            {
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadingTest {

    public static void main(String[] args) {

         myThread1 myThread1 = new myThread1(); // by extending thread class
         myThread2 myThread2 = new myThread2(); // implements Runnable interface
        Thread thread = new Thread(myThread2);

         myThread1.setPriority(1);
         thread.setPriority(10);

        myThread1.start();
        thread.start();


    }
}
