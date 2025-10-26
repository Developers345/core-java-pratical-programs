package com.jp.type.conversion;

public class TypeConversionTest {

    public static void main(String[] args) {

        byte b = 40;
        short s = 100;
        int i = 400;
        float f = 6000f;
        double d = 100.09;
        char c = 'A';
        boolean boo = true;

        //implict type conversion
         s = b;
         i = b;

         //explict type conversion
         b = (byte) i;
         s = (short) i;

         /*
          if range is less than integer then AutoPromotion to integer
          if range is higher than interger then autopromotion to higher range
          */
          int j = s + 'V';
          float l = i + f;

         // s = (short)boo;
        System.out.println(b);

    }
}
