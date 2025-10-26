package com.jp.lambda.expressions;

public class LambdaExpressionReturntypeTest {
    public static void main(String[] args) {

        Square square = (lenght, width) -> {return lenght * width;
        };

        System.out.println(square.getArea(12,34));

    }
}

@FunctionalInterface
interface Square
{
    public int getArea(int lenght, int width);
}
