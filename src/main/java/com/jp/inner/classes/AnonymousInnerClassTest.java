package com.jp.inner.classes;

public class AnonymousInnerClassTest {
    public static void main(String[] args) {

        Class1 class1 = new Class1(){
            public void print()
            {
                System.out.println("updated print");
            }
        };
        class1.print();

        Class4 class4 = new Class4() {
            @Override
            public void add() {

            }
        };
        class4.display();

        MessageWriter messageWriter = new MessageWriter() {
            @Override
            public void writeMessage() {
                System.out.println("message writing....");
            }
        };
        messageWriter.writeMessage();
    }
}
class Class1{
    public void show()
    {
        System.out.println("show will called Class1");
    }
    public void print()
    {
        System.out.println("print method will call Class1");
    }
}