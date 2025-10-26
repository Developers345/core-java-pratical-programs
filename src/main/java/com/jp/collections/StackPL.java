package com.jp.collections;

import java.util.Stack;

public class StackPL {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /*stack.add(1);
        stack.add(2);
        stack.add(2);
        stack.add(null);
        stack.add(null);
        stack.add(0,0);*/

        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(null);
        stack.push(null);
        stack.push(0);

      //  System.out.println(stack);
    //    stack.set(0,-1);
        System.out.println(stack);

        //System.out.println(stack.contains(1));
        System.out.println("peek- "+stack.peek());
        System.out.println(stack);
        System.out.println("pop--"+stack.pop());
        System.out.println(stack);
        System.out.println(stack.search(2));
        System.out.println(stack.lastIndexOf(2));


    }
}
