package com.jp.inner.classes;

public class TestClass1 {
    private int id = 101;

    public static void main(String[] args) {
        System.out.println("main method :TesClass1");

        TestClass2 tc2 = new TestClass1().new TestClass2();
        tc2.show();

        TestClass7 tc7 = new TestClass1.TestClass7();
        tc7.abc();

    }

    public class TestClass2 extends Balance implements PaymentGateway {

        private int id = 102;

        public void show() {
            int id = 103;
            System.out.println("inner class method scope variable acess" + " " + id);
            System.out.println("inner class object scope variable acess" + " " + this.id);
            System.out.println("outer class private variable acess" + " " + TestClass1.this.id);

            System.out.println(getBalance());
            withdraw();
            checkUpi();
            integrateUpi();
        }

        @Override
        public int getBalance()
        {
            return 500000;
        }


        @Override
        public void withdraw() {
            System.out.println("Withdraw the money");
        }

        @Override
        public void checkUpi() {
            System.out.println("checking UPI");
        }

        @Override
        public void integrateUpi() {
            System.out.println("Integrate UPI");

        }
    }

    public class TestClass6 extends TestClass2
    {
        public void showTestClass2()
        {
            show();
        }
    }
    public static class TestClass7{
        public void abc()
        {
            System.out.println("abc");
        }
    }



}


