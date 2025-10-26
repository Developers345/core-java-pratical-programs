package com.jp.test;

import java.util.Arrays;

public class ReverseWordStringTest {
    public static void main(String[] args) {

        String s = "java super";

        String[] s1 = s.split(" ");
        for (int i = s1.length-1; i > 0; i--)
        {
            System.out.println(s1[i]);
        }

    }
}
