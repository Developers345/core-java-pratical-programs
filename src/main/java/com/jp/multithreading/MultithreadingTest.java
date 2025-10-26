package com.jp.multithreading;

public class MultithreadingTest {
    public static void main(String[] args) {
        System.out.println("Hello Good Morning..");
        System.out.println("By default current exection thread--"+Thread.currentThread().getName());
        System.out.println("Active thread by default---"+ Thread.activeCount());
        System.out.println("Current priority main threaad ---"+ Thread.currentThread().getPriority());
        Thread.getAllStackTraces().keySet().forEach(t->{
            System.out.println(t.getName()+" - "+(t.isDaemon() ? "demon": "user"));
        });

    }
}
