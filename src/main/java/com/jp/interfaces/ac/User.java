package com.jp.interfaces.ac;

public class User {
    public static void main(String[] args) {

        HP hp = new HP();
        hp.copy();
        hp.paste();
        hp.cut();
        //hp.print();
        //Laptop.security();

        Dell dell = new Dell();
        dell.copy();
        dell.paste();
        dell.cut();
        //dell.print();
       // Laptop.security();

        Laptop laptop = new Dell();
        laptop.copy();

    }
}
