package com.jp.swiexpression;

import java.time.DayOfWeek;
import java.time.MonthDay;
enum TRAFFIC_LIGHT
{
    RED,YELLOW, GREEN,P;
        }
public class SwitchExpressionTest {

    public static void main(String[] args) {

         int number = 11;
         String resultNumber;
        resultNumber= switch (Integer.compare(number,0))
         {
             case 0 -> "Zero";
             case 1 -> {
                 if (number % 2 == 0)
                     yield "Postivie & Even";
                 else
                     yield "Positive & Odd";
             }
             case -1 -> "Negative";
             default -> throw new IllegalStateException("Unexpected value: " + Integer.compare(number,0));
         };

        System.out.println(resultNumber);


        TRAFFIC_LIGHT light = TRAFFIC_LIGHT.P;
        String trafficLightResult;
        trafficLightResult= switch (light)
         {
             case RED -> "Please Stop";
             case YELLOW -> "Be ready to slow down";
             case GREEN -> "Please Go";
             default -> "Please check the signal and go";
         };
        System.out.println(trafficLightResult);

        int monthNumber = 7;
        String result;

        result = switch(monthNumber)
        {
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            /*
            default is optional but when you return anything then default is manadary
             */
            default -> throw new IllegalStateException("Unexpected value: " + monthNumber);
        };
        System.out.println("Month is: "+result);
        /*int monthNumber = 7;

        switch(monthNumber)
            {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("Febraury");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("Aguest");
                    break;
                case 9:
                    System.out.println("Sept");
                    break;
                case 10:
                    System.out.println("Oct");
                    break;
                case 11:
                    System.out.println("Nov");
                    break;
                case 12:
                    System.out.println("Dec");
                    break;

                default:
                    System.out.println("invalid option");
            }*/

        /*String browser = "safari";
        switch(browser)
        {
            case "chorme":
                System.out.println("loading chrome");
                break;
            case "firefox":
                System.out.println("loding firefox");
                break;
            default:
                System.out.println("loading another browser");
        }*/
        /*DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
        switch(dayOfWeek)
        {
            case MONDAY:
                System.out.println("weekday");
                break;
            case FRIDAY:
                System.out.println("weekend near to you");
                 break;
            default:
                System.out.println("weekend");
        }*/
        /*int day = 1;
        switch(day)
        {
            case 1:
                System.out.println("start weekday");
                break;
            case 2:
                System.out.println("weekday");
                break;

            case 3:
                System.out.println("mid weekday");
                break;
            default:
                System.out.println("weekday! enjoy");
        }*/
    }
}
