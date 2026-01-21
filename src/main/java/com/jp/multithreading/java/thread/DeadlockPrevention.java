package com.jp.multithreading.java.thread;

public class DeadlockPrevention {

    static Object resource1 = new Object();
    static Object resource2 = new Object();

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                synchronized (resource2) {
                    System.out.println("Thread-1 done");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource1) {   // SAME ORDER
                synchronized (resource2) {
                    System.out.println("Thread-2 done");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

