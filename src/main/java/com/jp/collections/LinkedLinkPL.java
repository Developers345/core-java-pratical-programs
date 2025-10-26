package com.jp.collections;

import java.util.*;

public class LinkedLinkPL {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<>();
        al.add("S1");
        al.add("S2");
        ll.add("A1");
        ll.add("A2");
        ll.add("A3");
        ll.add(0,"A0");
        System.out.println(ll.get(0));
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
        ll.add("A3");
        ll.add(null);
        System.out.println(ll);

        ll.set(1,"A5");
        System.out.println(ll);

        ll.addAll(al);
        for(String s : ll)
        {
            System.out.println(s);
        }

        System.out.println(ll);

    }
}
