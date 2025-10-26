package com.jp.enumpackages;

public enum Week {
    //int dayNo; every enum class we can't decalre variable before constant
    MONDAY(1,"Opened"),TUEDAY(2,"Opened"),WENDESDAY(3),THURSDAY(4, "Opened"),FRIDAY(5),SATURDAY(6),SUNDAY(7);

    //All variables present in enum is final only.
    int dayNo;
    String status = "Closed";

        /*
         we cannot create the enum class object explicity
         due to that java make constructor as private
         within the enum class only we can create the enum object.
         whenver you decalred own private constructor then java will remove
         the default constructor
         */
       /* private days()
        {
            System.out.println("constructor called");
        }*/

    private Week(int dayNo)
    {
        this.dayNo = dayNo;
    }
    /*
    Usecase: book stall opened only fews days
     */
    private Week(String status)
    {
        this.status = status;

    }

    private Week(int dayNo, String status)
    {
        this.dayNo = dayNo;
        this.status = status;
    }
}
