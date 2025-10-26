package com.jp.enumpackages;

import java.util.Scanner;

public class EnumTest {

    /*
    Here for accessing static methods
    make it as static
    This code is duplicate every time we need
    to write this code each class create it
    seperate class.
     */
   /*static final String MONDAY = "Mon";
    static final String TUEDAY = "Tue";
    static final String WEDNESDAY = "Wed";
    static final String THURSDAY = "Thu";
    static final String FRIDAY = "Fri";
    static final String SATURDAY = "Sat";
    static final String SUNDAY = "Sun";


    final static String[] days = {
            MONDAY,
            TUEDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
    };*/
    public static void main(String[] args) {



        /*
        Here we decalre inside the method
        so other classes or other method in same class
        can't access this data we declare in class level
         */
        /*final String MONDAY = "Mon";
        final String TUEDAY = "Tue";
        final String WEDNESDAY = "Wed";
        final String THURSDAY = "Thu";
        final String FRIDAY = "Fri";
        final String SATURDAY = "Sat";
        final String SUNDAY = "Sun";


        String[] days = {
          MONDAY,
          TUEDAY,
          WEDNESDAY,
          THURSDAY,
                FRIDAY,
                SATURDAY,
                SUNDAY
        };*/
        //System.out.println("Please enter the day");
      //  Scanner sc = new Scanner(System.in);
        //String day = sc.nextLine();
        /*
        The above line problem is
        user trapper the text that cases
        got the exception
        so we go for array to store group of similar data
        advantage is user never temper the data we restrict that one.

         */
       // String day = days[0];
        /*
        The above statement also have the problem
        1. User enter the wrong array index so throws the ArrayIndexOutOfBoundException
        2. Day starting is not always monday in some countries
        so again problem occurs.user look into array and provide the value.
         */
        //MONDAY="Mon day";
        /*
        Here problem is new developer came and change the
        variable value without know existing developer
        to resolve the problem make all variables as final
        so variable as constant no one change it.
        Here type-safety will not acheive here.
         */
        //String day = Days.MONDAY;
        /* here still you can't restrict
        new developer modify the string value.so due to all
        problems java introduced enum in 1.5 version */

        Week day = Week.MONDAY;//Using Enum we achieved the type-safety
        //user never enter wrong data.
//enum class default methods
        System.out.println(day.getClass().getSuperclass());
        Week[] days = Week.values();
        for (Week d :days)
        {
            System.out.println(d);
        }
        System.out.println(day.name());
        System.out.println(day.ordinal());

        if (day == Week.MONDAY ||
                day == Week.TUEDAY ||
                day == Week.WENDESDAY ||
                day == Week.THURSDAY ||
                day == Week.FRIDAY)
        {
            System.out.println("This is weekday, it is "+day.dayNo+"th day"+" "+day+ ">>>"+ " "+day.status);
        }
        else if (day == Week.SATURDAY||
                day == Week.SUNDAY)
        {
            System.out.println("Weekend!!!, it is "+day.dayNo+"th day"+" "+day+" >>>"+" "+day.status);
        }
        String result;
        result = switch (day)
        {
            case MONDAY, TUEDAY,WENDESDAY,THURSDAY, FRIDAY -> "weekday, it is "+day.dayNo+"th day"+ " "+day + " >>>"+" "+day.status;
            case SATURDAY, SUNDAY -> "weekend!!!, it is "+day.dayNo+"th day"+" "+day+ " >>>"+ " "+day.status;
        };
        System.out.println(result);
    }
}
