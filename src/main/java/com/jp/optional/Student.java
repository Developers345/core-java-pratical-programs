package com.jp.optional;

import java.util.Optional;

public class Student {
    private  int rollNo;
    private String Name;
    private String address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        Name = name;
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Optional<String> getAddress() {
        //return address;
       // return Optional.of(address);// Here of() method accepts only non-null values
        return Optional.ofNullable(address);// Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.

    }

    public void setAddress(String address) {
        this.address = address;
    }


}
