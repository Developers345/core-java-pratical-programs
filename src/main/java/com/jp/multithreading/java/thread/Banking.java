package com.jp.multithreading.java.thread;

public class Banking {

    int balance = 10000;

    public synchronized void withdrawAmount( int amount) {
        try
        {
            if(amount > balance)
            {
                throw new Exception("Insuffient fund");
            }
            Thread.sleep(500);
            balance = balance - amount;
            System.out.println("Withdraw completed Successful");
            System.out.println("Remaining Amount is:"+balance);

        }catch (Exception e)
        {
            System.out.println("ERROR: "+ e.getMessage());
        }

    }
}
