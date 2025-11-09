package com.jp.lambda.expressions.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethodPratice {

    public static void main(String[] args) {

        System.out.println("============Using of() method===========");
        IntStream.of(1,3,5,6,8,10).filter(n-> n % 2 == 0).forEach(System.out::println);
        System.out.println("==========Using range() method============");
        IntStream.range(10,100).filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("==========Using rangeClosed() method========");
        IntStream.rangeClosed(10,100).filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("==========Using iterate() method create infinite stream and limit() to print only certain elements========");
        IntStream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);

        System.out.println("==========Using limit() method below 10 numbers========");
        IntStream.of(1,3,5,6,8,10).limit(10).forEach(System.out::println);
        System.out.println("==========Using iterate() method like for loop and combine limit() and skip() methods========");
        /*IntPredicate ip = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value <= 50;
            }
        };*/

        IntStream.iterate(1,value -> value <= 50, n-> n + 2)
                .limit(10)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("==========Using generate() method below 100 numbers and distinct() method========");
       long count =  IntStream.generate(() -> new Random().nextInt(100))
               .limit(200)
               .distinct().count();
        System.out.println(count);

        System.out.println("==========Using concat() method ========");
        IntStream is1 = IntStream.of(1,3,5,6,8,10);
        IntStream is2 = IntStream.of(2,7,9,0,6,7,4,7);
        IntStream.concat(is1,is2).forEach(System.out::println);

        System.out.println("==========Using toArray() method ========");
        IntStream is3 = IntStream.of(1,3,5,6,8,10);
        IntStream is4 = IntStream.of(2,7,9,0,6,7,4,7);
        int[] array = IntStream.concat(is3, is4).distinct().toArray();
        System.out.println(Arrays.toString(array));
        List<Integer> list1 = List.of(1,4,6,8,3,8,3,9,5);
        Object[] obj = list1.stream().distinct().toArray();
        System.out.println(Arrays.toString(obj));
        System.out.println("==========Using Stream() interface ========");
        Stream.of(1,"Hello").forEach(System.out::println);
        System.out.println("==========String Stream ========");
        /*
        String contains 3 things
        1.Character 2. Word 3. Lines
         */

        //lines streams
        String s = "Hi\nHow Are you\nAre you Fine?";
        s.lines().forEach(System.out::println);

        //Words
        String s1 = "Ganesh Kumar";
        Arrays.stream(s1.split(" ")).forEach(System.out::println);

        //characters
        String s2 = "Gireesh";
        s2.chars().mapToObj(c -> (char)c).forEach(System.out::println);


    }
}
