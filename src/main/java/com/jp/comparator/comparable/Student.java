package com.jp.comparator.comparable;

public class Student implements Comparable<Student> {
    public int rollNo;
    public String name;
    public int marks;
    public int mathMarks;
    public int physicsMarks;

    public Student(int rollNo, String name, int marks, int mathMarks,int physicsMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.mathMarks = mathMarks;
        this.physicsMarks = physicsMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", mathMarks=" + mathMarks +
                ", physicsMarks=" + physicsMarks +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        //return (this.rollNo < anotherStudent.rollNo) ? -1 : ((this.rollNo == anotherStudent.rollNo) ? 0 : 1);
       // return this.rollNo - anotherStudent.rollNo;
        return Integer.compare(this.rollNo,anotherStudent.rollNo); //-> Thses 3 are ascending order
      //  return Integer.compare(anotherStudent.rollNo,this.rollNo); -> decesnding order for interger
        //return this.name.compareTo(anotherStudent.name); -> Name ascending order
       // return anotherStudent.name.compareTo(this.name); -> Name descending order
    }
}
