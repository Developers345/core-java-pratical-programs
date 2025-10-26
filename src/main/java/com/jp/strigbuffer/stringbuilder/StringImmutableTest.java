package com.jp.strigbuffer.stringbuilder;

public class StringImmutableTest {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Gireesh");//reference location : 726
        StringBuffer sb2 = new StringBuffer("Gireesh");// reference location : 838
        System.out.println("sb1 == sb2"+ " "+ (sb1 == sb2));// 726 == 838

        sb1 = sb1.append("Kumar"); // address location : 726
        System.out.println("sb1 == sb2"+ " "+ (sb1 == sb2));//726 == 838

        StringBuffer sb3 = new StringBuffer("GireeshKumar");// reference location : 874
        System.out.println("sb1 == sb3"+ " "+(sb1 == sb3));//726==874

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

        StringBuilder sbd1 = new StringBuilder("Gireesh");//reference location : 726
        StringBuilder sbd2 = new StringBuilder("Gireesh");// reference location : 838
        System.out.println("sbd1 == sbd2"+ " "+ (sbd1 == sbd2));// 726 == 838

        sbd1 = sbd1.append("Kumar"); // address location : 726
        System.out.println("sbd1 == sbd2"+ " "+ (sbd1 == sbd2));//726 == 838

        StringBuilder sbd3 = new StringBuilder("GireeshKumar");// reference location : 874
        System.out.println("sbd1 == sbd3"+ " "+(sbd1 == sbd3));//726==874
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        String s1 = "Gireesh"; // reference location : 871
        String s2 = "Gireesh"; //reference location : 871
        System.out.println("s1 == s2"+" "+(s1 == s2));// 871 == 871

         s1 = s1 + "Kumar"; // reference location : 880
        System.out.println("s1 == s2"+ " "+ (s1 == s2)); //880 == 871

        String s3 = "GireeshKumar";// reference location : 886
        System.out.println("s1 == s3"+" "+ (s1 == s3));//880 == 886
    }
}
