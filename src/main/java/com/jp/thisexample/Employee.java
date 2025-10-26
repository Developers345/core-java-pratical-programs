package com.jp.thisexample;

public class Employee {

    int age = 25;
    String name;

    public String getJobRole() {
        return jobRole;
    }

    public Employee setJobRole(String jobRole) {
        this.jobRole = jobRole;
        return this;
    }

    String jobRole;

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public static void main(String[] args) {

        Employee emp = new Employee();
       emp.setAge(17)
               .setName("Giri")
               .setJobRole("Developer");

        System.out.println(emp.getAge()+" "+emp.getName()+ " "+emp.getJobRole());
    }

    public Employee setAge(int age) {
        //age = age;
        /*17 = 17 method check age variable present inside method or not.
        if age variable present then method never check object level variable.*/

        //new Employee().age = age;

        /*
        The above scenario every time new anonymous object is created.
        whenever setAge() method execution completes then remove method stack in
        Stack Area. So object is eligible for garbage collector and GC
        delete the anonymous object.
         */

        //emp.age=age;

        /*
        The above scenario we pass current using object as method parameter
        so operation perform on the current using object iteself.
        here problem in class there many attriburtes present so every time we can
        pass the current object is effect readabilty of the method.
         */

         this.age = age;
         /*
         The above scenario java itself pass the current using object
         reference so developer no need to pass the object along with variable name
          */
         return this;
    }
    public int getAge()
    {
        return age;
    }
}
