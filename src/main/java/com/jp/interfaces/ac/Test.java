package com.jp.interfaces.ac;

public class Test {

    public static void main(String[] args) {

        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("Drive method called");
            }
        };
        car.drive();
    }
}
