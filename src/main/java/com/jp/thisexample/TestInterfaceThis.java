package com.jp.thisexample;

public class TestInterfaceThis {
    public static void main(String[] args) {

        Jagur j = new Jagur() {
            @Override
            public void drive() {
                super.drive();
            }
        };
        j.setCarName("tata");
        System.out.println(j.getName());


    }
}
