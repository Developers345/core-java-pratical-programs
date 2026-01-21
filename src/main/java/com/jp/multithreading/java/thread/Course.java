package com.jp.multithreading.java.thread;

public class Course {

    String courseName;
    int noOfSeats;

    public Course(String courseName, int noOfSeats) {
        this.courseName = courseName;
        this.noOfSeats = noOfSeats;
    }

    public synchronized void registerCourse(int rollNo)
    {
        try
        {
            if(noOfSeats - 1 < 0)
            {
                throw new Exception("Sorry!, No Seats Avaliable for register");
            }
            //Thread.sleep(500);
            noOfSeats -= 1;

            System.out.println("Success Booked the Seat: "+rollNo);
            System.out.println("Remaining seats are: "+ noOfSeats);
        }catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }

    }
}
