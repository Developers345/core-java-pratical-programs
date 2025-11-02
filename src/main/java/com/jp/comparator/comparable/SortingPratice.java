package com.jp.comparator.comparable;

import java.lang.reflect.Array;
import java.util.*;

public class SortingPratice {

    public static void main(String[] args) {

        /*Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer x, Integer y) {
                return ( x < y ) ? 1 : ((x == y) ? 0 : -1);
            }
        };*/
      //  Comparator<Integer> comparator = (x,y)-> ( x < y ) ? 1 : ((x == y) ? 0 : -1);
       // Comparator<Integer> comparator = (x,y)->Integer.compare(y,x);
        Comparator<Integer> comparator = Comparator.comparingInt((Integer i) -> i).reversed();



        Integer[] arr = {2,8,4,10,67};
        Arrays.sort(arr);
        Arrays.sort(arr,comparator);
        //System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
       // System.out.println(list);

       /* Comparator<Student> nameComparator = new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
                // return s2.name.compareTo(s1.name);
            }
        };*/
      //  Comparator<Student> nameComparator = (s1,s2)-> s1.name.compareTo(s2.name);
        Comparator<Student> nameComparator = Comparator.comparing(s-> s.name,Comparator.nullsFirst(Comparator.naturalOrder()));
        Comparator<Student> marksComparator = Comparator.comparing(s-> s.marks);
        Comparator<Student> mathsMarksComparator = Comparator.comparing(s-> s.mathMarks);
        Comparator<Student> physicsMarksComparator = Comparator.comparing(s-> s.physicsMarks);
        Student[] students = {
                new Student(105,"Rajesh",60,20,30),
                new Student(103,"Amar",70,40,80),
                new Student(101,"Balu",80,20,50),
                new Student(104,"David",80,50,80),
                new Student(102,null,55,40,50)

        };

        //Arrays.sort(students, nameComparator.reversed());
        //Arrays.sort(students, nameComparator);
        //System.out.println(Arrays.toString(students));
        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        //sort by name
        Collections.sort(studentList,nameComparator);
        System.out.println(studentList);

        //sort my marks
        Collections.sort(studentList,marksComparator.thenComparing(mathsMarksComparator).thenComparing(physicsMarksComparator));
        System.out.println(studentList);

        //sort by rollno
        Collections.sort(studentList);
        System.out.println(studentList);

    }
}
