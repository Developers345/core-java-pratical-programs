package com.jp.exceptions;

import java.util.Arrays;

public class ExceptionTest {
    public static void main(String[] args){

        m1();

    }

    public static void m1()
    {
        int a = 20;
        int b = 0;
        int result = 0;
        try
        {
             result = a / b;

        }catch(ArithmeticException e)
        {
            ArthematicCustomException ae = new ArthematicCustomException("Anything divide by 0 is not valid",e);
            throw ae;
            //System.out.println(Arrays.toString(e.getStackTrace()));
          //  throw e;
        }
        finally {
            System.out.println("always execute irrespective of exception occurred or not ");
        }

        System.out.println("result--"+ result);
    }
}
