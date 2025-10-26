package com.jp.thisexample;

public  abstract class Jagur implements Car{
    String name ="jaugur";
    @Override
    public void drive() {

    }

    public void setCarName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
