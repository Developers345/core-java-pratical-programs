package com.jp.lambda.expressions.foreach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForeachMethodPratice {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,7,8,10);

        //traditional for loop
        /*for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }*/

        // enhance for loop
       /* for (Integer i:list)
        {
            System.out.println(i);
        }*/

        // for each method
        //Anonymous inner class
        /*Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };*/
       // Consumer<Integer> con = i-> System.out.println(i);
        list.forEach( i-> System.out.println(i));

        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Ramesh");
        map.put(102,"Ramu");
        map.put(103,"Rajesh");

        //Anonymous inner class
        /*BiConsumer<Integer,String> biCon = new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {

                System.out.println(key +">>"+value);
            }
        };*/

       // BiConsumer<Integer,String> biCon = (key,value) -> System.out.println(key+" >> "+value);
        map.forEach((key,value) -> System.out.println(key+" >> "+value));

        int[] arr = {1,7,9,4,7,0};
       // arr.foreach -> directly support for each method is not available for arrays.
    }
}
