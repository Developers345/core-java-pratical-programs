package com.jp.collections;

import java.util.ArrayList;

public class AlPl {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(null);
        al.add(1);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(3);
        al2.add(4);
        al.addAll(al2);
        System.out.println(al.size());
        System.out.println(al);
    }
}
