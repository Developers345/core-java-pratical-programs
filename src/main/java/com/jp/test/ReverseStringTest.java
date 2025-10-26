package com.jp.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseStringTest {
    public static void main(String[] args) {

         String s = "java";
         char ch[] = s.toCharArray();
         for (int i = ch.length-1; i >= 0; i--)
         {
            // System.out.print(ch[i]);
         }
         String str = "ab cde";// ed cba
         StringBuffer sb = new StringBuffer(str.replaceAll(" ",""));
         sb.reverse();
         System.out.println("Before put the space  -> "+sb);
         for(int i =0 ; i<str.length(); i++){
             if(str.charAt(i) == ' '){
                 sb.insert(i," ");
             }
         }
        // System.out.println(sb);

/*
input {24,24,24,65,65,65,65,70,70}
second highest repeated number
output = 24
*/
        List<Integer> numberList = Arrays.asList(24,24,24,65,65,65,65,70,70,55,55);
        Map<Integer, Long> mp = numberList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mp);
        //Long num = mp.entrySet().stream().map(e -> e.getValue()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
      //  System.out.println(num);
    }
}
