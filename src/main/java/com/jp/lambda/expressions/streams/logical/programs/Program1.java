package com.jp.lambda.expressions.streams.logical.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Problem Statement:
-----------------
From a list of employee names, find those atleast 5 characters.
Convert them into uppercase and arrange them alphabetically
then print them

 input:
 List<String> employees = Arrays.asList("John","Alexandra","Ben","David","Christina","Amy");
output:
ALXEANDRA
CHIRISTINA
DAVID
 */
public class Program1 {

    public static void main(String[] args) {

        List<String> employees = Arrays.asList("John","Alexandra","Ben","David","Christina","Amy");


         employees.stream()
                .filter(e -> e.length() >= 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);



    }
}
