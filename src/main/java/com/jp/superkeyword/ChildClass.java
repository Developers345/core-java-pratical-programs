package com.jp.superkeyword;

interface ParentInterface
{
    String name = "Gopi";
}
class GrandParentClass
{
String name = "Ganesh";
}
class ParentClass extends GrandParentClass
{
    public ParentClass()
    {
        System.out.println("default constructor from parent class");
    }

    public ParentClass(int i)
    {
        System.out.println("Parent class paramerterized constructor");
    }
     //String name = "Yadagiri";
    int age = 32;

    public void printDetails()
    {
        System.out.println("Priniting from parent class details");
        System.out.println(name+">>>"+ age);
    }

}
public final class ChildClass extends ParentClass implements ParentInterface {
    String name = "Giri";
   /* public ChildClass()
    {
        super();// implictly java added super() for default constructor of child class
        System.out.println("child class constructor");
    }*/
    /*
    If parent class have parameter constructor present without default constructor then child class constructor throw the below error:
    There is no parameterless constructor available in 'com. jp. superkeyword. ParentClass'
     To resolve the above problem we need to add default constructor in parent class you can use or not use.
     There is another way to resolve the problem call the super class parameter constructor using super(40);
     */
    public ChildClass(int i)
    {
        //this(); // this() is used to call the child class no-paramerter or parameter constructor
        super(40);
        System.out.println("paramerter constructor from child class");
        //super();  Call to 'super()' must be first statement in constructor body.
    }
    public ChildClass()
    {

    }

    public static void main(String[] args) {
        ChildClass cc = new ChildClass(1);
        cc.dummy();
        cc.printDetails();


       // System.out.println(super.name);
        // super keyword nevers uses inside static methods,blocks(static context).
        //Here super keywords deals with super class instance(object) due to that in static context
        //you can't use the super keyword.
    }

    public void dummy()
    {
        System.out.println(this.name);// here prints Giri only because child class overrides the name variable
        /*
        Here first java checks the variable in local after class, after that parent class.
        */

        System.out.println(super.name);// here calls the super class variable using super keyword.
       /*
       If child class not ovverides the super class variable don't use the super keyword. Because
       any other developer assumes that child class ovverrides the parent class variable.
       Java is not throwing any error. just it is good paratice.
       */
        /*
        super keyword appliable for both static and non-static variables in class.
        Using super keyword for static variables java will not throw any error but java gives the warning "static variable only access through class name iteself".
         */
        //super.printDetails();

        System.out.println(ParentInterface.name);
    }
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Additional functionality");
    }

}
