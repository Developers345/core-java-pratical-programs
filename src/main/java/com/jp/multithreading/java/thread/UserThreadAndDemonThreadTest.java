package com.jp.multithreading.java.thread;

public class UserThreadAndDemonThreadTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread(()->{
            for (int i = 1; i <= 10; i++)
            {
                System.out.println("i :"+ i);
                try
                {
                 Thread.sleep(1000);

                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(()->{

           for (int j = 11; j <= 50; j++)
           {
               System.out.println("j: "+j);
               try
               {
                   Thread.sleep(1000);
               }catch (InterruptedException e)
               {
                   e.printStackTrace();
               }
           }

        });

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
    }
}
