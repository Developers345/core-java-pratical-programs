package com.jp.inner.classes;

public abstract class Balance {

    public void checkBalance()
    {
        System.out.println("Balance checking...");
    }

    public int getBalance()
    {
        return 40000;
    }

    public abstract void withdraw();
}
