package com.jp.finalkeyword;

public final class FinalKywordTest {

     static final int h = 0;
    public FinalKywordTest()
    {
       // h = 89;
    }

    public final static void main(String[] args) {
        final int i = 10;
        //i = 67;
       // System.out.println(h);
       FinalKywordTest finalKywordTest = new FinalKywordTest();
       finalKywordTest.show(100);
   //    Program2.main(new String[]{"Giri"});

        final StringBuilder sb = new StringBuilder("Hello");
        sb.append("Reedy");
        System.out.println(sb);
       // sb = new StringBuilder("Hi"); //this is not allowed for final re-reference

    }
     public final void show(final int p)
    {
        //p = 78;
        System.out.println(p);
        final int j = 90;
        //j = 78;
      //  h =90;
    }
}
/*
class Program2 extends FinalKywordTest
{
    //@Override
   */
/* public final void show(final int p)
    {

    }*//*


    */
/*public static void main(String[] args) {
        args= new String[]{"Gireesh"};
        System.out.println();
    }*//*

}*/

/*final abstract  class Test1
{
    public final void display()
    {
        System.out.println("display");
    }
     abstract void draw();
}*/

