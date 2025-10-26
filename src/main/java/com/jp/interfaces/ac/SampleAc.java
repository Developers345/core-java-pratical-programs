package com.jp.interfaces.ac;

public abstract class SampleAc implements Laptop {

    public void copy() {
        System.out.println(" copy code");
    }


    public void cut() {
        System.out.println("cut code");
    }

    public abstract void paste();

}
