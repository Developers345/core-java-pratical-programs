package com.jp.multithreading.java.thread;

public class SynchronizedTest {

    public static void main(String[] args) {
        

         Course course = new Course("Java",1);

         new Thread(()-> {
            int rollNo = 101;
            course.registerCourse(rollNo);
         }).start();

         //Registration registration1 = new Registration(course,101);
         //Registration registration2 = new Registration(course,102);

          new Thread(()->{
              int rollNo = 102;
              course.registerCourse(rollNo);
         }).start();

         /*Thread t1 = new Thread(registration1);
         Thread t2 = new Thread(registration2);

         t1.start();
         t2.start();*/

    }
}
