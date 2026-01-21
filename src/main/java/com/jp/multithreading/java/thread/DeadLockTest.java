package com.jp.multithreading.java.thread;

public class DeadLockTest {

    public static void main(String[] args) {

             Object resource1 = new Object();
             Object resource2 = new Object();

            Thread t1 = new Thread(() -> {
                    synchronized (resource1) {
                        System.out.println("Thread-1 locked resource1");

                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        synchronized (resource2) {
                            System.out.println("Thread-1 locked resource2");
                        }
                    }
                });

                Thread t2 = new Thread(() -> {
                    synchronized (resource2) {
                        System.out.println("Thread-2 locked resource2");

                        try { Thread.sleep(100);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        synchronized (resource1) {
                            System.out.println("Thread-2 locked resource1");
                        }
                    }
                });

                t1.start();
                t2.start();

        }

    }

