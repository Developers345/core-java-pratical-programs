package com.jp.collections.logical.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesArrayListTest {

    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(50,10,10,40,30,30,60,60);
        List<Integer> uniqueList = new ArrayList<Integer>();
        for(Integer num :arrayList)
        {
            if(!uniqueList.contains(num))
            {
                uniqueList.add(num);
            }
        }
        System.out.println("ArrayList with Duplicate----"+arrayList);
        System.out.println("ArrayList Without Duplicate----"+uniqueList);

    }
}
