package com.jp.polymorishm;

public class Calculations {

    /*
    * complie time polymorphism achieved by method overrloading
    * In method overrloading there are 3 points need to remember
    * 1. order of parameter type
    * 2. number of parameter types/ parameters
    * 3. type of parameters
     */
    public void add(int a, int b)
    {

    }

    public void add(int a, int b,int c)
    {

    }

    public static void main(String[] args) {
        Calculations cal = new Calculations();
        cal.add(2,3);
        cal.add(2,3,4);
    }
}
