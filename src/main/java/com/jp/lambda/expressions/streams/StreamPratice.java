package com.jp.lambda.expressions.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamPratice {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,9,65,2,5,8,8,67);
        Integer[] arr = {4,9,65,2,5,8,8,67};



        /*Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0 ;
            }
        };*/


        /*Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i * i ;
            }
        };*/
         long count =  numbers.stream()
                .filter(i -> i % 2 == 0)
                 .sorted(Comparator.reverseOrder())
                 .map(i->
                 {
                     StringBuilder s = new StringBuilder("");
                     for (int k = 1; k <= i; k++) {
                          //s += "*";
                         s.append("*");
                     }
                     return s;
                 })
                .peek(System.out::println)
                  .count();
        System.out.println("count is"+" "+count);

        System.out.println("=========================================");

        /*
        Stream Direct support for Array is not there.
         */
       long countArr =  Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .map(i->
                {
                    StringBuilder s = new StringBuilder("");
                    for (int k = 1; k <= i; k++) {
                        //s += "*";
                        s.append("*");
                    }
                    return s;
                })
                .peek(System.out::println)
                .count();

        System.out.println("Array count:"+" "+countArr);
    }
}
