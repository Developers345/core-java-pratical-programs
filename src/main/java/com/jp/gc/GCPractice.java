package com.jp.gc;

public class GCPractice {

    public void finalize()
    {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        //un-reffered objects
        //un-used objects
        //anonymous objects

        GCPractice gcp1 = new GCPractice();
        GCPractice gcp2 = new GCPractice();
        GCPractice gcp3 = new GCPractice();

        gcp1 = null;// make as unreffered object
        gcp2 = gcp3;//make as unreffered object here gcp2 as unreffered

        new GCPractice(); // anonymous object

        System.gc();// This gc methos internal called Runtime.getRuntime().gc();
        //Runtime.getRuntime().gc();
        //whenver gc() invoke then finalize() internal called
    }
}
