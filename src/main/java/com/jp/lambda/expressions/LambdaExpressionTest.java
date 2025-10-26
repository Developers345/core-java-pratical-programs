package com.jp.lambda.expressions;

public class LambdaExpressionTest {
    public static void main(String[] args) {

        //Traditional way implementation
        Audi audi = new Audi();
        audi.drive(200,"Audi");

// Anonymous class implemetation
        Car c1 = new Car()
        {
          public void drive(int speed, String model)
          {
              System.out.println("Driving "+model);

          }
        };
        c1.drive(150, "BMW");

        //Lambda expression with anonymous function implementation
        //syntax: (arguments) -> { function body };
        Car c2 = (speed,model) -> System.out.println("TATA car driving "+speed + "model is"+model);
        c2.drive(100, "TATA");
    }
}

class Audi implements Car
{
    @Override
    public void drive(int speed,String model)
    {
        System.out.println("car driving "+ speed + "Model is"+ model);
    }
}
@FunctionalInterface
interface Car
{
    public void drive(int speed, String model);
}
