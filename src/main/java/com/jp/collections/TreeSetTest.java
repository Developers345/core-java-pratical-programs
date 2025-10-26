package com.jp.collections;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(1);
        ts.add(10);
        ts.add(10);
        ts.add(89);
        ts.add(98);
        ts.add(78);
        ts.add(91);
        ts.add(67);

        //ts.add(null);

        System.out.println(ts.remove(10));
        System.out.println(ts.remove(20));
        System.out.println(ts.contains(1));
        System.out.println(ts.contains(4));

        for (Integer element:ts)
        {
            System.out.println(element);
        }

        System.out.println(ts);
        System.out.println("special methods");
        System.out.println(ts.descendingSet());
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts.subSet(1,100).remove(67));
        System.out.println(ts);

    }
}
