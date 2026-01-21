package com.jp.multithreading.java.thread;

public class BankingThreadTest {

    public static void main(String[] args) {

        Banking banking = new Banking();

        new Thread(()->{
           int amount = 7000;
           banking.withdrawAmount(amount);
        }).start();

        new Thread(()->{
           int amount = 7000;
           banking.withdrawAmount(amount);
        }).start();
    }
}
