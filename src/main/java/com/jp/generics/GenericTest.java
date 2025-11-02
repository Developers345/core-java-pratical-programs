package com.jp.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {
//Box<Almond> box = new Box<Almond>(3); -> Here right side again we declare <Almond> it is not required
        //because of code duplicate happen so java can understand that remove the right side <Almond> java internally convert it.
        Box<Almond> box = new Box<>(3);
        box.add(new Almond("India Almond"));
        box.add(new Almond("America Almond"));
     //   box.add("World");// here checking at complie time itself so user cannot provide the wrong data
        System.out.println((Almond)box.get(1));


        Box<Cashew> box1 = new Box<>(3);
        box1.add(new Cashew("India Cashew"));
        box1.add(new Cashew("America Cashew"));
     //   box1.add("Hello");

        System.out.println((Cashew)box1.get(1));

        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        //al.add(new Almond("India almond"));
        //al.add(2345);
        System.out.println(al);



        /*CashewBox cashewBox = new CashewBox(2);
        cashewBox.add(new Cashew("India Cashew"));
        cashewBox.add(new Cashew("America Cashew"));

        System.out.println(cashewBox.getCashew(1));*/
        swap("Hello","World");
        swap(1,2);
        swap(12.5,16.7);
        swap(true,false);

       // List<String> al = new ArrayList<>();


    }
    public static <T> void swap(T i, T j)
    {
        System.out.println("Before Swapping "+i + " >> "+j);
        T temp;
        temp = i;
        i = j;
        j = temp;

        System.out.println("After Swapping---"+ i +" >> "+ j);
    }

    public void printList(List< String> l)
    {
        for (String ll :l)
        {
            System.out.println(ll);
        }
    }

}

class Almond
{
    String name;
    public Almond(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Almond{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Cashew
{
    String name;

    public Cashew(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cashew{" +
                "name='" + name + '\'' +
                '}';
    }
}

//class AlmondBox
class Box<T>
{

    //Almond [] almonds;
   // Object [] dryFurits;
    T [] dryFurits;
    int index;
    public Box(int size)
    {
        dryFurits = (T[])new Object[size];
        index = 0;
    }

    public void add(T object)
    {
        dryFurits[index] = object;
        index++;
    }

    public T get(int i)
    {
        return dryFurits[i];
    }
}
/*
This clas is not required because we use object type.
 */
/*class CashewBox
{

    Cashew [] cashews;
    int index;
    public CashewBox(int size)
    {
        cashews = new Cashew[size];
        index = 0;
    }

    public void add(Cashew cashew)
    {
        cashews[index] = cashew;
        index++;
    }

    public Cashew getCashew(int i)
    {
        return cashews[i];
    }
}*/
