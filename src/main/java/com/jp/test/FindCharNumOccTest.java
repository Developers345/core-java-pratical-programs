package com.jp.test;

import java.util.Scanner;

public class FindCharNumOccTest {
    public static void main(String[] args) {
        System.out.println("Please enter the target letter ");
        Scanner sc = new Scanner(System.in);
        char targetCharacter = sc.next().charAt(0);

        String s = "Helloooo World";
        int count = 0;

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++)
        {
            if(charArray[i] == targetCharacter)
            {
                count++;
            }
        }
        System.out.println("The character occurance "+ count);




    }
}


