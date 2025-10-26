package com.jp.memorymanagement;

public class Test1 {

    public static void main(String[] args) {

        Integer size = 10;
        for (int i = 0; i < Integer.MAX_VALUE;i++)
        {
            int[] arr = new int[size];
            size *= 2;
            System.out.println(size);
        }
    }
}
//1342177280
//-1610612736 - after increse size to 8GB
//-Xmx8000m - setting the heap size -
