package com.jp.thisexample;

import java.util.Arrays;

public interface Car {
    String name = "jagur";
    void drive();

    default void setCarName(String name)
    {
        System.out.println(Arrays.toString(this.getClass().getDeclaredMethods()));
        //this.name = name;
        /*
        Cannot assign a value to final variable 'name'
        the above error thrown by complier because variables/
        attributes by default final.
         In interface also we can use this keyword but it is not access the instance variables of the interface. it is used to access the implemeted class variables inside the interface.
         */
    }
}
