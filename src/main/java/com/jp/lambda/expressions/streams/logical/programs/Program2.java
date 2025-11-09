package com.jp.lambda.expressions.streams.logical.programs;

import java.util.Arrays;

/*
 Problem Statement
 -----------------
 From Array of Integers, Select the old ones,
 calculate their squares, and print them in increasing order.
 Also show how many numbers met the criteria.

 input :
 int[] numbers = {3,6,1,8,5,10,7}

 output:
 1
 9
 25
 49

 count is : 4
 */
public class Program2 {

    public static void main(String[] args) {

         int[] numbers = {3,6,1,8,5,10,7};

        long count = Arrays.stream(numbers)
                .filter(i -> i % 2 == 1)
                .sorted()
                .map(k -> k * k)
                .peek(System.out::println)
                .count();

        System.out.println("The Count of Odd numbers:"+ " "+ count);
    }
}
