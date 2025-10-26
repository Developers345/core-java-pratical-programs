package com.jp.strigbuffer.stringbuilder;

public class StringStringBufferStringBulierDiffTest {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Gireesh");
        StringBuilder sb2 = new StringBuilder("Gireesh");

        System.out.println("sb1 == sb2"+" "+(sb1.equals(sb2)));// reference comparsion
        System.out.println("sb1 == sb2"+" "+(sb1.compareTo(sb2))); // content comparsion

        sb1.insert(1,"Kumar");
        System.out.println(sb1);
        sb1.delete(0,5);
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(100);


    }
}
