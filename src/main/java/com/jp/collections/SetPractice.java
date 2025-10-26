package com.jp.collections;

import java.util.HashSet;

public class SetPractice {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(2);
        hs.add(45);
        hs.add(67);
        hs.add(45);
        hs.add(null);
        hs.add(null);

        System.out.println(hs.remove(45));
        System.out.println(hs.remove(1));
        System.out.println(hs.contains(45));
        System.out.println(hs.contains(67));
        for (Integer element: hs)
        {
            System.out.println(element);
        }
        System.out.println(hs);
    }
}
