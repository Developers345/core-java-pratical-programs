package com.jp.collections;

import java.util.*;

public class VectorPL {
    public static void main(String[] args) {

        Vector<Integer> v1 = new Vector<>();

        v1.add(1);
        v1.add(2);
        v1.add(null);
        v1.add(2);
        v1.add(0,0);

        Vector<Integer> v2 = new Vector<>();
        v2.add(5);
        v2.add(6);

        System.out.println("v1 list - "+v1);
        System.out.println("v2 list - "+v2);


      /*  for (int i = 0; i <v2.size(); i++)
        {
            v1.add(v2.get(i));
        }
*/
         for(Integer k : v1)
         {
             System.out.print(k+"\n");

         }
         //v1.addAll(v2);
         v1.addAll(0,v2);
        System.out.println("v1 combined list - "+v1);

         //v1.remove(0);
        v1.set(0,4);
        System.out.println("v1 combined list after deletion- "+v1);
        System.out.println("vector capacity---"+v1.capacity());
        System.out.println("vector size---"+v1.size());

        System.out.println(v1.containsAll(v2));
        System.out.println(Arrays.toString(v1.toArray()));
    }
}
