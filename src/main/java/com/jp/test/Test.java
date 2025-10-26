package com.jp.test;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = " Hello World ";
        String s6 = "java string";
        String s7 = "JAVA STRING";

        //System.out.println(s1 == s2);
        //System.out.println(s1 == s3);
        //System.out.println(s1 == s4);
        //System.out.println(s1.equals(s4));
        //System.out.println(s4.equalsIgnoreCase(s5));
        //System.out.println(s4.startsWith("O"));
        //System.out.println(s4.endsWith("o"));
        // System.out.println(s5.contains(s4));
        // System.out.println(s5.length());
        //System.out.println(s5.trim());
        //System.out.println(s5.trim().length());
      //  System.out.println(s6.toUpperCase());
       // System.out.println(s7.toLowerCase());
       // char[] charArray = s1.toCharArray();

      //  System.out.println(Arrays.toString(charArray));

       // System.out.println(s1.indexOf("o"));
        //System.out.println(s1.lastIndexOf("l"));
        //System.out.println(s1.charAt(5));
       // System.out.println(s1.substring(0,3));
        int i = 10;
      //  System.out.println(String.valueOf(i));

        //System.out.println(s1.replace("l","z"));
        //System.out.println(s5.replaceAll("l","z"));
      //  System.out.println(Arrays.toString(s6.split(" ")));

        String s8 = "java is super";
        String[] s = s8.split(" ");
        //System.out.println(s.length);

        String s9 = "java is super";
        char[] charArray = s9.toCharArray();
        System.out.println(charArray.length);


    }
}
