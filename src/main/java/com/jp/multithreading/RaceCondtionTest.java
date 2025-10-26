package com.jp.multithreading;

public class RaceCondtionTest {
    public static void main(String[] args) throws InterruptedException {

        BrickDiary bd = new BrickDiary();

        Runnable r1 = () -> {
          for(int i = 0; i < 10000; i+=50)
          {
              bd.incrementBrickCount();
          }
        };

        Thread t1 = new Thread(r1,"Worker-1");
        Runnable r2 = () -> {
            for(int i = 0; i < 15000; i+=50)
            {
                bd.incrementBrickCount();
            }
        };
        Thread t2 = new Thread(r2,"worker-2");
        Runnable r3 = () -> {
          for (int i = 0; i < 5000; i+=50)
          {
              bd.incrementBrickCount();
          }
        };
        Thread t3 = new Thread(r3,"worker-3");
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(bd.brickCount);
        System.out.println(bd.brickCount2);
    }
}
