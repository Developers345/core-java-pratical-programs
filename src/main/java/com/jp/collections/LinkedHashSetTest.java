package com.jp.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(4);
        lhs.add(5);
        lhs.add(65);
        lhs.add(65);
        lhs.add(null);

        System.out.println(lhs.remove(1));
        System.out.println(lhs.remove(65));

        System.out.println(lhs.contains(1));
        System.out.println(lhs.contains(5));

        for (Integer element:lhs)
        {
            System.out.println(element);
        }
        System.out.println(lhs);
    }
}
