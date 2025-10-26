package com.jp.ternary.operator;

public class TernaryOperatorTest {
    public static void main(String[] args) {

        int i = 100;
        int j = 70;
        int max;
        //old style
        if(i > j)
            max = i;
        else
            max = j;

        System.out.println(max);

        // Using ternary operator
        System.out.println((i > j) ? i : j);

        // old way for checking 3 conditions
        int number = -10;
        if(number == 0)
            System.out.println("The number is zero");
        else if(number > 0)
            System.out.println("The number is postive");
        else if (number < 0)
            System.out.println("The numbere is Negative");

        //Using ternary operator checking three conditions
        System.out.println((number == 0) ? "Zero" : (number > 0) ? "Positive" : "Negative");
    }
}
