package com.jp.wrapper.classes;

import java.util.ArrayList;

public class WrapperClassTest {
    public static void main(String[] args) {

        int i = 20;

        //Integer(55) deprecated
        //Integer ii = new Integer(55);
        Integer ii = Integer.valueOf(88);//boxing
        System.out.println(ii);

        Integer i2 = 89;// auto-boxing
        System.out.println(i2);

        int i3 = i2.intValue();// un-boxing
        int i4 = i2; // auto-unboxing

        System.out.println(i3);
        System.out.println(i4);

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(34);//auto-boxing
        al.add(Integer.valueOf(45)); // boxing
       int i5 =  al.get(0);//auto-unboxing
        System.out.println(i5);

        String s = "14";
        int i7 = Integer.valueOf(s);//This method returns reference/object type(Integer)
        int i8 = Integer.parseInt(s);// this method returns primitive datatype(int)
        System.out.println(i7);

    }
}
