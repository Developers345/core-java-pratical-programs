package com.jp.inheritence;

public class Admin extends Developer {


    public void manage() {
        super.read();
        super.write();
        System.out.println("manage access");
    }

    public void read()
    {
        System.out.println("admin read access");
    }
}
